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
import android.text.TextUtils;
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
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$DocumentAttribute;
import org.telegram.tgnet.TLRPC$Message;
import org.telegram.tgnet.TLRPC$TL_documentAttributeAudio;
import org.telegram.tgnet.TLRPC$TL_documentAttributeFilename;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.BlurringShader;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Paint.Views.RoundView;
import org.telegram.ui.Components.PhotoFilterView;
import org.telegram.ui.Components.VideoEditTextureView;
import org.telegram.ui.Components.VideoPlayer;
import org.telegram.ui.Stories.recorder.PreviewView;
import org.telegram.ui.Stories.recorder.StoryEntry;
import org.telegram.ui.Stories.recorder.TimelineView;
public class PreviewView extends FrameLayout {
    private float Tx;
    private float Ty;
    private IStoryPart activePart;
    private boolean activePartPressed;
    private boolean allowCropping;
    private boolean allowRotation;
    private boolean allowWithSingleTouch;
    private float angle;
    private VideoPlayer audioPlayer;
    private Bitmap bitmap;
    private final Paint bitmapPaint;
    private final BlurringShader.BlurManager blurManager;
    private float cx;
    private float cy;
    private boolean doNotSpanRotation;
    private boolean draw;
    private StoryEntry entry;
    public TextureView filterTextureView;
    private Matrix finalMatrix;
    private int gradientBottom;
    private final Paint gradientPaint;
    private int gradientTop;
    private float h;
    private boolean inTrash;
    public Runnable invalidateBlur;
    public boolean isMuted;
    private boolean isPart;
    private long lastPos;
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
    private PhotoFilterView photoFilterView;
    private float rotationDiff;
    private VideoPlayer roundPlayer;
    private int roundPlayerHeight;
    private int roundPlayerWidth;
    private RoundView roundView;
    private long seekedLastTime;
    private final Paint snapPaint;
    private boolean snappedRotation;
    private long tapTime;
    private Matrix tempMatrix;
    private float[] tempVertices;
    private VideoEditTextureView textureView;
    private final AnimatedFloat thumbAlpha;
    private Bitmap thumbBitmap;
    private TimelineView timelineView;
    private final PointF touch;
    private Matrix touchMatrix;
    private float trashCx;
    private float trashCy;
    private int trashPartIndex;
    private AnimatedFloat trashT;
    private final Runnable updateAudioProgressRunnable;
    private final Runnable updateProgressRunnable;
    private final Runnable updateRoundProgressRunnable;
    private final float[] vertices;
    private int videoHeight;
    private VideoPlayer videoPlayer;
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

    public void onRoundRemove() {
    }

    public void onRoundSelectChange(boolean z) {
    }

    public PreviewView(Context context, BlurringShader.BlurManager blurManager) {
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
        this.updateAudioProgressRunnable = new Runnable() {
            @Override
            public final void run() {
                PreviewView.this.lambda$new$6();
            }
        };
        this.updateRoundProgressRunnable = new Runnable() {
            @Override
            public final void run() {
                PreviewView.this.lambda$new$7();
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
        this.blurManager = blurManager;
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setShadowLayer(AndroidUtilities.dp(3.0f), 0.0f, AndroidUtilities.dp(1.0f), 1073741824);
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
        if (videoPlayer == null || videoPlayer.getDuration() == -9223372036854775807L) {
            return 1L;
        }
        return this.videoPlayer.getDuration();
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
            setupAudio((StoryEntry) null, false);
            setupRound(null, null, false);
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
        setupAudio(storyEntry, false);
        setupRound(storyEntry, null, false);
    }

    public void setupAudio(StoryEntry storyEntry, boolean z) {
        VideoPlayer videoPlayer = this.audioPlayer;
        if (videoPlayer != null) {
            videoPlayer.pause();
            this.audioPlayer.releasePlayer(true);
            this.audioPlayer = null;
        }
        if (storyEntry == null) {
            return;
        }
        TimelineView timelineView = this.timelineView;
        if (timelineView != null) {
            timelineView.setAudio(storyEntry.audioPath, storyEntry.audioAuthor, storyEntry.audioTitle, storyEntry.audioDuration, storyEntry.audioOffset, storyEntry.audioLeft, storyEntry.audioRight, storyEntry.audioVolume, z);
        }
        if (storyEntry.audioPath != null) {
            VideoPlayer videoPlayer2 = new VideoPlayer();
            this.audioPlayer = videoPlayer2;
            videoPlayer2.allowMultipleInstances = true;
            videoPlayer2.setDelegate(new VideoPlayer.VideoPlayerDelegate() {
                @Override
                public void onError(VideoPlayer videoPlayer3, Exception exc) {
                }

                @Override
                public void onRenderedFirstFrame() {
                }

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

                @Override
                public void onVideoSizeChanged(int i, int i2, int i3, float f) {
                }

                @Override
                public void onStateChanged(boolean z2, int i) {
                    AndroidUtilities.cancelRunOnUIThread(PreviewView.this.updateAudioProgressRunnable);
                    if (PreviewView.this.audioPlayer == null || !PreviewView.this.audioPlayer.isPlaying()) {
                        return;
                    }
                    AndroidUtilities.runOnUIThread(PreviewView.this.updateAudioProgressRunnable);
                }
            });
            this.audioPlayer.preparePlayer(Uri.fromFile(new File(storyEntry.audioPath)), "other");
            checkVolumes();
            if (this.videoPlayer != null && getDuration() > 0) {
                long duration = storyEntry.left * ((float) getDuration());
                this.videoPlayer.seekTo(duration);
                this.timelineView.setProgress(duration);
            }
            updateAudioPlayer(true);
        }
    }

    public void setupAudio(MessageObject messageObject, boolean z) {
        TLRPC$Message tLRPC$Message;
        StoryEntry storyEntry = this.entry;
        if (storyEntry != null) {
            storyEntry.editedMedia = true;
            if (messageObject == null || (tLRPC$Message = messageObject.messageOwner) == null) {
                storyEntry.audioPath = null;
                storyEntry.audioAuthor = null;
                storyEntry.audioTitle = null;
                storyEntry.audioOffset = 0L;
                storyEntry.audioDuration = 0L;
                storyEntry.audioLeft = 0.0f;
                storyEntry.audioRight = 1.0f;
            } else {
                storyEntry.audioPath = tLRPC$Message.attachPath;
                storyEntry.audioAuthor = null;
                storyEntry.audioTitle = null;
                TLRPC$Document document = messageObject.getDocument();
                if (document != null) {
                    Iterator<TLRPC$DocumentAttribute> it = document.attributes.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        TLRPC$DocumentAttribute next = it.next();
                        if (next instanceof TLRPC$TL_documentAttributeAudio) {
                            this.entry.audioAuthor = next.performer;
                            if (!TextUtils.isEmpty(next.title)) {
                                this.entry.audioTitle = next.title;
                            }
                            this.entry.audioDuration = (long) (next.duration * 1000.0d);
                        } else if (next instanceof TLRPC$TL_documentAttributeFilename) {
                            this.entry.audioTitle = next.file_name;
                        }
                    }
                }
                StoryEntry storyEntry2 = this.entry;
                storyEntry2.audioOffset = 0L;
                if (storyEntry2.isVideo) {
                    storyEntry2.audioOffset = storyEntry2.left * ((float) getDuration());
                }
                StoryEntry storyEntry3 = this.entry;
                storyEntry3.audioLeft = 0.0f;
                long min = Math.min((storyEntry3 == null || !storyEntry3.isVideo) ? storyEntry3.audioDuration : getDuration(), 120000L);
                StoryEntry storyEntry4 = this.entry;
                storyEntry4.audioRight = storyEntry4.audioDuration != 0 ? Math.min(1.0f, ((float) Math.min(min, 59000L)) / ((float) this.entry.audioDuration)) : 1.0f;
            }
        }
        setupAudio(this.entry, z);
    }

    public void seekTo(long j) {
        VideoPlayer videoPlayer = this.videoPlayer;
        if (videoPlayer != null) {
            videoPlayer.seekTo(j, false);
        } else {
            VideoPlayer videoPlayer2 = this.roundPlayer;
            if (videoPlayer2 != null) {
                videoPlayer2.seekTo(j, false);
            } else {
                VideoPlayer videoPlayer3 = this.audioPlayer;
                if (videoPlayer3 != null) {
                    videoPlayer3.seekTo(j, false);
                }
            }
        }
        updateAudioPlayer(true);
        updateRoundPlayer(true);
    }

    public void seek(long j) {
        seekTo(j);
        TimelineView timelineView = this.timelineView;
        if (timelineView != null) {
            timelineView.setProgress(0L);
        }
    }

    public void setVideoTimelineView(TimelineView timelineView) {
        this.timelineView = timelineView;
        if (timelineView != null) {
            timelineView.setDelegate(new TimelineView.TimelineDelegate() {
                @Override
                public void onProgressDragChange(boolean z) {
                    PreviewView.this.updatePauseReason(-4, z);
                }

                @Override
                public void onProgressChange(long j, boolean z) {
                    if (!z) {
                        PreviewView.this.seekTo(j);
                    } else if (PreviewView.this.videoPlayer != null) {
                        PreviewView.this.videoPlayer.seekTo(j, true);
                    } else if (PreviewView.this.audioPlayer != null) {
                        PreviewView.this.audioPlayer.seekTo(j, false);
                    }
                }

                @Override
                public void onVideoVolumeChange(float f) {
                    if (PreviewView.this.entry == null) {
                        return;
                    }
                    PreviewView.this.entry.videoVolume = f;
                    PreviewView.this.checkVolumes();
                }

                @Override
                public void onVideoLeftChange(float f) {
                    if (PreviewView.this.entry == null) {
                        return;
                    }
                    PreviewView.this.entry.left = f;
                    PreviewView.this.entry.editedMedia = true;
                    if (PreviewView.this.videoPlayer == null || PreviewView.this.videoPlayer.getDuration() == -9223372036854775807L) {
                        return;
                    }
                    PreviewView previewView = PreviewView.this;
                    previewView.seekTo(f * ((float) previewView.videoPlayer.getDuration()));
                }

                @Override
                public void onVideoRightChange(float f) {
                    if (PreviewView.this.entry == null) {
                        return;
                    }
                    PreviewView.this.entry.right = f;
                    PreviewView.this.entry.editedMedia = true;
                }

                @Override
                public void onAudioLeftChange(float f) {
                    if (PreviewView.this.entry == null) {
                        return;
                    }
                    PreviewView.this.entry.audioLeft = f;
                    PreviewView.this.entry.editedMedia = true;
                    PreviewView.this.updateAudioPlayer(true);
                }

                @Override
                public void onAudioRightChange(float f) {
                    if (PreviewView.this.entry == null) {
                        return;
                    }
                    PreviewView.this.entry.audioRight = f;
                    PreviewView.this.entry.editedMedia = true;
                    PreviewView.this.updateAudioPlayer(true);
                }

                @Override
                public void onAudioOffsetChange(long j) {
                    if (PreviewView.this.entry == null) {
                        return;
                    }
                    PreviewView.this.entry.audioOffset = j;
                    PreviewView.this.entry.editedMedia = true;
                    PreviewView.this.updateAudioPlayer(true);
                }

                @Override
                public void onAudioRemove() {
                    PreviewView.this.setupAudio((MessageObject) null, true);
                }

                @Override
                public void onAudioVolumeChange(float f) {
                    if (PreviewView.this.entry == null) {
                        return;
                    }
                    PreviewView.this.entry.audioVolume = f;
                    PreviewView.this.entry.editedMedia = true;
                    PreviewView.this.checkVolumes();
                }

                @Override
                public void onRoundLeftChange(float f) {
                    if (PreviewView.this.entry == null) {
                        return;
                    }
                    PreviewView.this.entry.roundLeft = f;
                    PreviewView.this.entry.editedMedia = true;
                    PreviewView.this.updateRoundPlayer(true);
                }

                @Override
                public void onRoundRightChange(float f) {
                    if (PreviewView.this.entry == null) {
                        return;
                    }
                    PreviewView.this.entry.roundRight = f;
                    PreviewView.this.entry.editedMedia = true;
                    PreviewView.this.updateRoundPlayer(true);
                }

                @Override
                public void onRoundOffsetChange(long j) {
                    if (PreviewView.this.entry == null) {
                        return;
                    }
                    PreviewView.this.entry.roundOffset = j;
                    PreviewView.this.entry.editedMedia = true;
                    PreviewView.this.updateRoundPlayer(true);
                }

                @Override
                public void onRoundRemove() {
                    PreviewView.this.setupRound(null, null, true);
                    PreviewView.this.onRoundRemove();
                }

                @Override
                public void onRoundVolumeChange(float f) {
                    if (PreviewView.this.entry == null) {
                        return;
                    }
                    PreviewView.this.entry.roundVolume = f;
                    PreviewView.this.entry.editedMedia = true;
                    PreviewView.this.checkVolumes();
                }

                @Override
                public void onRoundSelectChange(boolean z) {
                    PreviewView.this.onRoundSelectChange(z);
                }
            });
        }
    }

    private void setupImage(final StoryEntry storyEntry) {
        BlurringShader.BlurManager blurManager;
        String str;
        Uri withAppendedId;
        Bitmap bitmap = this.bitmap;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.bitmap.recycle();
        }
        this.bitmap = null;
        Bitmap bitmap2 = this.thumbBitmap;
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            this.thumbBitmap.recycle();
        }
        this.thumbBitmap = null;
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
                Bitmap scaledBitmap = StoryEntry.getScaledBitmap(new StoryEntry.DecodeBitmap() {
                    @Override
                    public final Bitmap decode(BitmapFactory.Options options) {
                        Bitmap lambda$setupImage$0;
                        lambda$setupImage$0 = PreviewView.this.lambda$setupImage$0(storyEntry, j2, path, options);
                        return lambda$setupImage$0;
                    }
                }, measuredWidth, i, false);
                this.bitmap = scaledBitmap;
                BlurringShader.BlurManager blurManager2 = this.blurManager;
                if (blurManager2 == null || scaledBitmap == null) {
                    return;
                }
                blurManager2.resetBitmap();
                this.blurManager.setFallbackBlur(storyEntry.buildBitmap(0.2f, this.bitmap), 0);
                Runnable runnable = this.invalidateBlur;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            } else if (!storyEntry.isDraft && storyEntry.isVideo && bitmap4 != null) {
                storyEntry.width = bitmap4.getWidth();
                storyEntry.height = this.bitmap.getHeight();
                storyEntry.setupMatrix();
            }
        }
        if (storyEntry != null && (blurManager = this.blurManager) != null && this.bitmap != null) {
            blurManager.resetBitmap();
            this.blurManager.setFallbackBlur(storyEntry.buildBitmap(0.2f, this.bitmap), 0);
            Runnable runnable2 = this.invalidateBlur;
            if (runnable2 != null) {
                runnable2.run();
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
            int i = storyEntry2.gradientTopColor;
            this.gradientTop = i;
            int i2 = storyEntry2.gradientBottomColor;
            this.gradientBottom = i2;
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, measuredHeight, new int[]{i, i2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            VideoEditTextureView videoEditTextureView = this.textureView;
            if (videoEditTextureView != null) {
                videoEditTextureView.updateUiBlurGradient(this.gradientTop, this.gradientBottom);
            }
            PhotoFilterView photoFilterView = this.photoFilterView;
            if (photoFilterView != null) {
                photoFilterView.updateUiBlurGradient(this.gradientTop, this.gradientBottom);
            }
        }
        invalidate();
    }

    public void lambda$setupGradient$1(int i, int[] iArr) {
        StoryEntry storyEntry = this.entry;
        int i2 = iArr[0];
        this.gradientTop = i2;
        storyEntry.gradientTopColor = i2;
        int i3 = iArr[1];
        this.gradientBottom = i3;
        storyEntry.gradientBottomColor = i3;
        this.gradientPaint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, i, iArr, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        invalidate();
        VideoEditTextureView videoEditTextureView = this.textureView;
        if (videoEditTextureView != null) {
            videoEditTextureView.updateUiBlurGradient(this.gradientTop, this.gradientBottom);
        }
        PhotoFilterView photoFilterView = this.photoFilterView;
        if (photoFilterView != null) {
            photoFilterView.updateUiBlurGradient(this.gradientTop, this.gradientBottom);
        }
    }

    public void lambda$setupGradient$2(int i, int[] iArr) {
        StoryEntry storyEntry = this.entry;
        int i2 = iArr[0];
        this.gradientTop = i2;
        storyEntry.gradientTopColor = i2;
        int i3 = iArr[1];
        this.gradientBottom = i3;
        storyEntry.gradientBottomColor = i3;
        this.gradientPaint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, i, iArr, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        invalidate();
        VideoEditTextureView videoEditTextureView = this.textureView;
        if (videoEditTextureView != null) {
            videoEditTextureView.updateUiBlurGradient(this.gradientTop, this.gradientBottom);
        }
        PhotoFilterView photoFilterView = this.photoFilterView;
        if (photoFilterView != null) {
            photoFilterView.updateUiBlurGradient(this.gradientTop, this.gradientBottom);
        }
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
            TimelineView timelineView = this.timelineView;
            if (timelineView != null) {
                timelineView.setVideo(null, 1L, 0.0f);
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
        videoPlayer3.allowMultipleInstances = true;
        videoPlayer3.setDelegate(new AnonymousClass3(storyEntry, new Runnable[]{runnable}));
        VideoEditTextureView videoEditTextureView2 = this.textureView;
        if (videoEditTextureView2 != null) {
            videoEditTextureView2.clearAnimation();
            this.textureView.release();
            removeView(this.textureView);
            this.textureView = null;
        }
        this.textureView = new VideoEditTextureView(getContext(), this.videoPlayer);
        this.blurManager.resetBitmap();
        this.textureView.updateUiBlurManager(this.blurManager);
        this.textureView.setAlpha(runnable != null ? 1.0f : 0.0f);
        this.textureView.setOpaque(false);
        applyMatrix();
        addView(this.textureView, LayoutHelper.createFrame(-2, -2, 51));
        storyEntry.detectHDR(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                PreviewView.this.lambda$setupVideoPlayer$4((StoryEntry.HDRInfo) obj);
            }
        });
        this.videoPlayer.preparePlayer(Uri.fromFile(storyEntry.getOriginalFile()), "other");
        this.videoPlayer.setPlayWhenReady(this.pauseLinks.isEmpty());
        this.videoPlayer.setLooping(true);
        if (storyEntry.isEditSaved) {
            j = (storyEntry.left * ((float) storyEntry.duration)) + ((float) j);
        }
        if (j > 0) {
            this.videoPlayer.seekTo(j);
        }
        checkVolumes();
        updateAudioPlayer(true);
        this.timelineView.setVideo(storyEntry.getOriginalFile().getAbsolutePath(), getDuration(), storyEntry.videoVolume);
        this.timelineView.setVideoLeft(storyEntry.left);
        this.timelineView.setVideoRight(storyEntry.right);
        TimelineView timelineView2 = this.timelineView;
        if (timelineView2 == null || j <= 0) {
            return;
        }
        timelineView2.setProgress(j);
    }

    public void lambda$setupVideoPlayer$3() {
        VideoEditTextureView videoEditTextureView = this.textureView;
        if (videoEditTextureView != null) {
            videoEditTextureView.release();
            removeView(this.textureView);
            this.textureView = null;
        }
    }

    public class AnonymousClass3 implements VideoPlayer.VideoPlayerDelegate {
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

        AnonymousClass3(StoryEntry storyEntry, Runnable[] runnableArr) {
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
                            PreviewView.AnonymousClass3.this.lambda$onRenderedFirstFrame$0(storyEntry);
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

    public void setupRound(StoryEntry storyEntry, RoundView roundView, boolean z) {
        if (storyEntry == null || storyEntry.round == null) {
            VideoPlayer videoPlayer = this.roundPlayer;
            if (videoPlayer != null) {
                videoPlayer.pause();
                this.roundPlayer.releasePlayer(true);
                this.roundPlayer = null;
            }
            TimelineView timelineView = this.timelineView;
            if (timelineView != null) {
                timelineView.setRoundNull(z);
            }
            this.roundView = null;
            AndroidUtilities.cancelRunOnUIThread(this.updateProgressRunnable);
            return;
        }
        VideoPlayer videoPlayer2 = this.roundPlayer;
        if (videoPlayer2 != null) {
            videoPlayer2.releasePlayer(true);
            this.roundPlayer = null;
        }
        VideoPlayer videoPlayer3 = new VideoPlayer();
        this.roundPlayer = videoPlayer3;
        videoPlayer3.allowMultipleInstances = true;
        videoPlayer3.setDelegate(new VideoPlayer.VideoPlayerDelegate() {
            @Override
            public void onError(VideoPlayer videoPlayer4, Exception exc) {
            }

            @Override
            public void onRenderedFirstFrame() {
            }

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

            @Override
            public void onStateChanged(boolean z2, int i) {
                if (PreviewView.this.roundPlayer == null) {
                    return;
                }
                if (PreviewView.this.roundPlayer == null || !PreviewView.this.roundPlayer.isPlaying()) {
                    AndroidUtilities.cancelRunOnUIThread(PreviewView.this.updateRoundProgressRunnable);
                } else {
                    AndroidUtilities.runOnUIThread(PreviewView.this.updateRoundProgressRunnable);
                }
            }

            @Override
            public void onVideoSizeChanged(int i, int i2, int i3, float f) {
                PreviewView.this.roundPlayerWidth = i;
                PreviewView.this.roundPlayerHeight = i2;
                if (PreviewView.this.roundView != null) {
                    PreviewView.this.roundView.resizeTextureView(i, i2);
                }
            }
        });
        this.roundPlayer.preparePlayer(Uri.fromFile(storyEntry.round), "other");
        checkVolumes();
        attachRoundView(roundView);
        this.timelineView.setRound(storyEntry.round.getAbsolutePath(), storyEntry.roundDuration, storyEntry.roundOffset, storyEntry.roundLeft, storyEntry.roundRight, storyEntry.roundVolume, z);
        updateRoundPlayer(true);
    }

    public void attachRoundView(RoundView roundView) {
        VideoPlayer videoPlayer;
        this.roundView = roundView;
        if (roundView == null || (videoPlayer = this.roundPlayer) == null) {
            return;
        }
        videoPlayer.setTextureView(roundView.textureView);
    }

    public long release() {
        VideoPlayer videoPlayer = this.audioPlayer;
        if (videoPlayer != null) {
            videoPlayer.pause();
            this.audioPlayer.releasePlayer(true);
            this.audioPlayer = null;
        }
        long j = 0;
        VideoPlayer videoPlayer2 = this.roundPlayer;
        if (videoPlayer2 != null) {
            j = videoPlayer2.getCurrentPosition();
            this.roundPlayer.pause();
            this.roundPlayer.releasePlayer(true);
            this.roundPlayer = null;
        }
        VideoPlayer videoPlayer3 = this.videoPlayer;
        if (videoPlayer3 != null) {
            long currentPosition = videoPlayer3.getCurrentPosition();
            this.videoPlayer.pause();
            this.videoPlayer.releasePlayer(true);
            this.videoPlayer = null;
            return currentPosition;
        }
        return j;
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

    public void setFilterTextureView(TextureView textureView, PhotoFilterView photoFilterView) {
        TextureView textureView2 = this.filterTextureView;
        if (textureView2 != null) {
            removeView(textureView2);
            this.filterTextureView = null;
        }
        this.photoFilterView = photoFilterView;
        this.filterTextureView = textureView;
        if (photoFilterView != null) {
            photoFilterView.updateUiBlurGradient(this.gradientTop, this.gradientBottom);
        }
        TextureView textureView3 = this.filterTextureView;
        if (textureView3 != null) {
            addView(textureView3);
        }
    }

    public void lambda$new$5() {
        VideoPlayer videoPlayer = this.videoPlayer;
        if (videoPlayer == null || this.timelineView == null) {
            return;
        }
        long currentPosition = videoPlayer.getCurrentPosition();
        if (getDuration() > 1) {
            float duration = ((float) currentPosition) / ((float) getDuration());
            if (!this.timelineView.isDragging()) {
                StoryEntry storyEntry = this.entry;
                if ((duration < storyEntry.left || duration > storyEntry.right) && System.currentTimeMillis() - this.seekedLastTime > 500) {
                    this.seekedLastTime = System.currentTimeMillis();
                    VideoPlayer videoPlayer2 = this.videoPlayer;
                    long duration2 = this.entry.left * ((float) getDuration());
                    videoPlayer2.seekTo(duration2);
                    updateAudioPlayer(true);
                    updateRoundPlayer(true);
                    currentPosition = duration2;
                    this.timelineView.setProgress(this.videoPlayer.getCurrentPosition());
                }
            }
            updateAudioPlayer(currentPosition < this.lastPos);
            updateRoundPlayer(currentPosition < this.lastPos);
            this.timelineView.setProgress(this.videoPlayer.getCurrentPosition());
        } else {
            this.timelineView.setProgress(this.videoPlayer.getCurrentPosition());
        }
        if (this.videoPlayer.isPlaying()) {
            AndroidUtilities.cancelRunOnUIThread(this.updateProgressRunnable);
            AndroidUtilities.runOnUIThread(this.updateProgressRunnable, 1000.0f / AndroidUtilities.screenRefreshRate);
        }
        this.lastPos = currentPosition;
    }

    public void lambda$new$6() {
        VideoPlayer videoPlayer = this.audioPlayer;
        if (videoPlayer == null || this.videoPlayer != null || this.roundPlayer != null || this.timelineView == null) {
            return;
        }
        long currentPosition = videoPlayer.getCurrentPosition();
        StoryEntry storyEntry = this.entry;
        if (storyEntry != null) {
            float f = (float) currentPosition;
            float f2 = storyEntry.audioLeft;
            long j = storyEntry.audioDuration;
            if ((f < f2 * ((float) j) || f > storyEntry.audioRight * ((float) j)) && System.currentTimeMillis() - this.seekedLastTime > 500) {
                this.seekedLastTime = System.currentTimeMillis();
                VideoPlayer videoPlayer2 = this.audioPlayer;
                StoryEntry storyEntry2 = this.entry;
                long j2 = storyEntry2.audioLeft * ((float) storyEntry2.audioDuration);
                videoPlayer2.seekTo(j2);
                currentPosition = j2;
            }
        }
        this.timelineView.setProgress(currentPosition);
        if (this.audioPlayer.isPlaying()) {
            AndroidUtilities.cancelRunOnUIThread(this.updateAudioProgressRunnable);
            AndroidUtilities.runOnUIThread(this.updateAudioProgressRunnable, 1000.0f / AndroidUtilities.screenRefreshRate);
        }
    }

    public void lambda$new$7() {
        VideoPlayer videoPlayer = this.roundPlayer;
        if (videoPlayer == null || this.videoPlayer != null || this.timelineView == null) {
            return;
        }
        long currentPosition = videoPlayer.getCurrentPosition();
        StoryEntry storyEntry = this.entry;
        if (storyEntry != null) {
            float f = (float) currentPosition;
            float f2 = storyEntry.roundLeft;
            long j = storyEntry.roundDuration;
            if ((f < f2 * ((float) j) || f > storyEntry.roundRight * ((float) j)) && System.currentTimeMillis() - this.seekedLastTime > 500) {
                this.seekedLastTime = System.currentTimeMillis();
                VideoPlayer videoPlayer2 = this.roundPlayer;
                StoryEntry storyEntry2 = this.entry;
                long j2 = storyEntry2.roundLeft * ((float) storyEntry2.roundDuration);
                videoPlayer2.seekTo(j2);
                updateAudioPlayer(true);
                currentPosition = j2;
            }
        }
        this.timelineView.setProgress(currentPosition);
        if (this.roundPlayer.isPlaying()) {
            AndroidUtilities.cancelRunOnUIThread(this.updateRoundProgressRunnable);
            AndroidUtilities.runOnUIThread(this.updateRoundProgressRunnable, 1000.0f / AndroidUtilities.screenRefreshRate);
        }
    }

    public void updateAudioPlayer(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.recorder.PreviewView.updateAudioPlayer(boolean):void");
    }

    public void updateRoundPlayer(boolean z) {
        StoryEntry storyEntry;
        VideoPlayer videoPlayer = this.roundPlayer;
        if (videoPlayer == null || this.entry == null) {
            return;
        }
        VideoPlayer videoPlayer2 = this.videoPlayer;
        boolean z2 = false;
        if (videoPlayer2 == null) {
            videoPlayer.setPlayWhenReady(this.pauseLinks.isEmpty());
            this.roundPlayer.setLooping(true);
            RoundView roundView = this.roundView;
            if (roundView != null) {
                roundView.setShown(true, false);
            }
            long currentPosition = this.roundPlayer.getCurrentPosition();
            if (!z || this.roundPlayer.getDuration() == -9223372036854775807L) {
                return;
            }
            float duration = ((float) currentPosition) / ((float) this.roundPlayer.getDuration());
            StoryEntry storyEntry2 = this.entry;
            if ((duration < storyEntry2.roundLeft || duration > storyEntry2.roundRight) && System.currentTimeMillis() - this.seekedLastTime > 500) {
                this.seekedLastTime = System.currentTimeMillis();
                this.roundPlayer.seekTo(-this.entry.roundOffset);
                return;
            }
            return;
        }
        long currentPosition2 = videoPlayer2.getCurrentPosition();
        StoryEntry storyEntry3 = this.entry;
        long j = (storyEntry3.roundRight - storyEntry3.roundLeft) * ((float) storyEntry3.roundDuration);
        long j2 = storyEntry3.roundOffset;
        boolean z3 = currentPosition2 >= j2 && currentPosition2 <= j2 + j;
        if (this.videoPlayer.isPlaying() && z3) {
            z2 = true;
        }
        long j3 = (currentPosition2 - this.entry.roundOffset) + (storyEntry.roundLeft * ((float) storyEntry.roundDuration));
        RoundView roundView2 = this.roundView;
        if (roundView2 != null) {
            roundView2.setShown(z3, true);
        }
        if (this.roundPlayer.isPlaying() != z2) {
            this.roundPlayer.setPlayWhenReady(z2);
            this.roundPlayer.seekTo(j3);
        } else if (!z || Math.abs(this.roundPlayer.getCurrentPosition() - j3) <= 120) {
        } else {
            this.roundPlayer.seekTo(j3);
        }
    }

    public void whenError(Runnable runnable) {
        this.onErrorListener = runnable;
    }

    public void mute(boolean z) {
        this.isMuted = z;
        checkVolumes();
    }

    public void checkVolumes() {
        float f;
        StoryEntry storyEntry;
        VideoPlayer videoPlayer = this.videoPlayer;
        float f2 = 1.0f;
        if (videoPlayer != null) {
            videoPlayer.setVolume((this.isMuted || ((storyEntry = this.entry) != null && storyEntry.muted)) ? 0.0f : storyEntry != null ? storyEntry.videoVolume : 1.0f);
        }
        VideoPlayer videoPlayer2 = this.roundPlayer;
        if (videoPlayer2 != null) {
            if (this.isMuted) {
                f = 0.0f;
            } else {
                StoryEntry storyEntry2 = this.entry;
                f = storyEntry2 != null ? storyEntry2.roundVolume : 1.0f;
            }
            videoPlayer2.setVolume(f);
        }
        VideoPlayer videoPlayer3 = this.audioPlayer;
        if (videoPlayer3 != null) {
            if (this.isMuted) {
                f2 = 0.0f;
            } else {
                StoryEntry storyEntry3 = this.entry;
                if (storyEntry3 != null) {
                    f2 = storyEntry3.audioVolume;
                }
            }
            videoPlayer3.setVolume(f2);
        }
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
        updateAudioPlayer(true);
        updateRoundPlayer(true);
    }

    public boolean isPlaying() {
        return !this.pauseLinks.contains(-9982);
    }

    public void play(boolean z) {
        updatePauseReason(-9982, !z);
    }
}
