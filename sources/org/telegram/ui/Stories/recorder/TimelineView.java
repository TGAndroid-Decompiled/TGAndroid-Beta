package org.telegram.ui.Stories.recorder;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.BlurringShader;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.Scroller;
import org.telegram.ui.Stories.recorder.TimelineView;

public class TimelineView extends View {
    private Runnable askExactSeek;
    private StaticLayout audioAuthor;
    private float audioAuthorLeft;
    private final TextPaint audioAuthorPaint;
    private float audioAuthorWidth;
    private final BlurringShader.StoryBlurDrawer audioBlur;
    private final RectF audioBounds;
    private final Path audioClipPath;
    private final Paint audioDotPaint;
    private long audioDuration;
    private final Drawable audioIcon;
    private float audioLeft;
    private long audioOffset;
    private String audioPath;
    private float audioRight;
    private boolean audioSelected;
    private final AnimatedFloat audioSelectedT;
    private final AnimatedFloat audioT;
    private StaticLayout audioTitle;
    private float audioTitleLeft;
    private final TextPaint audioTitlePaint;
    private float audioTitleWidth;
    private float audioVolume;
    private final BlurringShader.StoryBlurDrawer audioWaveformBlur;
    private final BlurringShader.StoryBlurDrawer backgroundBlur;
    private final BlurringShader.BlurManager blurManager;
    private final ViewGroup container;
    private long coverEnd;
    private long coverStart;
    private TimelineDelegate delegate;
    private boolean dragged;
    private boolean draggingProgress;
    private final LinearGradient ellipsizeGradient;
    private final Matrix ellipsizeMatrix;
    private final Paint ellipsizePaint;
    private int h;
    private boolean hadDragChange;
    private boolean hasAudio;
    private boolean hasRound;
    private boolean hasVideo;
    private boolean isCover;
    private boolean isMainVideoRound;
    private long lastTime;
    private float lastX;
    private final AnimatedFloat loopProgress;
    private long loopProgressFrom;
    private final Runnable onLongPress;
    private int ph;
    private int pressHandle;
    private long pressTime;
    private int pressType;
    private final View previewContainer;
    private long progress;
    private final Paint progressShadowPaint;
    private final Paint progressWhitePaint;
    private int px;
    private int py;
    private final Paint regionCutPaint;
    private final Paint regionHandlePaint;
    private final Paint regionPaint;
    private boolean resetWaveform;
    private final Theme.ResourcesProvider resourcesProvider;
    private final RectF roundBounds;
    private final Path roundClipPath;
    private long roundDuration;
    private float roundLeft;
    private long roundOffset;
    private String roundPath;
    private float roundRight;
    private boolean roundSelected;
    private final AnimatedFloat roundSelectedT;
    private final AnimatedFloat roundT;
    private VideoThumbsLoader roundThumbs;
    private float roundVolume;
    private long scroll;
    private final Scroller scroller;
    private boolean scrolling;
    private boolean scrollingVideo;
    private final Path selectedVideoClipPath;
    final float[] selectedVideoRadii;
    private int sw;
    private VideoThumbsLoader thumbs;
    private VelocityTracker velocityTracker;
    private final RectF videoBounds;
    private final Path videoClipPath;
    private long videoDuration;
    private final Paint videoFramePaint;
    private float videoLeft;
    private String videoPath;
    private float videoRight;
    private final AnimatedFloat videoSelectedT;
    private float videoVolume;
    private int w;
    private int wasScrollX;
    private AudioWaveformLoader waveform;
    private boolean waveformIsLoaded;
    private final AnimatedFloat waveformLoaded;
    private final AnimatedFloat waveformMax;
    private final Paint waveformPaint;
    private final WaveformPath waveformPath;
    final float[] waveformRadii;

    public interface TimelineDelegate {

        public final class CC {
            public static void $default$onAudioLeftChange(TimelineDelegate timelineDelegate, float f) {
            }

            public static void $default$onAudioOffsetChange(TimelineDelegate timelineDelegate, long j) {
            }

            public static void $default$onAudioRemove(TimelineDelegate timelineDelegate) {
            }

            public static void $default$onAudioRightChange(TimelineDelegate timelineDelegate, float f) {
            }

            public static void $default$onAudioVolumeChange(TimelineDelegate timelineDelegate, float f) {
            }

            public static void $default$onProgressChange(TimelineDelegate timelineDelegate, long j, boolean z) {
            }

            public static void $default$onProgressDragChange(TimelineDelegate timelineDelegate, boolean z) {
            }

            public static void $default$onRoundLeftChange(TimelineDelegate timelineDelegate, float f) {
            }

            public static void $default$onRoundOffsetChange(TimelineDelegate timelineDelegate, long j) {
            }

            public static void $default$onRoundRemove(TimelineDelegate timelineDelegate) {
            }

            public static void $default$onRoundRightChange(TimelineDelegate timelineDelegate, float f) {
            }

            public static void $default$onRoundSelectChange(TimelineDelegate timelineDelegate, boolean z) {
            }

            public static void $default$onRoundVolumeChange(TimelineDelegate timelineDelegate, float f) {
            }

            public static void $default$onVideoRightChange(TimelineDelegate timelineDelegate, float f) {
            }

            public static void $default$onVideoVolumeChange(TimelineDelegate timelineDelegate, float f) {
            }
        }

        void onAudioLeftChange(float f);

        void onAudioOffsetChange(long j);

        void onAudioRemove();

        void onAudioRightChange(float f);

        void onAudioVolumeChange(float f);

        void onProgressChange(long j, boolean z);

        void onProgressDragChange(boolean z);

        void onRoundLeftChange(float f);

        void onRoundOffsetChange(long j);

        void onRoundRemove();

        void onRoundRightChange(float f);

        void onRoundSelectChange(boolean z);

        void onRoundVolumeChange(float f);

        void onVideoLeftChange(float f);

        void onVideoRightChange(float f);

        void onVideoVolumeChange(float f);
    }

    public static int heightDp() {
        return 112;
    }

    private long getBaseDuration() {
        if (this.hasVideo) {
            return this.videoDuration;
        }
        if (this.hasRound) {
            return this.roundDuration;
        }
        if (this.hasAudio) {
            return this.audioDuration;
        }
        return Math.max(1L, this.audioDuration);
    }

    public void setCover() {
        this.isCover = true;
    }

    public TimelineView(Context context, final ViewGroup viewGroup, final View view, final Theme.ResourcesProvider resourcesProvider, final BlurringShader.BlurManager blurManager) {
        super(context);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.roundT = new AnimatedFloat(this, 0L, 360L, cubicBezierInterpolator);
        this.roundSelectedT = new AnimatedFloat(this, 360L, cubicBezierInterpolator);
        this.audioT = new AnimatedFloat(this, 0L, 360L, cubicBezierInterpolator);
        this.audioSelectedT = new AnimatedFloat(this, 360L, cubicBezierInterpolator);
        this.videoSelectedT = new AnimatedFloat(this, 360L, cubicBezierInterpolator);
        this.waveformLoaded = new AnimatedFloat(this, 0L, 600L, cubicBezierInterpolator);
        this.waveformMax = new AnimatedFloat(this, 0L, 360L, cubicBezierInterpolator);
        this.videoBounds = new RectF();
        this.videoFramePaint = new Paint(3);
        this.videoClipPath = new Path();
        this.selectedVideoClipPath = new Path();
        this.roundBounds = new RectF();
        this.roundClipPath = new Path();
        Paint paint = new Paint(1);
        this.regionPaint = paint;
        Paint paint2 = new Paint(1);
        this.regionCutPaint = paint2;
        Paint paint3 = new Paint(1);
        this.regionHandlePaint = paint3;
        Paint paint4 = new Paint(1);
        this.progressShadowPaint = paint4;
        Paint paint5 = new Paint(1);
        this.progressWhitePaint = paint5;
        this.audioBounds = new RectF();
        this.audioClipPath = new Path();
        Paint paint6 = new Paint(1);
        this.waveformPaint = paint6;
        this.waveformPath = new WaveformPath();
        Paint paint7 = new Paint(1);
        this.audioDotPaint = paint7;
        TextPaint textPaint = new TextPaint(1);
        this.audioAuthorPaint = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.audioTitlePaint = textPaint2;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 16.0f, 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.ellipsizeGradient = linearGradient;
        this.ellipsizeMatrix = new Matrix();
        Paint paint8 = new Paint(1);
        this.ellipsizePaint = paint8;
        this.scroller = new Scroller(getContext());
        this.coverStart = -1L;
        this.coverEnd = -1L;
        this.loopProgress = new AnimatedFloat(0.0f, this, 0L, 340L, cubicBezierInterpolator);
        this.loopProgressFrom = -1L;
        this.pressHandle = -1;
        this.pressType = -1;
        this.scrollingVideo = true;
        this.scrolling = false;
        this.selectedVideoRadii = new float[8];
        this.waveformRadii = new float[8];
        this.container = viewGroup;
        this.previewContainer = view;
        this.resourcesProvider = resourcesProvider;
        paint7.setColor(Integer.MAX_VALUE);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setColor(-1);
        textPaint2.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint2.setColor(-1);
        paint6.setColor(1090519039);
        paint8.setShader(linearGradient);
        paint8.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setColor(-1);
        paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(1.0f), 436207616);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint3.setColor(-16777216);
        paint5.setColor(-1);
        paint4.setColor(637534208);
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.filled_widget_music).mutate();
        this.audioIcon = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.blurManager = blurManager;
        this.backgroundBlur = new BlurringShader.StoryBlurDrawer(blurManager, this, 0);
        this.audioBlur = new BlurringShader.StoryBlurDrawer(blurManager, this, 3);
        this.audioWaveformBlur = new BlurringShader.StoryBlurDrawer(blurManager, this, 4);
        this.onLongPress = new Runnable() {
            @Override
            public final void run() {
                TimelineView.this.lambda$new$5(viewGroup, resourcesProvider, blurManager, view);
            }
        };
    }

    public void lambda$new$5(ViewGroup viewGroup, Theme.ResourcesProvider resourcesProvider, BlurringShader.BlurManager blurManager, View view) {
        float f;
        float f2;
        int i = this.pressType;
        try {
            if (i == 2 && this.hasAudio) {
                SliderView onValueChange = new SliderView(getContext(), 0).setMinMax(0.0f, 1.5f).setValue(this.audioVolume).setOnValueChange(new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        TimelineView.this.lambda$new$0((Float) obj);
                    }
                });
                long min = Math.min(getBaseDuration(), 120000L);
                int i2 = this.w;
                int i3 = this.px;
                int i4 = this.ph;
                ItemOptions.makeOptions(viewGroup, resourcesProvider, this).addView(onValueChange).addSpaceGap().add(R.drawable.msg_delete, LocaleController.getString(R.string.StoryAudioRemove), new Runnable() {
                    @Override
                    public final void run() {
                        TimelineView.this.lambda$new$1();
                    }
                }).setGravity(5).forceTop(true).translate((-(this.w - Math.min((i2 - i3) - i4, (i3 + i4) + (((((float) (this.audioOffset - this.scroll)) + (AndroidUtilities.lerp(this.audioRight, 1.0f, this.audioSelectedT.get()) * ((float) this.audioDuration))) / ((float) min)) * this.sw)))) + AndroidUtilities.dp(18.0f), (((this.h - this.py) - (this.hasVideo ? getVideoHeight() + AndroidUtilities.dp(4.0f) : 0.0f)) - (this.hasRound ? getRoundHeight() + AndroidUtilities.dp(4.0f) : 0.0f)) - (this.hasAudio ? getAudioHeight() + AndroidUtilities.dp(4.0f) : 0.0f)).show().setBlurBackground(blurManager, -view.getX(), -view.getY());
                performHapticFeedback(0, 1);
            } else if (i == 1 && this.hasRound) {
                SliderView onValueChange2 = new SliderView(getContext(), 0).setMinMax(0.0f, 1.5f).setValue(this.roundVolume).setOnValueChange(new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        TimelineView.this.lambda$new$2((Float) obj);
                    }
                });
                long min2 = Math.min(getBaseDuration(), 120000L);
                int i5 = this.w;
                int i6 = this.px;
                int i7 = this.ph;
                float min3 = Math.min((i5 - i6) - i7, i6 + i7 + (((((float) (this.roundOffset - this.scroll)) + (AndroidUtilities.lerp(this.roundRight, 1.0f, this.roundSelectedT.get()) * ((float) this.roundDuration))) / ((float) min2)) * this.sw));
                float f3 = this.h - this.py;
                if (this.hasVideo) {
                    f = 4.0f;
                    f2 = getVideoHeight() + AndroidUtilities.dp(4.0f);
                } else {
                    f = 4.0f;
                    f2 = 0.0f;
                }
                ItemOptions.makeOptions(viewGroup, resourcesProvider, this).addView(onValueChange2).addSpaceGap().add(R.drawable.msg_delete, LocaleController.getString(R.string.StoryRoundRemove), new Runnable() {
                    @Override
                    public final void run() {
                        TimelineView.this.lambda$new$3();
                    }
                }).setGravity(5).forceTop(true).translate((-(this.w - min3)) + AndroidUtilities.dp(18.0f), (f3 - f2) - (this.hasRound ? getRoundHeight() + AndroidUtilities.dp(f) : 0.0f)).show().setBlurBackground(blurManager, -view.getX(), -view.getY());
                performHapticFeedback(0, 1);
            } else {
                if (i != 0 || !this.hasVideo) {
                    return;
                }
                ItemOptions.makeOptions(viewGroup, resourcesProvider, this).addView(new SliderView(getContext(), 0).setMinMax(0.0f, 1.5f).setValue(this.videoVolume).setOnValueChange(new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        TimelineView.this.lambda$new$4((Float) obj);
                    }
                })).setGravity(5).forceTop(true).translate(AndroidUtilities.dp(18.0f), (this.h - this.py) - (this.hasVideo ? getVideoHeight() + AndroidUtilities.dp(4.0f) : 0.0f)).show().setBlurBackground(blurManager, -view.getX(), -view.getY());
                performHapticFeedback(0, 1);
            }
        } catch (Exception unused) {
        }
    }

    public void lambda$new$0(Float f) {
        this.audioVolume = f.floatValue();
        TimelineDelegate timelineDelegate = this.delegate;
        if (timelineDelegate != null) {
            timelineDelegate.onAudioVolumeChange(f.floatValue());
        }
    }

    public void lambda$new$1() {
        TimelineDelegate timelineDelegate = this.delegate;
        if (timelineDelegate != null) {
            timelineDelegate.onAudioRemove();
        }
    }

    public void lambda$new$2(Float f) {
        this.roundVolume = f.floatValue();
        TimelineDelegate timelineDelegate = this.delegate;
        if (timelineDelegate != null) {
            timelineDelegate.onRoundVolumeChange(f.floatValue());
        }
    }

    public void lambda$new$3() {
        TimelineDelegate timelineDelegate = this.delegate;
        if (timelineDelegate != null) {
            timelineDelegate.onRoundRemove();
        }
    }

    public void lambda$new$4(Float f) {
        this.videoVolume = f.floatValue();
        TimelineDelegate timelineDelegate = this.delegate;
        if (timelineDelegate != null) {
            timelineDelegate.onVideoVolumeChange(f.floatValue());
        }
    }

    public void setDelegate(TimelineDelegate timelineDelegate) {
        this.delegate = timelineDelegate;
    }

    public void setCoverVideo(long j, long j2) {
        this.coverStart = j;
        this.coverEnd = j2;
        setupVideoThumbs(true);
    }

    public void setVideo(boolean z, String str, long j, float f) {
        if (TextUtils.equals(this.videoPath, str)) {
            return;
        }
        VideoThumbsLoader videoThumbsLoader = this.thumbs;
        if (videoThumbsLoader != null) {
            videoThumbsLoader.destroy();
            this.thumbs = null;
        }
        this.isMainVideoRound = z;
        if (str != null) {
            this.scroll = 0L;
            this.videoPath = str;
            this.videoDuration = j;
            this.videoVolume = f;
            setupVideoThumbs(false);
        } else {
            this.videoPath = null;
            this.videoDuration = 1L;
            this.scroll = 0L;
        }
        if (!this.hasRound) {
            this.roundSelected = false;
        }
        this.hasVideo = this.videoPath != null;
        this.progress = 0L;
        invalidate();
    }

    public void setRoundNull(boolean z) {
        setRound(null, 0L, 0L, 0.0f, 0.0f, 0.0f, z);
    }

    public void setRound(String str, long j, long j2, float f, float f2, float f3, boolean z) {
        if (TextUtils.equals(this.roundPath, str)) {
            return;
        }
        VideoThumbsLoader videoThumbsLoader = this.roundThumbs;
        if (videoThumbsLoader != null) {
            videoThumbsLoader.destroy();
            this.roundThumbs = null;
        }
        long j3 = this.roundDuration;
        if (str != null) {
            this.roundPath = str;
            this.roundDuration = j;
            this.roundOffset = j2 - (((float) j) * f);
            this.roundLeft = f;
            this.roundRight = f2;
            this.roundVolume = f3;
            setupRoundThumbs();
            if (!this.hasVideo) {
                this.audioSelected = false;
                this.roundSelected = true;
            }
        } else {
            this.roundPath = null;
            this.roundDuration = 1L;
            this.roundSelected = false;
        }
        this.hasRound = this.roundPath != null;
        if (j3 != j && !this.hasVideo && this.waveform != null) {
            this.resetWaveform = true;
            setupAudioWaveform();
        }
        if (this.hasAudio && this.hasRound && !this.hasVideo) {
            this.audioLeft = 0.0f;
            this.audioRight = Utilities.clamp(((float) j) / ((float) this.audioDuration), 1.0f, 0.0f);
        }
        if (!z) {
            this.roundSelectedT.set(this.roundSelected, true);
            this.audioSelectedT.set(this.audioSelected, true);
            this.roundT.set(this.hasRound, true);
        }
        invalidate();
    }

    public void selectRound(boolean z) {
        if (z && this.hasRound) {
            this.roundSelected = true;
            this.audioSelected = false;
        } else {
            this.roundSelected = false;
            this.audioSelected = this.hasAudio && !this.hasVideo;
        }
        invalidate();
    }

    private void setupVideoThumbs(boolean z) {
        if (getMeasuredWidth() > 0) {
            VideoThumbsLoader videoThumbsLoader = this.thumbs;
            if (videoThumbsLoader == null || z) {
                if (videoThumbsLoader != null) {
                    videoThumbsLoader.destroy();
                    this.thumbs = null;
                }
                boolean z2 = this.isMainVideoRound;
                String str = this.videoPath;
                int i = this.w;
                int i2 = this.px;
                int i3 = (i - i2) - i2;
                int dp = AndroidUtilities.dp(38.0f);
                long j = this.videoDuration;
                VideoThumbsLoader videoThumbsLoader2 = new VideoThumbsLoader(z2, str, i3, dp, j > 2 ? Long.valueOf(j) : null, 120000L, this.coverStart, this.coverEnd);
                this.thumbs = videoThumbsLoader2;
                if (videoThumbsLoader2.getDuration() > 0) {
                    this.videoDuration = this.thumbs.getDuration();
                }
                setupRoundThumbs();
            }
        }
    }

    private void setupRoundThumbs() {
        if (getMeasuredWidth() <= 0 || this.roundThumbs != null) {
            return;
        }
        if (!this.hasVideo || this.videoDuration >= 1) {
            String str = this.roundPath;
            int i = this.w;
            int i2 = this.px;
            int i3 = (i - i2) - i2;
            int dp = AndroidUtilities.dp(38.0f);
            long j = this.roundDuration;
            VideoThumbsLoader videoThumbsLoader = new VideoThumbsLoader(false, str, i3, dp, j > 2 ? Long.valueOf(j) : null, this.hasVideo ? this.videoDuration : 120000L, -1L, -1L);
            this.roundThumbs = videoThumbsLoader;
            if (videoThumbsLoader.getDuration() > 0) {
                this.roundDuration = this.roundThumbs.getDuration();
            }
        }
    }

    public void setProgress(long r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.recorder.TimelineView.setProgress(long):void");
    }

    public void setVideoLeft(float f) {
        this.videoLeft = f;
        invalidate();
    }

    public void setVideoRight(float f) {
        this.videoRight = f;
        invalidate();
    }

    public void setAudio(String str, String str2, String str3, long j, long j2, float f, float f2, float f3, boolean z) {
        String str4;
        String str5;
        if (!TextUtils.equals(this.audioPath, str)) {
            AudioWaveformLoader audioWaveformLoader = this.waveform;
            if (audioWaveformLoader != null) {
                audioWaveformLoader.destroy();
                this.waveform = null;
                this.waveformIsLoaded = false;
                this.waveformLoaded.set(0.0f, true);
            }
            this.audioPath = str;
            setupAudioWaveform();
        }
        this.audioPath = str;
        boolean z2 = !TextUtils.isEmpty(str);
        this.hasAudio = z2;
        if (z2) {
            str4 = str2;
            str5 = str3;
        } else {
            this.audioSelected = false;
            str4 = null;
            str5 = null;
        }
        if (TextUtils.isEmpty(str4)) {
            str4 = null;
        }
        if (TextUtils.isEmpty(str5)) {
            str5 = null;
        }
        if (this.hasAudio) {
            this.audioDuration = j;
            this.audioOffset = j2 - (((float) j) * f);
            this.audioLeft = f;
            this.audioRight = f2;
            this.audioVolume = f3;
            if (str4 != null) {
                StaticLayout staticLayout = new StaticLayout(str4, this.audioAuthorPaint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.audioAuthor = staticLayout;
                this.audioAuthorWidth = staticLayout.getLineCount() > 0 ? this.audioAuthor.getLineWidth(0) : 0.0f;
                this.audioAuthorLeft = this.audioAuthor.getLineCount() > 0 ? this.audioAuthor.getLineLeft(0) : 0.0f;
            } else {
                this.audioAuthorWidth = 0.0f;
                this.audioAuthor = null;
            }
            if (str5 != null) {
                StaticLayout staticLayout2 = new StaticLayout(str5, this.audioTitlePaint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.audioTitle = staticLayout2;
                this.audioTitleWidth = staticLayout2.getLineCount() > 0 ? this.audioTitle.getLineWidth(0) : 0.0f;
                this.audioTitleLeft = this.audioTitle.getLineCount() > 0 ? this.audioTitle.getLineLeft(0) : 0.0f;
            } else {
                this.audioTitleWidth = 0.0f;
                this.audioTitle = null;
            }
        }
        if (!z) {
            this.audioT.set(this.hasAudio, true);
        }
        invalidate();
    }

    private void setupAudioWaveform() {
        if (getMeasuredWidth() > 0) {
            if (this.waveform == null || this.resetWaveform) {
                this.waveform = new AudioWaveformLoader(this.audioPath, (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                this.waveformIsLoaded = false;
                this.waveformLoaded.set(0.0f, true);
                this.waveformMax.set(1.0f, true);
            }
        }
    }

    private int detectHandle(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        float min = (float) Math.min(getBaseDuration(), 120000L);
        float clamp = this.px + this.ph + (this.sw * (((float) ((Utilities.clamp(this.progress, getBaseDuration(), 0L) + (!this.hasVideo ? this.audioOffset : 0L)) - this.scroll)) / min));
        boolean z = false;
        if (!this.isCover && x >= clamp - AndroidUtilities.dp(12.0f) && x <= clamp + AndroidUtilities.dp(12.0f)) {
            return 0;
        }
        boolean z2 = this.hasVideo && y > (((float) (this.h - this.py)) - getVideoHeight()) - ((float) AndroidUtilities.dp(2.0f));
        if (this.hasRound && y > (((((this.h - this.py) - getVideoHeight()) - AndroidUtilities.dp(4.0f)) - getRoundHeight()) - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(2.0f) && y < ((this.h - this.py) - getVideoHeight()) - AndroidUtilities.dp(2.0f)) {
            z = true;
        }
        if (z2) {
            if (this.isCover) {
                return 4;
            }
            float f = this.px + this.ph;
            float f2 = this.videoLeft;
            float f3 = (float) this.videoDuration;
            float f4 = (float) this.scroll;
            float f5 = this.sw;
            float f6 = ((((f2 * f3) - f4) / min) * f5) + f;
            float f7 = f + ((((this.videoRight * f3) - f4) / min) * f5);
            if (x >= f6 - AndroidUtilities.dp(15.0f) && x <= AndroidUtilities.dp(5.0f) + f6) {
                return 2;
            }
            if (x >= f7 - AndroidUtilities.dp(5.0f) && x <= AndroidUtilities.dp(15.0f) + f7) {
                return 3;
            }
            if (x >= f6 && x <= f7 && (this.videoLeft > 0.01f || this.videoRight < 0.99f)) {
                return 4;
            }
        } else if (z) {
            float f8 = this.px + this.ph;
            float f9 = (float) this.roundOffset;
            float f10 = this.roundLeft;
            float f11 = (float) this.roundDuration;
            float f12 = (float) this.scroll;
            float f13 = this.sw;
            float f14 = (((((f10 * f11) + f9) - f12) / min) * f13) + f8;
            float f15 = f8 + ((((f9 + (this.roundRight * f11)) - f12) / min) * f13);
            if (this.roundSelected || !this.hasVideo) {
                if (x >= f14 - AndroidUtilities.dp(15.0f) && x <= AndroidUtilities.dp(5.0f) + f14) {
                    return 10;
                }
                if (x >= f15 - AndroidUtilities.dp(5.0f) && x <= AndroidUtilities.dp(15.0f) + f15) {
                    return 11;
                }
                if (x >= f14 && x <= f15) {
                    return !this.hasVideo ? 12 : 9;
                }
                float f16 = this.px + this.ph;
                long j = this.roundOffset;
                long j2 = this.scroll;
                float f17 = this.sw;
                float f18 = ((((float) (j - j2)) / min) * f17) + f16;
                f15 = f16 + ((((float) ((j + this.roundDuration) - j2)) / min) * f17);
                f14 = f18;
            }
            if (x >= f14 && x <= f15) {
                return 9;
            }
        } else if (this.hasAudio) {
            float f19 = this.px + this.ph;
            float f20 = (float) this.audioOffset;
            float f21 = this.audioLeft;
            float f22 = (float) this.audioDuration;
            float f23 = (float) this.scroll;
            float f24 = this.sw;
            float f25 = (((((f21 * f22) + f20) - f23) / min) * f24) + f19;
            float f26 = f19 + ((((f20 + (this.audioRight * f22)) - f23) / min) * f24);
            if (this.audioSelected || (!this.hasVideo && !this.hasRound)) {
                if (x >= f25 - AndroidUtilities.dp(15.0f) && x <= AndroidUtilities.dp(5.0f) + f25) {
                    return 6;
                }
                if (x >= f26 - AndroidUtilities.dp(5.0f) && x <= AndroidUtilities.dp(15.0f) + f26) {
                    return 7;
                }
                if (x >= f25 && x <= f26) {
                    return !this.hasVideo ? 8 : 5;
                }
                float f27 = this.px + this.ph;
                long j3 = this.audioOffset;
                long j4 = this.scroll;
                float f28 = this.sw;
                float f29 = ((((float) (j3 - j4)) / min) * f28) + f27;
                f26 = ((((float) ((j3 + this.audioDuration) - j4)) / min) * f28) + f27;
                f25 = f29;
            }
            if (x >= f25 && x <= f26) {
                return 5;
            }
        }
        return (this.videoDuration <= 120000 || !z2) ? -1 : 1;
    }

    public boolean onBackPressed() {
        boolean z = false;
        if (this.audioSelected) {
            this.audioSelected = false;
            z = true;
            if (this.hasRound && !this.hasVideo) {
                this.roundSelected = true;
                TimelineDelegate timelineDelegate = this.delegate;
                if (timelineDelegate != null) {
                    timelineDelegate.onRoundSelectChange(true);
                }
            }
        }
        return z;
    }

    public boolean isDragging() {
        return this.dragged;
    }

    private boolean setProgressAt(float f, boolean z) {
        if (!this.hasVideo && !this.hasAudio) {
            return false;
        }
        float min = (((f - this.px) - this.ph) / this.sw) * ((float) Math.min(getBaseDuration(), 120000L));
        boolean z2 = this.hasVideo;
        final long clamp = Utilities.clamp(min + ((float) (!z2 ? -this.audioOffset : 0L)) + ((float) this.scroll), (float) (z2 ? this.videoDuration : this.audioDuration), 0.0f);
        boolean z3 = this.hasVideo;
        if (z3) {
            float f2 = ((float) clamp) / ((float) this.videoDuration);
            if (f2 < this.videoLeft || f2 > this.videoRight) {
                return false;
            }
        }
        if (this.hasAudio && !z3) {
            float f3 = ((float) clamp) / ((float) this.audioDuration);
            if (f3 < this.audioLeft || f3 > this.audioRight) {
                return false;
            }
        }
        this.progress = clamp;
        invalidate();
        TimelineDelegate timelineDelegate = this.delegate;
        if (timelineDelegate != null) {
            timelineDelegate.onProgressChange(clamp, z);
        }
        Runnable runnable = this.askExactSeek;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.askExactSeek = null;
        }
        if (!z) {
            return true;
        }
        Runnable runnable2 = new Runnable() {
            @Override
            public final void run() {
                TimelineView.this.lambda$setProgressAt$6(clamp);
            }
        };
        this.askExactSeek = runnable2;
        AndroidUtilities.runOnUIThread(runnable2, 150L);
        return true;
    }

    public void lambda$setProgressAt$6(long j) {
        TimelineDelegate timelineDelegate = this.delegate;
        if (timelineDelegate != null) {
            timelineDelegate.onProgressChange(j, false);
        }
    }

    private float getVideoHeight() {
        if (this.hasVideo) {
            return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), this.videoSelectedT.set((this.audioSelected || this.roundSelected) ? false : true));
        }
        return 0.0f;
    }

    private float getAudioHeight() {
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), this.audioSelectedT.set(this.audioSelected));
    }

    private float getRoundHeight() {
        if (!this.hasRound) {
            return 0.0f;
        }
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), this.roundSelectedT.set(this.roundSelected));
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.recorder.TimelineView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    private long minAudioSelect() {
        return Math.max(1000.0f, ((float) Math.min(this.hasVideo ? this.videoDuration : this.hasRound ? this.roundDuration : this.audioDuration, 59000L)) * 0.15f);
    }

    private void moveAudioOffset(float f) {
        float f2;
        long j;
        float f3;
        long j2;
        float f4;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        TimelineDelegate timelineDelegate;
        long clamp;
        boolean z = this.hasVideo;
        if (!z && !this.hasRound) {
            long j8 = this.audioOffset;
            long clamp2 = Utilities.clamp(j8 + f, 0L, -(this.audioDuration - Math.min(getBaseDuration(), 120000L)));
            this.audioOffset = clamp2;
            float f5 = (float) (clamp2 - j8);
            this.audioLeft = Utilities.clamp(this.audioLeft - (f5 / ((float) this.audioDuration)), 1.0f, 0.0f);
            this.audioRight = Utilities.clamp(this.audioRight - (f5 / ((float) this.audioDuration)), 1.0f, 0.0f);
            TimelineDelegate timelineDelegate2 = this.delegate;
            if (timelineDelegate2 != null) {
                timelineDelegate2.onAudioLeftChange(this.audioLeft);
                this.delegate.onAudioRightChange(this.audioRight);
            }
        } else if (this.audioSelected) {
            if (z) {
                f2 = this.videoLeft;
                j = this.videoDuration;
            } else {
                f2 = this.roundLeft;
                j = this.roundDuration;
            }
            float f6 = f2 * ((float) j);
            if (z) {
                f3 = this.videoRight;
                j2 = this.videoDuration;
            } else {
                f3 = this.roundRight;
                j2 = this.roundDuration;
            }
            float f7 = f3 * ((float) j2);
            if (z) {
                f4 = this.videoRight - this.videoLeft;
                j3 = this.videoDuration;
            } else {
                f4 = this.roundRight - this.roundLeft;
                j3 = this.roundDuration;
            }
            float f8 = f4 * ((float) j3);
            float f9 = this.audioRight;
            float f10 = (float) this.audioDuration;
            long j9 = f7 - (f9 * f10);
            float f11 = this.audioLeft;
            long j10 = f6 - (f11 * f10);
            float min = Math.min(f9 - f11, f8 / f10);
            long j11 = this.audioOffset;
            long j12 = f;
            long j13 = j11 + j12;
            if (j13 > j9) {
                float clamp3 = Utilities.clamp(((f7 - ((float) j11)) - ((float) j12)) / ((float) this.audioDuration), 1.0f, min);
                this.audioRight = clamp3;
                float clamp4 = Utilities.clamp(clamp3 - min, 1.0f, 0.0f);
                this.audioLeft = clamp4;
                float f12 = this.audioRight;
                float f13 = (float) this.audioDuration;
                long j14 = f7 - (f12 * f13);
                long j15 = f6 - (clamp4 * f13);
                if (j14 < j15) {
                    j7 = j15;
                    j6 = j14;
                } else {
                    j6 = j15;
                    j7 = j14;
                }
                this.audioOffset = Utilities.clamp(this.audioOffset + j12, j7, j6);
                TimelineDelegate timelineDelegate3 = this.delegate;
                if (timelineDelegate3 != null) {
                    timelineDelegate3.onAudioLeftChange(this.audioLeft);
                    this.delegate.onAudioRightChange(this.audioRight);
                }
            } else if (j13 < j10) {
                float clamp5 = Utilities.clamp(((f6 - ((float) j11)) - ((float) j12)) / ((float) this.audioDuration), 1.0f - min, 0.0f);
                this.audioLeft = clamp5;
                float clamp6 = Utilities.clamp(clamp5 + min, 1.0f, 0.0f);
                this.audioRight = clamp6;
                float f14 = (float) this.audioDuration;
                long j16 = f7 - (clamp6 * f14);
                long j17 = f6 - (this.audioLeft * f14);
                if (j16 < j17) {
                    j5 = j17;
                    j4 = j16;
                } else {
                    j4 = j17;
                    j5 = j16;
                }
                this.audioOffset = Utilities.clamp(this.audioOffset + j12, j5, j4);
                TimelineDelegate timelineDelegate4 = this.delegate;
                if (timelineDelegate4 != null) {
                    timelineDelegate4.onAudioLeftChange(this.audioLeft);
                    this.delegate.onAudioRightChange(this.audioRight);
                }
            } else {
                this.audioOffset = j13;
            }
        } else {
            long j18 = this.audioOffset + f;
            float baseDuration = (float) getBaseDuration();
            float f15 = (float) this.audioDuration;
            this.audioOffset = Utilities.clamp(j18, baseDuration - (this.audioRight * f15), (-this.audioLeft) * f15);
        }
        invalidate();
        TimelineDelegate timelineDelegate5 = this.delegate;
        if (timelineDelegate5 != null) {
            timelineDelegate5.onAudioOffsetChange(this.audioOffset + (this.audioLeft * ((float) this.audioDuration)));
        }
        boolean z2 = this.dragged;
        if (!z2 && (timelineDelegate = this.delegate) != null) {
            timelineDelegate.onProgressDragChange(true);
            if (this.hasVideo) {
                long j19 = this.audioOffset + (this.audioLeft * ((float) this.audioDuration));
                float f16 = this.videoRight;
                float f17 = (float) this.videoDuration;
                clamp = Utilities.clamp(j19, f16 * f17, this.videoLeft * f17);
            } else if (this.hasRound) {
                long j20 = this.audioOffset + (this.audioLeft * ((float) this.audioDuration));
                float f18 = this.roundRight;
                float f19 = (float) this.roundDuration;
                clamp = Utilities.clamp(j20, f18 * f19, this.roundLeft * f19);
            } else {
                float f20 = this.audioLeft;
                clamp = Utilities.clamp(f20 * ((float) r6), this.audioDuration, 0L);
            }
            if (this.hasVideo && Math.abs(this.progress - clamp) > 400) {
                this.loopProgressFrom = this.progress;
                this.loopProgress.set(1.0f, true);
            }
            TimelineDelegate timelineDelegate6 = this.delegate;
            this.progress = clamp;
            timelineDelegate6.onProgressChange(clamp, false);
            return;
        }
        if (z2 || this.scrolling) {
            if (this.hasVideo) {
                long j21 = this.audioOffset + (this.audioLeft * ((float) this.audioDuration));
                float f21 = this.videoRight;
                float f22 = (float) this.videoDuration;
                this.progress = Utilities.clamp(j21, f21 * f22, this.videoLeft * f22);
            } else if (this.hasRound) {
                long j22 = this.audioOffset + (this.audioLeft * ((float) this.audioDuration));
                float f23 = this.roundRight;
                float f24 = (float) this.videoDuration;
                this.progress = Utilities.clamp(j22, f23 * f24, this.roundLeft * f24);
            } else {
                float f25 = this.audioLeft;
                this.progress = Utilities.clamp(f25 * ((float) r5), this.audioDuration, 0L);
            }
            TimelineDelegate timelineDelegate7 = this.delegate;
            if (timelineDelegate7 != null) {
                timelineDelegate7.onProgressChange(this.progress, false);
            }
        }
    }

    private void moveRoundOffset(float f) {
        long j;
        long j2;
        long j3;
        long j4;
        TimelineDelegate timelineDelegate;
        long clamp;
        if (!this.hasVideo) {
            long j5 = this.roundOffset;
            long clamp2 = Utilities.clamp(j5 + f, 0L, -(this.roundDuration - Math.min(getBaseDuration(), 120000L)));
            this.roundOffset = clamp2;
            float f2 = (float) (clamp2 - j5);
            this.roundLeft = Utilities.clamp(this.roundLeft - (f2 / ((float) this.roundDuration)), 1.0f, 0.0f);
            this.roundRight = Utilities.clamp(this.roundRight - (f2 / ((float) this.roundDuration)), 1.0f, 0.0f);
            TimelineDelegate timelineDelegate2 = this.delegate;
            if (timelineDelegate2 != null) {
                timelineDelegate2.onAudioLeftChange(this.roundLeft);
                this.delegate.onAudioRightChange(this.roundRight);
            }
        } else if (this.roundSelected) {
            float f3 = this.videoRight;
            float f4 = (float) this.videoDuration;
            float f5 = this.roundRight;
            float f6 = (float) this.roundDuration;
            long j6 = (f3 * f4) - (f5 * f6);
            float f7 = this.videoLeft;
            float f8 = this.roundLeft;
            long j7 = (f7 * f4) - (f8 * f6);
            float min = Math.min(f5 - f8, ((f3 - f7) * f4) / f6);
            long j8 = this.roundOffset;
            long j9 = f;
            long j10 = j8 + j9;
            if (j10 > j6) {
                float clamp3 = Utilities.clamp((((this.videoRight * ((float) this.videoDuration)) - ((float) j8)) - ((float) j9)) / ((float) this.roundDuration), 1.0f, min);
                this.roundRight = clamp3;
                float clamp4 = Utilities.clamp(clamp3 - min, 1.0f, 0.0f);
                this.roundLeft = clamp4;
                float f9 = this.videoRight;
                float f10 = (float) this.videoDuration;
                float f11 = this.roundRight;
                float f12 = (float) this.roundDuration;
                long j11 = (f9 * f10) - (f11 * f12);
                long j12 = (this.videoLeft * f10) - (clamp4 * f12);
                if (j11 < j12) {
                    j4 = j12;
                    j3 = j11;
                } else {
                    j3 = j12;
                    j4 = j11;
                }
                this.roundOffset = Utilities.clamp(this.roundOffset + j9, j4, j3);
                TimelineDelegate timelineDelegate3 = this.delegate;
                if (timelineDelegate3 != null) {
                    timelineDelegate3.onRoundLeftChange(this.roundLeft);
                    this.delegate.onRoundRightChange(this.roundRight);
                }
            } else if (j10 < j7) {
                float clamp5 = Utilities.clamp((((this.videoLeft * ((float) this.videoDuration)) - ((float) j8)) - ((float) j9)) / ((float) this.roundDuration), 1.0f - min, 0.0f);
                this.roundLeft = clamp5;
                float clamp6 = Utilities.clamp(clamp5 + min, 1.0f, 0.0f);
                this.roundRight = clamp6;
                float f13 = this.videoRight;
                float f14 = (float) this.videoDuration;
                float f15 = (float) this.roundDuration;
                long j13 = (f13 * f14) - (clamp6 * f15);
                long j14 = (this.videoLeft * f14) - (this.roundLeft * f15);
                if (j13 < j14) {
                    j2 = j13;
                    j = j14;
                } else {
                    j = j13;
                    j2 = j14;
                }
                this.roundOffset = Utilities.clamp(this.roundOffset + j9, j, j2);
                TimelineDelegate timelineDelegate4 = this.delegate;
                if (timelineDelegate4 != null) {
                    timelineDelegate4.onRoundLeftChange(this.roundLeft);
                    this.delegate.onRoundRightChange(this.roundRight);
                }
            } else {
                this.roundOffset = j10;
            }
        } else {
            long j15 = this.roundOffset + f;
            float baseDuration = (float) getBaseDuration();
            float f16 = (float) this.roundDuration;
            this.roundOffset = Utilities.clamp(j15, baseDuration - (this.roundRight * f16), (-this.roundLeft) * f16);
        }
        invalidate();
        TimelineDelegate timelineDelegate5 = this.delegate;
        if (timelineDelegate5 != null) {
            timelineDelegate5.onRoundOffsetChange(this.roundOffset + (this.roundLeft * ((float) this.roundDuration)));
        }
        boolean z = this.dragged;
        if (!z && (timelineDelegate = this.delegate) != null) {
            timelineDelegate.onProgressDragChange(true);
            if (this.hasVideo) {
                long j16 = this.roundOffset + (this.roundLeft * ((float) this.roundDuration));
                float f17 = this.videoRight;
                float f18 = (float) this.videoDuration;
                clamp = Utilities.clamp(j16, f17 * f18, this.videoLeft * f18);
            } else {
                float f19 = this.roundLeft;
                clamp = Utilities.clamp(f19 * ((float) r7), this.roundDuration, 0L);
            }
            if (this.hasVideo && Math.abs(this.progress - clamp) > 400) {
                this.loopProgressFrom = this.progress;
                this.loopProgress.set(1.0f, true);
            }
            TimelineDelegate timelineDelegate6 = this.delegate;
            this.progress = clamp;
            timelineDelegate6.onProgressChange(clamp, false);
            return;
        }
        if (z || this.scrolling) {
            if (this.hasVideo) {
                long j17 = this.roundOffset + (this.roundLeft * ((float) this.roundDuration));
                float f20 = this.videoRight;
                float f21 = (float) this.videoDuration;
                this.progress = Utilities.clamp(j17, f20 * f21, this.videoLeft * f21);
            } else {
                float f22 = this.roundLeft;
                this.progress = Utilities.clamp(f22 * ((float) r5), this.roundDuration, 0L);
            }
            TimelineDelegate timelineDelegate7 = this.delegate;
            if (timelineDelegate7 != null) {
                timelineDelegate7.onProgressChange(this.progress, false);
            }
        }
    }

    @Override
    public void computeScroll() {
        if (this.scroller.computeScrollOffset()) {
            int currX = this.scroller.getCurrX();
            long min = Math.min(getBaseDuration(), 120000L);
            if (this.scrollingVideo) {
                this.scroll = Math.max(0.0f, (((currX - this.px) - this.ph) / this.sw) * ((float) min));
            } else {
                if (!this.audioSelected) {
                    this.scroller.abortAnimation();
                    return;
                }
                int i = this.px;
                int i2 = this.ph;
                float f = this.sw;
                float f2 = (float) min;
                moveAudioOffset(((((currX - i) - i2) / f) * f2) - ((((this.wasScrollX - i) - i2) / f) * f2));
            }
            invalidate();
            this.wasScrollX = currX;
            return;
        }
        if (this.scrolling) {
            this.scrolling = false;
            TimelineDelegate timelineDelegate = this.delegate;
            if (timelineDelegate != null) {
                timelineDelegate.onProgressDragChange(false);
            }
        }
    }

    public class WaveformPath extends Path {
        private float lastAnimatedLoaded;
        private float lastAudioHeight;
        private float lastAudioSelected;
        private float lastBottom;
        private float lastLeft;
        private float lastMaxBar;
        private float lastRight;
        private long lastScrollDuration;
        private float lastStart;
        private int lastWaveformCount;

        WaveformPath() {
        }

        public void check(float f, float f2, float f3, float f4, float f5, long j, float f6, float f7, float f8) {
            if (TimelineView.this.waveform != null) {
                if (this.lastWaveformCount != TimelineView.this.waveform.getCount() || Math.abs(this.lastAnimatedLoaded - f5) > 0.01f || this.lastScrollDuration != j || Math.abs(this.lastAudioHeight - f6) > 1.0f || Math.abs(this.lastMaxBar - f7) > 0.01f || Math.abs(this.lastAudioSelected - f4) > 0.1f || Math.abs(this.lastBottom - f8) > 1.0f || Math.abs(this.lastStart - f) > 1.0f || Math.abs(this.lastLeft - f2) > 1.0f || Math.abs(this.lastRight - f3) > 1.0f) {
                    this.lastWaveformCount = TimelineView.this.waveform.getCount();
                    this.lastStart = f;
                    this.lastLeft = f2;
                    this.lastRight = f3;
                    this.lastAudioSelected = f4;
                    this.lastAnimatedLoaded = f5;
                    this.lastScrollDuration = j;
                    this.lastMaxBar = f7;
                    this.lastAudioHeight = f6;
                    this.lastBottom = f8;
                    layout(f, f2, f3, f4, f5, j, f7, f6, f8);
                    return;
                }
                return;
            }
            rewind();
        }

        private void layout(float f, float f2, float f3, float f4, float f5, long j, float f6, float f7, float f8) {
            TimelineView.this.waveformPath.rewind();
            float round = Math.round(AndroidUtilities.dpf2(3.3333f));
            int min = Math.min(TimelineView.this.waveform.getCount() - 1, (int) Math.ceil(((TimelineView.this.ph + f3) - f) / round));
            for (int max = Math.max(0, (int) (((f2 - TimelineView.this.ph) - f) / round)); max <= min; max++) {
                float f9 = max;
                float dp = (f9 * round) + f + AndroidUtilities.dp(2.0f);
                float bar = f6 <= 0.0f ? 0.0f : (TimelineView.this.waveform.getBar(max) / f6) * f7 * 0.6f;
                if (f9 < f5 && max + 1 > f5) {
                    bar *= f5 - f9;
                } else if (f9 > f5) {
                    bar = 0.0f;
                }
                if (dp < f2 || dp > f3) {
                    bar *= f4;
                    if (bar <= 0.0f) {
                    }
                }
                float max2 = Math.max(bar, AndroidUtilities.lerp(AndroidUtilities.dpf2(0.66f), AndroidUtilities.dpf2(1.5f), f4));
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(dp, AndroidUtilities.lerp(f8 - max2, f8 - ((f7 + max2) / 2.0f), f4), AndroidUtilities.dpf2(1.66f) + dp, AndroidUtilities.lerp(f8, f8 - ((f7 - max2) / 2.0f), f4));
                TimelineView.this.waveformPath.addRoundRect(rectF, TimelineView.this.waveformRadii, Path.Direction.CW);
            }
        }
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        Paint paint;
        long j;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        double d;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        long j2;
        float f18;
        float f19;
        float f20;
        float max;
        float f21;
        float max2;
        float lerp;
        float lerp2;
        double d2;
        float f22;
        float f23;
        float f24;
        float f25;
        boolean z;
        float f26;
        Paint paint2 = this.backgroundBlur.getPaint(1.0f);
        long min = Math.min(getBaseDuration(), 120000L);
        float f27 = this.hasVideo ? 1.0f : 0.0f;
        float f28 = this.videoSelectedT.set((this.audioSelected || this.roundSelected) ? false : true);
        if (this.hasVideo) {
            canvas.save();
            float videoHeight = getVideoHeight();
            f = f27;
            long j3 = this.videoDuration;
            float f29 = j3 <= 0 ? 0.0f : (this.px + this.ph) - ((((float) this.scroll) / ((float) min)) * this.sw);
            float f30 = this.ph;
            float f31 = f29 - f30;
            float f32 = (j3 <= 0 ? 0.0f : ((((float) (j3 - this.scroll)) / ((float) min)) * this.sw) + this.px + r12) + f30;
            RectF rectF = this.videoBounds;
            float f33 = this.h - this.py;
            rectF.set(f31, f33 - videoHeight, f32, f33);
            this.videoClipPath.rewind();
            this.videoClipPath.addRoundRect(this.videoBounds, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
            canvas.clipPath(this.videoClipPath);
            VideoThumbsLoader videoThumbsLoader = this.thumbs;
            if (videoThumbsLoader != null) {
                float frameWidth = videoThumbsLoader.getFrameWidth();
                int max3 = (int) Math.max(0.0d, Math.floor((f31 - this.px) / frameWidth));
                int min2 = (int) Math.min(this.thumbs.count, Math.ceil(((f32 - f31) - this.px) / frameWidth) + 1.0d);
                int i = (int) this.videoBounds.top;
                boolean z2 = this.thumbs.frames.size() >= min2;
                boolean z3 = z2 && !this.isMainVideoRound;
                if (z3) {
                    int i2 = max3;
                    while (true) {
                        if (i2 >= Math.min(this.thumbs.frames.size(), min2)) {
                            break;
                        }
                        if (((VideoThumbsLoader.BitmapFrame) this.thumbs.frames.get(i2)).bitmap == null) {
                            z3 = false;
                            break;
                        }
                        i2++;
                    }
                }
                if (!z3) {
                    if (paint2 == null) {
                        canvas.drawColor(1073741824);
                    } else {
                        canvas.drawRect(this.videoBounds, paint2);
                        canvas.drawColor(855638016);
                    }
                }
                while (max3 < Math.min(this.thumbs.frames.size(), min2)) {
                    VideoThumbsLoader.BitmapFrame bitmapFrame = (VideoThumbsLoader.BitmapFrame) this.thumbs.frames.get(max3);
                    if (bitmapFrame.bitmap != null) {
                        this.videoFramePaint.setAlpha((int) (bitmapFrame.getAlpha() * 255.0f));
                        canvas.drawBitmap(bitmapFrame.bitmap, f31, i - ((int) ((r1.getHeight() - videoHeight) / 2.0f)), this.videoFramePaint);
                    }
                    f31 += frameWidth;
                    max3++;
                }
                if (!z2) {
                    this.thumbs.load();
                }
            }
            this.selectedVideoClipPath.rewind();
            if (this.isCover) {
                f26 = videoHeight;
            } else {
                RectF rectF2 = AndroidUtilities.rectTmp;
                int i3 = this.px;
                int i4 = this.ph;
                float f34 = i3 + i4;
                float f35 = this.videoLeft;
                float f36 = (float) this.videoDuration;
                float f37 = (float) this.scroll;
                float f38 = (float) min;
                float f39 = this.sw;
                float f40 = (((((f35 * f36) - f37) / f38) * f39) + f34) - (f35 <= 0.0f ? i4 : 0);
                float f41 = this.h - this.py;
                float f42 = f41 - videoHeight;
                f26 = videoHeight;
                float f43 = this.videoRight;
                float f44 = f34 + ((((f36 * f43) - f37) / f38) * f39);
                if (f43 < 1.0f) {
                    i4 = 0;
                }
                rectF2.set(f40, f42, f44 + i4, f41);
                this.selectedVideoClipPath.addRoundRect(rectF2, this.selectedVideoRadii, Path.Direction.CW);
                canvas.clipPath(this.selectedVideoClipPath, Region.Op.DIFFERENCE);
                canvas.drawColor(1342177280);
            }
            canvas.restore();
            f2 = f26;
        } else {
            f = f27;
            f2 = 0.0f;
        }
        float dp = AndroidUtilities.dp(4.0f);
        float f45 = this.roundT.set(this.hasRound);
        float f46 = this.roundSelectedT.set(this.hasRound && this.roundSelected);
        float roundHeight = getRoundHeight() * f45;
        if (f45 > 0.0f) {
            if (this.hasVideo) {
                float f47 = (float) min;
                f24 = this.px + this.ph + (((((float) (this.roundOffset - this.scroll)) + (AndroidUtilities.lerp(this.roundLeft, 0.0f, f46) * ((float) this.roundDuration))) / f47) * this.sw);
                f23 = this.px + this.ph + (((((float) (this.roundOffset - this.scroll)) + (AndroidUtilities.lerp(this.roundRight, 1.0f, f46) * ((float) this.roundDuration))) / f47) * this.sw);
                f3 = f46;
                f4 = f45;
            } else {
                float f48 = this.px + this.ph;
                long j4 = this.roundOffset - this.scroll;
                float f49 = (float) min;
                float f50 = this.sw;
                float f51 = ((((float) j4) / f49) * f50) + f48;
                f3 = f46;
                f4 = f45;
                f23 = ((((float) (j4 + this.roundDuration)) / f49) * f50) + f48;
                f24 = f51;
            }
            float f52 = ((this.h - this.py) - f2) - (dp * f);
            RectF rectF3 = this.roundBounds;
            float f53 = this.ph;
            rectF3.set(f24 - f53, f52 - roundHeight, f23 + f53, f52);
            this.roundClipPath.rewind();
            this.roundClipPath.addRoundRect(this.roundBounds, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
            canvas.save();
            canvas.clipPath(this.roundClipPath);
            VideoThumbsLoader videoThumbsLoader2 = this.roundThumbs;
            if (videoThumbsLoader2 != null) {
                long j5 = this.roundDuration;
                float f54 = j5 <= 0 ? 0.0f : this.px + this.ph + ((((float) (this.roundOffset - this.scroll)) / ((float) min)) * this.sw);
                float f55 = this.ph;
                float f56 = f54 - f55;
                float f57 = (j5 <= 0 ? 0.0f : ((((float) ((this.roundOffset + j5) - this.scroll)) / ((float) min)) * this.sw) + this.px + r4) + f55;
                int frameWidth2 = videoThumbsLoader2.getFrameWidth();
                if (this.hasVideo) {
                    f25 = this.px + this.ph + ((((float) (this.roundOffset - this.scroll)) / ((float) min)) * this.sw);
                } else {
                    f25 = this.px;
                }
                float f58 = frameWidth2;
                int max4 = (int) Math.max(0.0d, Math.floor((f56 - f25) / f58));
                int min3 = (int) Math.min(this.roundThumbs.count, Math.ceil((f57 - f56) / f58) + 1.0d);
                int i5 = (int) this.roundBounds.top;
                boolean z4 = this.roundThumbs.frames.size() >= min3;
                if (z4) {
                    for (int i6 = max4; i6 < Math.min(this.roundThumbs.frames.size(), min3); i6++) {
                        if (((VideoThumbsLoader.BitmapFrame) this.roundThumbs.frames.get(i6)).bitmap == null) {
                            z = false;
                            break;
                        }
                    }
                }
                z = z4;
                if (!z) {
                    if (paint2 == null) {
                        canvas.drawColor(1073741824);
                    } else {
                        canvas.drawRect(this.roundBounds, paint2);
                        canvas.drawColor(855638016);
                    }
                }
                while (max4 < Math.min(this.roundThumbs.frames.size(), min3)) {
                    VideoThumbsLoader.BitmapFrame bitmapFrame2 = (VideoThumbsLoader.BitmapFrame) this.roundThumbs.frames.get(max4);
                    if (bitmapFrame2.bitmap != null) {
                        this.videoFramePaint.setAlpha((int) (bitmapFrame2.getAlpha() * 255.0f));
                        canvas.drawBitmap(bitmapFrame2.bitmap, f56, i5 - ((int) ((r13.getHeight() - roundHeight) / 2.0f)), this.videoFramePaint);
                    }
                    f56 += f58;
                    max4++;
                }
                if (!z4) {
                    this.roundThumbs.load();
                }
            }
            this.selectedVideoClipPath.rewind();
            RectF rectF4 = AndroidUtilities.rectTmp;
            int i7 = this.px;
            int i8 = this.ph;
            float f59 = i7 + i8;
            float f60 = this.roundLeft;
            float f61 = (float) this.roundDuration;
            float f62 = (float) this.scroll;
            float f63 = (float) this.roundOffset;
            float f64 = (float) min;
            paint = paint2;
            float f65 = this.sw;
            float f66 = ((((((f60 * f61) - f62) + f63) / f64) * f65) + f59) - (f60 <= 0.0f ? i8 : 0);
            float f67 = i8 * (1.0f - f3);
            float f68 = f66 - f67;
            RectF rectF5 = this.roundBounds;
            f5 = dp;
            float f69 = rectF5.top;
            f6 = f2;
            float f70 = this.roundRight;
            rectF4.set(f68, f69, f59 + (((((f61 * f70) - f62) + f63) / f64) * f65) + (f70 >= 1.0f ? i8 : 0) + f67, rectF5.bottom);
            this.selectedVideoClipPath.addRoundRect(rectF4, this.selectedVideoRadii, Path.Direction.CW);
            canvas.clipPath(this.selectedVideoClipPath, Region.Op.DIFFERENCE);
            canvas.drawColor(1342177280);
            canvas.restore();
        } else {
            f3 = f46;
            f4 = f45;
            f5 = dp;
            f6 = f2;
            paint = paint2;
        }
        float f71 = this.audioT.set(this.hasAudio);
        float f72 = this.audioSelectedT.set(this.hasAudio && this.audioSelected);
        float audioHeight = getAudioHeight() * f71;
        if (f71 > 0.0f) {
            Paint paint3 = this.audioBlur.getPaint(f71);
            canvas.save();
            if (this.hasVideo || this.hasRound) {
                float f73 = (float) min;
                lerp = this.px + this.ph + (((((float) (this.audioOffset - this.scroll)) + (AndroidUtilities.lerp(this.audioLeft, 0.0f, f72) * ((float) this.audioDuration))) / f73) * this.sw);
                lerp2 = this.px + this.ph + (((((float) (this.audioOffset - this.scroll)) + (AndroidUtilities.lerp(this.audioRight, 1.0f, f72) * ((float) this.audioDuration))) / f73) * this.sw);
            } else {
                float f74 = this.px + this.ph;
                long j6 = this.audioOffset - this.scroll;
                float f75 = (float) min;
                float f76 = this.sw;
                lerp2 = f74 + ((((float) (j6 + this.audioDuration)) / f75) * f76);
                lerp = ((((float) j6) / f75) * f76) + f74;
            }
            float f77 = ((((this.h - this.py) - f6) - (f5 * f)) - roundHeight) - (f5 * f4);
            RectF rectF6 = this.audioBounds;
            float f78 = this.ph;
            float f79 = f77 - audioHeight;
            rectF6.set(lerp - f78, f79, lerp2 + f78, f77);
            this.audioClipPath.rewind();
            this.audioClipPath.addRoundRect(this.audioBounds, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
            canvas.clipPath(this.audioClipPath);
            if (paint3 == null) {
                canvas.drawColor(Theme.multAlpha(1073741824, f71));
            } else {
                canvas.drawRect(this.audioBounds, paint3);
                canvas.drawColor(Theme.multAlpha(855638016, f71));
            }
            if (this.waveform == null || paint3 == null) {
                d2 = 0.0d;
            } else {
                Paint paint4 = this.audioWaveformBlur.getPaint(0.4f * f71);
                if (paint4 == null) {
                    paint4 = this.waveformPaint;
                    paint4.setAlpha((int) (64.0f * f71));
                }
                float f80 = this.waveformMax.set(this.waveform.getMaxBar(), !this.waveformIsLoaded);
                this.waveformIsLoaded = this.waveform.getLoadedCount() > 0;
                d2 = 0.0d;
                this.waveformPath.check(this.px + this.ph + ((((float) (this.audioOffset - this.scroll)) / ((float) min)) * this.sw), lerp, lerp2, f72, this.waveformLoaded.set(this.waveform.getLoadedCount()), min, audioHeight, f80, f77);
                canvas.drawPath(this.waveformPath, paint4);
            }
            if (f72 < 1.0f) {
                int i9 = this.px;
                float f81 = this.ph + i9;
                float f82 = (float) (this.audioOffset - this.scroll);
                float f83 = this.audioLeft;
                float f84 = (float) this.audioDuration;
                float f85 = (float) min;
                float f86 = this.sw;
                float f87 = ((((f83 * f84) + f82) / f85) * f86) + f81;
                float f88 = f81 + (((f82 + (this.audioRight * f84)) / f85) * f86);
                float max5 = (Math.max(i9, f87) + Math.min(this.w - this.px, f88)) / 2.0f;
                float dp2 = f79 + AndroidUtilities.dp(14.0f);
                float max6 = Math.max(0.0f, (Math.min(this.w - this.px, f88) - Math.max(this.px, f87)) - AndroidUtilities.dp(24.0f));
                float dpf2 = AndroidUtilities.dpf2(13.0f) + ((this.audioAuthor == null && this.audioTitle == null) ? 0.0f : AndroidUtilities.dpf2(3.11f) + this.audioAuthorWidth + AndroidUtilities.dpf2(9.66f) + this.audioTitleWidth);
                boolean z5 = dpf2 < max6;
                float min4 = max5 - (Math.min(dpf2, max6) / 2.0f);
                this.audioIcon.setBounds((int) min4, (int) (dp2 - (AndroidUtilities.dp(13.0f) / 2.0f)), (int) (AndroidUtilities.dp(13.0f) + min4), (int) ((AndroidUtilities.dp(13.0f) / 2.0f) + dp2));
                float f89 = 1.0f - f72;
                float f90 = f89 * 255.0f;
                this.audioIcon.setAlpha((int) f90);
                this.audioIcon.draw(canvas);
                float dpf22 = min4 + AndroidUtilities.dpf2(16.11f);
                d = 0.0d;
                f9 = f3;
                f7 = f;
                f8 = f4;
                f10 = f5;
                j = min;
                canvas.saveLayerAlpha(0.0f, 0.0f, this.w, this.h, 255, 31);
                float min5 = Math.min(f88, this.w) - AndroidUtilities.dp(12.0f);
                f11 = 0.0f;
                canvas.clipRect(dpf22, 0.0f, min5, this.h);
                if (this.audioAuthor != null) {
                    canvas.save();
                    canvas.translate(dpf22 - this.audioAuthorLeft, dp2 - (this.audioAuthor.getHeight() / 2.0f));
                    this.audioAuthorPaint.setAlpha((int) (f90 * f71));
                    this.audioAuthor.draw(canvas);
                    canvas.restore();
                    f22 = dpf22 + this.audioAuthorWidth;
                } else {
                    f22 = dpf22;
                }
                if (this.audioAuthor != null && this.audioTitle != null) {
                    float dpf23 = f22 + AndroidUtilities.dpf2(3.66f);
                    int alpha = this.audioDotPaint.getAlpha();
                    this.audioDotPaint.setAlpha((int) (alpha * f89));
                    canvas.drawCircle(AndroidUtilities.dp(1.0f) + dpf23, dp2, AndroidUtilities.dp(1.0f), this.audioDotPaint);
                    this.audioDotPaint.setAlpha(alpha);
                    f22 = dpf23 + AndroidUtilities.dpf2(2.0f) + AndroidUtilities.dpf2(4.0f);
                }
                if (this.audioTitle != null) {
                    canvas.save();
                    canvas.translate(f22 - this.audioTitleLeft, dp2 - (this.audioTitle.getHeight() / 2.0f));
                    this.audioTitlePaint.setAlpha((int) (f90 * f71));
                    this.audioTitle.draw(canvas);
                    canvas.restore();
                }
                if (!z5) {
                    this.ellipsizeMatrix.reset();
                    this.ellipsizeMatrix.postScale(AndroidUtilities.dpf2(8.0f) / 16.0f, 1.0f);
                    this.ellipsizeMatrix.postTranslate(min5 - AndroidUtilities.dp(8.0f), 0.0f);
                    this.ellipsizeGradient.setLocalMatrix(this.ellipsizeMatrix);
                    canvas.drawRect(min5 - AndroidUtilities.dp(8.0f), f79, min5, f77, this.ellipsizePaint);
                }
                canvas.restore();
            } else {
                d = d2;
                j = min;
                f7 = f;
                f8 = f4;
                f9 = f3;
                f10 = f5;
                f11 = 0.0f;
            }
            canvas.restore();
        } else {
            j = min;
            f7 = f;
            f8 = f4;
            f9 = f3;
            f10 = f5;
            f11 = 0.0f;
            d = 0.0d;
        }
        boolean z6 = this.hasVideo;
        float f91 = ((z6 || this.hasRound) ? f72 : 1.0f) * f71;
        if (z6 || this.hasAudio) {
            f12 = f9;
            f13 = f8;
        } else {
            f13 = f8;
            f12 = 1.0f;
        }
        float f92 = f13 * f12;
        float f93 = this.h - this.py;
        float f94 = f93 - f6;
        float f95 = f7;
        float f96 = f10 * f95;
        float f97 = f94 - f96;
        float f98 = f97 - roundHeight;
        float f99 = f98 - (f10 * f13);
        float f100 = ((f99 - audioHeight) * f91) + f11 + (f98 * f92) + (f94 * f28);
        float f101 = (f99 * f91) + f11 + (f97 * f92) + (f93 * f28);
        float f102 = (float) this.audioOffset;
        float f103 = this.audioLeft;
        float f104 = (float) this.audioDuration;
        float f105 = (float) this.roundOffset;
        float f106 = this.roundLeft;
        float f107 = f71;
        float f108 = (float) this.roundDuration;
        float f109 = (((f103 * f104) + f102) * f91) + f11 + (((f106 * f108) + f105) * f92);
        float f110 = this.videoLeft;
        float f111 = f13;
        float f112 = (float) this.videoDuration;
        float f113 = ((f102 + (this.audioRight * f104)) * f91) + f11 + ((f105 + (this.roundRight * f108)) * f92) + (this.videoRight * f112 * f28);
        float f114 = this.px + this.ph;
        float f115 = (float) this.scroll;
        long j7 = j;
        float f116 = (float) j7;
        float f117 = this.sw;
        float f118 = ((((f109 + ((f110 * f112) * f28)) - f115) / f116) * f117) + f114;
        float f119 = f114 + (((f113 - f115) / f116) * f117);
        if (!this.hasAudio || z6) {
            f14 = f111;
            f15 = f107;
            f107 = Math.max(f95, f14);
        } else {
            f15 = f107;
            f14 = f111;
        }
        if (f15 > d || f14 > d || f95 > d) {
            if (this.hasVideo || this.hasRound) {
                f16 = f72;
                f17 = 1.0f;
            } else {
                f16 = f72;
                f17 = AndroidUtilities.lerp(0.6f, 1.0f, f16) * f15;
            }
            float f120 = f16;
            j2 = j7;
            f18 = 0.0f;
            drawRegion(canvas, paint, f100, f101, f118, f119, f17 * f107);
            if (this.hasVideo && ((this.hasAudio || this.hasRound) && (f120 > 0.0f || f9 > 0.0f))) {
                float f121 = this.h - this.py;
                float f122 = this.ph + this.px;
                float f123 = this.videoLeft;
                float f124 = (float) this.videoDuration;
                float f125 = (float) this.scroll;
                float f126 = this.sw;
                drawRegion(canvas, paint, f121 - f6, f121, f122 + ((((f123 * f124) - f125) / f116) * f126), f122 + ((((this.videoRight * f124) - f125) / f116) * f126), 0.8f);
            }
            float f127 = this.loopProgress.set(0.0f);
            float max7 = ((((this.h - this.py) - f6) - ((audioHeight + (f10 * Math.max(f14, f95))) * f15)) - ((roundHeight + f96) * f14)) - AndroidUtilities.dpf2(4.3f);
            float dpf24 = (this.h - this.py) + AndroidUtilities.dpf2(4.3f);
            if (f127 > 0.0f) {
                long j8 = this.loopProgressFrom;
                if (j8 == -1) {
                    if (this.hasVideo) {
                        f19 = (float) this.videoDuration;
                        f20 = this.videoRight;
                    } else if (this.hasRound) {
                        f19 = (float) this.roundDuration;
                        f20 = this.roundRight;
                    } else {
                        f19 = (float) this.audioDuration;
                        f20 = this.audioRight;
                    }
                    j8 = f19 * f20;
                }
                drawProgress(canvas, max7, dpf24, j8, f127 * f107);
            }
            drawProgress(canvas, max7, dpf24, this.progress, (1.0f - f127) * f107);
        } else {
            j2 = j7;
            f18 = 0.0f;
        }
        if (this.dragged) {
            long dp3 = (AndroidUtilities.dp(32.0f) / this.sw) * f116 * (1.0f / (1000.0f / AndroidUtilities.screenRefreshRate));
            int i10 = this.pressHandle;
            if (i10 == 4) {
                float f128 = this.videoLeft;
                long j9 = this.scroll;
                long j10 = this.videoDuration;
                float f129 = (float) j10;
                long j11 = (f128 >= ((float) j9) / f129 ? this.videoRight > ((float) (j9 + j2)) / f129 ? 1 : 0 : -1) * dp3;
                long clamp = Utilities.clamp(j9 + j11, j10 - j2, 0L);
                this.scroll = clamp;
                this.progress += j11;
                float f130 = ((float) (clamp - j9)) / ((float) this.videoDuration);
                if (f130 > f18) {
                    f21 = 1.0f;
                    max2 = Math.min(1.0f - this.videoRight, f130);
                } else {
                    f21 = 1.0f;
                    max2 = Math.max(f18 - this.videoLeft, f130);
                }
                this.videoLeft = Utilities.clamp(this.videoLeft + max2, f21, f18);
                this.videoRight = Utilities.clamp(this.videoRight + max2, f21, f18);
                TimelineDelegate timelineDelegate = this.delegate;
                if (timelineDelegate != null) {
                    timelineDelegate.onVideoLeftChange(this.videoLeft);
                    this.delegate.onVideoRightChange(this.videoRight);
                }
                invalidate();
                return;
            }
            if (i10 == 8) {
                float f131 = this.audioLeft;
                long j12 = this.audioOffset;
                long j13 = -j12;
                float f132 = (float) (j13 + 100);
                long j14 = this.audioDuration;
                float f133 = (float) j14;
                int i11 = f131 >= f132 / f133 ? this.audioRight >= ((float) ((j13 + j2) - 100)) / f133 ? 1 : 0 : -1;
                if (i11 != 0) {
                    if (this.audioSelected && this.hasVideo) {
                        long j15 = j12 - (i11 * dp3);
                        float f134 = this.videoRight;
                        float f135 = (float) this.videoDuration;
                        this.audioOffset = Utilities.clamp(j15, (f134 * f135) - (f131 * f133), (this.videoLeft * f135) - (this.audioRight * f133));
                    } else if (this.roundSelected && this.hasRound) {
                        long j16 = j12 - (i11 * dp3);
                        float f136 = this.roundRight;
                        float f137 = (float) this.roundDuration;
                        this.audioOffset = Utilities.clamp(j16, (f136 * f137) - (f131 * f133), (this.roundLeft * f137) - (this.audioRight * f133));
                    } else {
                        this.audioOffset = Utilities.clamp(j12 - (i11 * dp3), 0L, -(j14 - Math.min(getBaseDuration(), 120000L)));
                    }
                    float f138 = ((float) (-(this.audioOffset - j12))) / ((float) this.audioDuration);
                    if (f138 > f18) {
                        max = Math.min(1.0f - this.audioRight, f138);
                    } else {
                        max = Math.max(f18 - this.audioLeft, f138);
                    }
                    if (!this.hasVideo) {
                        float f139 = (float) this.progress;
                        float f140 = (float) this.audioDuration;
                        this.progress = Utilities.clamp(f139 + (max * f140), f140, f18);
                    }
                    this.audioLeft = Utilities.clamp(this.audioLeft + max, 1.0f, f18);
                    this.audioRight = Utilities.clamp(this.audioRight + max, 1.0f, f18);
                    TimelineDelegate timelineDelegate2 = this.delegate;
                    if (timelineDelegate2 != null) {
                        timelineDelegate2.onAudioLeftChange(this.audioLeft);
                        this.delegate.onAudioRightChange(this.audioRight);
                        this.delegate.onProgressChange(this.progress, false);
                    }
                    invalidate();
                }
            }
        }
    }

    private void drawRegion(Canvas canvas, Paint paint, float f, float f2, float f3, float f4, float f5) {
        if (f5 <= 0.0f) {
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f3 - AndroidUtilities.dp(10.0f), f, f4 + AndroidUtilities.dp(10.0f), f2);
        canvas.saveLayerAlpha(0.0f, 0.0f, this.w, this.h, 255, 31);
        int i = (int) (255.0f * f5);
        this.regionPaint.setAlpha(i);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.regionPaint);
        rectF.inset(AndroidUtilities.dp(this.isCover ? 2.5f : 10.0f), AndroidUtilities.dp(2.0f));
        if (this.isCover) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), this.regionCutPaint);
        } else {
            canvas.drawRect(rectF, this.regionCutPaint);
        }
        float dp = AndroidUtilities.dp(2.0f);
        float dp2 = AndroidUtilities.dp(10.0f);
        Paint paint2 = paint != null ? paint : this.regionHandlePaint;
        this.regionHandlePaint.setAlpha(255);
        paint2.setAlpha(i);
        float f6 = f + f2;
        float f7 = (f6 - dp2) / 2.0f;
        float f8 = (f6 + dp2) / 2.0f;
        rectF.set(f3 - ((AndroidUtilities.dp(this.isCover ? 2.0f : 10.0f) - dp) / 2.0f), f7, f3 - ((AndroidUtilities.dp(this.isCover ? 2.0f : 10.0f) + dp) / 2.0f), f8);
        if (!this.isCover) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), paint2);
            if (paint != null && !this.isCover) {
                this.regionHandlePaint.setAlpha((int) (f5 * 48.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), this.regionHandlePaint);
            }
        }
        rectF.set(f4 + ((AndroidUtilities.dp(this.isCover ? 2.5f : 10.0f) - dp) / 2.0f), f7, f4 + ((AndroidUtilities.dp(this.isCover ? 2.5f : 10.0f) + dp) / 2.0f), f8);
        if (!this.isCover) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), paint2);
            if (paint != null) {
                this.regionHandlePaint.setAlpha((int) (f5 * 48.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), this.regionHandlePaint);
            }
        }
        canvas.restore();
    }

    private void drawProgress(Canvas canvas, float f, float f2, long j, float f3) {
        if (this.isCover) {
            return;
        }
        float clamp = this.px + this.ph + (this.sw * (((float) ((Utilities.clamp(j, getBaseDuration(), 0L) + (!this.hasVideo ? this.audioOffset : 0L)) - this.scroll)) / ((float) Math.min(getBaseDuration(), 120000L))));
        float f4 = (((f + f2) / 2.0f) / 2.0f) * (1.0f - f3);
        float f5 = f + f4;
        float f6 = f2 - f4;
        this.progressShadowPaint.setAlpha((int) (38.0f * f3));
        this.progressWhitePaint.setAlpha((int) (f3 * 255.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(clamp - AndroidUtilities.dpf2(1.5f), f5, AndroidUtilities.dpf2(1.5f) + clamp, f6);
        rectF.inset(-AndroidUtilities.dpf2(0.66f), -AndroidUtilities.dpf2(0.66f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.progressShadowPaint);
        rectF.set(clamp - AndroidUtilities.dpf2(1.5f), f5, clamp + AndroidUtilities.dpf2(1.5f), f6);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.progressWhitePaint);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        this.audioAuthorPaint.setTextSize(AndroidUtilities.dp(12.0f));
        this.audioTitlePaint.setTextSize(AndroidUtilities.dp(12.0f));
        float[] fArr = this.waveformRadii;
        float dp = AndroidUtilities.dp(2.0f);
        fArr[3] = dp;
        fArr[2] = dp;
        fArr[1] = dp;
        fArr[0] = dp;
        float[] fArr2 = this.waveformRadii;
        fArr2[7] = 0.0f;
        fArr2[6] = 0.0f;
        fArr2[5] = 0.0f;
        fArr2[4] = 0.0f;
        int dp2 = AndroidUtilities.dp(12.0f);
        this.px = dp2;
        int dp3 = AndroidUtilities.dp(5.0f);
        this.py = dp3;
        setPadding(dp2, dp3, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(5.0f));
        int size = View.MeasureSpec.getSize(i);
        this.w = size;
        int dp4 = AndroidUtilities.dp(heightDp());
        this.h = dp4;
        setMeasuredDimension(size, dp4);
        int dp5 = AndroidUtilities.dp(10.0f);
        this.ph = dp5;
        this.sw = (this.w - (dp5 * 2)) - (this.px * 2);
        if (this.videoPath != null && this.thumbs == null) {
            setupVideoThumbs(false);
        }
        if (this.audioPath == null || this.waveform != null) {
            return;
        }
        setupAudioWaveform();
    }

    public class VideoThumbsLoader {
        private Path clipPath;
        private final int count;
        private boolean destroyed;
        private long duration;
        private final int frameHeight;
        private final long frameIterator;
        private final int frameWidth;
        private final boolean isRound;
        private MediaMetadataRetriever metadataRetriever;
        private long nextFrame;
        private final ArrayList<BitmapFrame> frames = new ArrayList<>();
        private boolean loading = false;
        private final Paint bitmapPaint = new Paint(3);

        public VideoThumbsLoader(boolean r16, java.lang.String r17, int r18, int r19, java.lang.Long r20, long r21, long r23, long r25) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.recorder.TimelineView.VideoThumbsLoader.<init>(org.telegram.ui.Stories.recorder.TimelineView, boolean, java.lang.String, int, int, java.lang.Long, long, long, long):void");
        }

        public int getFrameWidth() {
            return this.frameWidth;
        }

        public long getDuration() {
            return this.duration;
        }

        public void load() {
            if (this.loading || this.metadataRetriever == null || this.frames.size() >= this.count) {
                return;
            }
            this.loading = true;
            this.nextFrame += this.frameIterator;
            Utilities.themeQueue.cancelRunnable(new TimelineView$VideoThumbsLoader$$ExternalSyntheticLambda0(this));
            Utilities.themeQueue.postRunnable(new TimelineView$VideoThumbsLoader$$ExternalSyntheticLambda0(this));
        }

        public void retrieveFrame() {
            MediaMetadataRetriever mediaMetadataRetriever = this.metadataRetriever;
            if (mediaMetadataRetriever == null) {
                return;
            }
            final Bitmap bitmap = null;
            try {
                bitmap = mediaMetadataRetriever.getFrameAtTime(this.nextFrame * 1000, 2);
                if (bitmap != null) {
                    Bitmap createBitmap = Bitmap.createBitmap(this.frameWidth, this.frameHeight, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    float max = Math.max(this.frameWidth / bitmap.getWidth(), this.frameHeight / bitmap.getHeight());
                    Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                    Rect rect2 = new Rect((int) ((createBitmap.getWidth() - (bitmap.getWidth() * max)) / 2.0f), (int) ((createBitmap.getHeight() - (bitmap.getHeight() * max)) / 2.0f), (int) ((createBitmap.getWidth() + (bitmap.getWidth() * max)) / 2.0f), (int) ((createBitmap.getHeight() + (bitmap.getHeight() * max)) / 2.0f));
                    if (this.isRound) {
                        if (this.clipPath == null) {
                            this.clipPath = new Path();
                        }
                        this.clipPath.rewind();
                        this.clipPath.addCircle(this.frameWidth / 2.0f, this.frameHeight / 2.0f, Math.min(r6, r9) / 2.0f, Path.Direction.CW);
                        canvas.clipPath(this.clipPath);
                    }
                    canvas.drawBitmap(bitmap, rect, rect2, this.bitmapPaint);
                    bitmap.recycle();
                    bitmap = createBitmap;
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    TimelineView.VideoThumbsLoader.this.lambda$retrieveFrame$0(bitmap);
                }
            });
        }

        public void lambda$retrieveFrame$0(Bitmap bitmap) {
            if (!this.loading || this.destroyed) {
                return;
            }
            this.frames.add(new BitmapFrame(bitmap));
            this.loading = false;
            TimelineView.this.invalidate();
        }

        public void destroy() {
            this.destroyed = true;
            Utilities.themeQueue.cancelRunnable(new TimelineView$VideoThumbsLoader$$ExternalSyntheticLambda0(this));
            Iterator<BitmapFrame> it = this.frames.iterator();
            while (it.hasNext()) {
                Bitmap bitmap = it.next().bitmap;
                if (bitmap != null) {
                    bitmap.recycle();
                }
            }
            this.frames.clear();
            MediaMetadataRetriever mediaMetadataRetriever = this.metadataRetriever;
            if (mediaMetadataRetriever != null) {
                try {
                    mediaMetadataRetriever.release();
                } catch (Exception e) {
                    this.metadataRetriever = null;
                    FileLog.e(e);
                }
            }
        }

        public class BitmapFrame {
            private final AnimatedFloat alpha;
            public Bitmap bitmap;

            public BitmapFrame(Bitmap bitmap) {
                this.alpha = new AnimatedFloat(0.0f, TimelineView.this, 0L, 240L, CubicBezierInterpolator.EASE_OUT_QUINT);
                this.bitmap = bitmap;
            }

            public float getAlpha() {
                return this.alpha.set(1.0f);
            }
        }
    }

    public class AudioWaveformLoader {
        private final int count;
        private final short[] data;
        private long duration;
        private final MediaExtractor extractor;
        private MediaFormat inputFormat;
        private short max;
        private FfmpegAudioWaveformLoader waveformLoader;
        private int loaded = 0;
        private final Object lock = new Object();
        private boolean stop = false;

        public AudioWaveformLoader(String str, int i) {
            int i2 = 0;
            MediaExtractor mediaExtractor = new MediaExtractor();
            this.extractor = mediaExtractor;
            String str2 = null;
            try {
                mediaExtractor.setDataSource(str);
                int trackCount = mediaExtractor.getTrackCount();
                while (true) {
                    if (i2 < trackCount) {
                        MediaFormat trackFormat = this.extractor.getTrackFormat(i2);
                        str2 = trackFormat.getString("mime");
                        if (str2 != null && str2.startsWith("audio/")) {
                            this.extractor.selectTrack(i2);
                            this.inputFormat = trackFormat;
                            break;
                        }
                        i2++;
                    } else {
                        break;
                    }
                }
                MediaFormat mediaFormat = this.inputFormat;
                if (mediaFormat != null) {
                    this.duration = mediaFormat.getLong("durationUs") / 1000000;
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            int round = Math.round(((((float) (this.duration * 1000)) / ((float) Math.min(TimelineView.this.hasVideo ? TimelineView.this.videoDuration : TimelineView.this.hasRound ? TimelineView.this.roundDuration : this.duration * 1000, 120000L))) * i) / Math.round(AndroidUtilities.dpf2(3.3333f)));
            this.count = round;
            this.data = new short[round];
            if (this.duration <= 0 || this.inputFormat == null) {
                return;
            }
            if ("audio/mpeg".equals(str2) || "audio/mp3".equals(str2)) {
                this.waveformLoader = new FfmpegAudioWaveformLoader(str, round, new Utilities.Callback2() {
                    @Override
                    public final void run(Object obj, Object obj2) {
                        TimelineView.AudioWaveformLoader.this.lambda$run$0((short[]) obj, ((Integer) obj2).intValue());
                    }
                });
            } else {
                Utilities.phoneBookQueue.postRunnable(new TimelineView$AudioWaveformLoader$$ExternalSyntheticLambda0(this));
            }
        }

        public void run() {
            MediaCodec.BufferInfo bufferInfo;
            int i;
            int i2;
            ByteBuffer outputBuffer;
            short s;
            ByteBuffer outputBuffer2;
            ByteBuffer inputBuffer;
            try {
                int round = Math.round((((float) (this.duration * this.inputFormat.getInteger("sample-rate"))) / this.count) / 5.0f);
                MediaCodec createDecoderByType = MediaCodec.createDecoderByType(this.inputFormat.getString("mime"));
                if (createDecoderByType == null) {
                    return;
                }
                createDecoderByType.configure(this.inputFormat, (Surface) null, (MediaCrypto) null, 0);
                createDecoderByType.start();
                ByteBuffer[] inputBuffers = createDecoderByType.getInputBuffers();
                ByteBuffer[] outputBuffers = createDecoderByType.getOutputBuffers();
                final short[] sArr = new short[32];
                int i3 = -1;
                int i4 = 0;
                boolean z = false;
                int i5 = 0;
                int i6 = 0;
                short s2 = 0;
                while (true) {
                    MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                    int dequeueInputBuffer = createDecoderByType.dequeueInputBuffer(2500L);
                    if (dequeueInputBuffer >= 0) {
                        if (Build.VERSION.SDK_INT < 21) {
                            inputBuffer = inputBuffers[dequeueInputBuffer];
                        } else {
                            inputBuffer = createDecoderByType.getInputBuffer(dequeueInputBuffer);
                        }
                        int readSampleData = this.extractor.readSampleData(inputBuffer, 0);
                        if (readSampleData < 0) {
                            i = 21;
                            bufferInfo = bufferInfo2;
                            createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                            z = true;
                        } else {
                            bufferInfo = bufferInfo2;
                            i = 21;
                            createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, this.extractor.getSampleTime(), 0);
                            this.extractor.advance();
                        }
                    } else {
                        bufferInfo = bufferInfo2;
                        i = 21;
                    }
                    if (i3 >= 0) {
                        if (Build.VERSION.SDK_INT < i) {
                            outputBuffer2 = outputBuffers[i3];
                        } else {
                            outputBuffer2 = createDecoderByType.getOutputBuffer(i3);
                        }
                        outputBuffer2.position(0);
                    }
                    MediaCodec.BufferInfo bufferInfo3 = bufferInfo;
                    i3 = createDecoderByType.dequeueOutputBuffer(bufferInfo3, 2500L);
                    int i7 = -1;
                    while (i3 != i7 && !z) {
                        if (i3 >= 0) {
                            if (Build.VERSION.SDK_INT < i) {
                                outputBuffer = outputBuffers[i3];
                            } else {
                                outputBuffer = createDecoderByType.getOutputBuffer(i3);
                            }
                            if (outputBuffer != null && bufferInfo3.size > 0) {
                                int i8 = i6;
                                while (outputBuffer.remaining() > 0) {
                                    short s3 = (short) (((outputBuffer.get() & 255) << 8) | (outputBuffer.get() & 255));
                                    if (i8 >= round) {
                                        sArr[i4 - i5] = s2;
                                        int i9 = i4 + 1;
                                        final int i10 = i9 - i5;
                                        if (i10 >= sArr.length || i9 >= this.count) {
                                            short[] sArr2 = new short[sArr.length];
                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                @Override
                                                public final void run() {
                                                    TimelineView.AudioWaveformLoader.this.lambda$run$0(sArr, i10);
                                                }
                                            });
                                            sArr = sArr2;
                                            i5 = i9;
                                        }
                                        i4 = i9;
                                        if (i9 >= this.data.length) {
                                            i6 = 0;
                                            s2 = 0;
                                            break;
                                        } else {
                                            s = 0;
                                            i8 = 0;
                                        }
                                    } else {
                                        s = s2;
                                    }
                                    s2 = s < s3 ? s3 : s;
                                    i8++;
                                    if (outputBuffer.remaining() < 8) {
                                        break;
                                    } else {
                                        outputBuffer.position(outputBuffer.position() + 8);
                                    }
                                }
                                i6 = i8;
                            }
                            createDecoderByType.releaseOutputBuffer(i3, false);
                            if ((bufferInfo3.flags & 4) != 0) {
                                i2 = i4;
                                z = true;
                                break;
                            }
                        } else if (i3 == -3) {
                            outputBuffers = createDecoderByType.getOutputBuffers();
                        }
                        i3 = createDecoderByType.dequeueOutputBuffer(bufferInfo3, 2500L);
                        i7 = -1;
                        i = 21;
                    }
                    i2 = i4;
                    synchronized (this.lock) {
                        try {
                            if (!this.stop) {
                                if (z || i2 >= this.count) {
                                    break;
                                } else {
                                    i4 = i2;
                                }
                            } else {
                                break;
                            }
                        } finally {
                        }
                    }
                }
                createDecoderByType.stop();
                createDecoderByType.release();
                this.extractor.release();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        public void lambda$run$0(short[] sArr, int i) {
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = this.loaded + i2;
                short[] sArr2 = this.data;
                if (i3 >= sArr2.length) {
                    break;
                }
                sArr2[i3] = sArr[i2];
                short s = this.max;
                short s2 = sArr[i2];
                if (s < s2) {
                    this.max = s2;
                }
            }
            this.loaded += i;
            TimelineView.this.invalidate();
        }

        public void destroy() {
            FfmpegAudioWaveformLoader ffmpegAudioWaveformLoader = this.waveformLoader;
            if (ffmpegAudioWaveformLoader != null) {
                ffmpegAudioWaveformLoader.destroy();
            }
            Utilities.phoneBookQueue.cancelRunnable(new TimelineView$AudioWaveformLoader$$ExternalSyntheticLambda0(this));
            synchronized (this.lock) {
                this.stop = true;
            }
        }

        public short getMaxBar() {
            return this.max;
        }

        public short getBar(int i) {
            return this.data[i];
        }

        public int getLoadedCount() {
            return this.loaded;
        }

        public int getCount() {
            return this.count;
        }
    }

    public int getContentHeight() {
        return (int) (this.py + (this.hasVideo ? getVideoHeight() + AndroidUtilities.dp(4.0f) : 0.0f) + (this.hasRound ? getRoundHeight() + AndroidUtilities.dp(4.0f) : 0.0f) + (this.hasAudio ? AndroidUtilities.dp(4.0f) + getAudioHeight() : 0.0f) + this.py);
    }
}
