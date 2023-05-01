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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildConfig;
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
    private ArrayList<Pair<Float, CharSequence>> timestamps;
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
    private int currentTimestamp = -1;
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
                this.animatedThumbX = i9;
                if (i == 1 && (seekBarDelegate = this.delegate) != null) {
                    seekBarDelegate.onSeekBarDrag(i9 / (this.width - thumbWidth));
                }
                this.pressed = false;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        VideoPlayerSeekBar.this.lambda$onTouch$0();
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
                int i11 = this.width;
                int i12 = thumbWidth;
                if (i10 > i11 - i12) {
                    this.draggingThumbX = i11 - i12;
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

    public void lambda$onTouch$0() {
        this.pressedDelayed = false;
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
        int ceil = (int) Math.ceil((this.width - thumbWidth) * f);
        if (z) {
            if (Math.abs(ceil - this.thumbX) > AndroidUtilities.dp(10.0f)) {
                float interpolation = CubicBezierInterpolator.DEFAULT.getInterpolation(this.animateThumbProgress);
                this.fromThumbX = (int) ((this.thumbX * interpolation) + (this.fromThumbX * (1.0f - interpolation)));
                this.animateThumbProgress = 0.0f;
            } else if (this.animateThumbProgress == 1.0f) {
                this.animateThumbProgress = 0.0f;
                this.fromThumbX = this.thumbX;
            }
        }
        this.thumbX = ceil;
        if (ceil < 0) {
            this.thumbX = 0;
        } else {
            int i = this.width;
            int i2 = thumbWidth;
            if (ceil > i - i2) {
                this.thumbX = i - i2;
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
        Integer parseInt;
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
            this.timestamps = new ArrayList<>();
            this.timestampsAppearing = 0.0f;
            if (this.timestampLabelPaint == null) {
                TextPaint textPaint = new TextPaint(1);
                this.timestampLabelPaint = textPaint;
                textPaint.setTextSize(AndroidUtilities.dp(12.0f));
                this.timestampLabelPaint.setColor(-1);
            }
            for (URLSpanNoUnderline uRLSpanNoUnderline : uRLSpanNoUnderlineArr) {
                if (uRLSpanNoUnderline != null && uRLSpanNoUnderline.getURL() != null && uRLSpanNoUnderline.label != null && uRLSpanNoUnderline.getURL().startsWith("video?") && (parseInt = Utilities.parseInt((CharSequence) uRLSpanNoUnderline.getURL().substring(6))) != null && parseInt.intValue() >= 0) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(uRLSpanNoUnderline.label);
                    Emoji.replaceEmoji(spannableStringBuilder, this.timestampLabelPaint.getFontMetricsInt(), AndroidUtilities.dp(14.0f), false);
                    this.timestamps.add(new Pair<>(Float.valueOf(((float) (parseInt.intValue() * 1000)) / ((float) j)), spannableStringBuilder));
                }
            }
            Collections.sort(this.timestamps, VideoPlayerSeekBar$$ExternalSyntheticLambda1.INSTANCE);
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

    public static int lambda$updateTimestamps$1(Pair pair, Pair pair2) {
        if (((Float) pair.first).floatValue() > ((Float) pair2.first).floatValue()) {
            return 1;
        }
        return ((Float) pair2.first).floatValue() > ((Float) pair.first).floatValue() ? -1 : 0;
    }

    public void draw(Canvas canvas, View view) {
        int i;
        int i2;
        int i3;
        int i4;
        this.rect.left = this.horizontalPadding + AndroidUtilities.lerp(thumbWidth / 2.0f, 0.0f, this.transitionProgress);
        RectF rectF = this.rect;
        int i5 = this.height;
        rectF.top = AndroidUtilities.lerp((i5 - this.lineHeight) / 2.0f, (i5 - AndroidUtilities.dp(3.0f)) - this.smallLineHeight, this.transitionProgress);
        RectF rectF2 = this.rect;
        int i6 = this.height;
        rectF2.bottom = AndroidUtilities.lerp((this.lineHeight + i6) / 2.0f, i6 - AndroidUtilities.dp(3.0f), this.transitionProgress);
        float f = this.thumbX;
        float min = Math.min(this.animatedThumbX, f);
        this.animatedThumbX = min;
        float lerp = AndroidUtilities.lerp(min, f, 0.5f);
        this.animatedThumbX = lerp;
        if (Math.abs(f - lerp) > 0.005f) {
            this.parentView.invalidate();
        }
        float f2 = this.animatedThumbX;
        float f3 = this.animateThumbProgress;
        if (f3 != 1.0f) {
            float f4 = f3 + 0.07272727f;
            this.animateThumbProgress = f4;
            if (f4 >= 1.0f) {
                this.animateThumbProgress = 1.0f;
            } else {
                view.invalidate();
                float interpolation = CubicBezierInterpolator.DEFAULT.getInterpolation(this.animateThumbProgress);
                f2 = (f2 * interpolation) + (this.fromThumbX * (1.0f - interpolation));
            }
        }
        float f5 = this.animateThumbLoopBackProgress.set(0.0f);
        if (this.pressed) {
            f5 = 0.0f;
        }
        this.rect.right = this.horizontalPadding + AndroidUtilities.lerp(this.width - (thumbWidth / 2.0f), this.parentView.getWidth() - (this.horizontalPadding * 2.0f), this.transitionProgress);
        setPaintColor(this.selected ? this.backgroundSelectedColor : this.backgroundColor, 1.0f - this.transitionProgress);
        drawProgressBar(canvas, this.rect, paint);
        float f6 = this.bufferedAnimationValue;
        if (f6 != 1.0f) {
            float f7 = f6 + 0.16f;
            this.bufferedAnimationValue = f7;
            if (f7 > 1.0f) {
                this.bufferedAnimationValue = 1.0f;
            } else {
                this.parentView.invalidate();
            }
        }
        if (this.animateResetBuffering) {
            float f8 = this.animateFromBufferedProgress;
            if (f8 > 0.0f) {
                this.rect.right = this.horizontalPadding + AndroidUtilities.lerp((thumbWidth / 2.0f) + (f8 * (this.width - i4)), this.parentView.getWidth() - (this.horizontalPadding * 2.0f), this.transitionProgress);
                setPaintColor(this.selected ? this.backgroundSelectedColor : this.cacheColor, (1.0f - this.transitionProgress) * (1.0f - this.bufferedAnimationValue));
                drawProgressBar(canvas, this.rect, paint);
            }
            float f9 = this.bufferedProgress;
            if (f9 > 0.0f) {
                this.rect.right = this.horizontalPadding + AndroidUtilities.lerp((thumbWidth / 2.0f) + (f9 * (this.width - i3)), this.parentView.getWidth() - (this.horizontalPadding * 2.0f), this.transitionProgress);
                setPaintColor(this.selected ? this.backgroundSelectedColor : this.cacheColor, 1.0f - this.transitionProgress);
                drawProgressBar(canvas, this.rect, paint);
            }
        } else {
            float f10 = this.animateFromBufferedProgress;
            float f11 = this.bufferedAnimationValue;
            float f12 = (f10 * (1.0f - f11)) + (this.bufferedProgress * f11);
            if (f12 > 0.0f) {
                this.rect.right = this.horizontalPadding + AndroidUtilities.lerp((thumbWidth / 2.0f) + (f12 * (this.width - i)), this.parentView.getWidth() - (this.horizontalPadding * 2.0f), this.transitionProgress);
                setPaintColor(this.selected ? this.backgroundSelectedColor : this.cacheColor, 1.0f - this.transitionProgress);
                drawProgressBar(canvas, this.rect, paint);
            }
        }
        float dp = AndroidUtilities.dp(this.pressed ? 8.0f : 6.0f);
        if (this.currentRadius != dp) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.lastUpdateTime;
            this.lastUpdateTime = elapsedRealtime;
            if (j > 18) {
                j = 16;
            }
            float f13 = this.currentRadius;
            if (f13 < dp) {
                float dp2 = f13 + (AndroidUtilities.dp(1.0f) * (((float) j) / 60.0f));
                this.currentRadius = dp2;
                if (dp2 > dp) {
                    this.currentRadius = dp;
                }
            } else {
                float dp3 = f13 - (AndroidUtilities.dp(1.0f) * (((float) j) / 60.0f));
                this.currentRadius = dp3;
                if (dp3 < dp) {
                    this.currentRadius = dp;
                }
            }
            View view2 = this.parentView;
            if (view2 != null) {
                view2.invalidate();
            }
        }
        float lerp2 = AndroidUtilities.lerp(this.currentRadius, 0.0f, this.transitionProgress);
        if (f5 > 0.0f) {
            RectF rectF3 = this.rect;
            float f14 = rectF3.left;
            rectF3.right = this.horizontalPadding + AndroidUtilities.lerp((thumbWidth / 2.0f) + (this.width - i2), this.parentView.getWidth() - (this.horizontalPadding * 2.0f), this.transitionProgress);
            RectF rectF4 = this.rect;
            rectF4.left = AndroidUtilities.lerp(f14, rectF4.right, 1.0f - f5);
            if (this.transitionProgress > 0.0f && this.rect.width() > 0.0f) {
                strokePaint.setAlpha((int) (this.transitionProgress * 255.0f * 0.2f));
                drawProgressBar(canvas, this.rect, strokePaint);
            }
            setPaintColor(ColorUtils.blendARGB(this.progressColor, this.smallLineColor, this.transitionProgress), 1.0f);
            drawProgressBar(canvas, this.rect, paint);
            this.rect.left = f14;
            setPaintColor(ColorUtils.blendARGB(this.circleColor, getProgress() == 0.0f ? 0 : this.smallLineColor, this.transitionProgress), 1.0f - this.transitionProgress);
            canvas.drawCircle(this.horizontalPadding + AndroidUtilities.lerp((thumbWidth / 2.0f) + this.loopBackWasThumbX, (this.parentView.getWidth() - (this.horizontalPadding * 2.0f)) * (this.loopBackWasThumbX / (this.width - thumbWidth)), this.transitionProgress), this.rect.centerY(), lerp2 * f5, paint);
        }
        RectF rectF5 = this.rect;
        float f15 = this.horizontalPadding;
        float f16 = thumbWidth / 2.0f;
        if (this.pressed) {
            f2 = this.draggingThumbX;
        }
        rectF5.right = f15 + AndroidUtilities.lerp(f16 + f2, (this.parentView.getWidth() - (this.horizontalPadding * 2.0f)) * getProgress(), this.transitionProgress);
        if (this.transitionProgress > 0.0f && this.rect.width() > 0.0f) {
            strokePaint.setAlpha((int) (this.transitionProgress * 255.0f * 0.2f));
            drawProgressBar(canvas, this.rect, strokePaint);
        }
        setPaintColor(ColorUtils.blendARGB(this.progressColor, this.smallLineColor, this.transitionProgress), 1.0f);
        drawProgressBar(canvas, this.rect, paint);
        setPaintColor(ColorUtils.blendARGB(this.circleColor, getProgress() == 0.0f ? 0 : this.smallLineColor, this.transitionProgress), 1.0f - this.transitionProgress);
        RectF rectF6 = this.rect;
        canvas.drawCircle(rectF6.right, rectF6.centerY(), lerp2 * (1.0f - f5), paint);
        drawTimestampLabel(canvas);
    }

    private void drawProgressBar(Canvas canvas, RectF rectF, Paint paint2) {
        int i;
        float f;
        int i2 = 1;
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(2, 1, this.transitionProgress));
        ArrayList<Pair<Float, CharSequence>> arrayList = this.timestamps;
        if (arrayList == null || arrayList.isEmpty()) {
            canvas.drawRoundRect(rectF, dp, dp, paint2);
            return;
        }
        float f2 = rectF.bottom;
        float lerp = this.horizontalPadding + AndroidUtilities.lerp(thumbWidth / 2.0f, 0.0f, this.transitionProgress);
        float lerp2 = this.horizontalPadding + AndroidUtilities.lerp(this.width - (thumbWidth / 2.0f), this.parentView.getWidth() - (this.horizontalPadding * 2.0f), this.transitionProgress);
        AndroidUtilities.rectTmp.set(rectF);
        float dp2 = AndroidUtilities.dp(this.timestampsAppearing * 1.0f) / 2.0f;
        if (tmpPath == null) {
            tmpPath = new Path();
        }
        tmpPath.reset();
        float dp3 = AndroidUtilities.dp(4.0f) / (lerp2 - lerp);
        int i3 = 0;
        while (true) {
            i = -1;
            if (i3 >= this.timestamps.size()) {
                i3 = -1;
                break;
            } else if (((Float) this.timestamps.get(i3).first).floatValue() >= dp3) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 < 0) {
            i3 = 0;
        }
        int size = this.timestamps.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            } else if (1.0f - ((Float) this.timestamps.get(size).first).floatValue() >= dp3) {
                i = size + 1;
                break;
            } else {
                size--;
            }
        }
        if (i < 0) {
            i = this.timestamps.size();
        }
        int i4 = i;
        int i5 = i3;
        while (i5 <= i4) {
            float floatValue = i5 == i3 ? 0.0f : ((Float) this.timestamps.get(i5 - 1).first).floatValue();
            float floatValue2 = i5 == i4 ? 1.0f : ((Float) this.timestamps.get(i5).first).floatValue();
            while (i5 != i4 && i5 != 0 && i5 < this.timestamps.size() - i2 && ((Float) this.timestamps.get(i5).first).floatValue() - floatValue <= dp3) {
                i5++;
                floatValue2 = ((Float) this.timestamps.get(i5).first).floatValue();
            }
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.left = AndroidUtilities.lerp(lerp, lerp2, floatValue) + (i5 > 0 ? dp2 : 0.0f);
            float lerp3 = AndroidUtilities.lerp(lerp, lerp2, floatValue2) - (i5 < i4 ? dp2 : 0.0f);
            rectF2.right = lerp3;
            float f3 = rectF.right;
            boolean z = lerp3 > f3;
            if (z) {
                rectF2.right = f3;
            }
            float f4 = rectF2.right;
            float f5 = rectF.left;
            if (f4 < f5) {
                f = lerp;
            } else {
                if (rectF2.left < f5) {
                    rectF2.left = f5;
                }
                if (tmpRadii == null) {
                    tmpRadii = new float[8];
                }
                if (i5 == i3 || (z && rectF2.left >= rectF.left)) {
                    f = lerp;
                    float[] fArr = tmpRadii;
                    fArr[7] = dp;
                    fArr[6] = dp;
                    fArr[1] = dp;
                    fArr[0] = dp;
                    float f6 = 0.7f * dp * this.timestampsAppearing;
                    fArr[5] = f6;
                    fArr[4] = f6;
                    fArr[3] = f6;
                    fArr[2] = f6;
                } else if (i5 >= i4) {
                    float[] fArr2 = tmpRadii;
                    f = lerp;
                    float f7 = 0.7f * dp * this.timestampsAppearing;
                    fArr2[7] = f7;
                    fArr2[6] = f7;
                    fArr2[1] = f7;
                    fArr2[0] = f7;
                    fArr2[5] = dp;
                    fArr2[4] = dp;
                    fArr2[3] = dp;
                    fArr2[2] = dp;
                } else {
                    f = lerp;
                    float[] fArr3 = tmpRadii;
                    float f8 = this.timestampsAppearing * 0.7f * dp;
                    fArr3[5] = f8;
                    fArr3[4] = f8;
                    fArr3[3] = f8;
                    fArr3[2] = f8;
                    fArr3[7] = f8;
                    fArr3[6] = f8;
                    fArr3[1] = f8;
                    fArr3[0] = f8;
                }
                tmpPath.addRoundRect(rectF2, tmpRadii, Path.Direction.CW);
                if (z) {
                    break;
                }
            }
            i5++;
            lerp = f;
            i2 = 1;
        }
        canvas.drawPath(tmpPath, paint2);
    }

    private void drawTimestampLabel(Canvas canvas) {
        float f;
        float f2;
        ArrayList<Pair<Float, CharSequence>> arrayList = this.timestamps;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        float f3 = ((this.pressed || this.pressedDelayed) ? this.draggingThumbX : this.animatedThumbX) / (this.width - thumbWidth);
        int size = this.timestamps.size() - 1;
        while (true) {
            if (size < 0) {
                size = -1;
                break;
            } else if (((Float) this.timestamps.get(size).first).floatValue() - 0.001f <= f3) {
                break;
            } else {
                size--;
            }
        }
        if (this.timestampLabel == null) {
            this.timestampLabel = new StaticLayout[2];
        }
        float lerp = this.horizontalPadding + AndroidUtilities.lerp(thumbWidth / 2.0f, 0.0f, this.transitionProgress);
        float lerp2 = this.horizontalPadding + AndroidUtilities.lerp(this.width - (thumbWidth / 2.0f), this.parentView.getWidth() - (this.horizontalPadding * 2.0f), this.transitionProgress);
        float f4 = this.horizontalPadding + (this.width - (thumbWidth / 2.0f));
        float abs = Math.abs(lerp - f4) - AndroidUtilities.dp(16.0f);
        float f5 = this.lastWidth;
        if (f5 > 0.0f && Math.abs(f5 - abs) > 0.01f) {
            StaticLayout[] staticLayoutArr = this.timestampLabel;
            if (staticLayoutArr[0] != null) {
                staticLayoutArr[0] = makeStaticLayout(staticLayoutArr[0].getText(), (int) abs);
            }
            StaticLayout[] staticLayoutArr2 = this.timestampLabel;
            if (staticLayoutArr2[1] != null) {
                staticLayoutArr2[1] = makeStaticLayout(staticLayoutArr2[1].getText(), (int) abs);
            }
        }
        this.lastWidth = abs;
        if (size != this.currentTimestamp) {
            StaticLayout[] staticLayoutArr3 = this.timestampLabel;
            staticLayoutArr3[1] = staticLayoutArr3[0];
            if (this.pressed) {
                try {
                    this.parentView.performHapticFeedback(9, 1);
                } catch (Exception unused) {
                }
            }
            if (size >= 0 && size < this.timestamps.size()) {
                CharSequence charSequence = (CharSequence) this.timestamps.get(size).second;
                if (charSequence == null) {
                    this.timestampLabel[0] = null;
                } else {
                    this.timestampLabel[0] = makeStaticLayout(charSequence, (int) abs);
                }
            } else {
                this.timestampLabel[0] = null;
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
            this.currentTimestamp = size;
        }
        if (this.timestampChangeT < 1.0f) {
            this.timestampChangeT = Math.min(this.timestampChangeT + (((float) Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.lastTimestampUpdate))) / (this.timestamps.size() > 8 ? 160.0f : 220.0f)), 1.0f);
            this.parentView.invalidate();
            this.lastTimestampUpdate = SystemClock.elapsedRealtime();
        }
        if (this.timestampsAppearing < 1.0f) {
            this.timestampsAppearing = Math.min(this.timestampsAppearing + (((float) Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.lastTimestampUpdate))) / 200.0f), 1.0f);
            this.parentView.invalidate();
            SystemClock.elapsedRealtime();
        }
        float interpolation = CubicBezierInterpolator.DEFAULT.getInterpolation(this.timestampChangeT);
        canvas.save();
        int i2 = this.height;
        canvas.translate(lerp + ((lerp2 - f4) * this.transitionProgress), AndroidUtilities.lerp((this.lineHeight + i2) / 2.0f, i2 - AndroidUtilities.dp(3.0f), this.transitionProgress) + AndroidUtilities.dp(12.0f));
        if (this.timestampLabel[1] != null) {
            canvas.save();
            if (this.timestampChangeDirection != 0) {
                f2 = 0.0f;
                canvas.translate(AndroidUtilities.dp(8.0f) + (AndroidUtilities.dp(16.0f) * (-this.timestampChangeDirection) * interpolation), 0.0f);
            } else {
                f2 = 0.0f;
            }
            canvas.translate(f2, (-this.timestampLabel[1].getHeight()) / 2.0f);
            this.timestampLabelPaint.setAlpha((int) ((1.0f - this.transitionProgress) * 255.0f * (1.0f - interpolation) * this.timestampsAppearing));
            this.timestampLabel[1].draw(canvas);
            canvas.restore();
        }
        if (this.timestampLabel[0] != null) {
            canvas.save();
            if (this.timestampChangeDirection != 0) {
                f = 0.0f;
                canvas.translate(AndroidUtilities.dp(8.0f) + (AndroidUtilities.dp(16.0f) * this.timestampChangeDirection * (1.0f - interpolation)), 0.0f);
            } else {
                f = 0.0f;
            }
            canvas.translate(f, (-this.timestampLabel[0].getHeight()) / 2.0f);
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
        CharSequence charSequence2 = charSequence == null ? BuildConfig.APP_CENTER_HASH : charSequence;
        if (Build.VERSION.SDK_INT >= 23) {
            return StaticLayout.Builder.obtain(charSequence2, 0, charSequence2.length(), this.timestampLabelPaint, i).setMaxLines(1).setAlignment(Layout.Alignment.ALIGN_CENTER).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(Math.min(AndroidUtilities.dp(400.0f), i)).build();
        }
        return new StaticLayout(charSequence2, 0, charSequence2.length(), this.timestampLabelPaint, i, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false, TextUtils.TruncateAt.END, Math.min(AndroidUtilities.dp(400.0f), i));
    }

    private void setPaintColor(int i, float f) {
        if (f < 1.0f) {
            i = ColorUtils.setAlphaComponent(i, (int) (Color.alpha(i) * f));
        }
        paint.setColor(i);
    }
}
