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
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
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
    private TimelineDelegate delegate;
    private boolean dragged;
    private boolean draggingProgress;
    private final LinearGradient ellipsizeGradient;
    private final Matrix ellipsizeMatrix;
    private final Paint ellipsizePaint;
    private int h;
    private boolean hadDragChange;
    private boolean hasAudio;
    private boolean hasVideo;
    private long lastTime;
    private float lastX;
    private final AnimatedFloat loopProgress;
    private final Runnable onLongPress;
    private int ph;
    private int pressHandle;
    private long pressTime;
    private boolean pressVideo;
    private long progress;
    private final Paint progressShadowPaint;
    private final Paint progressWhitePaint;
    private int px;
    private int py;
    private final Paint regionCutPaint;
    private final Paint regionHandlePaint;
    private final Paint regionPaint;
    private final Theme.ResourcesProvider resourcesProvider;
    private long scroll;
    private final Scroller scroller;
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
    private int w;
    private AudioWaveformLoader waveform;
    private boolean waveformIsLoaded;
    private final AnimatedFloat waveformLoaded;
    private final AnimatedFloat waveformMax;
    private final Paint waveformPaint;
    private final Path waveformPath;
    final float[] waveformRadii;

    public interface TimelineDelegate {
        void onAudioLeftChange(float f);

        void onAudioOffsetChange(long j);

        void onAudioRemove();

        void onAudioRightChange(float f);

        void onAudioVolumeChange(float f);

        void onProgressChange(long j, boolean z);

        void onProgressDragChange(boolean z);

        void onVideoLeftChange(float f);

        void onVideoRightChange(float f);
    }

    private long getBaseDuration() {
        if (this.hasVideo) {
            return this.videoDuration;
        }
        if (this.hasAudio) {
            return this.audioDuration;
        }
        return Math.max(1L, this.audioDuration);
    }

    public TimelineView(Context context, final ViewGroup viewGroup, final View view, final Theme.ResourcesProvider resourcesProvider, final BlurringShader.BlurManager blurManager) {
        super(context);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.audioT = new AnimatedFloat(this, 0L, 360L, cubicBezierInterpolator);
        this.audioSelectedT = new AnimatedFloat(this, 360L, cubicBezierInterpolator);
        this.waveformLoaded = new AnimatedFloat(this, 0L, 600L, cubicBezierInterpolator);
        this.waveformMax = new AnimatedFloat(this, 0L, 360L, cubicBezierInterpolator);
        this.videoBounds = new RectF();
        this.videoFramePaint = new Paint(3);
        this.videoClipPath = new Path();
        this.selectedVideoClipPath = new Path();
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
        this.waveformPath = new Path();
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
        this.loopProgress = new AnimatedFloat(0.0f, this, 0L, 200L, CubicBezierInterpolator.EASE_BOTH);
        this.pressHandle = -1;
        this.pressVideo = true;
        this.scrollingVideo = true;
        this.selectedVideoRadii = new float[8];
        this.waveformRadii = new float[8];
        this.resourcesProvider = resourcesProvider;
        paint7.setColor(ConnectionsManager.DEFAULT_DATACENTER_ID);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
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
        this.backgroundBlur = new BlurringShader.StoryBlurDrawer(blurManager, this, 0);
        this.audioBlur = new BlurringShader.StoryBlurDrawer(blurManager, this, 3);
        this.audioWaveformBlur = new BlurringShader.StoryBlurDrawer(blurManager, this, 4);
        this.onLongPress = new Runnable() {
            @Override
            public final void run() {
                TimelineView.this.lambda$new$2(viewGroup, resourcesProvider, blurManager, view);
            }
        };
    }

    public void lambda$new$2(ViewGroup viewGroup, Theme.ResourcesProvider resourcesProvider, BlurringShader.BlurManager blurManager, View view) {
        int i;
        if (this.pressVideo || !this.hasAudio) {
            return;
        }
        VolumeSliderView onValueChange = new VolumeSliderView(getContext()).setVolume(this.audioVolume).setOnValueChange(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                TimelineView.this.lambda$new$0((Float) obj);
            }
        });
        long min = Math.min(getBaseDuration(), 120000L);
        int i2 = this.w;
        int i3 = this.px;
        int i4 = this.ph;
        float min2 = Math.min((i2 - i3) - i4, i3 + i4 + (((((float) (this.audioOffset - this.scroll)) + (AndroidUtilities.lerp(this.audioRight, 1.0f, this.audioSelectedT.get()) * ((float) this.audioDuration))) / ((float) min)) * this.sw));
        ItemOptions forceTop = ItemOptions.makeOptions(viewGroup, resourcesProvider, this).addView(onValueChange).addSpaceGap().add(R.drawable.msg_delete, LocaleController.getString(R.string.StoryAudioRemove), new Runnable() {
            @Override
            public final void run() {
                TimelineView.this.lambda$new$1();
            }
        }).setGravity(5).forceTop(true);
        float dp = AndroidUtilities.dp(6.0f) - (this.w - min2);
        int dp2 = AndroidUtilities.dp(4.0f);
        if (this.hasVideo) {
            i = 0;
        } else {
            i = AndroidUtilities.dp(this.audioSelected ? 35.0f : 40.0f);
        }
        forceTop.translate(dp, dp2 + i).show().setBlurBackground(blurManager, -view.getX(), -view.getY());
        try {
            performHapticFeedback(0, 1);
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

    public void setDelegate(TimelineDelegate timelineDelegate) {
        this.delegate = timelineDelegate;
    }

    public void setVideo(String str, long j) {
        if (TextUtils.equals(this.videoPath, str)) {
            return;
        }
        VideoThumbsLoader videoThumbsLoader = this.thumbs;
        if (videoThumbsLoader != null) {
            videoThumbsLoader.destroy();
            this.thumbs = null;
        }
        if (str != null) {
            this.scroll = 0L;
            this.videoPath = str;
            this.videoDuration = j;
            setupVideoThumbs();
        } else {
            this.videoPath = null;
            this.videoDuration = 1L;
            this.scroll = 0L;
        }
        this.hasVideo = this.videoPath != null;
        this.progress = 0L;
        invalidate();
    }

    private void setupVideoThumbs() {
        if (getMeasuredWidth() <= 0 || this.thumbs != null) {
            return;
        }
        VideoThumbsLoader videoThumbsLoader = new VideoThumbsLoader(this.videoPath, (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), AndroidUtilities.dp(38.0f));
        this.thumbs = videoThumbsLoader;
        if (videoThumbsLoader.getDuration() > 0) {
            this.videoDuration = this.thumbs.getDuration();
        }
    }

    public void setProgress(long r11) {
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
        this.audioPath = str;
        AudioWaveformLoader audioWaveformLoader = this.waveform;
        if (audioWaveformLoader != null) {
            audioWaveformLoader.destroy();
            this.waveform = null;
            this.waveformIsLoaded = false;
            this.waveformLoaded.set(0.0f, true);
        }
        setupAudioWaveform();
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
        if (getMeasuredWidth() <= 0 || this.waveform != null) {
            return;
        }
        this.waveform = new AudioWaveformLoader(this.audioPath, (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        this.waveformIsLoaded = false;
        this.waveformLoaded.set(0.0f, true);
        this.waveformMax.set(1.0f, true);
    }

    private int detectHandle(MotionEvent motionEvent) {
        float f;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        float min = (float) Math.min(getBaseDuration(), 120000L);
        float clamp = this.px + this.ph + (this.sw * (((float) ((Utilities.clamp(this.progress, getBaseDuration(), 0L) + (!this.hasVideo ? this.audioOffset : 0L)) - this.scroll)) / min));
        if (x < clamp - AndroidUtilities.dp(12.0f) || x > clamp + AndroidUtilities.dp(12.0f)) {
            boolean z = y > (((float) (this.h - this.py)) - getVideoHeight()) - ((float) AndroidUtilities.dp(2.0f));
            if (z) {
                int i = this.px;
                int i2 = this.ph;
                float f2 = this.videoLeft;
                long j = this.videoDuration;
                long j2 = this.scroll;
                int i3 = this.sw;
                float f3 = i + i2 + ((((f2 * ((float) j)) - ((float) j2)) / min) * i3);
                float f4 = i + i2 + ((((this.videoRight * ((float) j)) - ((float) j2)) / min) * i3);
                if (x >= f3 - AndroidUtilities.dp(15.0f) && x <= AndroidUtilities.dp(5.0f) + f3) {
                    return 2;
                }
                if (x >= f4 - AndroidUtilities.dp(5.0f) && x <= AndroidUtilities.dp(15.0f) + f4) {
                    return 3;
                }
                if (x >= f3 && x <= f4 && (this.videoLeft > 0.01f || this.videoRight < 0.99f)) {
                    return 4;
                }
            } else if (this.hasAudio) {
                int i4 = this.px;
                int i5 = this.ph;
                long j3 = this.audioOffset;
                float f5 = this.audioLeft;
                long j4 = this.audioDuration;
                float f6 = ((float) j3) + (f5 * ((float) j4));
                long j5 = this.scroll;
                int i6 = this.sw;
                float f7 = i4 + i5 + (((f6 - ((float) j5)) / min) * i6);
                float f8 = i4 + i5 + ((((((float) j3) + (this.audioRight * ((float) j4))) - ((float) j5)) / min) * i6);
                if (this.audioSelected || !this.hasVideo) {
                    if (x >= f7 - AndroidUtilities.dp(15.0f)) {
                        f = 5.0f;
                        if (x <= AndroidUtilities.dp(5.0f) + f7) {
                            return 6;
                        }
                    } else {
                        f = 5.0f;
                    }
                    if (x >= f8 - AndroidUtilities.dp(f) && x <= AndroidUtilities.dp(15.0f) + f8) {
                        return 7;
                    }
                    if (x >= f7 && x <= f8) {
                        return (this.audioLeft > (((float) Math.max(0L, this.scroll - this.audioOffset)) / ((float) this.audioDuration)) + 0.01f || this.audioRight < Math.min(1.0f, Math.max(0.0f, ((float) (this.scroll - this.audioOffset)) + ((float) Math.min(120000L, getBaseDuration()))) / ((float) this.audioDuration)) - 0.01f) ? 8 : 5;
                    }
                    int i7 = this.px;
                    int i8 = this.ph;
                    long j6 = this.audioOffset;
                    long j7 = this.scroll;
                    int i9 = this.sw;
                    f7 = i7 + i8 + ((((float) (j6 - j7)) / min) * i9);
                    f8 = i7 + i8 + ((((float) ((j6 + this.audioDuration) - j7)) / min) * i9);
                }
                if (x >= f7 && x <= f8) {
                    return 5;
                }
            }
            return (this.videoDuration <= 120000 || !z) ? -1 : 1;
        }
        return 0;
    }

    public boolean onBackPressed() {
        if (this.audioSelected) {
            this.audioSelected = false;
            return true;
        }
        return false;
    }

    public boolean isDragging() {
        return this.dragged;
    }

    private void setProgressAt(float f, boolean z) {
        if (this.hasVideo || this.hasAudio) {
            float min = (((f - this.px) - this.ph) / this.sw) * ((float) Math.min(getBaseDuration(), 120000L));
            boolean z2 = this.hasVideo;
            final long clamp = Utilities.clamp(min + ((float) (!z2 ? -this.audioOffset : 0L)) + ((float) this.scroll), (float) (z2 ? this.videoDuration : this.audioDuration), 0.0f);
            boolean z3 = this.hasVideo;
            if (z3) {
                float f2 = (float) clamp;
                long j = this.videoDuration;
                if (f2 / ((float) j) < this.videoLeft || f2 / ((float) j) > this.videoRight) {
                    return;
                }
            }
            if (this.hasAudio && !z3) {
                float f3 = (float) clamp;
                long j2 = this.audioDuration;
                if (f3 / ((float) j2) < this.audioLeft || f3 / ((float) j2) > this.audioRight) {
                    return;
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
            if (z) {
                Runnable runnable2 = new Runnable() {
                    @Override
                    public final void run() {
                        TimelineView.this.lambda$setProgressAt$3(clamp);
                    }
                };
                this.askExactSeek = runnable2;
                AndroidUtilities.runOnUIThread(runnable2, 150L);
            }
        }
    }

    public void lambda$setProgressAt$3(long j) {
        TimelineDelegate timelineDelegate = this.delegate;
        if (timelineDelegate != null) {
            timelineDelegate.onProgressChange(j, false);
        }
    }

    private float getVideoHeight() {
        if (this.hasVideo) {
            return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), 1.0f - this.audioSelectedT.set(this.audioSelected));
        }
        return 0.0f;
    }

    private float getAudioHeight() {
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), this.audioSelectedT.set(this.audioSelected));
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        TimelineDelegate timelineDelegate;
        VelocityTracker velocityTracker;
        int i;
        int i2;
        VelocityTracker velocityTracker2;
        VelocityTracker velocityTracker3;
        float max;
        boolean z2;
        boolean z3;
        float max2;
        boolean z4;
        TimelineDelegate timelineDelegate2;
        boolean z5;
        boolean z6;
        TimelineDelegate timelineDelegate3;
        boolean z7;
        int i3;
        if (this.hasVideo || this.hasAudio) {
            long currentTimeMillis = System.currentTimeMillis();
            if (motionEvent.getAction() == 0) {
                Runnable runnable = this.askExactSeek;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    this.askExactSeek = null;
                }
                this.scroller.abortAnimation();
                this.pressHandle = detectHandle(motionEvent);
                if (this.hasAudio) {
                    if (motionEvent.getY() <= ((this.h - this.py) - getVideoHeight()) - (this.hasVideo ? AndroidUtilities.dp(4.0f) : 0)) {
                        z7 = false;
                        this.pressVideo = z7;
                        this.pressTime = System.currentTimeMillis();
                        i3 = this.pressHandle;
                        this.draggingProgress = i3 != 0 || i3 == -1 || i3 == 1;
                        this.hadDragChange = false;
                        if (i3 != 1 || i3 == 5 || i3 == 8) {
                            this.velocityTracker = VelocityTracker.obtain();
                        } else {
                            VelocityTracker velocityTracker4 = this.velocityTracker;
                            if (velocityTracker4 != null) {
                                velocityTracker4.recycle();
                                this.velocityTracker = null;
                            }
                        }
                        this.dragged = false;
                        this.lastX = motionEvent.getX();
                        AndroidUtilities.cancelRunOnUIThread(this.onLongPress);
                        AndroidUtilities.runOnUIThread(this.onLongPress, ViewConfiguration.getLongPressTimeout());
                    }
                }
                z7 = true;
                this.pressVideo = z7;
                this.pressTime = System.currentTimeMillis();
                i3 = this.pressHandle;
                this.draggingProgress = i3 != 0 || i3 == -1 || i3 == 1;
                this.hadDragChange = false;
                if (i3 != 1) {
                }
                this.velocityTracker = VelocityTracker.obtain();
                this.dragged = false;
                this.lastX = motionEvent.getX();
                AndroidUtilities.cancelRunOnUIThread(this.onLongPress);
                AndroidUtilities.runOnUIThread(this.onLongPress, ViewConfiguration.getLongPressTimeout());
            } else if (motionEvent.getAction() == 2) {
                float x = motionEvent.getX() - this.lastX;
                if (this.dragged || Math.abs(x) > AndroidUtilities.touchSlop) {
                    long min = Math.min(getBaseDuration(), 120000L);
                    int i4 = this.pressHandle;
                    if (i4 == 1) {
                        this.scroll = Utilities.clamp(((float) this.scroll) - ((x / this.sw) * ((float) min)), (float) (this.videoDuration - min), 0.0f);
                        invalidate();
                        this.dragged = true;
                        this.draggingProgress = false;
                    } else if (i4 == 2 || i4 == 3 || i4 == 4) {
                        long j = this.videoDuration;
                        float f = (x / this.sw) * (((float) min) / ((float) j));
                        if (i4 == 2) {
                            float clamp = Utilities.clamp(this.videoLeft + f, this.videoRight - (1000.0f / ((float) j)), 0.0f);
                            this.videoLeft = clamp;
                            TimelineDelegate timelineDelegate4 = this.delegate;
                            if (timelineDelegate4 != null) {
                                timelineDelegate4.onVideoLeftChange(clamp);
                            }
                            float f2 = this.videoRight;
                            float f3 = this.videoLeft;
                            long j2 = this.videoDuration;
                            if (f2 - f3 > 59000.0f / ((float) j2)) {
                                float min2 = Math.min(1.0f, f3 + (59000.0f / ((float) j2)));
                                this.videoRight = min2;
                                TimelineDelegate timelineDelegate5 = this.delegate;
                                if (timelineDelegate5 != null) {
                                    timelineDelegate5.onVideoRightChange(min2);
                                }
                            }
                        } else if (i4 == 3) {
                            float clamp2 = Utilities.clamp(this.videoRight + f, 1.0f, this.videoLeft + (1000.0f / ((float) j)));
                            this.videoRight = clamp2;
                            TimelineDelegate timelineDelegate6 = this.delegate;
                            if (timelineDelegate6 != null) {
                                timelineDelegate6.onVideoRightChange(clamp2);
                            }
                            float f4 = this.videoRight;
                            long j3 = this.videoDuration;
                            if (f4 - this.videoLeft > 59000.0f / ((float) j3)) {
                                float max3 = Math.max(0.0f, f4 - (59000.0f / ((float) j3)));
                                this.videoLeft = max3;
                                TimelineDelegate timelineDelegate7 = this.delegate;
                                if (timelineDelegate7 != null) {
                                    timelineDelegate7.onVideoLeftChange(max3);
                                }
                            }
                        } else if (i4 == 4) {
                            if (f > 0.0f) {
                                max = Math.min(1.0f - this.videoRight, f);
                            } else {
                                max = Math.max(-this.videoLeft, f);
                            }
                            float f5 = this.videoLeft + max;
                            this.videoLeft = f5;
                            this.videoRight += max;
                            TimelineDelegate timelineDelegate8 = this.delegate;
                            if (timelineDelegate8 != null) {
                                timelineDelegate8.onVideoLeftChange(f5);
                                this.delegate.onVideoRightChange(this.videoRight);
                            }
                        }
                        long j4 = this.progress;
                        long j5 = this.videoDuration;
                        float f6 = ((float) j4) / ((float) j5);
                        float f7 = this.videoLeft;
                        if (f6 < f7 || ((float) j4) / ((float) j5) > this.videoRight) {
                            long j6 = f7 * ((float) j5);
                            this.progress = j6;
                            TimelineDelegate timelineDelegate9 = this.delegate;
                            if (timelineDelegate9 != null) {
                                z2 = false;
                                timelineDelegate9.onProgressChange(j6, false);
                                invalidate();
                                this.dragged = true;
                                this.draggingProgress = z2;
                            }
                        }
                        z2 = false;
                        invalidate();
                        this.dragged = true;
                        this.draggingProgress = z2;
                    } else if (i4 == 6 || i4 == 7 || i4 == 8) {
                        long j7 = this.audioDuration;
                        float f8 = (x / this.sw) * (((float) min) / ((float) j7));
                        if (i4 == 6) {
                            float f9 = this.audioRight - (1000.0f / ((float) j7));
                            float max4 = (float) Math.max(0L, this.scroll - this.audioOffset);
                            long j8 = this.audioDuration;
                            float f10 = max4 / ((float) j8);
                            if (!this.hasVideo) {
                                f10 = Math.max(f10, this.audioRight - (59000.0f / ((float) j8)));
                                if (!this.hadDragChange && f8 < 0.0f && this.audioLeft <= this.audioRight - (59000.0f / ((float) this.audioDuration))) {
                                    this.pressHandle = 8;
                                }
                            }
                            float f11 = this.audioLeft;
                            float clamp3 = Utilities.clamp(f11 + f8, f9, f10);
                            this.audioLeft = clamp3;
                            if (Math.abs(f11 - clamp3) > 0.01f) {
                                this.hadDragChange = true;
                            }
                            TimelineDelegate timelineDelegate10 = this.delegate;
                            if (timelineDelegate10 != null) {
                                timelineDelegate10.onAudioOffsetChange(this.audioOffset + (this.audioLeft * ((float) this.audioDuration)));
                            }
                            TimelineDelegate timelineDelegate11 = this.delegate;
                            if (timelineDelegate11 != null) {
                                timelineDelegate11.onAudioLeftChange(this.audioLeft);
                            }
                        } else if (i4 == 7) {
                            float min3 = Math.min(1.0f, ((float) Math.max(0L, (this.scroll - this.audioOffset) + min)) / ((float) this.audioDuration));
                            float f12 = this.audioLeft;
                            long j9 = this.audioDuration;
                            float f13 = f12 + (1000.0f / ((float) j9));
                            if (!this.hasVideo) {
                                min3 = Math.min(min3, f12 + (59000.0f / ((float) j9)));
                                if (!this.hadDragChange && f8 > 0.0f && this.audioRight >= this.audioLeft + (59000.0f / ((float) this.audioDuration))) {
                                    this.pressHandle = 8;
                                }
                            }
                            float f14 = this.audioRight;
                            float clamp4 = Utilities.clamp(f14 + f8, min3, f13);
                            this.audioRight = clamp4;
                            if (Math.abs(f14 - clamp4) > 0.01f) {
                                this.hadDragChange = true;
                            }
                            TimelineDelegate timelineDelegate12 = this.delegate;
                            if (timelineDelegate12 != null) {
                                timelineDelegate12.onAudioRightChange(this.audioRight);
                            }
                        }
                        if (this.pressHandle == 8) {
                            float max5 = ((float) Math.max(0L, this.scroll - this.audioOffset)) / ((float) this.audioDuration);
                            float min4 = Math.min(1.0f, ((float) Math.max(0L, (this.scroll - this.audioOffset) + min)) / ((float) this.audioDuration));
                            if (f8 > 0.0f) {
                                max2 = Math.min(min4 - this.audioRight, f8);
                            } else {
                                max2 = Math.max(max5 - this.audioLeft, f8);
                            }
                            float f15 = this.audioLeft + max2;
                            this.audioLeft = f15;
                            this.audioRight += max2;
                            TimelineDelegate timelineDelegate13 = this.delegate;
                            if (timelineDelegate13 != null) {
                                timelineDelegate13.onAudioLeftChange(f15);
                                this.delegate.onAudioOffsetChange(this.audioOffset + (this.audioLeft * ((float) this.audioDuration)));
                                this.delegate.onAudioRightChange(this.audioRight);
                            }
                        }
                        if (!this.hasVideo) {
                            long j10 = this.progress;
                            long j11 = this.audioDuration;
                            float f16 = ((float) j10) / ((float) j11);
                            float f17 = this.audioLeft;
                            if (f16 < f17 || ((float) j10) / ((float) j11) > this.audioRight) {
                                long j12 = f17 * ((float) j11);
                                this.progress = j12;
                                TimelineDelegate timelineDelegate14 = this.delegate;
                                if (timelineDelegate14 != null) {
                                    z3 = false;
                                    timelineDelegate14.onProgressChange(j12, false);
                                    invalidate();
                                    this.dragged = true;
                                    this.draggingProgress = z3;
                                }
                            }
                        }
                        z3 = false;
                        invalidate();
                        this.dragged = true;
                        this.draggingProgress = z3;
                    } else if (i4 == 5) {
                        float f18 = (x / this.sw) * ((float) min);
                        if (!this.hasVideo) {
                            this.audioOffset = Utilities.clamp(this.audioOffset + f18, 0L, -(this.audioDuration - Math.min(getBaseDuration(), 120000L)));
                        } else if (this.audioSelected) {
                            this.audioOffset = Utilities.clamp(this.audioOffset + f18, ((float) getBaseDuration()) - (((float) this.audioDuration) * this.audioRight), Math.min(getBaseDuration(), this.audioDuration) - Math.max(getBaseDuration(), this.audioDuration));
                        } else {
                            long j13 = this.audioOffset + f18;
                            float baseDuration = (float) getBaseDuration();
                            long j14 = this.audioDuration;
                            this.audioOffset = Utilities.clamp(j13, baseDuration - (((float) j14) * this.audioRight), (-this.audioLeft) * ((float) j14));
                        }
                        float max6 = ((float) Math.max(0L, this.scroll - this.audioOffset)) / ((float) this.audioDuration);
                        float min5 = Math.min(1.0f, ((float) Math.max(0L, (this.scroll - this.audioOffset) + min)) / ((float) this.audioDuration));
                        float f19 = this.audioRight;
                        float f20 = this.audioLeft;
                        float f21 = f19 - f20;
                        if (f20 < max6) {
                            this.audioLeft = max6;
                            this.audioRight = Math.min(1.0f, max6 + f21);
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (this.audioRight > min5) {
                            this.audioRight = min5;
                            this.audioLeft = Math.max(0.0f, min5 - f21);
                            z5 = true;
                        }
                        TimelineDelegate timelineDelegate15 = this.delegate;
                        if (timelineDelegate15 != null && z5) {
                            timelineDelegate15.onAudioLeftChange(this.audioLeft);
                            this.delegate.onAudioRightChange(this.audioRight);
                        }
                        if (!this.hasVideo) {
                            long j15 = this.progress;
                            long j16 = this.audioDuration;
                            float f22 = ((float) j15) / ((float) j16);
                            float f23 = this.audioLeft;
                            if (f22 < f23 || ((float) j15) / ((float) j16) > this.audioRight) {
                                long j17 = f23 * ((float) j16);
                                this.progress = j17;
                                TimelineDelegate timelineDelegate16 = this.delegate;
                                if (timelineDelegate16 != null) {
                                    timelineDelegate16.onProgressChange(j17, false);
                                }
                            }
                        }
                        invalidate();
                        TimelineDelegate timelineDelegate17 = this.delegate;
                        if (timelineDelegate17 != null) {
                            timelineDelegate17.onAudioOffsetChange(this.audioOffset + (this.audioLeft * ((float) this.audioDuration)));
                        }
                        if (this.dragged || (timelineDelegate3 = this.delegate) == null) {
                            z6 = true;
                        } else {
                            z6 = true;
                            timelineDelegate3.onProgressDragChange(true);
                        }
                        this.dragged = z6;
                        this.draggingProgress = false;
                    } else if (this.draggingProgress) {
                        setProgressAt(motionEvent.getX(), currentTimeMillis - this.lastTime < 350);
                        if (this.dragged || (timelineDelegate2 = this.delegate) == null) {
                            z4 = true;
                        } else {
                            z4 = true;
                            timelineDelegate2.onProgressDragChange(true);
                        }
                        this.dragged = z4;
                    }
                    this.lastX = motionEvent.getX();
                }
                if (this.dragged) {
                    AndroidUtilities.cancelRunOnUIThread(this.onLongPress);
                }
                int i5 = this.pressHandle;
                if ((i5 == 1 || i5 == 5 || i5 == 8) && (velocityTracker3 = this.velocityTracker) != null) {
                    velocityTracker3.addMovement(motionEvent);
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                AndroidUtilities.cancelRunOnUIThread(this.onLongPress);
                this.scroller.abortAnimation();
                if (motionEvent.getAction() == 1) {
                    if (System.currentTimeMillis() - this.pressTime <= ViewConfiguration.getTapTimeout() && !this.dragged) {
                        boolean z8 = this.pressVideo;
                        if (!z8 && !this.audioSelected) {
                            this.audioSelected = true;
                            invalidate();
                        } else if (z8 && this.audioSelected) {
                            this.audioSelected = false;
                            invalidate();
                        } else {
                            setProgressAt(motionEvent.getX(), false);
                        }
                    } else {
                        int i6 = this.pressHandle;
                        if (i6 == 1 && (velocityTracker2 = this.velocityTracker) != null) {
                            velocityTracker2.computeCurrentVelocity(1000);
                            int xVelocity = (int) this.velocityTracker.getXVelocity();
                            this.scrollingVideo = true;
                            if (Math.abs(xVelocity) > AndroidUtilities.dp(100.0f)) {
                                long min6 = Math.min(this.videoDuration, 120000L);
                                int i7 = this.px;
                                float f24 = (float) min6;
                                int i8 = this.sw;
                                this.scroller.fling((int) (i7 + ((((float) this.scroll) / f24) * i8)), 0, -xVelocity, 0, i7, (int) (i7 + ((((float) (this.videoDuration - min6)) / f24) * i8)), 0, 0);
                            }
                        } else if ((i6 == 5 || (i6 == 8 && !this.dragged)) && this.hasVideo && this.audioSelected && (velocityTracker = this.velocityTracker) != null) {
                            velocityTracker.computeCurrentVelocity(1000);
                            int xVelocity2 = (int) this.velocityTracker.getXVelocity();
                            this.scrollingVideo = false;
                            if (Math.abs(xVelocity2) > AndroidUtilities.dp(100.0f)) {
                                float min7 = (float) Math.min(getBaseDuration(), 120000L);
                                int i9 = (int) (this.px + ((((float) this.audioOffset) / min7) * this.sw));
                                long max7 = Math.max(getBaseDuration(), this.audioDuration);
                                long min8 = Math.min(getBaseDuration(), this.audioDuration);
                                this.scroller.fling(i9, 0, xVelocity2, 0, (int) (i + i2 + ((((float) (min8 - max7)) / min7) * this.sw)), this.px + this.ph, 0, 0);
                            }
                        }
                    }
                }
                Runnable runnable2 = this.askExactSeek;
                if (runnable2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable2);
                    this.askExactSeek = null;
                }
                if (!this.dragged || (timelineDelegate = this.delegate) == null) {
                    z = false;
                } else {
                    z = false;
                    timelineDelegate.onProgressDragChange(false);
                }
                this.dragged = z;
                this.draggingProgress = z;
                this.pressTime = -1L;
                this.pressHandle = -1;
                VelocityTracker velocityTracker5 = this.velocityTracker;
                if (velocityTracker5 != null) {
                    velocityTracker5.recycle();
                    this.velocityTracker = null;
                }
            }
            this.lastTime = System.currentTimeMillis();
            return true;
        }
        return false;
    }

    @Override
    public void computeScroll() {
        if (this.scroller.computeScrollOffset()) {
            float currX = this.scroller.getCurrX();
            long min = Math.min(getBaseDuration(), 120000L);
            if (this.scrollingVideo) {
                this.scroll = Math.max(0.0f, (((currX - this.px) - this.ph) / this.sw) * ((float) min));
            } else {
                long j = (((currX - this.px) - this.ph) / this.sw) * ((float) min);
                this.audioOffset = j;
                float max = ((float) Math.max(0L, this.scroll - j)) / ((float) this.audioDuration);
                float min2 = Math.min(1.0f, ((float) Math.max(0L, (this.scroll - this.audioOffset) + min)) / ((float) this.audioDuration));
                boolean z = false;
                float f = this.audioRight;
                float f2 = this.audioLeft;
                float f3 = f - f2;
                boolean z2 = true;
                if (f2 < max) {
                    this.audioLeft = max;
                    this.audioRight = Math.min(1.0f, max + f3);
                    z = true;
                }
                if (this.audioRight > min2) {
                    this.audioRight = min2;
                    this.audioLeft = Math.max(0.0f, min2 - f3);
                } else {
                    z2 = z;
                }
                TimelineDelegate timelineDelegate = this.delegate;
                if (timelineDelegate != null && z2) {
                    timelineDelegate.onAudioLeftChange(this.audioLeft);
                    this.delegate.onAudioRightChange(this.audioRight);
                }
            }
            invalidate();
        }
    }

    @Override
    protected void dispatchDraw(android.graphics.Canvas r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.recorder.TimelineView.dispatchDraw(android.graphics.Canvas):void");
    }

    private void drawRegion(Canvas canvas, Paint paint, float f, float f2, float f3, float f4, float f5) {
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f3 - AndroidUtilities.dp(10.0f), f, f4 + AndroidUtilities.dp(10.0f), f2);
        canvas.saveLayerAlpha(0.0f, 0.0f, this.w, this.h, 255, 31);
        int i = (int) (255.0f * f5);
        this.regionPaint.setAlpha(i);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.regionPaint);
        rectF.inset(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f));
        canvas.drawRect(rectF, this.regionCutPaint);
        float dp = AndroidUtilities.dp(2.0f);
        float dp2 = AndroidUtilities.dp(10.0f);
        Paint paint2 = paint != null ? paint : this.regionHandlePaint;
        paint2.setAlpha(i);
        float f6 = f + f2;
        float f7 = (f6 - dp2) / 2.0f;
        float f8 = (f6 + dp2) / 2.0f;
        rectF.set(f3 - ((AndroidUtilities.dp(10.0f) - dp) / 2.0f), f7, f3 - ((AndroidUtilities.dp(10.0f) + dp) / 2.0f), f8);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), paint2);
        rectF.set(f4 + ((AndroidUtilities.dp(10.0f) - dp) / 2.0f), f7, f4 + ((AndroidUtilities.dp(10.0f) + dp) / 2.0f), f8);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), paint2);
        canvas.restore();
    }

    private void drawProgress(Canvas canvas, float f, float f2, long j, float f3) {
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
        int dp4 = AndroidUtilities.dp(80.0f);
        this.h = dp4;
        setMeasuredDimension(size, dp4);
        int dp5 = AndroidUtilities.dp(10.0f);
        this.ph = dp5;
        this.sw = (this.w - (dp5 * 2)) - (this.px * 2);
        if (this.videoPath != null && this.thumbs == null) {
            setupVideoThumbs();
        }
        if (this.audioPath == null || this.waveform != null) {
            return;
        }
        setupAudioWaveform();
    }

    public class VideoThumbsLoader {
        private final int count;
        private boolean destroyed;
        private long duration;
        private final int frameHeight;
        private final long frameIterator;
        private final int frameWidth;
        private MediaMetadataRetriever metadataRetriever;
        private long nextFrame;
        private final ArrayList<BitmapFrame> frames = new ArrayList<>();
        private boolean loading = false;
        private final Paint bitmapPaint = new Paint(3);

        public VideoThumbsLoader(java.lang.String r10, int r11, int r12) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.recorder.TimelineView.VideoThumbsLoader.<init>(org.telegram.ui.Stories.recorder.TimelineView, java.lang.String, int, int):void");
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
                    canvas.drawBitmap(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), new Rect((int) ((createBitmap.getWidth() - (bitmap.getWidth() * max)) / 2.0f), (int) ((createBitmap.getHeight() - (bitmap.getHeight() * max)) / 2.0f), (int) ((createBitmap.getWidth() + (bitmap.getWidth() * max)) / 2.0f), (int) ((createBitmap.getHeight() + (bitmap.getHeight() * max)) / 2.0f)), this.bitmapPaint);
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
                VideoThumbsLoader.this = r10;
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
            TimelineView.this = r8;
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
            int round = Math.round(((((float) (this.duration * 1000)) / ((float) Math.min(r8.hasVideo ? r8.videoDuration : this.duration * 1000, 120000L))) * i) / Math.round(AndroidUtilities.dpf2(3.3333f)));
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
            int i3;
            boolean z;
            short s;
            ByteBuffer outputBuffer2;
            ByteBuffer inputBuffer;
            try {
                int round = Math.round((((float) (this.duration * this.inputFormat.getInteger("sample-rate"))) / this.count) / 5.0f);
                MediaCodec createDecoderByType = MediaCodec.createDecoderByType(this.inputFormat.getString("mime"));
                if (createDecoderByType == null) {
                    return;
                }
                int i4 = 0;
                createDecoderByType.configure(this.inputFormat, (Surface) null, (MediaCrypto) null, 0);
                createDecoderByType.start();
                ByteBuffer[] inputBuffers = createDecoderByType.getInputBuffers();
                ByteBuffer[] outputBuffers = createDecoderByType.getOutputBuffers();
                final short[] sArr = new short[32];
                int i5 = -1;
                boolean z2 = false;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
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
                        int readSampleData = this.extractor.readSampleData(inputBuffer, i4);
                        if (readSampleData < 0) {
                            bufferInfo = bufferInfo2;
                            i = i5;
                            createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                            z2 = true;
                        } else {
                            bufferInfo = bufferInfo2;
                            i = i5;
                            createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, this.extractor.getSampleTime(), 0);
                            this.extractor.advance();
                        }
                    } else {
                        bufferInfo = bufferInfo2;
                        i = i5;
                    }
                    if (i >= 0) {
                        if (Build.VERSION.SDK_INT < 21) {
                            outputBuffer2 = outputBuffers[i];
                        } else {
                            outputBuffer2 = createDecoderByType.getOutputBuffer(i);
                        }
                        outputBuffer2.position(0);
                    }
                    i5 = createDecoderByType.dequeueOutputBuffer(bufferInfo, 2500L);
                    while (i5 != -1 && !z2) {
                        if (i5 >= 0) {
                            if (Build.VERSION.SDK_INT < 21) {
                                outputBuffer = outputBuffers[i5];
                            } else {
                                outputBuffer = createDecoderByType.getOutputBuffer(i5);
                            }
                            if (outputBuffer == null || bufferInfo.size <= 0) {
                                i3 = i8;
                            } else {
                                int i9 = i8;
                                while (outputBuffer.remaining() > 0) {
                                    short s3 = (short) (((outputBuffer.get() & 255) << 8) | (outputBuffer.get() & 255));
                                    if (i9 >= round) {
                                        sArr[i6 - i7] = s2;
                                        int i10 = i6 + 1;
                                        final int i11 = i10 - i7;
                                        if (i11 >= sArr.length || i10 >= this.count) {
                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                @Override
                                                public final void run() {
                                                    TimelineView.AudioWaveformLoader.this.lambda$run$0(sArr, i11);
                                                }
                                            });
                                            sArr = new short[sArr.length];
                                            i7 = i10;
                                        }
                                        i6 = i10;
                                        if (i10 >= this.data.length) {
                                            z = false;
                                            i3 = 0;
                                            s2 = 0;
                                            break;
                                        }
                                        s = 0;
                                        i9 = 0;
                                    } else {
                                        s = s2;
                                    }
                                    s2 = s < s3 ? s3 : s;
                                    i9++;
                                    if (outputBuffer.remaining() < 8) {
                                        break;
                                    }
                                    outputBuffer.position(outputBuffer.position() + 8);
                                }
                                i3 = i9;
                            }
                            z = false;
                            createDecoderByType.releaseOutputBuffer(i5, z);
                            if ((bufferInfo.flags & 4) != 0) {
                                i8 = i3;
                                i2 = i6;
                                z2 = true;
                                break;
                            }
                            i8 = i3;
                        } else if (i5 == -3) {
                            outputBuffers = createDecoderByType.getOutputBuffers();
                        }
                        i5 = createDecoderByType.dequeueOutputBuffer(bufferInfo, 2500L);
                    }
                    i2 = i6;
                    synchronized (this.lock) {
                        if (!this.stop) {
                            if (z2 || i2 >= this.count) {
                                break;
                            }
                            i6 = i2;
                            i4 = 0;
                        } else {
                            break;
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
                int i3 = this.loaded;
                int i4 = i3 + i2;
                short[] sArr2 = this.data;
                if (i4 >= sArr2.length) {
                    break;
                }
                sArr2[i3 + i2] = sArr[i2];
                if (this.max < sArr[i2]) {
                    this.max = sArr[i2];
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
}
