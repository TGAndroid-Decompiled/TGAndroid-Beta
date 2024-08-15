package org.telegram.ui.Stories.recorder;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.zxing.common.detector.MathUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC$ChatFull;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$DocumentAttribute;
import org.telegram.tgnet.TLRPC$Message;
import org.telegram.tgnet.TLRPC$TL_documentAttributeAudio;
import org.telegram.tgnet.TLRPC$TL_documentAttributeFilename;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$UserFull;
import org.telegram.tgnet.TLRPC$WallPaper;
import org.telegram.ui.ActionBar.EmojiThemes;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.BlurringShader;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.MotionBackgroundDrawable;
import org.telegram.ui.Components.Paint.Views.RoundView;
import org.telegram.ui.Components.PhotoFilterView;
import org.telegram.ui.Components.VideoEditTextureView;
import org.telegram.ui.Components.VideoPlayer;
import org.telegram.ui.Stories.recorder.PreviewView;
import org.telegram.ui.Stories.recorder.StoryEntry;
import org.telegram.ui.Stories.recorder.TimelineView;
public class PreviewView extends FrameLayout {
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
    public boolean drawForThemeToggle;
    private StoryEntry entry;
    public TextureView filterTextureView;
    private Matrix finalMatrix;
    private long finalSeekPosition;
    private int gradientBottom;
    private final Paint gradientPaint;
    private int gradientTop;
    private float h;
    public Runnable invalidateBlur;
    public boolean isMuted;
    private long lastPos;
    private final PointF lastTouch;
    private float lastTouchDistance;
    private double lastTouchRotation;
    private Drawable lastWallpaperDrawable;
    private final Matrix matrix;
    private boolean moving;
    private boolean multitouch;
    private Runnable onErrorListener;
    private Runnable onTap;
    private final HashSet<Integer> pauseLinks;
    private PhotoFilterView photoFilterView;
    private float rotationDiff;
    private VideoPlayer roundPlayer;
    private int roundPlayerHeight;
    private int roundPlayerWidth;
    private RoundView roundView;
    private long seekedLastTime;
    private Runnable slowerSeek;
    private boolean slowerSeekScheduled;
    private final Paint snapPaint;
    private boolean snappedRotation;
    private boolean snappedToCenterAndScaled;
    private long tapTime;
    private VideoEditTextureView textureView;
    private final TextureViewHolder textureViewHolder;
    private final AnimatedFloat thumbAlpha;
    private Bitmap thumbBitmap;
    private TimelineView timelineView;
    private final PointF touch;
    private Matrix touchMatrix;
    private final Runnable updateAudioProgressRunnable;
    private final Runnable updateProgressRunnable;
    private final Runnable updateRoundProgressRunnable;
    private final float[] vertices;
    private int videoHeight;
    private VideoPlayer videoPlayer;
    private int videoWidth;
    private float w;
    private Drawable wallpaperDrawable;
    private AnimatedFloat wallpaperDrawableCrossfade;

    public boolean additionalTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    protected void invalidateTextureViewHolder() {
    }

    public void onAudioChanged() {
    }

    public void onEntityDraggedBottom(boolean z) {
    }

    public void onEntityDraggedTop(boolean z) {
    }

    public void onRoundRemove() {
    }

    public void onRoundSelectChange(boolean z) {
    }

    public PreviewView(Context context, BlurringShader.BlurManager blurManager, TextureViewHolder textureViewHolder) {
        super(context);
        Paint paint = new Paint(1);
        this.snapPaint = paint;
        this.slowerSeek = new Runnable() {
            @Override
            public final void run() {
                PreviewView.this.lambda$new$0();
            }
        };
        this.updateProgressRunnable = new Runnable() {
            @Override
            public final void run() {
                PreviewView.this.lambda$new$8();
            }
        };
        this.updateAudioProgressRunnable = new Runnable() {
            @Override
            public final void run() {
                PreviewView.this.lambda$new$9();
            }
        };
        this.updateRoundProgressRunnable = new Runnable() {
            @Override
            public final void run() {
                PreviewView.this.lambda$new$10();
            }
        };
        this.wallpaperDrawableCrossfade = new AnimatedFloat(this, 0L, 350L, CubicBezierInterpolator.EASE_OUT_QUINT);
        this.bitmapPaint = new Paint(7);
        this.gradientPaint = new Paint(1);
        this.matrix = new Matrix();
        this.vertices = new float[2];
        this.draw = true;
        this.thumbAlpha = new AnimatedFloat(this, 0L, 320L, CubicBezierInterpolator.EASE_OUT);
        this.drawForThemeToggle = false;
        this.allowCropping = true;
        this.lastTouch = new PointF();
        this.touch = new PointF();
        this.touchMatrix = new Matrix();
        this.finalMatrix = new Matrix();
        this.pauseLinks = new HashSet<>();
        this.blurManager = blurManager;
        this.textureViewHolder = textureViewHolder;
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
            setupWallpaper(null, false);
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
                storyEntry.setupGradient(new PreviewView$$ExternalSyntheticLambda1(this));
            }
        } else {
            setupVideoPlayer(null, runnable, 0L);
            setupImage(storyEntry);
            setupGradient();
        }
        applyMatrix();
        setupWallpaper(storyEntry, false);
        setupAudio(storyEntry, false);
        setupRound(storyEntry, null, false);
    }

    public void preset(StoryEntry storyEntry) {
        this.entry = storyEntry;
        if (storyEntry == null) {
            setupImage(null);
            setupWallpaper(null, false);
            this.gradientPaint.setShader(null);
            setupAudio((StoryEntry) null, false);
            setupRound(null, null, false);
            return;
        }
        if (storyEntry.isVideo) {
            setupImage(storyEntry);
            if (storyEntry.gradientTopColor != 0 || storyEntry.gradientBottomColor != 0) {
                setupGradient();
            } else {
                storyEntry.setupGradient(new PreviewView$$ExternalSyntheticLambda1(this));
            }
        } else {
            setupImage(storyEntry);
            setupGradient();
        }
        applyMatrix();
        setupWallpaper(storyEntry, false);
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
                public void onVideoSizeChanged(int i, int i2, int i3, float f) {
                }

                {
                    PreviewView.this = this;
                }

                @Override
                public void onStateChanged(boolean z2, int i) {
                    AndroidUtilities.cancelRunOnUIThread(PreviewView.this.updateAudioProgressRunnable);
                    if (PreviewView.this.audioPlayer == null || !PreviewView.this.audioPlayer.isPlaying()) {
                        return;
                    }
                    AndroidUtilities.runOnUIThread(PreviewView.this.updateAudioProgressRunnable);
                }

                @Override
                public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                    PreviewView.this.invalidateTextureViewHolder();
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
        onAudioChanged();
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

    public void lambda$new$0() {
        seekTo(this.finalSeekPosition);
        this.slowerSeekScheduled = false;
    }

    public void seekTo(long j) {
        seekTo(j, false);
    }

    public void seekTo(long j, boolean z) {
        VideoPlayer videoPlayer = this.videoPlayer;
        if (videoPlayer != null) {
            videoPlayer.seekTo(j, z);
        } else {
            VideoPlayer videoPlayer2 = this.roundPlayer;
            if (videoPlayer2 != null) {
                videoPlayer2.seekTo(j, z);
            } else {
                VideoPlayer videoPlayer3 = this.audioPlayer;
                if (videoPlayer3 != null) {
                    videoPlayer3.seekTo(j, z);
                }
            }
        }
        updateAudioPlayer(true);
        updateRoundPlayer(true);
        if (z) {
            if (!this.slowerSeekScheduled || Math.abs(this.finalSeekPosition - j) > 450) {
                this.slowerSeekScheduled = true;
                AndroidUtilities.cancelRunOnUIThread(this.slowerSeek);
                AndroidUtilities.runOnUIThread(this.slowerSeek, 60L);
            }
            this.finalSeekPosition = j;
        }
    }

    public long getCurrentPosition() {
        VideoPlayer videoPlayer = this.videoPlayer;
        if (videoPlayer != null) {
            return videoPlayer.getCurrentPosition();
        }
        VideoPlayer videoPlayer2 = this.roundPlayer;
        if (videoPlayer2 != null) {
            return videoPlayer2.getCurrentPosition();
        }
        VideoPlayer videoPlayer3 = this.audioPlayer;
        if (videoPlayer3 != null) {
            return videoPlayer3.getCurrentPosition();
        }
        return 0L;
    }

    public void getCoverBitmap(final Utilities.Callback<Bitmap> callback, View... viewArr) {
        VideoEditTextureView videoEditTextureView;
        final int dp = (int) (AndroidUtilities.dp(26.0f) * AndroidUtilities.density);
        final int dp2 = (int) (AndroidUtilities.dp(30.33f) * AndroidUtilities.density);
        final int dp3 = (int) (AndroidUtilities.dp(4.0f) * AndroidUtilities.density);
        final Bitmap[] bitmapArr = new Bitmap[viewArr.length];
        for (int i = 0; i < viewArr.length; i++) {
            View view = viewArr[i];
            if (view != null && view.getWidth() >= 0 && viewArr[i].getHeight() > 0) {
                View view2 = viewArr[i];
                if (view2 == this && (videoEditTextureView = this.textureView) != null) {
                    bitmapArr[i] = videoEditTextureView.getBitmap();
                } else if (view2 instanceof TextureView) {
                    bitmapArr[i] = ((TextureView) view2).getBitmap();
                } else if ((view2 instanceof ViewGroup) && ((ViewGroup) view2).getChildCount() > 0) {
                    bitmapArr[i] = Bitmap.createBitmap(dp, dp2, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapArr[i]);
                    canvas.save();
                    float max = Math.max(dp / viewArr[i].getWidth(), dp2 / viewArr[i].getHeight());
                    canvas.scale(max, max);
                    viewArr[i].draw(canvas);
                    canvas.restore();
                }
            }
        }
        Utilities.globalQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                PreviewView.lambda$getCoverBitmap$2(dp, dp2, dp3, bitmapArr, callback);
            }
        });
    }

    public static void lambda$getCoverBitmap$2(int i, int i2, int i3, Bitmap[] bitmapArr, final Utilities.Callback callback) {
        final Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Path path = new Path();
        RectF rectF = new RectF();
        rectF.set(0.0f, 0.0f, createBitmap.getWidth(), createBitmap.getHeight());
        float f = i3;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        canvas.clipPath(path);
        for (int i4 = 0; i4 < bitmapArr.length; i4++) {
            if (bitmapArr[i4] != null) {
                canvas.save();
                canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                float max = Math.max(createBitmap.getWidth() / bitmapArr[i4].getWidth(), createBitmap.getHeight() / bitmapArr[i4].getHeight());
                canvas.scale(max, max);
                canvas.translate((-bitmapArr[i4].getWidth()) / 2.0f, (-bitmapArr[i4].getHeight()) / 2.0f);
                canvas.drawBitmap(bitmapArr[i4], 0.0f, 0.0f, (Paint) null);
                canvas.restore();
                AndroidUtilities.recycleBitmap(bitmapArr[i4]);
            }
        }
        Utilities.stackBlurBitmap(createBitmap, 1);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                Utilities.Callback.this.run(createBitmap);
            }
        });
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
                {
                    PreviewView.this = this;
                }

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

    private void setupImage(final org.telegram.ui.Stories.recorder.StoryEntry r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.recorder.PreviewView.setupImage(org.telegram.ui.Stories.recorder.StoryEntry):void");
    }

    public Bitmap lambda$setupImage$3(StoryEntry storyEntry, long j, String str, BitmapFactory.Options options) {
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
                        PreviewView.this.lambda$setupGradient$4(measuredHeight, (int[]) obj);
                    }
                });
            } else {
                Bitmap bitmap2 = this.thumbBitmap;
                if (bitmap2 != null) {
                    DominantColors.getColors(true, bitmap2, true, new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            PreviewView.this.lambda$setupGradient$5(measuredHeight, (int[]) obj);
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

    public void lambda$setupGradient$4(int i, int[] iArr) {
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

    public void lambda$setupGradient$5(int i, int[] iArr) {
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

    public void setupVideoPlayer(StoryEntry storyEntry, Runnable runnable, long j) {
        ArrayList<MessageObject> arrayList;
        if (storyEntry == null) {
            VideoPlayer videoPlayer = this.videoPlayer;
            if (videoPlayer != null) {
                videoPlayer.pause();
                this.videoPlayer.releasePlayer(true);
                this.videoPlayer = null;
            }
            TextureViewHolder textureViewHolder = this.textureViewHolder;
            if (textureViewHolder != null && textureViewHolder.active) {
                textureViewHolder.setTextureView(null);
            } else {
                VideoEditTextureView videoEditTextureView = this.textureView;
                if (videoEditTextureView != null) {
                    videoEditTextureView.clearAnimation();
                    this.textureView.animate().alpha(0.0f).withEndAction(new Runnable() {
                        @Override
                        public final void run() {
                            PreviewView.this.lambda$setupVideoPlayer$6();
                        }
                    }).start();
                }
            }
            TimelineView timelineView = this.timelineView;
            if (timelineView != null) {
                timelineView.setVideo(false, null, 1L, 0.0f);
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
        this.textureView.updateUiBlurManager(storyEntry.isRepostMessage ? null : this.blurManager);
        this.textureView.setOpaque(false);
        applyMatrix();
        TextureViewHolder textureViewHolder2 = this.textureViewHolder;
        if (textureViewHolder2 != null && textureViewHolder2.active) {
            textureViewHolder2.setTextureView(this.textureView);
        } else {
            this.textureView.setAlpha(runnable != null ? 1.0f : 0.0f);
            addView(this.textureView, LayoutHelper.createFrame(-2, -2, 51));
        }
        storyEntry.detectHDR(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                PreviewView.this.lambda$setupVideoPlayer$7((StoryEntry.HDRInfo) obj);
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
        this.timelineView.setVideo(storyEntry.isRepostMessage && (arrayList = storyEntry.messageObjects) != null && arrayList.size() == 1 && storyEntry.messageObjects.get(0).type == 5, storyEntry.getOriginalFile().getAbsolutePath(), getDuration(), storyEntry.videoVolume);
        this.timelineView.setVideoLeft(storyEntry.left);
        this.timelineView.setVideoRight(storyEntry.right);
        TimelineView timelineView2 = this.timelineView;
        if (timelineView2 == null || j <= 0) {
            return;
        }
        timelineView2.setProgress(j);
    }

    public void lambda$setupVideoPlayer$6() {
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

        AnonymousClass3(StoryEntry storyEntry, Runnable[] runnableArr) {
            PreviewView.this = r1;
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
            if (PreviewView.this.textureViewHolder != null && PreviewView.this.textureViewHolder.active) {
                PreviewView.this.textureViewHolder.activateTextureView(PreviewView.this.videoWidth, PreviewView.this.videoHeight);
            }
            Runnable runnable = this.val$whenReadyFinal[0];
            if (runnable == null) {
                if (PreviewView.this.textureView != null) {
                    if (PreviewView.this.textureViewHolder == null || !PreviewView.this.textureViewHolder.active) {
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
                return;
            }
            PreviewView.this.post(runnable);
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

        @Override
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            PreviewView.this.invalidateTextureViewHolder();
        }
    }

    public void lambda$setupVideoPlayer$7(StoryEntry.HDRInfo hDRInfo) {
        VideoEditTextureView videoEditTextureView = this.textureView;
        if (videoEditTextureView != null) {
            videoEditTextureView.setHDRInfo(hDRInfo);
        }
    }

    public static class TextureViewHolder {
        public boolean active;
        private TextureView textureView;
        public boolean textureViewActive;
        public int videoHeight;
        public int videoWidth;
        private Utilities.Callback2<Integer, Integer> whenTextureViewActive;
        private Utilities.Callback<TextureView> whenTextureViewReceived;

        public void setTextureView(TextureView textureView) {
            TextureView textureView2 = this.textureView;
            if (textureView2 == textureView) {
                return;
            }
            if (textureView2 != null) {
                ViewParent parent = textureView2.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.textureView);
                }
                this.textureView = null;
            }
            this.textureViewActive = false;
            this.textureView = textureView;
            Utilities.Callback<TextureView> callback = this.whenTextureViewReceived;
            if (callback != null) {
                callback.run(textureView);
            }
        }

        public void activateTextureView(int i, int i2) {
            this.textureViewActive = true;
            this.videoWidth = i;
            this.videoHeight = i2;
            Utilities.Callback2<Integer, Integer> callback2 = this.whenTextureViewActive;
            if (callback2 != null) {
                callback2.run(Integer.valueOf(i), Integer.valueOf(this.videoHeight));
            }
        }

        public void takeTextureView(Utilities.Callback<TextureView> callback, Utilities.Callback2<Integer, Integer> callback2) {
            Utilities.Callback2<Integer, Integer> callback22;
            this.whenTextureViewReceived = callback;
            this.whenTextureViewActive = callback2;
            TextureView textureView = this.textureView;
            if (textureView != null && callback != null) {
                callback.run(textureView);
            }
            if (!this.textureViewActive || (callback22 = this.whenTextureViewActive) == null) {
                return;
            }
            callback22.run(Integer.valueOf(this.videoWidth), Integer.valueOf(this.videoHeight));
        }
    }

    @Override
    protected boolean drawChild(Canvas canvas, View view, long j) {
        StoryEntry storyEntry;
        if (view == this.textureView && (storyEntry = this.entry) != null && storyEntry.isRepostMessage) {
            return false;
        }
        return super.drawChild(canvas, view, j);
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

            {
                PreviewView.this = this;
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
        long j;
        VideoPlayer videoPlayer = this.audioPlayer;
        if (videoPlayer != null) {
            videoPlayer.pause();
            this.audioPlayer.releasePlayer(true);
            this.audioPlayer = null;
        }
        VideoPlayer videoPlayer2 = this.roundPlayer;
        if (videoPlayer2 != null) {
            j = videoPlayer2.getCurrentPosition();
            this.roundPlayer.pause();
            this.roundPlayer.releasePlayer(true);
            this.roundPlayer = null;
        } else {
            j = 0;
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

    public void lambda$new$8() {
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

    public void lambda$new$9() {
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

    public void lambda$new$10() {
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
        this.w = MathUtils.distance(f, f2, fArr4[0], fArr4[1]) * 2.0f;
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
        if (this.wallpaperDrawable != null) {
            if (this.drawForThemeToggle) {
                Path path = new Path();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                path.addRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
            }
            Drawable drawable = this.wallpaperDrawable;
            float f = !(!(drawable instanceof MotionBackgroundDrawable) || ((MotionBackgroundDrawable) drawable).getPatternBitmap() != null) ? 0.0f : this.wallpaperDrawableCrossfade.set(1.0f);
            Drawable drawable2 = this.lastWallpaperDrawable;
            if (drawable2 != null && f < 1.0f) {
                drawable2.setAlpha((int) ((1.0f - f) * 255.0f));
                StoryEntry.drawBackgroundDrawable(canvas, this.lastWallpaperDrawable, getWidth(), getHeight());
            }
            this.wallpaperDrawable.setAlpha((int) (f * 255.0f));
            StoryEntry.drawBackgroundDrawable(canvas, this.wallpaperDrawable, getWidth(), getHeight());
            if (this.drawForThemeToggle) {
                canvas.restore();
            }
        } else {
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.gradientPaint);
        }
        if (this.draw && this.entry != null) {
            float f2 = this.thumbAlpha.set(this.bitmap != null);
            if (this.thumbBitmap != null && 1.0f - f2 > 0.0f) {
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
                this.bitmapPaint.setAlpha((int) (f2 * 255.0f));
                canvas.drawBitmap(this.bitmap, this.matrix, this.bitmapPaint);
            }
        }
        super.dispatchDraw(canvas);
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
        if (storyEntry == null || storyEntry.isRepostMessage) {
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

    private boolean touchEvent(MotionEvent motionEvent) {
        double d;
        float f;
        if (this.allowCropping) {
            boolean z = motionEvent.getPointerCount() > 1;
            if (z) {
                this.touch.x = (motionEvent.getX(0) + motionEvent.getX(1)) / 2.0f;
                this.touch.y = (motionEvent.getY(0) + motionEvent.getY(1)) / 2.0f;
                f = MathUtils.distance(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
                d = Math.atan2(motionEvent.getY(1) - motionEvent.getY(0), motionEvent.getX(1) - motionEvent.getX(0));
            } else {
                this.touch.x = motionEvent.getX(0);
                this.touch.y = motionEvent.getY(0);
                d = 0.0d;
                f = 0.0f;
            }
            if (this.multitouch != z) {
                PointF pointF = this.lastTouch;
                PointF pointF2 = this.touch;
                pointF.x = pointF2.x;
                pointF.y = pointF2.y;
                this.lastTouchDistance = f;
                this.lastTouchRotation = d;
                this.multitouch = z;
            }
            StoryEntry storyEntry = this.entry;
            if (storyEntry == null) {
                return false;
            }
            float width = storyEntry.resultWidth / getWidth();
            if (motionEvent.getActionMasked() == 0) {
                this.rotationDiff = 0.0f;
                this.snappedRotation = false;
                this.snappedToCenterAndScaled = false;
                this.doNotSpanRotation = false;
                invalidate();
                this.moving = true;
                this.touchMatrix.set(this.entry.matrix);
            }
            if (motionEvent.getActionMasked() == 2 && this.moving && this.entry != null) {
                PointF pointF3 = this.touch;
                float f2 = pointF3.x * width;
                float f3 = pointF3.y * width;
                PointF pointF4 = this.lastTouch;
                float f4 = pointF4.x * width;
                float f5 = pointF4.y * width;
                if (motionEvent.getPointerCount() > 1) {
                    float f6 = this.lastTouchDistance;
                    if (f6 != 0.0f) {
                        float f7 = f / f6;
                        this.touchMatrix.postScale(f7, f7, f2, f3);
                    }
                    float degrees = (float) Math.toDegrees(d - this.lastTouchRotation);
                    float f8 = this.rotationDiff + degrees;
                    this.rotationDiff = f8;
                    if (!this.allowRotation) {
                        boolean z2 = Math.abs(f8) > 20.0f;
                        this.allowRotation = z2;
                        if (!z2) {
                            extractPointsData(this.touchMatrix);
                            this.allowRotation = (((float) Math.round(this.angle / 90.0f)) * 90.0f) - this.angle > 20.0f;
                        }
                        if (!this.snappedRotation) {
                            AndroidUtilities.vibrateCursor(this);
                            this.snappedRotation = true;
                        }
                    }
                    if (this.allowRotation) {
                        this.touchMatrix.postRotate(degrees, f2, f3);
                    }
                    this.allowWithSingleTouch = true;
                }
                if (motionEvent.getPointerCount() > 1 || this.allowWithSingleTouch) {
                    this.touchMatrix.postTranslate(f2 - f4, f3 - f5);
                }
                this.finalMatrix.set(this.touchMatrix);
                this.matrix.set(this.touchMatrix);
                extractPointsData(this.matrix);
                float round = (Math.round(this.angle / 90.0f) * 90.0f) - this.angle;
                if (this.allowRotation && !this.doNotSpanRotation) {
                    if (Math.abs(round) < 3.5f) {
                        this.finalMatrix.postRotate(round, this.cx, this.cy);
                        if (!this.snappedRotation) {
                            AndroidUtilities.vibrateCursor(this);
                            this.snappedRotation = true;
                        }
                    } else {
                        this.snappedRotation = false;
                    }
                }
                this.entry.matrix.set(this.finalMatrix);
                this.entry.editedMedia = true;
                applyMatrix();
                invalidate();
            }
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent.getPointerCount() <= 1) {
                    this.allowWithSingleTouch = false;
                    onEntityDraggedTop(false);
                    onEntityDraggedBottom(false);
                }
                this.moving = false;
                this.allowRotation = false;
                this.rotationDiff = 0.0f;
                this.snappedToCenterAndScaled = false;
                this.snappedRotation = false;
                invalidate();
            }
            PointF pointF5 = this.lastTouch;
            PointF pointF6 = this.touch;
            pointF5.x = pointF6.x;
            pointF5.y = pointF6.y;
            this.lastTouchDistance = f;
            this.lastTouchRotation = d;
            return true;
        }
        return false;
    }

    private boolean tapTouchEvent(MotionEvent motionEvent) {
        Runnable runnable;
        if (motionEvent.getAction() == 0) {
            this.tapTime = System.currentTimeMillis();
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
        boolean z = additionalTouchEvent(motionEvent) || touchEvent(motionEvent);
        tapTouchEvent(motionEvent);
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

    public static Drawable getBackgroundDrawable(Drawable drawable, int i, long j, boolean z) {
        TLRPC$WallPaper tLRPC$WallPaper = null;
        if (j == Long.MIN_VALUE) {
            return null;
        }
        if (j >= 0) {
            TLRPC$UserFull userFull = MessagesController.getInstance(i).getUserFull(j);
            if (userFull != null) {
                tLRPC$WallPaper = userFull.wallpaper;
            }
        } else {
            TLRPC$ChatFull chatFull = MessagesController.getInstance(i).getChatFull(-j);
            if (chatFull != null) {
                tLRPC$WallPaper = chatFull.wallpaper;
            }
        }
        return getBackgroundDrawable(drawable, i, tLRPC$WallPaper, z);
    }

    public static android.graphics.drawable.Drawable getBackgroundDrawable(android.graphics.drawable.Drawable r5, int r6, org.telegram.tgnet.TLRPC$WallPaper r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.recorder.PreviewView.getBackgroundDrawable(android.graphics.drawable.Drawable, int, org.telegram.tgnet.TLRPC$WallPaper, boolean):android.graphics.drawable.Drawable");
    }

    public void setupWallpaper(StoryEntry storyEntry, boolean z) {
        Drawable drawable = this.wallpaperDrawable;
        this.lastWallpaperDrawable = drawable;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        if (storyEntry == null) {
            this.wallpaperDrawable = null;
            return;
        }
        long j = storyEntry.backgroundWallpaperPeerId;
        String str = storyEntry.backgroundWallpaperEmoticon;
        if (str != null) {
            Drawable backgroundDrawableFromTheme = getBackgroundDrawableFromTheme(storyEntry.currentAccount, str, storyEntry.isDark);
            storyEntry.backgroundDrawable = backgroundDrawableFromTheme;
            this.wallpaperDrawable = backgroundDrawableFromTheme;
        } else if (j != Long.MIN_VALUE) {
            Drawable backgroundDrawable = getBackgroundDrawable(this.wallpaperDrawable, storyEntry.currentAccount, j, storyEntry.isDark);
            storyEntry.backgroundDrawable = backgroundDrawable;
            this.wallpaperDrawable = backgroundDrawable;
        } else {
            this.wallpaperDrawable = null;
            return;
        }
        if (this.lastWallpaperDrawable != this.wallpaperDrawable) {
            if (z) {
                this.wallpaperDrawableCrossfade.set(0.0f, true);
            } else {
                this.lastWallpaperDrawable = null;
            }
        }
        Drawable drawable2 = this.wallpaperDrawable;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
        BlurringShader.BlurManager blurManager = this.blurManager;
        if (blurManager != null) {
            Drawable drawable3 = this.wallpaperDrawable;
            if (drawable3 != null) {
                if (drawable3 instanceof BitmapDrawable) {
                    blurManager.setFallbackBlur(((BitmapDrawable) drawable3).getBitmap(), 0);
                } else {
                    int intrinsicWidth = drawable3.getIntrinsicWidth();
                    int intrinsicHeight = this.wallpaperDrawable.getIntrinsicHeight();
                    if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
                        intrinsicWidth = 1080;
                        intrinsicHeight = 1920;
                    }
                    float f = intrinsicWidth;
                    float f2 = intrinsicHeight;
                    float max = Math.max(100.0f / f, 100.0f / f2);
                    if (max > 1.0f) {
                        intrinsicWidth = (int) (f * max);
                        intrinsicHeight = (int) (f2 * max);
                    }
                    Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
                    this.wallpaperDrawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                    this.wallpaperDrawable.draw(new Canvas(createBitmap));
                    this.blurManager.setFallbackBlur(createBitmap, 0, true);
                }
            } else {
                blurManager.setFallbackBlur(null, 0);
            }
        }
        invalidate();
    }

    public static Drawable getBackgroundDrawableFromTheme(int i, String str, boolean z) {
        return getBackgroundDrawableFromTheme(i, str, z, false);
    }

    public static Drawable getBackgroundDrawableFromTheme(int i, String str, boolean z, boolean z2) {
        EmojiThemes theme = ChatThemeController.getInstance(i).getTheme(str);
        if (theme == null) {
            return Theme.getCachedWallpaper();
        }
        return getBackgroundDrawableFromTheme(i, theme, 0, z, z2);
    }

    public static Drawable getBackgroundDrawableFromTheme(int i, EmojiThemes emojiThemes, int i2, boolean z) {
        return getBackgroundDrawableFromTheme(i, emojiThemes, i2, z, false);
    }

    public static Drawable getBackgroundDrawableFromTheme(int i, final EmojiThemes emojiThemes, int i2, final boolean z, boolean z2) {
        if (emojiThemes.isAnyStub()) {
            Drawable drawable = Theme.createBackgroundDrawable(EmojiThemes.getDefaultThemeInfo(z), emojiThemes.getPreviewColors(i, z ? 1 : 0), emojiThemes.getWallpaperLink(z ? 1 : 0), i2, false).wallpaper;
            return new ColorDrawable(-16777216);
        }
        SparseIntArray previewColors = emojiThemes.getPreviewColors(i, z ? 1 : 0);
        int i3 = Theme.key_chat_wallpaper;
        int i4 = previewColors.get(i3, Theme.getColor(i3));
        int i5 = Theme.key_chat_wallpaper_gradient_to1;
        int i6 = previewColors.get(i5, Theme.getColor(i5));
        int i7 = Theme.key_chat_wallpaper_gradient_to2;
        int i8 = previewColors.get(i7, Theme.getColor(i7));
        int i9 = Theme.key_chat_wallpaper_gradient_to3;
        int i10 = previewColors.get(i9, Theme.getColor(i9));
        final MotionBackgroundDrawable motionBackgroundDrawable = new MotionBackgroundDrawable();
        motionBackgroundDrawable.isPreview = z2;
        motionBackgroundDrawable.setPatternBitmap(emojiThemes.getWallpaper(z ? 1 : 0).settings.intensity);
        motionBackgroundDrawable.setColors(i4, i6, i8, i10, 0, true);
        motionBackgroundDrawable.setPhase(i2);
        final int patternColor = motionBackgroundDrawable.getPatternColor();
        emojiThemes.loadWallpaper(z ? 1 : 0, new ResultCallback() {
            @Override
            public final void onComplete(Object obj) {
                PreviewView.lambda$getBackgroundDrawableFromTheme$11(EmojiThemes.this, z, z, motionBackgroundDrawable, patternColor, (Pair) obj);
            }

            @Override
            public void onError(TLRPC$TL_error tLRPC$TL_error) {
                ResultCallback.CC.$default$onError(this, tLRPC$TL_error);
            }
        });
        return motionBackgroundDrawable;
    }

    public static void lambda$getBackgroundDrawableFromTheme$11(EmojiThemes emojiThemes, boolean z, boolean z2, MotionBackgroundDrawable motionBackgroundDrawable, int i, Pair pair) {
        if (pair == null) {
            return;
        }
        long longValue = ((Long) pair.first).longValue();
        Bitmap bitmap = (Bitmap) pair.second;
        if (longValue != emojiThemes.getTlTheme(z ? 1 : 0).id || bitmap == null) {
            return;
        }
        motionBackgroundDrawable.setPatternBitmap(emojiThemes.getWallpaper(z2 ? 1 : 0).settings.intensity, bitmap);
        motionBackgroundDrawable.setPatternColorFilter(i);
        motionBackgroundDrawable.setPatternAlpha(1.0f);
    }

    @Override
    protected boolean verifyDrawable(Drawable drawable) {
        return this.wallpaperDrawable == drawable || super.verifyDrawable(drawable);
    }
}
