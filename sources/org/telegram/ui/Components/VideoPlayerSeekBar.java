package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.os.SystemClock;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;

public class VideoPlayerSeekBar {
    private static Paint paint;
    private static Paint strokePaint;
    private static int thumbWidth;
    private static Path tmpPath;
    private static float[] tmpRadii;
    private float animateFromBufferedProgress;
    private boolean animateResetBuffering;
    private AnimatedFloat animateThumbLoopBackProgress;
    private int backgroundColor;
    private int backgroundSelectedColor;
    private float bufferedProgress;
    private int cacheColor;
    private int circleColor;
    private float currentRadius;
    private SeekBarDelegate delegate;
    private int height;
    private int horizontalPadding;
    private CharSequence lastCaption;
    private long lastTimestampUpdate;
    private long lastTimestampsAppearingUpdate;
    private long lastUpdateTime;
    private long lastVideoDuration;
    private float loopBackWasThumbX;
    private View parentView;
    private float progress;
    private int progressColor;
    private boolean selected;
    private int smallLineColor;
    private int timestampChangeDirection;
    private StaticLayout[] timestampLabel;
    private TextPaint timestampLabelPaint;
    private ArrayList timestamps;
    private float transitionProgress;
    private int width;
    private int thumbX = 0;
    private float animatedThumbX = 0.0f;
    private int draggingThumbX = 0;
    private int thumbDX = 0;
    private boolean pressed = false;
    private boolean pressedDelayed = false;
    private RectF rect = new RectF();
    private float bufferedAnimationValue = 1.0f;
    private int lineHeight = AndroidUtilities.dp(4.0f);
    private int smallLineHeight = AndroidUtilities.dp(2.0f);
    private int fromThumbX = 0;
    private float animateThumbProgress = 1.0f;
    private float timestampsAppearing = 0.0f;
    private final float TIMESTAMP_GAP = 1.0f;
    private int currentTimestamp = -1;
    private int lastTimestamp = -1;
    private float timestampChangeT = 1.0f;
    private float lastWidth = -1.0f;

    public interface SeekBarDelegate {
        void onSeekBarContinuousDrag(float f);

        void onSeekBarDrag(float f);
    }

    public VideoPlayerSeekBar(View view) {
        if (paint == null) {
            paint = new Paint(1);
            Paint paint2 = new Paint(1);
            strokePaint = paint2;
            paint2.setStyle(Paint.Style.STROKE);
            strokePaint.setColor(-16777216);
            strokePaint.setStrokeWidth(1.0f);
        }
        this.parentView = view;
        thumbWidth = AndroidUtilities.dp(24.0f);
        this.currentRadius = AndroidUtilities.dp(6.0f);
        this.animateThumbLoopBackProgress = new AnimatedFloat(0.0f, view, 0L, 300L, CubicBezierInterpolator.EASE_OUT_QUINT);
    }

    public void setDelegate(SeekBarDelegate seekBarDelegate) {
        this.delegate = seekBarDelegate;
    }

    public boolean onTouch(int i, float f, float f2) {
        SeekBarDelegate seekBarDelegate;
        if (i == 0) {
            if (this.transitionProgress > 0.0f) {
                return false;
            }
            int i2 = this.height;
            int i3 = thumbWidth;
            int i4 = (i2 - i3) / 2;
            if (f >= (-i4)) {
                int i5 = this.width;
                if (f <= i5 + i4 && f2 >= 0.0f && f2 <= i2) {
                    int i6 = this.thumbX;
                    if (i6 - i4 > f || f > i6 + i3 + i4) {
                        int i7 = ((int) f) - (i3 / 2);
                        this.thumbX = i7;
                        if (i7 < 0) {
                            this.thumbX = 0;
                        } else if (i7 > i5 - i3) {
                            this.thumbX = i3 - i5;
                        }
                        this.animatedThumbX = this.thumbX;
                    }
                    this.pressedDelayed = true;
                    this.pressed = true;
                    int i8 = this.thumbX;
                    this.draggingThumbX = i8;
                    this.thumbDX = (int) (f - i8);
                    return true;
                }
            }
        } else if (i == 1 || i == 3) {
            if (this.pressed) {
                int i9 = this.draggingThumbX;
                this.thumbX = i9;
                float f3 = i9;
                this.animatedThumbX = f3;
                if (i == 1 && (seekBarDelegate = this.delegate) != null) {
                    seekBarDelegate.onSeekBarDrag(f3 / (this.width - thumbWidth));
                }
                this.pressed = false;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.pressedDelayed = false;
                    }
                }, 50L);
                return true;
            }
        } else if (i == 2 && this.pressed) {
            int i10 = (int) (f - this.thumbDX);
            this.draggingThumbX = i10;
            if (i10 < 0) {
                this.draggingThumbX = 0;
            } else {
                int i11 = this.width - thumbWidth;
                if (i10 > i11) {
                    this.draggingThumbX = i11;
                }
            }
            SeekBarDelegate seekBarDelegate2 = this.delegate;
            if (seekBarDelegate2 != null) {
                seekBarDelegate2.onSeekBarContinuousDrag(this.draggingThumbX / (this.width - thumbWidth));
            }
            return true;
        }
        return false;
    }

    public void setColors(int i, int i2, int i3, int i4, int i5, int i6) {
        this.backgroundColor = i;
        this.cacheColor = i2;
        this.circleColor = i4;
        this.progressColor = i3;
        this.backgroundSelectedColor = i5;
        this.smallLineColor = i6;
    }

    public void setProgress(float f, boolean z) {
        if (Math.abs(this.progress - 1.0f) < 0.04f && Math.abs(f) < 0.04f) {
            this.animateThumbLoopBackProgress.set(1.0f, true);
            this.loopBackWasThumbX = this.thumbX;
        }
        this.progress = f;
        int iCeil = (int) Math.ceil((this.width - thumbWidth) * f);
        if (z) {
            if (Math.abs(iCeil - this.thumbX) > AndroidUtilities.dp(10.0f)) {
                float interpolation = CubicBezierInterpolator.DEFAULT.getInterpolation(this.animateThumbProgress);
                this.fromThumbX = (int) ((this.thumbX * interpolation) + (this.fromThumbX * (1.0f - interpolation)));
                this.animateThumbProgress = 0.0f;
            } else if (this.animateThumbProgress == 1.0f) {
                this.animateThumbProgress = 0.0f;
                this.fromThumbX = this.thumbX;
            }
        }
        this.thumbX = iCeil;
        if (iCeil < 0) {
            this.thumbX = 0;
        } else {
            int i = this.width - thumbWidth;
            if (iCeil > i) {
                this.thumbX = i;
            }
        }
        if (Math.abs(this.animatedThumbX - this.thumbX) > AndroidUtilities.dp(8.0f)) {
            this.animatedThumbX = this.thumbX;
        }
    }

    public void setProgress(float f) {
        setProgress(f, false);
    }

    public void setBufferedProgress(float f) {
        float f2 = this.bufferedProgress;
        if (f != f2) {
            this.animateFromBufferedProgress = f2;
            this.animateResetBuffering = f < f2;
            this.bufferedProgress = f;
            this.bufferedAnimationValue = 0.0f;
        }
    }

    public float getProgress() {
        return this.thumbX / (this.width - thumbWidth);
    }

    public int getThumbX() {
        return (this.pressed ? this.draggingThumbX : this.thumbX) + (thumbWidth / 2);
    }

    public boolean isDragging() {
        return this.pressed;
    }

    public void setSize(int i, int i2) {
        this.width = i;
        this.height = i2;
        View view = this.parentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public int getWidth() {
        return this.width - thumbWidth;
    }

    public void setTransitionProgress(float f) {
        if (this.transitionProgress != f) {
            this.transitionProgress = f;
            this.parentView.invalidate();
        }
    }

    public void setHorizontalPadding(int i) {
        this.horizontalPadding = i;
    }

    public void clearTimestamps() {
        this.timestamps = null;
        this.currentTimestamp = -1;
        this.timestampsAppearing = 0.0f;
        StaticLayout[] staticLayoutArr = this.timestampLabel;
        if (staticLayoutArr != null) {
            staticLayoutArr[1] = null;
            staticLayoutArr[0] = null;
        }
        this.lastCaption = null;
        this.lastVideoDuration = -1L;
    }

    public void updateTimestamps(MessageObject messageObject, long j) {
        Integer num;
        String str;
        if (messageObject == null || j < 0) {
            clearTimestamps();
            return;
        }
        CharSequence charSequence = messageObject.caption;
        if (messageObject.isYouTubeVideo()) {
            if (messageObject.youtubeDescription == null && (str = messageObject.messageOwner.media.webpage.description) != null) {
                messageObject.youtubeDescription = SpannableString.valueOf(str);
                MessageObject.addUrlsByPattern(messageObject.isOut(), messageObject.youtubeDescription, false, 3, (int) j, false);
            }
            charSequence = messageObject.youtubeDescription;
        }
        if (charSequence == this.lastCaption && this.lastVideoDuration == j) {
            return;
        }
        this.lastCaption = charSequence;
        this.lastVideoDuration = j;
        if (!(charSequence instanceof Spanned)) {
            this.timestamps = null;
            this.currentTimestamp = -1;
            this.timestampsAppearing = 0.0f;
            StaticLayout[] staticLayoutArr = this.timestampLabel;
            if (staticLayoutArr != null) {
                staticLayoutArr[1] = null;
                staticLayoutArr[0] = null;
                return;
            }
            return;
        }
        Spanned spanned = (Spanned) charSequence;
        try {
            URLSpanNoUnderline[] uRLSpanNoUnderlineArr = (URLSpanNoUnderline[]) spanned.getSpans(0, spanned.length(), URLSpanNoUnderline.class);
            this.timestamps = new ArrayList();
            this.timestampsAppearing = 0.0f;
            if (this.timestampLabelPaint == null) {
                TextPaint textPaint = new TextPaint(1);
                this.timestampLabelPaint = textPaint;
                textPaint.setTextSize(AndroidUtilities.dp(12.0f));
                this.timestampLabelPaint.setColor(-1);
            }
            for (URLSpanNoUnderline uRLSpanNoUnderline : uRLSpanNoUnderlineArr) {
                if (uRLSpanNoUnderline != null && uRLSpanNoUnderline.getURL() != null && uRLSpanNoUnderline.label != null && uRLSpanNoUnderline.getURL().startsWith("video?") && (num = Utilities.parseInt((CharSequence) uRLSpanNoUnderline.getURL().substring(6))) != null && num.intValue() >= 0) {
                    float fIntValue = (((long) num.intValue()) * 1000) / j;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(uRLSpanNoUnderline.label);
                    Emoji.replaceEmoji(spannableStringBuilder, this.timestampLabelPaint.getFontMetricsInt(), false);
                    this.timestamps.add(new Pair(Float.valueOf(fIntValue), spannableStringBuilder));
                }
            }
            Collections.sort(this.timestamps, new Comparator() {
                @Override
                public final int compare(Object obj, Object obj2) {
                    return VideoPlayerSeekBar.m2937$r8$lambda$o3EHnMr9BcAI6WfiUzSrQzpwFA((Pair) obj, (Pair) obj2);
                }
            });
        } catch (Exception e) {
            FileLog.e(e);
            this.timestamps = null;
            this.currentTimestamp = -1;
            this.timestampsAppearing = 0.0f;
            StaticLayout[] staticLayoutArr2 = this.timestampLabel;
            if (staticLayoutArr2 != null) {
                staticLayoutArr2[1] = null;
                staticLayoutArr2[0] = null;
            }
        }
    }

    public static int m2937$r8$lambda$o3EHnMr9BcAI6WfiUzSrQzpwFA(Pair pair, Pair pair2) {
        if (((Float) pair.first).floatValue() > ((Float) pair2.first).floatValue()) {
            return 1;
        }
        return ((Float) pair2.first).floatValue() > ((Float) pair.first).floatValue() ? -1 : 0;
    }

    public void draw(Canvas canvas, View view) {
        float f;
        this.rect.left = this.horizontalPadding + AndroidUtilities.lerp(thumbWidth / 2.0f, 0.0f, this.transitionProgress);
        RectF rectF = this.rect;
        int i = this.height;
        rectF.top = AndroidUtilities.lerp((i - this.lineHeight) / 2.0f, (i - AndroidUtilities.dp(3.0f)) - this.smallLineHeight, this.transitionProgress);
        RectF rectF2 = this.rect;
        int i2 = this.height;
        rectF2.bottom = AndroidUtilities.lerp((this.lineHeight + i2) / 2.0f, i2 - AndroidUtilities.dp(3.0f), this.transitionProgress);
        float f2 = this.thumbX;
        float fMin = Math.min(this.animatedThumbX, f2);
        this.animatedThumbX = fMin;
        float fLerp = AndroidUtilities.lerp(fMin, f2, 0.5f);
        this.animatedThumbX = fLerp;
        if (Math.abs(f2 - fLerp) > 0.005f) {
            this.parentView.invalidate();
        }
        float f3 = this.animatedThumbX;
        float f4 = this.animateThumbProgress;
        if (f4 != 1.0f) {
            float f5 = f4 + 0.07272727f;
            this.animateThumbProgress = f5;
            if (f5 >= 1.0f) {
                this.animateThumbProgress = 1.0f;
            } else {
                view.invalidate();
                float interpolation = CubicBezierInterpolator.DEFAULT.getInterpolation(this.animateThumbProgress);
                f3 = (f3 * interpolation) + (this.fromThumbX * (1.0f - interpolation));
            }
        }
        float f6 = this.animateThumbLoopBackProgress.set(0.0f);
        if (this.pressed) {
            f6 = 0.0f;
        }
        this.rect.right = this.horizontalPadding + AndroidUtilities.lerp(this.width - (thumbWidth / 2.0f), this.parentView.getWidth() - (this.horizontalPadding * 2.0f), this.transitionProgress);
        setPaintColor(this.selected ? this.backgroundSelectedColor : this.backgroundColor, 1.0f - this.transitionProgress);
        drawProgressBar(canvas, this.rect, paint);
        float f7 = this.bufferedAnimationValue;
        if (f7 != 1.0f) {
            float f8 = f7 + 0.16f;
            this.bufferedAnimationValue = f8;
            if (f8 > 1.0f) {
                this.bufferedAnimationValue = 1.0f;
            } else {
                this.parentView.invalidate();
            }
        }
        if (this.animateResetBuffering) {
            float f9 = this.animateFromBufferedProgress;
            if (f9 > 0.0f) {
                RectF rectF3 = this.rect;
                float f10 = this.horizontalPadding;
                int i3 = thumbWidth;
                rectF3.right = f10 + AndroidUtilities.lerp((i3 / 2.0f) + (f9 * (this.width - i3)), this.parentView.getWidth() - (this.horizontalPadding * 2.0f), this.transitionProgress);
                setPaintColor(this.selected ? this.backgroundSelectedColor : this.cacheColor, (1.0f - this.transitionProgress) * (1.0f - this.bufferedAnimationValue));
                drawProgressBar(canvas, this.rect, paint);
            }
            float f11 = this.bufferedProgress;
            if (f11 > 0.0f) {
                RectF rectF4 = this.rect;
                float f12 = this.horizontalPadding;
                int i4 = thumbWidth;
                rectF4.right = f12 + AndroidUtilities.lerp((i4 / 2.0f) + (f11 * (this.width - i4)), this.parentView.getWidth() - (this.horizontalPadding * 2.0f), this.transitionProgress);
                setPaintColor(this.selected ? this.backgroundSelectedColor : this.cacheColor, 1.0f - this.transitionProgress);
                drawProgressBar(canvas, this.rect, paint);
            }
        } else {
            float f13 = this.animateFromBufferedProgress;
            float f14 = this.bufferedAnimationValue;
            float f15 = (f13 * (1.0f - f14)) + (this.bufferedProgress * f14);
            if (f15 > 0.0f) {
                RectF rectF5 = this.rect;
                float f16 = this.horizontalPadding;
                int i5 = thumbWidth;
                rectF5.right = f16 + AndroidUtilities.lerp((i5 / 2.0f) + (f15 * (this.width - i5)), this.parentView.getWidth() - (this.horizontalPadding * 2.0f), this.transitionProgress);
                setPaintColor(this.selected ? this.backgroundSelectedColor : this.cacheColor, 1.0f - this.transitionProgress);
                drawProgressBar(canvas, this.rect, paint);
            }
        }
        float fDp = AndroidUtilities.dp(this.pressed ? 8.0f : 6.0f);
        if (this.currentRadius != fDp) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.lastUpdateTime;
            this.lastUpdateTime = jElapsedRealtime;
            if (j > 18) {
                j = 16;
            }
            float f17 = this.currentRadius;
            if (f17 < fDp) {
                float fDp2 = f17 + (AndroidUtilities.dp(1.0f) * (j / 60.0f));
                this.currentRadius = fDp2;
                if (fDp2 > fDp) {
                    this.currentRadius = fDp;
                }
            } else {
                float fDp3 = f17 - (AndroidUtilities.dp(1.0f) * (j / 60.0f));
                this.currentRadius = fDp3;
                if (fDp3 < fDp) {
                    this.currentRadius = fDp;
                }
            }
            View view2 = this.parentView;
            if (view2 != null) {
                view2.invalidate();
            }
        }
        float fLerp2 = AndroidUtilities.lerp(this.currentRadius, 0.0f, this.transitionProgress);
        if (f6 > 0.0f) {
            RectF rectF6 = this.rect;
            float f18 = rectF6.left;
            float f19 = this.horizontalPadding;
            int i6 = thumbWidth;
            f = 2.0f;
            rectF6.right = f19 + AndroidUtilities.lerp((i6 / 2.0f) + (this.width - i6), this.parentView.getWidth() - (this.horizontalPadding * 2.0f), this.transitionProgress);
            RectF rectF7 = this.rect;
            rectF7.left = AndroidUtilities.lerp(f18, rectF7.right, 1.0f - f6);
            if (this.transitionProgress > 0.0f && this.rect.width() > 0.0f) {
                strokePaint.setAlpha((int) (this.transitionProgress * 255.0f * 0.2f));
                drawProgressBar(canvas, this.rect, strokePaint);
            }
            setPaintColor(ColorUtils.blendARGB(this.progressColor, this.smallLineColor, this.transitionProgress), 1.0f);
            drawProgressBar(canvas, this.rect, paint);
            this.rect.left = f18;
            setPaintColor(ColorUtils.blendARGB(this.circleColor, getProgress() == 0.0f ? 0 : this.smallLineColor, this.transitionProgress), 1.0f - this.transitionProgress);
            canvas.drawCircle(this.horizontalPadding + AndroidUtilities.lerp((thumbWidth / 2.0f) + this.loopBackWasThumbX, (this.parentView.getWidth() - (this.horizontalPadding * 2.0f)) * (this.loopBackWasThumbX / (this.width - thumbWidth)), this.transitionProgress), this.rect.centerY(), fLerp2 * f6, paint);
        } else {
            f = 2.0f;
        }
        RectF rectF8 = this.rect;
        float f20 = this.horizontalPadding;
        float f21 = thumbWidth / f;
        if (this.pressed) {
            f3 = this.draggingThumbX;
        }
        rectF8.right = f20 + AndroidUtilities.lerp(f21 + f3, (this.parentView.getWidth() - (this.horizontalPadding * f)) * getProgress(), this.transitionProgress);
        if (this.transitionProgress > 0.0f && this.rect.width() > 0.0f) {
            strokePaint.setAlpha((int) (this.transitionProgress * 255.0f * 0.2f));
            drawProgressBar(canvas, this.rect, strokePaint);
        }
        setPaintColor(ColorUtils.blendARGB(this.progressColor, this.smallLineColor, this.transitionProgress), 1.0f);
        drawProgressBar(canvas, this.rect, paint);
        setPaintColor(ColorUtils.blendARGB(this.circleColor, getProgress() != 0.0f ? this.smallLineColor : 0, this.transitionProgress), 1.0f - this.transitionProgress);
        RectF rectF9 = this.rect;
        canvas.drawCircle(rectF9.right, rectF9.centerY(), fLerp2 * (1.0f - f6), paint);
        drawTimestampLabel(canvas);
    }

    private void drawProgressBar(Canvas canvas, RectF rectF, Paint paint2) {
        int size;
        char c;
        float fFloatValue;
        char c2;
        VideoPlayerSeekBar videoPlayerSeekBar = this;
        float fDp = AndroidUtilities.dp(AndroidUtilities.lerp(2, 1, videoPlayerSeekBar.transitionProgress));
        ArrayList arrayList = videoPlayerSeekBar.timestamps;
        if (arrayList == null || arrayList.isEmpty()) {
            canvas.drawRoundRect(rectF, fDp, fDp, paint2);
            return;
        }
        float f = rectF.bottom;
        float fLerp = videoPlayerSeekBar.horizontalPadding + AndroidUtilities.lerp(thumbWidth / 2.0f, 0.0f, videoPlayerSeekBar.transitionProgress);
        float fLerp2 = videoPlayerSeekBar.horizontalPadding + AndroidUtilities.lerp(videoPlayerSeekBar.width - (thumbWidth / 2.0f), videoPlayerSeekBar.parentView.getWidth() - (videoPlayerSeekBar.horizontalPadding * 2.0f), videoPlayerSeekBar.transitionProgress);
        AndroidUtilities.rectTmp.set(rectF);
        float fDp2 = AndroidUtilities.dp(videoPlayerSeekBar.timestampsAppearing * 1.0f) / 2.0f;
        if (tmpPath == null) {
            tmpPath = new Path();
        }
        tmpPath.reset();
        float fDp3 = AndroidUtilities.dp(4.0f) / (fLerp2 - fLerp);
        int i = 0;
        while (true) {
            size = -1;
            if (i >= videoPlayerSeekBar.timestamps.size()) {
                i = -1;
                break;
            } else if (((Float) ((Pair) videoPlayerSeekBar.timestamps.get(i)).first).floatValue() >= fDp3) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            i = 0;
        }
        for (int size2 = videoPlayerSeekBar.timestamps.size() - 1; size2 >= 0; size2--) {
            if (1.0f - ((Float) ((Pair) videoPlayerSeekBar.timestamps.get(size2)).first).floatValue() >= fDp3) {
                size = size2 + 1;
                break;
            }
        }
        if (size < 0) {
            size = videoPlayerSeekBar.timestamps.size();
        }
        int i2 = size;
        int i3 = i;
        while (i3 <= i2) {
            if (i3 == i) {
                fFloatValue = 0.0f;
                c = 1;
            } else {
                c = 1;
                fFloatValue = ((Float) ((Pair) videoPlayerSeekBar.timestamps.get(i3 - 1)).first).floatValue();
            }
            float fFloatValue2 = i3 == i2 ? 1.0f : ((Float) ((Pair) videoPlayerSeekBar.timestamps.get(i3)).first).floatValue();
            while (i3 != i2 && i3 != 0 && i3 < videoPlayerSeekBar.timestamps.size() - 1 && ((Float) ((Pair) videoPlayerSeekBar.timestamps.get(i3)).first).floatValue() - fFloatValue <= fDp3) {
                i3++;
                fFloatValue2 = ((Float) ((Pair) videoPlayerSeekBar.timestamps.get(i3)).first).floatValue();
            }
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.left = AndroidUtilities.lerp(fLerp, fLerp2, fFloatValue) + (i3 > 0 ? fDp2 : 0.0f);
            float fLerp3 = AndroidUtilities.lerp(fLerp, fLerp2, fFloatValue2) - (i3 < i2 ? fDp2 : 0.0f);
            rectF2.right = fLerp3;
            float f2 = rectF.right;
            boolean z = fLerp3 > f2;
            if (z) {
                rectF2.right = f2;
            }
            float f3 = rectF2.right;
            float f4 = rectF.left;
            if (f3 >= f4) {
                if (rectF2.left < f4) {
                    rectF2.left = f4;
                }
                if (tmpRadii == null) {
                    tmpRadii = new float[8];
                }
                if (i3 != i) {
                    if (z) {
                        c2 = 4;
                        if (rectF2.left >= rectF.left) {
                        }
                        tmpPath.addRoundRect(rectF2, tmpRadii, Path.Direction.CW);
                        if (z) {
                            break;
                        }
                    } else {
                        c2 = 4;
                    }
                    if (i3 >= i2) {
                        float[] fArr = tmpRadii;
                        float f5 = 0.7f * fDp * videoPlayerSeekBar.timestampsAppearing;
                        fArr[7] = f5;
                        fArr[6] = f5;
                        fArr[c] = f5;
                        fArr[0] = f5;
                        fArr[5] = fDp;
                        fArr[c2] = fDp;
                        fArr[3] = fDp;
                        fArr[2] = fDp;
                    } else {
                        float[] fArr2 = tmpRadii;
                        float f6 = 0.7f * fDp * videoPlayerSeekBar.timestampsAppearing;
                        fArr2[5] = f6;
                        fArr2[c2] = f6;
                        fArr2[3] = f6;
                        fArr2[2] = f6;
                        fArr2[7] = f6;
                        fArr2[6] = f6;
                        fArr2[c] = f6;
                        fArr2[0] = f6;
                    }
                    tmpPath.addRoundRect(rectF2, tmpRadii, Path.Direction.CW);
                    if (z) {
                        break;
                        break;
                    }
                } else {
                    c2 = 4;
                }
                float[] fArr3 = tmpRadii;
                fArr3[7] = fDp;
                fArr3[6] = fDp;
                fArr3[c] = fDp;
                fArr3[0] = fDp;
                float f7 = 0.7f * fDp * videoPlayerSeekBar.timestampsAppearing;
                fArr3[5] = f7;
                fArr3[c2] = f7;
                fArr3[3] = f7;
                fArr3[2] = f7;
                tmpPath.addRoundRect(rectF2, tmpRadii, Path.Direction.CW);
                if (z) {
                    break;
                    break;
                }
            }
            i3++;
            videoPlayerSeekBar = this;
        }
        canvas.drawPath(tmpPath, paint2);
    }

    private void drawTimestampLabel(Canvas canvas) {
        float f;
        float f2;
        CharSequence charSequence;
        ArrayList arrayList = this.timestamps;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        float f3 = ((this.pressed || this.pressedDelayed) ? this.draggingThumbX : this.animatedThumbX) / (this.width - thumbWidth);
        int size = this.timestamps.size() - 1;
        while (true) {
            if (size < 0) {
                size = -1;
                break;
            } else if (((Float) ((Pair) this.timestamps.get(size)).first).floatValue() - 0.001f <= f3) {
                break;
            } else {
                size--;
            }
        }
        if (this.timestampLabel == null) {
            this.timestampLabel = new StaticLayout[2];
        }
        float fLerp = this.horizontalPadding + AndroidUtilities.lerp(thumbWidth / 2.0f, 0.0f, this.transitionProgress);
        float fLerp2 = this.horizontalPadding + AndroidUtilities.lerp(this.width - (thumbWidth / 2.0f), this.parentView.getWidth() - (this.horizontalPadding * 2.0f), this.transitionProgress);
        float f4 = this.horizontalPadding + (this.width - (thumbWidth / 2.0f));
        float fAbs = Math.abs(fLerp - f4) - AndroidUtilities.dp(16.0f);
        float f5 = this.lastWidth;
        if (f5 > 0.0f && Math.abs(f5 - fAbs) > 0.01f) {
            StaticLayout[] staticLayoutArr = this.timestampLabel;
            StaticLayout staticLayout = staticLayoutArr[0];
            if (staticLayout != null) {
                staticLayoutArr[0] = makeStaticLayout(staticLayout.getText(), (int) fAbs);
            }
            StaticLayout[] staticLayoutArr2 = this.timestampLabel;
            StaticLayout staticLayout2 = staticLayoutArr2[1];
            if (staticLayout2 != null) {
                staticLayoutArr2[1] = makeStaticLayout(staticLayout2.getText(), (int) fAbs);
            }
        }
        this.lastWidth = fAbs;
        if (size != this.currentTimestamp) {
            StaticLayout[] staticLayoutArr3 = this.timestampLabel;
            staticLayoutArr3[1] = staticLayoutArr3[0];
            if (this.pressed) {
                AndroidUtilities.vibrateCursor(this.parentView);
            }
            if (size < 0 || size >= this.timestamps.size() || (charSequence = (CharSequence) ((Pair) this.timestamps.get(size)).second) == null) {
                this.timestampLabel[0] = null;
            } else {
                this.timestampLabel[0] = makeStaticLayout(charSequence, (int) fAbs);
            }
            this.timestampChangeT = 0.0f;
            if (size == -1) {
                this.timestampChangeDirection = -1;
            } else {
                int i = this.currentTimestamp;
                if (i == -1) {
                    this.timestampChangeDirection = 1;
                } else if (size < i) {
                    this.timestampChangeDirection = -1;
                } else if (size > i) {
                    this.timestampChangeDirection = 1;
                }
            }
            this.lastTimestamp = this.currentTimestamp;
            this.currentTimestamp = size;
        }
        if (this.timestampChangeT < 1.0f) {
            f = 2.0f;
            this.timestampChangeT = Math.min(this.timestampChangeT + (Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.lastTimestampUpdate)) / (this.timestamps.size() > 8 ? 160.0f : 220.0f)), 1.0f);
            this.parentView.invalidate();
            this.lastTimestampUpdate = SystemClock.elapsedRealtime();
        } else {
            f = 2.0f;
        }
        if (this.timestampsAppearing < 1.0f) {
            f2 = 16.0f;
            this.timestampsAppearing = Math.min(this.timestampsAppearing + (Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.lastTimestampUpdate)) / 200.0f), 1.0f);
            this.parentView.invalidate();
            this.lastTimestampsAppearingUpdate = SystemClock.elapsedRealtime();
        } else {
            f2 = 16.0f;
        }
        float interpolation = CubicBezierInterpolator.DEFAULT.getInterpolation(this.timestampChangeT);
        canvas.save();
        int i2 = this.height;
        canvas.translate(fLerp + ((fLerp2 - f4) * this.transitionProgress), AndroidUtilities.lerp((this.lineHeight + i2) / f, i2 - AndroidUtilities.dp(3.0f), this.transitionProgress) + AndroidUtilities.dp(12.0f));
        if (this.timestampLabel[1] != null) {
            canvas.save();
            if (this.timestampChangeDirection != 0) {
                canvas.translate(AndroidUtilities.dp(8.0f) + (AndroidUtilities.dp(f2) * (-this.timestampChangeDirection) * interpolation), 0.0f);
            }
            canvas.translate(0.0f, (-this.timestampLabel[1].getHeight()) / f);
            this.timestampLabelPaint.setAlpha((int) ((1.0f - this.transitionProgress) * 255.0f * (1.0f - interpolation) * this.timestampsAppearing));
            this.timestampLabel[1].draw(canvas);
            canvas.restore();
        }
        if (this.timestampLabel[0] != null) {
            canvas.save();
            if (this.timestampChangeDirection != 0) {
                canvas.translate(AndroidUtilities.dp(8.0f) + (AndroidUtilities.dp(f2) * this.timestampChangeDirection * (1.0f - interpolation)), 0.0f);
            }
            canvas.translate(0.0f, (-this.timestampLabel[0].getHeight()) / f);
            this.timestampLabelPaint.setAlpha((int) ((1.0f - this.transitionProgress) * 255.0f * interpolation * this.timestampsAppearing));
            this.timestampLabel[0].draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    private StaticLayout makeStaticLayout(CharSequence charSequence, int i) {
        if (this.timestampLabelPaint == null) {
            TextPaint textPaint = new TextPaint(1);
            this.timestampLabelPaint = textPaint;
            textPaint.setTextSize(AndroidUtilities.dp(12.0f));
            this.timestampLabelPaint.setColor(-1);
        }
        CharSequence charSequence2 = charSequence == null ? "" : charSequence;
        if (Build.VERSION.SDK_INT >= 23) {
            return StaticLayout.Builder.obtain(charSequence2, 0, charSequence2.length(), this.timestampLabelPaint, i).setMaxLines(1).setAlignment(Layout.Alignment.ALIGN_CENTER).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(Math.min(AndroidUtilities.dp(400.0f), i)).build();
        }
        CharSequence charSequence3 = charSequence2;
        return new StaticLayout(charSequence3, 0, charSequence3.length(), this.timestampLabelPaint, i, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false, TextUtils.TruncateAt.END, Math.min(AndroidUtilities.dp(400.0f), i));
    }

    private void setPaintColor(int i, float f) {
        if (f < 1.0f) {
            i = ColorUtils.setAlphaComponent(i, (int) (Color.alpha(i) * f));
        }
        paint.setColor(i);
    }
}
