package org.telegram.ui.Stories.recorder;

import android.content.ContentUris;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Shader;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.util.Pair;
import android.util.Size;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.ViewConfiguration;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.zxing.common.detector.MathUtils;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.VideoEditTextureView;
import org.telegram.ui.Components.VideoPlayer;
import org.telegram.ui.Components.VideoTimelinePlayView;
import org.telegram.ui.Stories.recorder.PreviewView;
import org.telegram.ui.Stories.recorder.StoryEntry;
public class PreviewView extends FrameLayout {
    private float Tx;
    private float Ty;
    private IStoryPart activePart;
    private boolean activePartPressed;
    private boolean allowCropping;
    private boolean allowRotation;
    private boolean allowWithSingleTouch;
    private float angle;
    private Bitmap bitmap;
    private final Paint bitmapPaint;
    private float cx;
    private float cy;
    private boolean doNotSpanRotation;
    private boolean draw;
    private StoryEntry entry;
    public TextureView filterTextureView;
    private Matrix finalMatrix;
    private final Paint gradientPaint;
    private float h;
    private boolean inTrash;
    private boolean isPart;
    private final PointF lastTouch;
    private float lastTouchDistance;
    private double lastTouchRotation;
    private final Matrix matrix;
    private boolean multitouch;
    private Runnable onErrorListener;
    private Runnable onTap;
    private final HashMap<Integer, Bitmap> partsBitmap;
    private final HashMap<Integer, ButtonBounce> partsBounce;
    private final HashSet<Integer> pauseLinks;
    private float rotationDiff;
    private long seekedLastTime;
    private final Paint snapPaint;
    private boolean snappedRotation;
    private long tapTime;
    private Matrix tempMatrix;
    private float[] tempVertices;
    private VideoEditTextureView textureView;
    private final AnimatedFloat thumbAlpha;
    private Bitmap thumbBitmap;
    private final PointF touch;
    private Matrix touchMatrix;
    private float trashCx;
    private float trashCy;
    private int trashPartIndex;
    private AnimatedFloat trashT;
    private final Runnable updateProgressRunnable;
    private final float[] vertices;
    private int videoHeight;
    private VideoPlayer videoPlayer;
    private VideoTimelinePlayView videoTimelineView;
    private int videoWidth;

    public boolean additionalTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public void onEntityDragEnd(boolean z) {
    }

    public void onEntityDragStart() {
    }

    public void onEntityDragTrash(boolean z) {
    }

    public void onEntityDraggedBottom(boolean z) {
    }

    public void onEntityDraggedTop(boolean z) {
    }

    protected void onTimeDrag(boolean z, long j, boolean z2) {
    }

    public PreviewView(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.snapPaint = paint;
        this.partsBitmap = new HashMap<>();
        this.partsBounce = new HashMap<>();
        this.updateProgressRunnable = new Runnable() {
            @Override
            public final void run() {
                PreviewView.this.lambda$new$5();
            }
        };
        this.bitmapPaint = new Paint(7);
        this.gradientPaint = new Paint(1);
        this.matrix = new Matrix();
        this.vertices = new float[2];
        this.draw = true;
        this.thumbAlpha = new AnimatedFloat(this, 0L, 320L, CubicBezierInterpolator.EASE_OUT);
        this.allowCropping = true;
        this.lastTouch = new PointF();
        this.touch = new PointF();
        this.touchMatrix = new Matrix();
        this.finalMatrix = new Matrix();
        this.trashT = new AnimatedFloat(this, 0L, 280L, CubicBezierInterpolator.EASE_OUT_QUINT);
        this.tempVertices = new float[2];
        this.pauseLinks = new HashSet<>();
        VideoTimelinePlayView videoTimelinePlayView = new VideoTimelinePlayView(context);
        this.videoTimelineView = videoTimelinePlayView;
        videoTimelinePlayView.setMode(0);
        this.videoTimelineView.setDelegate(new AnonymousClass1());
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setShadowLayer(AndroidUtilities.dp(3.0f), 0.0f, AndroidUtilities.dp(1.0f), 1073741824);
    }

    public class AnonymousClass1 implements VideoTimelinePlayView.VideoTimelineViewDelegate {
        private Runnable dragStart;
        private boolean dragging;
        private long lastDragTime;
        private int seekTo;
        private Runnable seekToRunnable;

        AnonymousClass1() {
        }

        private float durationOf(long j) {
            return ((float) j) / ((float) (PreviewView.this.getDuration() == -9223372036854775807L ? PreviewView.this.entry.duration : PreviewView.this.getDuration()));
        }

        private long duration() {
            int i = (PreviewView.this.getDuration() > (-9223372036854775807L) ? 1 : (PreviewView.this.getDuration() == (-9223372036854775807L) ? 0 : -1));
            PreviewView previewView = PreviewView.this;
            return i == 0 ? previewView.entry.duration : previewView.getDuration();
        }

        @Override
        public void onLeftProgressChanged(float f) {
            if (PreviewView.this.videoPlayer != null) {
                if (PreviewView.this.videoPlayer.isPlaying()) {
                    PreviewView.this.videoPlayer.pause();
                }
                PreviewView.this.entry.left = f;
                PreviewView.this.entry.right = Utilities.clamp(Math.min(PreviewView.this.entry.right, PreviewView.this.entry.left + durationOf(59500L)), 1.0f, 0.0f);
                PreviewView.this.entry.left = Utilities.clamp(Math.min(PreviewView.this.entry.left, PreviewView.this.entry.right - durationOf(1000L)), 1.0f, 0.0f);
                PreviewView.this.videoTimelineView.setLeftRightProgress(PreviewView.this.entry.left, PreviewView.this.entry.right);
                seekTo(PreviewView.this.entry.left);
                PreviewView.this.videoTimelineView.setProgress(PreviewView.this.entry.left);
                drag(PreviewView.this.entry.left * ((float) duration()));
            }
        }

        @Override
        public void onRightProgressChanged(float f) {
            if (PreviewView.this.videoPlayer != null) {
                if (PreviewView.this.videoPlayer.isPlaying()) {
                    PreviewView.this.videoPlayer.pause();
                }
                PreviewView.this.entry.right = f;
                PreviewView.this.entry.left = Utilities.clamp(Math.max(PreviewView.this.entry.left, PreviewView.this.entry.right - durationOf(59500L)), 1.0f, 0.0f);
                PreviewView.this.entry.right = Utilities.clamp(Math.max(PreviewView.this.entry.right, PreviewView.this.entry.left + durationOf(1000L)), 1.0f, 0.0f);
                PreviewView.this.videoTimelineView.setLeftRightProgress(PreviewView.this.entry.left, PreviewView.this.entry.right);
                seekTo(PreviewView.this.entry.right);
                PreviewView.this.videoTimelineView.setProgress(PreviewView.this.entry.right);
                drag(PreviewView.this.entry.right * ((float) duration()));
            }
        }

        @Override
        public void onPlayProgressChanged(float f) {
            if (PreviewView.this.videoPlayer != null) {
                seekTo(f);
            }
            drag(f * ((float) duration()));
        }

        private void drag(long j) {
            this.lastDragTime = j;
            if (this.dragging) {
                PreviewView.this.onTimeDrag(false, j, false);
            } else if (this.dragStart == null) {
                Runnable runnable = new Runnable() {
                    @Override
                    public final void run() {
                        PreviewView.AnonymousClass1.this.lambda$drag$0();
                    }
                };
                this.dragStart = runnable;
                AndroidUtilities.runOnUIThread(runnable, 150L);
            }
        }

        public void lambda$drag$0() {
            this.dragging = true;
            this.dragStart = null;
            PreviewView.this.onTimeDrag(true, this.lastDragTime, false);
        }

        @Override
        public void didStartDragging(int i) {
            if (PreviewView.this.videoPlayer == null) {
                return;
            }
            PreviewView.this.updatePauseReason(-1, true);
            drag(PreviewView.this.videoTimelineView.getProgressOf(i) * ((float) duration()));
        }

        @Override
        public void didStopDragging(int i) {
            Runnable runnable = this.seekToRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.seekToRunnable.run();
            }
            if (PreviewView.this.videoPlayer != null && !PreviewView.this.videoPlayer.isPlaying()) {
                float currentPosition = ((float) PreviewView.this.videoPlayer.getCurrentPosition()) / ((float) PreviewView.this.getDuration());
                if (currentPosition < PreviewView.this.entry.left || currentPosition > PreviewView.this.entry.right) {
                    seekTo(PreviewView.this.entry.left * ((float) PreviewView.this.getDuration()));
                }
                PreviewView.this.updatePauseReason(-1, false);
            }
            this.dragging = false;
            Runnable runnable2 = this.dragStart;
            if (runnable2 != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable2);
                this.dragStart = null;
            }
            PreviewView.this.onTimeDrag(false, this.lastDragTime, true);
        }

        private void seekTo(float f) {
            if (PreviewView.this.videoPlayer == null) {
                return;
            }
            this.seekTo = (int) (((float) PreviewView.this.getDuration()) * f);
            if (SharedConfig.getDevicePerformanceClass() == 2) {
                if (PreviewView.this.videoPlayer != null) {
                    PreviewView.this.videoPlayer.seekTo(this.seekTo);
                }
                PreviewView.this.applyMatrix();
                this.seekToRunnable = null;
            } else if (this.seekToRunnable == null) {
                Runnable runnable = new Runnable() {
                    @Override
                    public final void run() {
                        PreviewView.AnonymousClass1.this.lambda$seekTo$1();
                    }
                };
                this.seekToRunnable = runnable;
                AndroidUtilities.runOnUIThread(runnable, 100L);
            }
        }

        public void lambda$seekTo$1() {
            if (PreviewView.this.videoPlayer != null) {
                PreviewView.this.videoPlayer.seekTo(this.seekTo);
            }
            PreviewView.this.applyMatrix();
            this.seekToRunnable = null;
        }
    }

    public long getDuration() {
        StoryEntry storyEntry = this.entry;
        if (storyEntry != null) {
            double d = storyEntry.fileDuration;
            if (d >= 0.0d) {
                return (long) (d * 1000.0d);
            }
        }
        VideoPlayer videoPlayer = this.videoPlayer;
        if (videoPlayer != null) {
            return videoPlayer.getDuration();
        }
        return 0L;
    }

    public VideoTimelinePlayView getTimelineView() {
        return this.videoTimelineView;
    }

    public void set(StoryEntry storyEntry) {
        set(storyEntry, null, 0L);
    }

    public void set(StoryEntry storyEntry, Runnable runnable, long j) {
        this.entry = storyEntry;
        if (storyEntry == null) {
            setupVideoPlayer(null, runnable, j);
            setupImage(null);
            setupParts(null);
            this.gradientPaint.setShader(null);
            return;
        }
        if (storyEntry.isVideo) {
            setupImage(storyEntry);
            setupVideoPlayer(storyEntry, runnable, j);
            if (storyEntry.gradientTopColor != 0 || storyEntry.gradientBottomColor != 0) {
                setupGradient();
            } else {
                storyEntry.setupGradient(new Runnable() {
                    @Override
                    public final void run() {
                        PreviewView.this.setupGradient();
                    }
                });
            }
        } else {
            setupVideoPlayer(null, runnable, 0L);
            setupImage(storyEntry);
            setupGradient();
        }
        setupParts(storyEntry);
        applyMatrix();
    }

    private void setupImage(final StoryEntry storyEntry) {
        String str;
        Uri withAppendedId;
        Bitmap bitmap = this.bitmap;
        if (bitmap != null) {
            bitmap.recycle();
            this.bitmap = null;
        }
        Bitmap bitmap2 = this.thumbBitmap;
        if (bitmap2 != null) {
            bitmap2.recycle();
            this.thumbBitmap = null;
        }
        if (storyEntry != null) {
            int measuredWidth = getMeasuredWidth() <= 0 ? AndroidUtilities.displaySize.x : getMeasuredWidth();
            int i = (int) ((measuredWidth * 16) / 9.0f);
            long j = -1;
            if (storyEntry.isVideo) {
                Bitmap bitmap3 = storyEntry.blurredVideoThumb;
                if (bitmap3 != null) {
                    this.bitmap = bitmap3;
                }
                if (this.bitmap == null && (str = storyEntry.thumbPath) != null && str.startsWith("vthumb://")) {
                    j = Long.parseLong(storyEntry.thumbPath.substring(9));
                    if (this.bitmap == null && Build.VERSION.SDK_INT >= 29) {
                        try {
                            if (storyEntry.isVideo) {
                                withAppendedId = ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, j);
                            } else {
                                withAppendedId = ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, j);
                            }
                            this.bitmap = getContext().getContentResolver().loadThumbnail(withAppendedId, new Size(measuredWidth, i), null);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
            final long j2 = j;
            if (j2 < 0 && storyEntry.isVideo && storyEntry.thumbPath == null) {
                invalidate();
                return;
            }
            Bitmap bitmap4 = this.bitmap;
            if (bitmap4 == null) {
                File originalFile = storyEntry.getOriginalFile();
                if (originalFile == null) {
                    return;
                }
                final String path = originalFile.getPath();
                this.bitmap = StoryEntry.getScaledBitmap(new StoryEntry.DecodeBitmap() {
                    @Override
                    public final Bitmap decode(BitmapFactory.Options options) {
                        Bitmap lambda$setupImage$0;
                        lambda$setupImage$0 = PreviewView.this.lambda$setupImage$0(storyEntry, j2, path, options);
                        return lambda$setupImage$0;
                    }
                }, measuredWidth, i, false);
                return;
            } else if (!storyEntry.isDraft && storyEntry.isVideo && bitmap4 != null) {
                storyEntry.width = bitmap4.getWidth();
                storyEntry.height = this.bitmap.getHeight();
                storyEntry.setupMatrix();
            }
        }
        invalidate();
    }

    public Bitmap lambda$setupImage$0(StoryEntry storyEntry, long j, String str, BitmapFactory.Options options) {
        if (storyEntry.isVideo) {
            String str2 = storyEntry.thumbPath;
            if (str2 != null) {
                return BitmapFactory.decodeFile(str2, options);
            }
            try {
                return MediaStore.Video.Thumbnails.getThumbnail(getContext().getContentResolver(), j, 1, options);
            } catch (Throwable unused) {
                invalidate();
                return null;
            }
        }
        return BitmapFactory.decodeFile(str, options);
    }

    public void setupGradient() {
        final int measuredHeight = getMeasuredHeight() > 0 ? getMeasuredHeight() : AndroidUtilities.displaySize.y;
        StoryEntry storyEntry = this.entry;
        if (storyEntry.gradientTopColor == 0 || storyEntry.gradientBottomColor == 0) {
            Bitmap bitmap = this.bitmap;
            if (bitmap != null) {
                DominantColors.getColors(true, bitmap, true, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        PreviewView.this.lambda$setupGradient$1(measuredHeight, (int[]) obj);
                    }
                });
            } else {
                Bitmap bitmap2 = this.thumbBitmap;
                if (bitmap2 != null) {
                    DominantColors.getColors(true, bitmap2, true, new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            PreviewView.this.lambda$setupGradient$2(measuredHeight, (int[]) obj);
                        }
                    });
                } else {
                    this.gradientPaint.setShader(null);
                }
            }
        } else {
            Paint paint = this.gradientPaint;
            StoryEntry storyEntry2 = this.entry;
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, measuredHeight, new int[]{storyEntry2.gradientTopColor, storyEntry2.gradientBottomColor}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        }
        invalidate();
    }

    public void lambda$setupGradient$1(int i, int[] iArr) {
        StoryEntry storyEntry = this.entry;
        storyEntry.gradientTopColor = iArr[0];
        storyEntry.gradientBottomColor = iArr[1];
        this.gradientPaint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, i, iArr, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        invalidate();
    }

    public void lambda$setupGradient$2(int i, int[] iArr) {
        StoryEntry storyEntry = this.entry;
        storyEntry.gradientTopColor = iArr[0];
        storyEntry.gradientBottomColor = iArr[1];
        this.gradientPaint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, i, iArr, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        invalidate();
    }

    private void setupVideoPlayer(StoryEntry storyEntry, Runnable runnable, long j) {
        if (storyEntry == null) {
            VideoPlayer videoPlayer = this.videoPlayer;
            if (videoPlayer != null) {
                videoPlayer.pause();
                this.videoPlayer.releasePlayer(true);
                this.videoPlayer = null;
            }
            VideoEditTextureView videoEditTextureView = this.textureView;
            if (videoEditTextureView != null) {
                videoEditTextureView.clearAnimation();
                this.textureView.animate().alpha(0.0f).withEndAction(new Runnable() {
                    @Override
                    public final void run() {
                        PreviewView.this.lambda$setupVideoPlayer$3();
                    }
                }).start();
            }
            AndroidUtilities.cancelRunOnUIThread(this.updateProgressRunnable);
            if (runnable != null) {
                AndroidUtilities.runOnUIThread(runnable);
                return;
            }
            return;
        }
        VideoPlayer videoPlayer2 = this.videoPlayer;
        if (videoPlayer2 != null) {
            videoPlayer2.releasePlayer(true);
            this.videoPlayer = null;
        }
        VideoPlayer videoPlayer3 = new VideoPlayer();
        this.videoPlayer = videoPlayer3;
        videoPlayer3.setDelegate(new AnonymousClass2(storyEntry, new Runnable[]{runnable}));
        VideoEditTextureView videoEditTextureView2 = this.textureView;
        if (videoEditTextureView2 != null) {
            videoEditTextureView2.clearAnimation();
            this.textureView.release();
            removeView(this.textureView);
            this.textureView = null;
        }
        VideoEditTextureView videoEditTextureView3 = new VideoEditTextureView(getContext(), this.videoPlayer);
        this.textureView = videoEditTextureView3;
        videoEditTextureView3.setAlpha(runnable != null ? 1.0f : 0.0f);
        this.textureView.setOpaque(false);
        applyMatrix();
        addView(this.textureView, LayoutHelper.createFrame(-2, -2, 51));
        storyEntry.detectHDR(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                PreviewView.this.lambda$setupVideoPlayer$4((StoryEntry.HDRInfo) obj);
            }
        });
        Uri fromFile = Uri.fromFile(storyEntry.getOriginalFile());
        this.videoPlayer.preparePlayer(fromFile, "other");
        this.videoPlayer.setPlayWhenReady(this.pauseLinks.isEmpty());
        this.videoPlayer.setLooping(true);
        if (j > 0) {
            this.videoPlayer.seekTo(j);
        }
        this.videoPlayer.setMute(storyEntry.muted);
        this.videoTimelineView.setVideoPath(fromFile.toString(), storyEntry.left, storyEntry.right);
    }

    public void lambda$setupVideoPlayer$3() {
        VideoEditTextureView videoEditTextureView = this.textureView;
        if (videoEditTextureView != null) {
            videoEditTextureView.release();
            removeView(this.textureView);
            this.textureView = null;
        }
    }

    public class AnonymousClass2 implements VideoPlayer.VideoPlayerDelegate {
        final StoryEntry val$entry;
        final Runnable[] val$whenReadyFinal;

        @Override
        public void onRenderedFirstFrame(AnalyticsListener.EventTime eventTime) {
            VideoPlayer.VideoPlayerDelegate.CC.$default$onRenderedFirstFrame(this, eventTime);
        }

        @Override
        public void onSeekFinished(AnalyticsListener.EventTime eventTime) {
            VideoPlayer.VideoPlayerDelegate.CC.$default$onSeekFinished(this, eventTime);
        }

        @Override
        public void onSeekStarted(AnalyticsListener.EventTime eventTime) {
            VideoPlayer.VideoPlayerDelegate.CC.$default$onSeekStarted(this, eventTime);
        }

        @Override
        public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
            return false;
        }

        @Override
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        AnonymousClass2(StoryEntry storyEntry, Runnable[] runnableArr) {
            this.val$entry = storyEntry;
            this.val$whenReadyFinal = runnableArr;
        }

        @Override
        public void onStateChanged(boolean z, int i) {
            if (PreviewView.this.videoPlayer == null) {
                return;
            }
            if (PreviewView.this.videoPlayer == null || !PreviewView.this.videoPlayer.isPlaying()) {
                AndroidUtilities.cancelRunOnUIThread(PreviewView.this.updateProgressRunnable);
            } else {
                AndroidUtilities.runOnUIThread(PreviewView.this.updateProgressRunnable);
            }
        }

        @Override
        public void onError(VideoPlayer videoPlayer, Exception exc) {
            if (PreviewView.this.onErrorListener != null) {
                PreviewView.this.onErrorListener.run();
            }
        }

        @Override
        public void onVideoSizeChanged(int i, int i2, int i3, float f) {
            StoryEntry storyEntry = this.val$entry;
            if (storyEntry != null) {
                storyEntry.hdrInfo = PreviewView.this.videoPlayer.getHDRStaticInfo(this.val$entry.hdrInfo);
                if (PreviewView.this.textureView != null) {
                    PreviewView.this.textureView.setHDRInfo(this.val$entry.hdrInfo);
                }
            }
            PreviewView.this.videoWidth = (int) (i * f);
            PreviewView.this.videoHeight = (int) (i2 * f);
            StoryEntry storyEntry2 = this.val$entry;
            if (storyEntry2 != null && (storyEntry2.width != PreviewView.this.videoWidth || this.val$entry.height != PreviewView.this.videoHeight)) {
                this.val$entry.width = PreviewView.this.videoWidth;
                this.val$entry.height = PreviewView.this.videoHeight;
                this.val$entry.setupMatrix();
            }
            PreviewView.this.applyMatrix();
            if (PreviewView.this.textureView != null) {
                PreviewView.this.textureView.setVideoSize(PreviewView.this.videoWidth, PreviewView.this.videoHeight);
            }
        }

        @Override
        public void onRenderedFirstFrame() {
            Runnable[] runnableArr = this.val$whenReadyFinal;
            if (runnableArr[0] == null) {
                if (PreviewView.this.textureView != null) {
                    ViewPropertyAnimator duration = PreviewView.this.textureView.animate().alpha(1.0f).setDuration(180L);
                    final StoryEntry storyEntry = this.val$entry;
                    duration.withEndAction(new Runnable() {
                        @Override
                        public final void run() {
                            PreviewView.AnonymousClass2.this.lambda$onRenderedFirstFrame$0(storyEntry);
                        }
                    }).start();
                    return;
                }
                return;
            }
            PreviewView.this.post(runnableArr[0]);
            this.val$whenReadyFinal[0] = null;
            if (PreviewView.this.bitmap != null) {
                PreviewView.this.bitmap.recycle();
                if (this.val$entry.blurredVideoThumb == PreviewView.this.bitmap) {
                    this.val$entry.blurredVideoThumb = null;
                }
                PreviewView.this.bitmap = null;
                PreviewView.this.invalidate();
            }
        }

        public void lambda$onRenderedFirstFrame$0(StoryEntry storyEntry) {
            if (PreviewView.this.bitmap != null) {
                PreviewView.this.bitmap.recycle();
                if (storyEntry.blurredVideoThumb == PreviewView.this.bitmap) {
                    storyEntry.blurredVideoThumb = null;
                }
                PreviewView.this.bitmap = null;
                PreviewView.this.invalidate();
            }
        }
    }

    public void lambda$setupVideoPlayer$4(StoryEntry.HDRInfo hDRInfo) {
        VideoEditTextureView videoEditTextureView = this.textureView;
        if (videoEditTextureView != null) {
            videoEditTextureView.setHDRInfo(hDRInfo);
        }
    }

    public long release() {
        VideoPlayer videoPlayer = this.videoPlayer;
        if (videoPlayer != null) {
            long currentPosition = videoPlayer.getCurrentPosition();
            this.videoPlayer.pause();
            this.videoPlayer.releasePlayer(true);
            this.videoPlayer = null;
            return currentPosition;
        }
        return 0L;
    }

    public void setupParts(StoryEntry storyEntry) {
        boolean z;
        if (storyEntry == null) {
            for (Bitmap bitmap : this.partsBitmap.values()) {
                if (bitmap != null) {
                    bitmap.recycle();
                }
            }
            this.partsBitmap.clear();
            this.partsBounce.clear();
            return;
        }
        int measuredWidth = getMeasuredWidth() <= 0 ? AndroidUtilities.displaySize.x : getMeasuredWidth();
        int i = (int) ((measuredWidth * 16) / 9.0f);
        for (int i2 = 0; i2 < storyEntry.parts.size(); i2++) {
            StoryEntry.Part part = storyEntry.parts.get(i2);
            if (part != null && this.partsBitmap.get(Integer.valueOf(part.id)) == null) {
                String path = part.file.getPath();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(path, options);
                options.inJustDecodeBounds = false;
                options.inSampleSize = StoryEntry.calculateInSampleSize(options, measuredWidth, i);
                this.partsBitmap.put(Integer.valueOf(part.id), BitmapFactory.decodeFile(path, options));
            }
        }
        Iterator<Map.Entry<Integer, Bitmap>> it = this.partsBitmap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, Bitmap> next = it.next();
            int i3 = 0;
            while (true) {
                if (i3 >= storyEntry.parts.size()) {
                    z = false;
                    break;
                } else if (storyEntry.parts.get(i3).id == next.getKey().intValue()) {
                    z = true;
                    break;
                } else {
                    i3++;
                }
            }
            if (!z) {
                it.remove();
                this.partsBounce.remove(next.getKey());
            }
        }
    }

    public void setFilterTextureView(TextureView textureView) {
        TextureView textureView2 = this.filterTextureView;
        if (textureView2 != null) {
            removeView(textureView2);
            this.filterTextureView = null;
        }
        this.filterTextureView = textureView;
        if (textureView != null) {
            addView(textureView);
        }
    }

    public void lambda$new$5() {
        VideoPlayer videoPlayer = this.videoPlayer;
        if (videoPlayer == null) {
            return;
        }
        float currentPosition = ((float) videoPlayer.getCurrentPosition()) / ((float) getDuration());
        if (!this.videoTimelineView.isDragging()) {
            StoryEntry storyEntry = this.entry;
            if ((currentPosition < storyEntry.left || currentPosition > storyEntry.right) && System.currentTimeMillis() - this.seekedLastTime > 500) {
                this.seekedLastTime = System.currentTimeMillis();
                this.videoPlayer.seekTo(this.entry.left * ((float) getDuration()));
            }
        }
        this.videoTimelineView.setProgress(Utilities.clamp(currentPosition, this.videoTimelineView.getRightProgress(), this.videoTimelineView.getLeftProgress()));
        if (this.videoPlayer.isPlaying()) {
            AndroidUtilities.cancelRunOnUIThread(this.updateProgressRunnable);
            AndroidUtilities.runOnUIThread(this.updateProgressRunnable, 1000.0f / AndroidUtilities.screenRefreshRate);
        }
    }

    public void whenError(Runnable runnable) {
        this.onErrorListener = runnable;
    }

    public void mute(boolean z) {
        VideoPlayer videoPlayer = this.videoPlayer;
        if (videoPlayer == null) {
            return;
        }
        videoPlayer.setMute(z);
    }

    private void extractPointsData(Matrix matrix) {
        StoryEntry storyEntry = this.entry;
        if (storyEntry == null) {
            return;
        }
        float[] fArr = this.vertices;
        fArr[0] = storyEntry.width / 2.0f;
        fArr[1] = storyEntry.height / 2.0f;
        matrix.mapPoints(fArr);
        float[] fArr2 = this.vertices;
        this.cx = fArr2[0];
        this.cy = fArr2[1];
        StoryEntry storyEntry2 = this.entry;
        fArr2[0] = storyEntry2.width;
        fArr2[1] = storyEntry2.height / 2.0f;
        matrix.mapPoints(fArr2);
        float[] fArr3 = this.vertices;
        this.angle = (float) Math.toDegrees(Math.atan2(fArr3[1] - this.cy, fArr3[0] - this.cx));
        float f = this.cx;
        float f2 = this.cy;
        float[] fArr4 = this.vertices;
        MathUtils.distance(f, f2, fArr4[0], fArr4[1]);
        float[] fArr5 = this.vertices;
        StoryEntry storyEntry3 = this.entry;
        fArr5[0] = storyEntry3.width / 2.0f;
        fArr5[1] = storyEntry3.height;
        matrix.mapPoints(fArr5);
        float f3 = this.cx;
        float f4 = this.cy;
        float[] fArr6 = this.vertices;
        this.h = MathUtils.distance(f3, f4, fArr6[0], fArr6[1]) * 2.0f;
    }

    public void setDraw(boolean z) {
        this.draw = z;
        invalidate();
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        Bitmap bitmap;
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.gradientPaint);
        if (this.draw && this.entry != null) {
            float f = this.thumbAlpha.set(this.bitmap != null);
            if (this.thumbBitmap != null && 1.0f - f > 0.0f) {
                this.matrix.set(this.entry.matrix);
                this.matrix.preScale(this.entry.width / this.thumbBitmap.getWidth(), this.entry.height / this.thumbBitmap.getHeight());
                this.matrix.postScale(getWidth() / this.entry.resultWidth, getHeight() / this.entry.resultHeight);
                this.bitmapPaint.setAlpha(255);
                canvas.drawBitmap(this.thumbBitmap, this.matrix, this.bitmapPaint);
            }
            if (this.bitmap != null) {
                this.matrix.set(this.entry.matrix);
                this.matrix.preScale(this.entry.width / this.bitmap.getWidth(), this.entry.height / this.bitmap.getHeight());
                this.matrix.postScale(getWidth() / this.entry.resultWidth, getHeight() / this.entry.resultHeight);
                this.bitmapPaint.setAlpha((int) (f * 255.0f));
                canvas.drawBitmap(this.bitmap, this.matrix, this.bitmapPaint);
            }
        }
        super.dispatchDraw(canvas);
        if (!this.draw || this.entry == null) {
            return;
        }
        float f2 = this.trashT.set(!this.inTrash);
        for (int i = 0; i < this.entry.parts.size(); i++) {
            StoryEntry.Part part = this.entry.parts.get(i);
            if (part != null && (bitmap = this.partsBitmap.get(Integer.valueOf(part.id))) != null) {
                ButtonBounce buttonBounce = this.partsBounce.get(Integer.valueOf(part.id));
                float scale = buttonBounce != null ? buttonBounce.getScale(0.05f) : 1.0f;
                this.matrix.set(part.matrix);
                canvas.save();
                if (scale != 1.0f) {
                    float[] fArr = this.tempVertices;
                    fArr[0] = part.width / 2.0f;
                    fArr[1] = part.height / 2.0f;
                    this.matrix.mapPoints(fArr);
                    canvas.scale(scale, scale, (this.tempVertices[0] / this.entry.resultWidth) * getWidth(), (this.tempVertices[1] / this.entry.resultHeight) * getHeight());
                }
                if (this.trashPartIndex == part.id) {
                    float lerp = AndroidUtilities.lerp(0.2f, 1.0f, f2);
                    canvas.scale(lerp, lerp, this.trashCx, this.trashCy);
                }
                this.matrix.preScale(part.width / bitmap.getWidth(), part.height / bitmap.getHeight());
                this.matrix.postScale(getWidth() / this.entry.resultWidth, getHeight() / this.entry.resultHeight);
                canvas.drawBitmap(bitmap, this.matrix, this.bitmapPaint);
                canvas.restore();
            }
        }
    }

    public VideoEditTextureView getTextureView() {
        return this.textureView;
    }

    public Pair<Integer, Integer> getPaintSize() {
        if (this.entry == null) {
            return new Pair<>(1080, 1920);
        }
        return new Pair<>(Integer.valueOf(this.entry.resultWidth), Integer.valueOf(this.entry.resultHeight));
    }

    public Bitmap getPhotoBitmap() {
        return this.bitmap;
    }

    public int getOrientation() {
        StoryEntry storyEntry = this.entry;
        if (storyEntry == null) {
            return 0;
        }
        return storyEntry.orientation;
    }

    @Override
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 8) {
            set(null);
        }
    }

    public void applyMatrix() {
        StoryEntry storyEntry = this.entry;
        if (storyEntry == null) {
            return;
        }
        if (this.textureView != null) {
            this.matrix.set(storyEntry.matrix);
            Matrix matrix = this.matrix;
            float width = 1.0f / getWidth();
            int i = this.entry.width;
            if (i < 0) {
                i = this.videoWidth;
            }
            float f = width * i;
            float height = 1.0f / getHeight();
            int i2 = this.entry.height;
            if (i2 < 0) {
                i2 = this.videoHeight;
            }
            matrix.preScale(f, height * i2);
            this.matrix.postScale(getWidth() / this.entry.resultWidth, getHeight() / this.entry.resultHeight);
            this.textureView.setTransform(this.matrix);
            this.textureView.invalidate();
        }
        invalidate();
    }

    public void setAllowCropping(boolean z) {
        this.allowCropping = z;
    }

    private boolean touchEvent(android.view.MotionEvent r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.recorder.PreviewView.touchEvent(android.view.MotionEvent):boolean");
    }

    public void deleteCurrentPart() {
        IStoryPart iStoryPart = this.activePart;
        if (iStoryPart != null) {
            this.entry.parts.remove(iStoryPart);
            setupParts(this.entry);
        }
    }

    private IStoryPart findPartAt(float f, float f2) {
        for (int size = this.entry.parts.size() - 1; size >= 0; size--) {
            StoryEntry.Part part = this.entry.parts.get(size);
            this.tempVertices[0] = (f / getWidth()) * this.entry.resultWidth;
            this.tempVertices[1] = (f2 / getHeight()) * this.entry.resultHeight;
            if (this.tempMatrix == null) {
                this.tempMatrix = new Matrix();
            }
            part.matrix.invert(this.tempMatrix);
            this.tempMatrix.mapPoints(this.tempVertices);
            float[] fArr = this.tempVertices;
            if (fArr[0] >= 0.0f && fArr[0] <= part.width && fArr[1] >= 0.0f && fArr[1] <= part.height) {
                return part;
            }
        }
        return this.entry;
    }

    private boolean tapTouchEvent(MotionEvent motionEvent) {
        Runnable runnable;
        if (motionEvent.getAction() == 0) {
            this.tapTime = System.currentTimeMillis();
            motionEvent.getX();
            motionEvent.getY();
            return true;
        } else if (motionEvent.getAction() == 1) {
            if (System.currentTimeMillis() - this.tapTime <= ViewConfiguration.getTapTimeout() && (runnable = this.onTap) != null) {
                runnable.run();
            }
            this.tapTime = 0L;
            return true;
        } else if (motionEvent.getAction() == 3) {
            this.tapTime = 0L;
            return false;
        } else {
            return false;
        }
    }

    public void setOnTapListener(Runnable runnable) {
        this.onTap = runnable;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.allowCropping) {
            touchEvent(motionEvent);
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z = touchEvent(motionEvent);
        if (!(this.activePart instanceof StoryEntry.Part)) {
            z = additionalTouchEvent(motionEvent) || z;
            tapTouchEvent(motionEvent);
        }
        if (z) {
            if (motionEvent.getPointerCount() <= 1) {
                super.dispatchTouchEvent(motionEvent);
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void updatePauseReason(int i, boolean z) {
        if (z) {
            this.pauseLinks.add(Integer.valueOf(i));
        } else {
            this.pauseLinks.remove(Integer.valueOf(i));
        }
        VideoPlayer videoPlayer = this.videoPlayer;
        if (videoPlayer != null) {
            videoPlayer.setPlayWhenReady(this.pauseLinks.isEmpty());
        }
    }

    public boolean isPlaying() {
        return !this.pauseLinks.contains(-9982);
    }

    public void play(boolean z) {
        updatePauseReason(-9982, !z);
    }
}
