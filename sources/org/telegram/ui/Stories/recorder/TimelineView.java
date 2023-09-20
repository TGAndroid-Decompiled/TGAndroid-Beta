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
    private long loopProgressFrom;
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
        this.loopProgress = new AnimatedFloat(0.0f, this, 0L, 340L, cubicBezierInterpolator);
        this.loopProgressFrom = -1L;
        this.pressHandle = -1;
        this.pressVideo = true;
        this.scrollingVideo = true;
        this.scrolling = false;
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
        float dp = (-(this.w - min2)) + AndroidUtilities.dp(18.0f);
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
        float f2;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        float min = (float) Math.min(getBaseDuration(), 120000L);
        float clamp = this.px + this.ph + (this.sw * (((float) ((Utilities.clamp(this.progress, getBaseDuration(), 0L) + (!this.hasVideo ? this.audioOffset : 0L)) - this.scroll)) / min));
        if (x < clamp - AndroidUtilities.dp(12.0f) || x > clamp + AndroidUtilities.dp(12.0f)) {
            boolean z = y > (((float) (this.h - this.py)) - getVideoHeight()) - ((float) AndroidUtilities.dp(2.0f));
            if (z) {
                int i = this.px;
                int i2 = this.ph;
                float f3 = this.videoLeft;
                long j = this.videoDuration;
                long j2 = this.scroll;
                int i3 = this.sw;
                float f4 = i + i2 + ((((f3 * ((float) j)) - ((float) j2)) / min) * i3);
                float f5 = i + i2 + ((((this.videoRight * ((float) j)) - ((float) j2)) / min) * i3);
                if (x >= f4 - AndroidUtilities.dp(15.0f) && x <= AndroidUtilities.dp(5.0f) + f4) {
                    return 2;
                }
                if (x >= f5 - AndroidUtilities.dp(5.0f) && x <= AndroidUtilities.dp(15.0f) + f5) {
                    return 3;
                }
                if (x >= f4 && x <= f5 && (this.videoLeft > 0.01f || this.videoRight < 0.99f)) {
                    return 4;
                }
            } else if (this.hasAudio) {
                int i4 = this.px;
                int i5 = this.ph;
                long j3 = this.audioOffset;
                float f6 = this.audioLeft;
                long j4 = this.audioDuration;
                float f7 = ((float) j3) + (f6 * ((float) j4));
                long j5 = this.scroll;
                int i6 = this.sw;
                float f8 = i4 + i5 + (((f7 - ((float) j5)) / min) * i6);
                float f9 = i4 + i5 + ((((((float) j3) + (this.audioRight * ((float) j4))) - ((float) j5)) / min) * i6);
                if (this.audioSelected || !this.hasVideo) {
                    if (x >= f8 - AndroidUtilities.dp(15.0f)) {
                        f = 5.0f;
                        if (x <= AndroidUtilities.dp(5.0f) + f8) {
                            return 6;
                        }
                    } else {
                        f = 5.0f;
                    }
                    if (x >= f9 - AndroidUtilities.dp(f) && x <= AndroidUtilities.dp(15.0f) + f9) {
                        return 7;
                    }
                    if (x >= f8 && x <= f9) {
                        Math.max(0L, this.scroll - this.audioOffset);
                        Math.min(1.0f, Math.max(0.0f, ((float) (this.scroll - this.audioOffset)) + ((float) Math.min(120000L, getBaseDuration()))) / ((float) this.audioDuration));
                        return 5;
                    }
                    int i7 = this.px;
                    int i8 = this.ph;
                    long j6 = this.audioOffset;
                    long j7 = this.scroll;
                    int i9 = this.sw;
                    f2 = i7 + i8 + ((((float) ((j6 + this.audioDuration) - j7)) / min) * i9);
                    f8 = i7 + i8 + ((((float) (j6 - j7)) / min) * i9);
                } else {
                    f2 = f9;
                }
                if (x >= f8 && x <= f2) {
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

    private boolean setProgressAt(float f, boolean z) {
        if (this.hasVideo || this.hasAudio) {
            float min = (((f - this.px) - this.ph) / this.sw) * ((float) Math.min(getBaseDuration(), 120000L));
            boolean z2 = this.hasVideo;
            final long clamp = Utilities.clamp(min + ((float) (!z2 ? -this.audioOffset : 0L)) + ((float) this.scroll), (float) (z2 ? this.videoDuration : this.audioDuration), 0.0f);
            boolean z3 = this.hasVideo;
            if (z3) {
                float f2 = (float) clamp;
                long j = this.videoDuration;
                if (f2 / ((float) j) < this.videoLeft || f2 / ((float) j) > this.videoRight) {
                    return false;
                }
            }
            if (this.hasAudio && !z3) {
                float f3 = (float) clamp;
                long j2 = this.audioDuration;
                if (f3 / ((float) j2) < this.audioLeft || f3 / ((float) j2) > this.audioRight) {
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
            if (z) {
                Runnable runnable2 = new Runnable() {
                    @Override
                    public final void run() {
                        TimelineView.this.lambda$setProgressAt$3(clamp);
                    }
                };
                this.askExactSeek = runnable2;
                AndroidUtilities.runOnUIThread(runnable2, 150L);
                return true;
            }
            return true;
        }
        return false;
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
    public boolean onTouchEvent(android.view.MotionEvent r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.recorder.TimelineView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    private long minAudioSelect() {
        return Math.max(1000.0f, ((float) Math.min(this.videoDuration, 59000L)) * 0.25f);
    }

    private void moveAudioOffset(float f) {
        long j;
        float clamp;
        float clamp2;
        boolean z;
        TimelineDelegate timelineDelegate;
        long min = Math.min(getBaseDuration(), 120000L);
        if (!this.hasVideo) {
            this.audioOffset = Utilities.clamp(this.audioOffset + f, 0L, -(this.audioDuration - Math.min(getBaseDuration(), 120000L)));
            j = min;
        } else if (this.audioSelected) {
            float f2 = this.videoRight;
            long j2 = this.videoDuration;
            float f3 = this.audioRight;
            long j3 = this.audioDuration;
            long j4 = (((float) j2) * f2) - (((float) j3) * f3);
            float f4 = this.videoLeft;
            float f5 = this.audioLeft;
            j = min;
            long j5 = (((float) j2) * f4) - (((float) j3) * f5);
            long j6 = this.audioOffset;
            long j7 = f;
            if (j6 + j7 > j4) {
                float f6 = f3 - f5;
                float clamp3 = Utilities.clamp((((f2 * ((float) j2)) - ((float) j6)) - ((float) j7)) / ((float) j3), 1.0f, f6);
                this.audioRight = clamp3;
                this.audioLeft = Utilities.clamp(clamp3 - f6, 1.0f, 0.0f);
                long j8 = this.audioOffset + j7;
                float f7 = this.videoRight;
                long j9 = this.videoDuration;
                float f8 = this.audioRight;
                long j10 = this.audioDuration;
                this.audioOffset = Utilities.clamp(j8, (f7 * ((float) j9)) - (f8 * ((float) j10)), (this.videoLeft * ((float) j9)) - (clamp2 * ((float) j10)));
                TimelineDelegate timelineDelegate2 = this.delegate;
                if (timelineDelegate2 != null) {
                    timelineDelegate2.onAudioRightChange(this.audioRight);
                }
            } else if (j6 + j7 < j5) {
                float f9 = f3 - f5;
                float clamp4 = Utilities.clamp((((((float) j2) * f4) - ((float) j6)) - ((float) j7)) / ((float) j3), 1.0f - f9, 0.0f);
                this.audioLeft = clamp4;
                this.audioRight = Utilities.clamp(clamp4 + f9, 1.0f, 0.0f);
                long j11 = this.audioOffset + j7;
                float f10 = this.videoRight;
                long j12 = this.videoDuration;
                long j13 = this.audioDuration;
                this.audioOffset = Utilities.clamp(j11, (f10 * ((float) j12)) - (clamp * ((float) j13)), (this.videoLeft * ((float) j12)) - (this.audioLeft * ((float) j13)));
                TimelineDelegate timelineDelegate3 = this.delegate;
                if (timelineDelegate3 != null) {
                    timelineDelegate3.onAudioLeftChange(this.audioLeft);
                }
            } else {
                this.audioOffset = j6 + j7;
            }
        } else {
            j = min;
            long j14 = this.audioOffset + f;
            long j15 = this.audioDuration;
            this.audioOffset = Utilities.clamp(j14, ((float) getBaseDuration()) - (((float) j15) * this.audioRight), (-this.audioLeft) * ((float) j15));
        }
        float max = ((float) Math.max(0L, this.scroll - this.audioOffset)) / ((float) this.audioDuration);
        float min2 = Math.min(1.0f, ((float) Math.max(0L, (this.scroll - this.audioOffset) + j)) / ((float) this.audioDuration));
        float f11 = this.audioRight;
        float f12 = this.audioLeft;
        float f13 = f11 - f12;
        if (f12 < max) {
            this.audioLeft = max;
            this.audioRight = Math.min(1.0f, max + f13);
            z = true;
        } else {
            z = false;
        }
        if (this.audioRight > min2) {
            this.audioRight = min2;
            this.audioLeft = Math.max(0.0f, min2 - f13);
            z = true;
        }
        TimelineDelegate timelineDelegate4 = this.delegate;
        if (timelineDelegate4 != null && z) {
            timelineDelegate4.onAudioLeftChange(this.audioLeft);
            this.delegate.onAudioRightChange(this.audioRight);
        }
        if (!this.hasVideo) {
            long j16 = this.progress;
            long j17 = this.audioDuration;
            float f14 = ((float) j16) / ((float) j17);
            float f15 = this.audioLeft;
            if (f14 < f15 || ((float) j16) / ((float) j17) > this.audioRight) {
                long j18 = f15 * ((float) j17);
                this.progress = j18;
                TimelineDelegate timelineDelegate5 = this.delegate;
                if (timelineDelegate5 != null) {
                    timelineDelegate5.onProgressChange(j18, false);
                }
            }
        }
        invalidate();
        TimelineDelegate timelineDelegate6 = this.delegate;
        if (timelineDelegate6 != null) {
            timelineDelegate6.onAudioOffsetChange(this.audioOffset + (this.audioLeft * ((float) this.audioDuration)));
        }
        boolean z2 = this.dragged;
        if (!z2 && (timelineDelegate = this.delegate) != null) {
            timelineDelegate.onProgressDragChange(true);
            if (this.hasVideo) {
                long j19 = this.audioOffset + (this.audioLeft * ((float) this.audioDuration));
                float f16 = this.videoRight;
                long j20 = this.videoDuration;
                long clamp5 = Utilities.clamp(j19, f16 * ((float) j20), this.videoLeft * ((float) j20));
                if (Math.abs(this.progress - clamp5) > 400) {
                    this.loopProgressFrom = this.progress;
                    this.loopProgress.set(1.0f, true);
                }
                TimelineDelegate timelineDelegate7 = this.delegate;
                this.progress = clamp5;
                timelineDelegate7.onProgressChange(clamp5, false);
            }
        } else if (z2 || this.scrolling) {
            long j21 = this.audioOffset + (this.audioLeft * ((float) this.audioDuration));
            float f17 = this.videoRight;
            long j22 = this.videoDuration;
            long clamp6 = Utilities.clamp(j21, f17 * ((float) j22), this.videoLeft * ((float) j22));
            this.progress = clamp6;
            TimelineDelegate timelineDelegate8 = this.delegate;
            if (timelineDelegate8 != null) {
                timelineDelegate8.onProgressChange(clamp6, false);
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
                int i = this.px;
                int i2 = this.ph;
                int i3 = this.sw;
                float f = (float) min;
                moveAudioOffset(((((currX - i) - i2) / i3) * f) - ((((this.wasScrollX - i) - i2) / i3) * f));
            }
            invalidate();
            this.wasScrollX = currX;
        } else if (this.scrolling) {
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
            TimelineView.this = r1;
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
        long j;
        Paint paint;
        float f2;
        float f3;
        float f4;
        float f5;
        long j2;
        double d;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        int i;
        int i2;
        long j3;
        float max;
        float f12;
        float f13;
        float max2;
        Paint paint2;
        float f14;
        long j4;
        float f15;
        float f16;
        float f17;
        long j5;
        float f18;
        float f19;
        boolean z;
        Bitmap bitmap;
        TimelineView timelineView = this;
        Paint paint3 = timelineView.backgroundBlur.getPaint(1.0f);
        long min = Math.min(getBaseDuration(), 120000L);
        boolean z2 = timelineView.hasVideo;
        float f20 = z2 ? 1.0f : 0.0f;
        if (z2) {
            canvas.save();
            float videoHeight = getVideoHeight();
            long j6 = timelineView.videoDuration;
            if (j6 <= 0) {
                f18 = f20;
                f19 = 0.0f;
            } else {
                f18 = f20;
                f19 = (timelineView.px + timelineView.ph) - ((((float) timelineView.scroll) / ((float) min)) * timelineView.sw);
            }
            int i3 = timelineView.ph;
            float f21 = f19 - i3;
            float f22 = (j6 <= 0 ? 0.0f : ((((float) (j6 - timelineView.scroll)) / ((float) min)) * timelineView.sw) + timelineView.px + i3) + i3;
            RectF rectF = timelineView.videoBounds;
            int i4 = timelineView.h;
            int i5 = timelineView.py;
            rectF.set(f21, (i4 - i5) - videoHeight, f22, i4 - i5);
            timelineView.videoClipPath.rewind();
            timelineView.videoClipPath.addRoundRect(timelineView.videoBounds, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
            canvas.clipPath(timelineView.videoClipPath);
            VideoThumbsLoader videoThumbsLoader = timelineView.thumbs;
            if (videoThumbsLoader != null) {
                float frameWidth = videoThumbsLoader.getFrameWidth();
                int max3 = (int) Math.max(0.0d, Math.floor((f21 - timelineView.px) / frameWidth));
                int min2 = (int) Math.min(timelineView.thumbs.count, Math.ceil(((f22 - f21) - timelineView.px) / frameWidth) + 1.0d);
                int i6 = (int) ((timelineView.h - timelineView.py) - videoHeight);
                boolean z3 = timelineView.thumbs.frames.size() >= min2;
                if (z3) {
                    for (int i7 = max3; i7 < Math.min(timelineView.thumbs.frames.size(), min2); i7++) {
                        if (((VideoThumbsLoader.BitmapFrame) timelineView.thumbs.frames.get(i7)).bitmap == null) {
                            z = false;
                            break;
                        }
                    }
                }
                z = z3;
                if (!z) {
                    if (paint3 == null) {
                        canvas.drawColor(1073741824);
                    } else {
                        canvas.drawRect(timelineView.videoBounds, paint3);
                        canvas.drawColor(AndroidUtilities.DARK_STATUS_BAR_OVERLAY);
                    }
                }
                while (max3 < Math.min(timelineView.thumbs.frames.size(), min2)) {
                    VideoThumbsLoader.BitmapFrame bitmapFrame = (VideoThumbsLoader.BitmapFrame) timelineView.thumbs.frames.get(max3);
                    if (bitmapFrame.bitmap != null) {
                        timelineView.videoFramePaint.setAlpha((int) (bitmapFrame.getAlpha() * 255.0f));
                        canvas.drawBitmap(bitmapFrame.bitmap, f21, i6 - ((int) ((bitmap.getHeight() - videoHeight) / 2.0f)), timelineView.videoFramePaint);
                    }
                    f21 += frameWidth;
                    max3++;
                }
                if (!z3) {
                    timelineView.thumbs.load();
                }
            }
            timelineView.selectedVideoClipPath.rewind();
            RectF rectF2 = AndroidUtilities.rectTmp;
            int i8 = timelineView.px;
            int i9 = timelineView.ph;
            float f23 = timelineView.videoLeft;
            long j7 = timelineView.videoDuration;
            f = f18;
            paint = paint3;
            long j8 = timelineView.scroll;
            float f24 = (float) min;
            j = min;
            int i10 = timelineView.sw;
            float f25 = ((i8 + i9) + ((((((float) j7) * f23) - ((float) j8)) / f24) * i10)) - (f23 <= 0.0f ? i9 : 0);
            int i11 = timelineView.h;
            int i12 = timelineView.py;
            float f26 = (i11 - i12) - videoHeight;
            float f27 = timelineView.videoRight;
            float f28 = i8 + i9 + ((((((float) j7) * f27) - ((float) j8)) / f24) * i10);
            if (f27 < 1.0f) {
                i9 = 0;
            }
            rectF2.set(f25, f26, f28 + i9, i11 - i12);
            timelineView.selectedVideoClipPath.addRoundRect(rectF2, timelineView.selectedVideoRadii, Path.Direction.CW);
            canvas.clipPath(timelineView.selectedVideoClipPath, Region.Op.DIFFERENCE);
            canvas.drawColor(1342177280);
            canvas.restore();
            f2 = videoHeight;
        } else {
            f = f20;
            j = min;
            paint = paint3;
            f2 = 0.0f;
        }
        float f29 = timelineView.audioT.set(timelineView.hasAudio);
        float f30 = timelineView.audioSelectedT.set(timelineView.hasAudio && timelineView.audioSelected);
        float dp = AndroidUtilities.dp(4.0f);
        float audioHeight = getAudioHeight() * f29;
        if (f29 > 0.0f) {
            Paint paint4 = timelineView.audioBlur.getPaint(f29);
            canvas.save();
            if (timelineView.hasVideo) {
                long j9 = j;
                float f31 = (float) j9;
                paint2 = paint4;
                f16 = timelineView.px + timelineView.ph + (((((float) (timelineView.audioOffset - timelineView.scroll)) + (AndroidUtilities.lerp(timelineView.audioLeft, 0.0f, f30) * ((float) timelineView.audioDuration))) / f31) * timelineView.sw);
                f15 = timelineView.px + timelineView.ph + (((((float) (timelineView.audioOffset - timelineView.scroll)) + (AndroidUtilities.lerp(timelineView.audioRight, 1.0f, f30) * ((float) timelineView.audioDuration))) / f31) * timelineView.sw);
                j4 = j9;
                f14 = f29;
                f7 = f30;
            } else {
                paint2 = paint4;
                long j10 = j;
                int i13 = timelineView.px;
                int i14 = timelineView.ph;
                long j11 = timelineView.audioOffset;
                f14 = f29;
                f7 = f30;
                long j12 = timelineView.scroll;
                float f32 = (float) j10;
                timelineView = this;
                j4 = j10;
                int i15 = timelineView.sw;
                float f33 = i13 + i14 + ((((float) (j11 - j12)) / f32) * i15);
                f15 = i13 + i14 + ((((float) ((j11 - j12) + timelineView.audioDuration)) / f32) * i15);
                f16 = f33;
            }
            float f34 = ((timelineView.h - timelineView.py) - f2) - (dp * f);
            RectF rectF3 = timelineView.audioBounds;
            int i16 = timelineView.ph;
            float f35 = f34 - audioHeight;
            rectF3.set(f16 - i16, f35, i16 + f15, f34);
            timelineView.audioClipPath.rewind();
            timelineView.audioClipPath.addRoundRect(timelineView.audioBounds, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
            canvas.clipPath(timelineView.audioClipPath);
            if (paint2 == null) {
                f17 = f14;
                canvas.drawColor(Theme.multAlpha(1073741824, f17));
            } else {
                f17 = f14;
                canvas.drawRect(timelineView.audioBounds, paint2);
                canvas.drawColor(Theme.multAlpha(AndroidUtilities.DARK_STATUS_BAR_OVERLAY, f17));
            }
            if (timelineView.waveform == null || paint2 == null) {
                j5 = j4;
                d = 0.0d;
            } else {
                Paint paint5 = timelineView.audioWaveformBlur.getPaint(0.4f * f17);
                if (paint5 == null) {
                    paint5 = timelineView.waveformPaint;
                    paint5.setAlpha((int) (64.0f * f17));
                }
                float f36 = timelineView.waveformMax.set(timelineView.waveform.getMaxBar(), !timelineView.waveformIsLoaded);
                timelineView.waveformIsLoaded = timelineView.waveform.getLoadedCount() > 0;
                j5 = j4;
                d = 0.0d;
                timelineView.waveformPath.check(timelineView.px + timelineView.ph + ((((float) (timelineView.audioOffset - timelineView.scroll)) / ((float) j5)) * timelineView.sw), f16, f15, f7, timelineView.waveformLoaded.set(timelineView.waveform.getLoadedCount()), j5, audioHeight, f36, f34);
                canvas.drawPath(timelineView.waveformPath, paint5);
            }
            if (f7 < 1.0f) {
                int i17 = timelineView.px;
                int i18 = timelineView.ph;
                long j13 = timelineView.audioOffset;
                long j14 = timelineView.scroll;
                f6 = f17;
                f4 = dp;
                float f37 = timelineView.audioLeft;
                f3 = f2;
                long j15 = timelineView.audioDuration;
                float f38 = (float) j5;
                int i19 = timelineView.sw;
                long j16 = j5;
                float f39 = i17 + i18 + (((((float) (j13 - j14)) + (f37 * ((float) j15))) / f38) * i19);
                float f40 = i18 + i17 + (((((float) (j13 - j14)) + (timelineView.audioRight * ((float) j15))) / f38) * i19);
                float max4 = (Math.max(i17, f39) + Math.min(timelineView.w - timelineView.px, f40)) / 2.0f;
                float dp2 = f35 + AndroidUtilities.dp(14.0f);
                float max5 = Math.max(0.0f, (Math.min(timelineView.w - timelineView.px, f40) - Math.max(timelineView.px, f39)) - AndroidUtilities.dp(24.0f));
                float dpf2 = AndroidUtilities.dpf2(13.0f) + ((timelineView.audioAuthor == null && timelineView.audioTitle == null) ? 0.0f : AndroidUtilities.dpf2(3.11f) + timelineView.audioAuthorWidth + AndroidUtilities.dpf2(9.66f) + timelineView.audioTitleWidth);
                boolean z4 = dpf2 < max5;
                float min3 = max4 - (Math.min(dpf2, max5) / 2.0f);
                timelineView.audioIcon.setBounds((int) min3, (int) (dp2 - (AndroidUtilities.dp(13.0f) / 2.0f)), (int) (AndroidUtilities.dp(13.0f) + min3), (int) ((AndroidUtilities.dp(13.0f) / 2.0f) + dp2));
                float f41 = 1.0f - f7;
                float f42 = f41 * 255.0f;
                timelineView.audioIcon.setAlpha((int) f42);
                timelineView.audioIcon.draw(canvas);
                float dpf22 = min3 + AndroidUtilities.dpf2(16.11f);
                f5 = f;
                j2 = j16;
                canvas.saveLayerAlpha(0.0f, 0.0f, timelineView.w, timelineView.h, 255, 31);
                float min4 = Math.min(f40, timelineView.w) - AndroidUtilities.dp(12.0f);
                canvas.clipRect(dpf22, 0.0f, min4, timelineView.h);
                if (timelineView.audioAuthor != null) {
                    canvas.save();
                    canvas.translate(dpf22 - timelineView.audioAuthorLeft, dp2 - (timelineView.audioAuthor.getHeight() / 2.0f));
                    timelineView.audioAuthorPaint.setAlpha((int) (f42 * f6));
                    timelineView.audioAuthor.draw(canvas);
                    canvas.restore();
                    dpf22 += timelineView.audioAuthorWidth;
                }
                if (timelineView.audioAuthor != null && timelineView.audioTitle != null) {
                    float dpf23 = dpf22 + AndroidUtilities.dpf2(3.66f);
                    int alpha = timelineView.audioDotPaint.getAlpha();
                    timelineView.audioDotPaint.setAlpha((int) (alpha * f41));
                    canvas.drawCircle(AndroidUtilities.dp(1.0f) + dpf23, dp2, AndroidUtilities.dp(1.0f), timelineView.audioDotPaint);
                    timelineView.audioDotPaint.setAlpha(alpha);
                    dpf22 = dpf23 + AndroidUtilities.dpf2(2.0f) + AndroidUtilities.dpf2(4.0f);
                }
                if (timelineView.audioTitle != null) {
                    canvas.save();
                    canvas.translate(dpf22 - timelineView.audioTitleLeft, dp2 - (timelineView.audioTitle.getHeight() / 2.0f));
                    timelineView.audioTitlePaint.setAlpha((int) (f42 * f6));
                    timelineView.audioTitle.draw(canvas);
                    canvas.restore();
                }
                if (!z4) {
                    timelineView.ellipsizeMatrix.reset();
                    timelineView.ellipsizeMatrix.postScale(AndroidUtilities.dpf2(8.0f) / 16.0f, 1.0f);
                    timelineView.ellipsizeMatrix.postTranslate(min4 - AndroidUtilities.dp(8.0f), 0.0f);
                    timelineView.ellipsizeGradient.setLocalMatrix(timelineView.ellipsizeMatrix);
                    canvas.drawRect(min4 - AndroidUtilities.dp(8.0f), f35, min4, f34, timelineView.ellipsizePaint);
                }
                canvas.restore();
            } else {
                j2 = j5;
                f3 = f2;
                f6 = f17;
                f4 = dp;
                f5 = f;
            }
            canvas.restore();
        } else {
            f3 = f2;
            f4 = dp;
            f5 = f;
            j2 = j;
            d = 0.0d;
            f6 = f29;
            f7 = f30;
        }
        int i20 = timelineView.h;
        int i21 = timelineView.py;
        float f43 = f5;
        float f44 = f4 * f43;
        float lerp = AndroidUtilities.lerp((i20 - i21) - f3, (((i20 - i21) - f3) - f44) - audioHeight, timelineView.hasVideo ? f7 : 1.0f);
        int i22 = timelineView.h;
        int i23 = timelineView.py;
        float f45 = f7;
        float lerp2 = AndroidUtilities.lerp(i22 - i23, ((i22 - i23) - f3) - f44, f45);
        float lerp3 = AndroidUtilities.lerp(timelineView.videoLeft * ((float) timelineView.videoDuration), ((float) timelineView.audioOffset) + (timelineView.audioLeft * ((float) timelineView.audioDuration)), timelineView.hasVideo ? f45 : 1.0f);
        float lerp4 = AndroidUtilities.lerp(timelineView.videoRight * ((float) timelineView.videoDuration), ((float) timelineView.audioOffset) + (timelineView.audioRight * ((float) timelineView.audioDuration)), timelineView.hasVideo ? f45 : 1.0f);
        int i24 = timelineView.px;
        int i25 = timelineView.ph;
        long j17 = timelineView.scroll;
        float f46 = (float) j2;
        int i26 = timelineView.sw;
        float f47 = i24 + i25 + (((lerp3 - ((float) j17)) / f46) * i26);
        float f48 = i24 + i25 + (((lerp4 - ((float) j17)) / f46) * i26);
        if (!timelineView.hasAudio || timelineView.hasVideo) {
            f8 = f6;
            f6 = f43;
        } else {
            f8 = f6;
        }
        if (f8 > d || f43 > d) {
            f9 = 0.0f;
            drawRegion(canvas, paint, lerp, lerp2, f47, f48, (timelineView.hasVideo ? 1.0f : AndroidUtilities.lerp(0.6f, 1.0f, f45) * f8) * f6);
            if (timelineView.hasVideo && timelineView.hasAudio && f45 > 0.0f) {
                float f49 = timelineView.h - timelineView.py;
                int i27 = timelineView.ph;
                int i28 = timelineView.px;
                float f50 = timelineView.videoLeft;
                long j18 = timelineView.videoDuration;
                long j19 = timelineView.scroll;
                int i29 = timelineView.sw;
                drawRegion(canvas, paint, (i - i2) - f3, f49, ((((f50 * ((float) j18)) - ((float) j19)) / f46) * i29) + i27 + i28, i27 + i28 + ((((timelineView.videoRight * ((float) j18)) - ((float) j19)) / f46) * i29), 0.8f);
            }
            float f51 = timelineView.loopProgress.set(0.0f);
            float dpf24 = (((timelineView.h - timelineView.py) - f3) - ((audioHeight + f44) * f8)) - AndroidUtilities.dpf2(4.3f);
            float dpf25 = (timelineView.h - timelineView.py) + AndroidUtilities.dpf2(4.3f);
            if (f51 > 0.0f) {
                long j20 = timelineView.loopProgressFrom;
                if (j20 == -1) {
                    if (timelineView.hasVideo) {
                        f10 = (float) timelineView.videoDuration;
                        f11 = timelineView.videoRight;
                    } else {
                        f10 = (float) timelineView.audioDuration;
                        f11 = timelineView.audioRight;
                    }
                    j20 = f10 * f11;
                }
                drawProgress(canvas, dpf24, dpf25, j20, f51 * f6);
            }
            drawProgress(canvas, dpf24, dpf25, timelineView.progress, (1.0f - f51) * f6);
        } else {
            f9 = 0.0f;
        }
        if (timelineView.dragged) {
            long dp3 = (AndroidUtilities.dp(32.0f) / timelineView.sw) * f46 * (1.0f / (1000.0f / AndroidUtilities.screenRefreshRate));
            int i30 = timelineView.pressHandle;
            int i31 = -1;
            if (i30 == 4) {
                float f52 = timelineView.videoLeft;
                long j21 = timelineView.scroll;
                long j22 = timelineView.videoDuration;
                if (f52 >= ((float) j21) / ((float) j22)) {
                    i31 = timelineView.videoRight > ((float) (j21 + j2)) / ((float) j22) ? 1 : 0;
                }
                long j23 = i31 * dp3;
                long clamp = Utilities.clamp(j21 + j23, j22 - j2, 0L);
                timelineView.scroll = clamp;
                timelineView.progress += j23;
                float f53 = ((float) (clamp - j21)) / ((float) timelineView.videoDuration);
                if (f53 > f9) {
                    f13 = 1.0f;
                    max2 = Math.min(1.0f - timelineView.videoRight, f53);
                } else {
                    f13 = 1.0f;
                    max2 = Math.max(f9 - timelineView.videoLeft, f53);
                }
                timelineView.videoLeft = Utilities.clamp(timelineView.videoLeft + max2, f13, f9);
                timelineView.videoRight = Utilities.clamp(timelineView.videoRight + max2, f13, f9);
                TimelineDelegate timelineDelegate = timelineView.delegate;
                if (timelineDelegate != null) {
                    timelineDelegate.onVideoLeftChange(timelineView.videoLeft);
                    timelineView.delegate.onVideoRightChange(timelineView.videoRight);
                }
                invalidate();
            } else if (i30 == 8) {
                float f54 = timelineView.audioLeft;
                long j24 = timelineView.audioOffset;
                float f55 = (float) ((-j24) + 100);
                long j25 = timelineView.audioDuration;
                if (f54 < f55 / ((float) j25)) {
                    j3 = j25;
                } else {
                    j3 = j25;
                    i31 = timelineView.audioRight >= ((float) (((-j24) + j2) - 100)) / ((float) j3) ? 1 : 0;
                }
                if (i31 != 0) {
                    if (timelineView.audioSelected) {
                        long j26 = j24 - (i31 * dp3);
                        float f56 = timelineView.videoRight;
                        long j27 = timelineView.videoDuration;
                        timelineView.audioOffset = Utilities.clamp(j26, (f56 * ((float) j27)) - (f54 * ((float) j3)), (timelineView.videoLeft * ((float) j27)) - (timelineView.audioRight * ((float) j3)));
                    } else {
                        timelineView.audioOffset = Utilities.clamp(j24 - (i31 * dp3), 0L, -(j3 - Math.min(getBaseDuration(), 120000L)));
                    }
                    float f57 = ((float) (-(timelineView.audioOffset - j24))) / ((float) timelineView.audioDuration);
                    if (f57 > 0.0f) {
                        max = Math.min(1.0f - timelineView.audioRight, f57);
                    } else {
                        max = Math.max(0.0f - timelineView.audioLeft, f57);
                    }
                    if (timelineView.hasVideo) {
                        f12 = 0.0f;
                    } else {
                        long j28 = timelineView.audioDuration;
                        f12 = 0.0f;
                        timelineView.progress = Utilities.clamp(((float) timelineView.progress) + (((float) j28) * max), (float) j28, 0.0f);
                    }
                    timelineView.audioLeft = Utilities.clamp(timelineView.audioLeft + max, 1.0f, f12);
                    timelineView.audioRight = Utilities.clamp(timelineView.audioRight + max, 1.0f, f12);
                    TimelineDelegate timelineDelegate2 = timelineView.delegate;
                    if (timelineDelegate2 != null) {
                        timelineDelegate2.onAudioLeftChange(timelineView.audioLeft);
                        timelineView.delegate.onAudioRightChange(timelineView.audioRight);
                        timelineView.delegate.onProgressChange(timelineView.progress, false);
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
        rectF.inset(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f));
        canvas.drawRect(rectF, this.regionCutPaint);
        float dp = AndroidUtilities.dp(2.0f);
        float dp2 = AndroidUtilities.dp(10.0f);
        Paint paint2 = paint != null ? paint : this.regionHandlePaint;
        this.regionHandlePaint.setAlpha(255);
        paint2.setAlpha(i);
        float f6 = f + f2;
        float f7 = (f6 - dp2) / 2.0f;
        float f8 = (f6 + dp2) / 2.0f;
        rectF.set(f3 - ((AndroidUtilities.dp(10.0f) - dp) / 2.0f), f7, f3 - ((AndroidUtilities.dp(10.0f) + dp) / 2.0f), f8);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), paint2);
        if (paint != null) {
            this.regionHandlePaint.setAlpha((int) (f5 * 48.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), this.regionHandlePaint);
        }
        rectF.set(f4 + ((AndroidUtilities.dp(10.0f) - dp) / 2.0f), f7, f4 + ((AndroidUtilities.dp(10.0f) + dp) / 2.0f), f8);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), paint2);
        if (paint != null) {
            this.regionHandlePaint.setAlpha((int) (f5 * 48.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), this.regionHandlePaint);
        }
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
