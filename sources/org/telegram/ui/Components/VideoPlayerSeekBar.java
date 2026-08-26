package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.os.SystemClock;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DiffUtil;
import com.google.android.gms.internal.mlkit_language_id_common.zzjd;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline2;
import org.telegram.messenger.video.TextureRenderer$$ExternalSyntheticOutline0;

public final class VideoPlayerSeekBar {
    public static Paint paint;
    public static Paint strokePaint;
    public static int thumbWidth;
    public static Path tmpPath;
    public static float[] tmpRadii;
    public float animateFromBufferedProgress;
    public boolean animateResetBuffering;
    public final AnimatedFloat animateThumbLoopBackProgress;
    public int backgroundColor;
    public float bufferedProgress;
    public int cacheColor;
    public int circleColor;
    public float currentRadius;
    public SeekBarDelegate delegate;
    public int height;
    public int horizontalPadding;
    public CharSequence lastCaption;
    public long lastTimestampUpdate;
    public long lastUpdateTime;
    public long lastVideoDuration;
    public float loopBackWasThumbX;
    public final View parentView;
    public float progress;
    public int progressColor;
    public int smallLineColor;
    public int timestampChangeDirection;
    public StaticLayout[] timestampLabel;
    public TextPaint timestampLabelPaint;
    public ArrayList timestamps;
    public float transitionProgress;
    public int width;
    public int thumbX = 0;
    public float animatedThumbX = 0.0f;
    public int draggingThumbX = 0;
    public int thumbDX = 0;
    public boolean pressed = false;
    public boolean pressedDelayed = false;
    public final RectF rect = new RectF();
    public float bufferedAnimationValue = 1.0f;
    public final int lineHeight = AndroidUtilities.dp(4.0f);
    public final int smallLineHeight = AndroidUtilities.dp(2.0f);
    public int fromThumbX = 0;
    public float animateThumbProgress = 1.0f;
    public float timestampsAppearing = 0.0f;
    public int currentTimestamp = -1;
    public float timestampChangeT = 1.0f;
    public float lastWidth = -1.0f;

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

    public static void setPaintColor(float f, int i) {
        if (f < 1.0f) {
            i = ColorUtils.setAlphaComponent(i, (int) (Color.alpha(i) * f));
        }
        paint.setColor(i);
    }

    public final void draw(Canvas canvas, View view) {
        float f;
        View view2;
        char c;
        float f2;
        float f3;
        float f4;
        float f5;
        char c2;
        CharSequence charSequence;
        RectF rectF = this.rect;
        rectF.left = AndroidUtilities.lerp(thumbWidth / 2.0f, 0.0f, this.transitionProgress) + this.horizontalPadding;
        int i = this.height;
        int i2 = this.lineHeight;
        rectF.top = AndroidUtilities.lerp((i - i2) / 2.0f, (i - AndroidUtilities.dp(3.0f)) - this.smallLineHeight, this.transitionProgress);
        int i3 = this.height;
        rectF.bottom = AndroidUtilities.lerp((i3 + i2) / 2.0f, i3 - AndroidUtilities.dp(3.0f), this.transitionProgress);
        float f6 = this.thumbX;
        float fMin = Math.min(this.animatedThumbX, f6);
        this.animatedThumbX = fMin;
        float fLerp = AndroidUtilities.lerp(fMin, f6, 0.5f);
        this.animatedThumbX = fLerp;
        float fAbs = Math.abs(f6 - fLerp);
        View view3 = this.parentView;
        if (fAbs > 0.005f) {
            view3.invalidate();
        }
        float f7 = this.animatedThumbX;
        float f8 = this.animateThumbProgress;
        if (f8 != 1.0f) {
            float f9 = f8 + 0.07272727f;
            this.animateThumbProgress = f9;
            if (f9 >= 1.0f) {
                this.animateThumbProgress = 1.0f;
            } else {
                view.invalidate();
                float interpolation = CubicBezierInterpolator.DEFAULT.getInterpolation(this.animateThumbProgress);
                f7 = (f7 * interpolation) + ((1.0f - interpolation) * this.fromThumbX);
            }
        }
        float f10 = this.animateThumbLoopBackProgress.set(0.0f, false);
        if (this.pressed) {
            f10 = 0.0f;
        }
        rectF.right = AndroidUtilities.lerp(this.width - (thumbWidth / 2.0f), view3.getWidth() - (this.horizontalPadding * 2.0f), this.transitionProgress) + this.horizontalPadding;
        setPaintColor(1.0f - this.transitionProgress, this.backgroundColor);
        drawProgressBar(canvas, rectF, paint);
        float f11 = this.bufferedAnimationValue;
        if (f11 != 1.0f) {
            float f12 = f11 + 0.16f;
            this.bufferedAnimationValue = f12;
            if (f12 > 1.0f) {
                this.bufferedAnimationValue = 1.0f;
            } else {
                view3.invalidate();
            }
        }
        if (this.animateResetBuffering) {
            float f13 = this.animateFromBufferedProgress;
            if (f13 > 0.0f) {
                float f14 = this.horizontalPadding;
                int i4 = thumbWidth;
                f = 2.0f;
                rectF.right = AndroidUtilities.lerp((f13 * (this.width - i4)) + (i4 / 2.0f), view3.getWidth() - (this.horizontalPadding * 2.0f), this.transitionProgress) + f14;
                setPaintColor((1.0f - this.bufferedAnimationValue) * (1.0f - this.transitionProgress), this.cacheColor);
                drawProgressBar(canvas, rectF, paint);
            } else {
                f = 2.0f;
            }
            float f15 = this.bufferedProgress;
            if (f15 > 0.0f) {
                float f16 = this.horizontalPadding;
                int i5 = thumbWidth;
                rectF.right = AndroidUtilities.lerp((f15 * (this.width - i5)) + (i5 / f), view3.getWidth() - (this.horizontalPadding * f), this.transitionProgress) + f16;
                setPaintColor(1.0f - this.transitionProgress, this.cacheColor);
                drawProgressBar(canvas, rectF, paint);
            }
        } else {
            f = 2.0f;
            float f17 = this.animateFromBufferedProgress;
            float f18 = this.bufferedAnimationValue;
            float f19 = (this.bufferedProgress * f18) + ((1.0f - f18) * f17);
            if (f19 > 0.0f) {
                float f20 = this.horizontalPadding;
                int i6 = thumbWidth;
                rectF.right = AndroidUtilities.lerp((f19 * (this.width - i6)) + (i6 / 2.0f), view3.getWidth() - (this.horizontalPadding * 2.0f), this.transitionProgress) + f20;
                setPaintColor(1.0f - this.transitionProgress, this.cacheColor);
                drawProgressBar(canvas, rectF, paint);
            }
        }
        float fDp = AndroidUtilities.dp(this.pressed ? 8.0f : 6.0f);
        if (this.currentRadius != fDp) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            view2 = view3;
            long j = jElapsedRealtime - this.lastUpdateTime;
            this.lastUpdateTime = jElapsedRealtime;
            if (j > 18) {
                j = 16;
            }
            float f21 = this.currentRadius;
            if (f21 < fDp) {
                c = 0;
                float fM = zzjd.m(j, 60.0f, AndroidUtilities.dp(1.0f), f21);
                this.currentRadius = fM;
                if (fM > fDp) {
                    this.currentRadius = fDp;
                }
            } else {
                c = 0;
                float fM2 = TextureRenderer$$ExternalSyntheticOutline0.m(j, 60.0f, AndroidUtilities.dp(1.0f), f21);
                this.currentRadius = fM2;
                if (fM2 < fDp) {
                    this.currentRadius = fDp;
                }
            }
            view2.invalidate();
        } else {
            view2 = view3;
            c = 0;
        }
        float fLerp2 = AndroidUtilities.lerp(this.currentRadius, 0.0f, this.transitionProgress);
        if (f10 > 0.0f) {
            float f22 = rectF.left;
            float f23 = this.horizontalPadding;
            int i7 = thumbWidth;
            f2 = 0.2f;
            f3 = 8.0f;
            float fLerp3 = AndroidUtilities.lerp((i7 / f) + (this.width - i7), view2.getWidth() - (this.horizontalPadding * f), this.transitionProgress) + f23;
            rectF.right = fLerp3;
            rectF.left = AndroidUtilities.lerp(f22, fLerp3, 1.0f - f10);
            if (this.transitionProgress > 0.0f && rectF.width() > 0.0f) {
                strokePaint.setAlpha((int) (this.transitionProgress * 255.0f * 0.2f));
                drawProgressBar(canvas, rectF, strokePaint);
            }
            setPaintColor(1.0f, ColorUtils.blendARGB(this.transitionProgress, this.progressColor, this.smallLineColor));
            drawProgressBar(canvas, rectF, paint);
            rectF.left = f22;
            setPaintColor(1.0f - this.transitionProgress, ColorUtils.blendARGB(this.transitionProgress, this.circleColor, ((float) this.thumbX) / ((float) (this.width - thumbWidth)) == 0.0f ? 0 : this.smallLineColor));
            canvas.drawCircle(AndroidUtilities.lerp((thumbWidth / f) + this.loopBackWasThumbX, (this.loopBackWasThumbX / (this.width - thumbWidth)) * (view2.getWidth() - (this.horizontalPadding * f)), this.transitionProgress) + this.horizontalPadding, rectF.centerY(), fLerp2 * f10, paint);
        } else {
            f2 = 0.2f;
            f3 = 8.0f;
        }
        float f24 = this.horizontalPadding;
        float f25 = thumbWidth / f;
        if (this.pressed) {
            f7 = this.draggingThumbX;
        }
        rectF.right = AndroidUtilities.lerp(f25 + f7, (this.thumbX / (this.width - thumbWidth)) * (view2.getWidth() - (this.horizontalPadding * f)), this.transitionProgress) + f24;
        if (this.transitionProgress > 0.0f && rectF.width() > 0.0f) {
            strokePaint.setAlpha((int) (this.transitionProgress * 255.0f * f2));
            drawProgressBar(canvas, rectF, strokePaint);
        }
        setPaintColor(1.0f, ColorUtils.blendARGB(this.transitionProgress, this.progressColor, this.smallLineColor));
        drawProgressBar(canvas, rectF, paint);
        setPaintColor(1.0f - this.transitionProgress, ColorUtils.blendARGB(this.transitionProgress, this.circleColor, ((float) this.thumbX) / ((float) (this.width - thumbWidth)) == 0.0f ? 0 : this.smallLineColor));
        canvas.drawCircle(rectF.right, rectF.centerY(), (1.0f - f10) * fLerp2, paint);
        ArrayList arrayList = this.timestamps;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        float f26 = ((this.pressed || this.pressedDelayed) ? this.draggingThumbX : this.animatedThumbX) / (this.width - thumbWidth);
        int size = this.timestamps.size() - 1;
        while (true) {
            if (size < 0) {
                size = -1;
                break;
            } else if (((Float) ((Pair) this.timestamps.get(size)).first).floatValue() - 0.001f <= f26) {
                break;
            } else {
                size--;
            }
        }
        if (this.timestampLabel == null) {
            this.timestampLabel = new StaticLayout[2];
        }
        float fLerp4 = AndroidUtilities.lerp(thumbWidth / f, 0.0f, this.transitionProgress) + this.horizontalPadding;
        float fLerp5 = AndroidUtilities.lerp(this.width - (thumbWidth / f), view2.getWidth() - (this.horizontalPadding * f), this.transitionProgress) + this.horizontalPadding;
        float f27 = (this.width - (thumbWidth / f)) + this.horizontalPadding;
        float fAbs2 = Math.abs(fLerp4 - f27) - AndroidUtilities.dp(16.0f);
        float f28 = this.lastWidth;
        if (f28 <= 0.0f || Math.abs(f28 - fAbs2) <= 0.01f) {
            f4 = 3.0f;
            f5 = 16.0f;
        } else {
            StaticLayout[] staticLayoutArr = this.timestampLabel;
            StaticLayout staticLayout = staticLayoutArr[c];
            if (staticLayout != null) {
                f5 = 16.0f;
                CharSequence text = staticLayout.getText();
                f4 = 3.0f;
                staticLayoutArr[c] = makeStaticLayout((int) fAbs2, text);
            } else {
                f4 = 3.0f;
                f5 = 16.0f;
            }
            StaticLayout[] staticLayoutArr2 = this.timestampLabel;
            StaticLayout staticLayout2 = staticLayoutArr2[1];
            if (staticLayout2 != null) {
                staticLayoutArr2[1] = makeStaticLayout((int) fAbs2, staticLayout2.getText());
            }
        }
        this.lastWidth = fAbs2;
        if (size != this.currentTimestamp) {
            StaticLayout[] staticLayoutArr3 = this.timestampLabel;
            staticLayoutArr3[1] = staticLayoutArr3[c];
            if (this.pressed) {
                AndroidUtilities.vibrateCursor(view2);
            }
            if (size < 0 || size >= this.timestamps.size() || (charSequence = (CharSequence) ((Pair) this.timestamps.get(size)).second) == null) {
                this.timestampLabel[c] = null;
            } else {
                this.timestampLabel[c] = makeStaticLayout((int) fAbs2, charSequence);
            }
            this.timestampChangeT = 0.0f;
            if (size == -1) {
                this.timestampChangeDirection = -1;
            } else {
                int i8 = this.currentTimestamp;
                if (i8 == -1) {
                    this.timestampChangeDirection = 1;
                } else if (size < i8) {
                    this.timestampChangeDirection = -1;
                } else if (size > i8) {
                    this.timestampChangeDirection = 1;
                }
            }
            this.currentTimestamp = size;
        }
        if (this.timestampChangeT < 1.0f) {
            c2 = 1;
            this.timestampChangeT = Math.min((Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.lastTimestampUpdate)) / (this.timestamps.size() > 8 ? 160.0f : 220.0f)) + this.timestampChangeT, 1.0f);
            view2.invalidate();
            this.lastTimestampUpdate = SystemClock.elapsedRealtime();
        } else {
            c2 = 1;
        }
        if (this.timestampsAppearing < 1.0f) {
            this.timestampsAppearing = Math.min((Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.lastTimestampUpdate)) / 200.0f) + this.timestampsAppearing, 1.0f);
            view2.invalidate();
            SystemClock.elapsedRealtime();
        }
        float interpolation2 = CubicBezierInterpolator.DEFAULT.getInterpolation(this.timestampChangeT);
        canvas.save();
        int i9 = this.height;
        canvas.translate(((fLerp5 - f27) * this.transitionProgress) + fLerp4, AndroidUtilities.lerp((i2 + i9) / f, i9 - AndroidUtilities.dp(f4), this.transitionProgress) + AndroidUtilities.dp(12.0f));
        if (this.timestampLabel[c2] != null) {
            canvas.save();
            if (this.timestampChangeDirection != 0) {
                canvas.translate((AndroidUtilities.dp(f5) * (-this.timestampChangeDirection) * interpolation2) + AndroidUtilities.dp(f3), 0.0f);
            }
            canvas.translate(0.0f, (-this.timestampLabel[c2].getHeight()) / f);
            this.timestampLabelPaint.setAlpha((int) ((1.0f - interpolation2) * (1.0f - this.transitionProgress) * 255.0f * this.timestampsAppearing));
            this.timestampLabel[c2].draw(canvas);
            canvas.restore();
        }
        if (this.timestampLabel[c] != null) {
            canvas.save();
            if (this.timestampChangeDirection != 0) {
                canvas.translate(DiffUtil.m(1.0f, interpolation2, AndroidUtilities.dp(f5) * this.timestampChangeDirection, AndroidUtilities.dp(f3)), 0.0f);
            }
            canvas.translate(0.0f, (-this.timestampLabel[c].getHeight()) / f);
            this.timestampLabelPaint.setAlpha((int) (ImageReceiver$$ExternalSyntheticOutline2.m(1.0f, this.transitionProgress, 255.0f, interpolation2) * this.timestampsAppearing));
            this.timestampLabel[c].draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    public final void drawProgressBar(Canvas canvas, RectF rectF, Paint paint2) {
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
        float fLerp = AndroidUtilities.lerp(thumbWidth / 2.0f, 0.0f, videoPlayerSeekBar.transitionProgress) + videoPlayerSeekBar.horizontalPadding;
        float fLerp2 = AndroidUtilities.lerp(videoPlayerSeekBar.width - (thumbWidth / 2.0f), videoPlayerSeekBar.parentView.getWidth() - (videoPlayerSeekBar.horizontalPadding * 2.0f), videoPlayerSeekBar.transitionProgress) + videoPlayerSeekBar.horizontalPadding;
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

    public final StaticLayout makeStaticLayout(int i, CharSequence charSequence) {
        if (this.timestampLabelPaint == null) {
            TextPaint textPaint = new TextPaint(1);
            this.timestampLabelPaint = textPaint;
            textPaint.setTextSize(AndroidUtilities.dp(12.0f));
            this.timestampLabelPaint.setColor(-1);
        }
        if (charSequence == null) {
            charSequence = "";
        }
        CharSequence charSequence2 = charSequence;
        if (Build.VERSION.SDK_INT < 23) {
            return new StaticLayout(charSequence2, 0, charSequence2.length(), this.timestampLabelPaint, i, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false, TextUtils.TruncateAt.END, Math.min(AndroidUtilities.dp(400.0f), i));
        }
        StaticLayout.Builder maxLines = StaticLayout.Builder.obtain(charSequence2, 0, charSequence2.length(), this.timestampLabelPaint, i).setMaxLines(1);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        StaticLayout.Builder alignment2 = maxLines.setAlignment(Layout.Alignment.ALIGN_CENTER);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        return alignment2.setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(Math.min(AndroidUtilities.dp(400.0f), i)).build();
    }

    public final boolean onTouch(float f, float f2, int i) {
        SeekBarDelegate seekBarDelegate;
        if (i == 0) {
            if (this.transitionProgress <= 0.0f) {
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
                AndroidUtilities.runOnUIThread(new Tooltip$$ExternalSyntheticLambda0(this, 13), 50L);
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

    public final void setBufferedProgress(float f) {
        float f2 = this.bufferedProgress;
        if (f != f2) {
            this.animateFromBufferedProgress = f2;
            this.animateResetBuffering = f < f2;
            this.bufferedProgress = f;
            this.bufferedAnimationValue = 0.0f;
        }
    }

    public final void setProgress(float f, boolean z) {
        if (Math.abs(this.progress - 1.0f) < 0.04f && Math.abs(f) < 0.04f) {
            this.animateThumbLoopBackProgress.set(1.0f, true);
            this.loopBackWasThumbX = this.thumbX;
        }
        this.progress = f;
        int iCeil = (int) Math.ceil((this.width - thumbWidth) * f);
        if (z) {
            if (Math.abs(iCeil - this.thumbX) > AndroidUtilities.dp(10.0f)) {
                float interpolation = CubicBezierInterpolator.DEFAULT.getInterpolation(this.animateThumbProgress);
                this.fromThumbX = (int) DiffUtil.m(1.0f, interpolation, this.fromThumbX, this.thumbX * interpolation);
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
}
