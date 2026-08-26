package org.telegram.ui.Stories.recorder;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.DiffUtil;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.CubicBezierInterpolator;

public class SliderView extends View {
    public final Path clipPath;
    public final int currentType;
    public int fixWidth;
    public int h;
    public float lastTouchX;
    public float maxVolume;
    public float minVolume;
    public Utilities.Callback onValueChange;
    public long pressTime;
    public float r;
    public final Paint speaker1Paint;
    public final Path speaker1Path;
    public final Paint speaker2Paint;
    public final Path speaker2Path;
    public final Paint speakerWave1Paint;
    public final Path speakerWave1Path;
    public final Paint speakerWave2Paint;
    public final Path speakerWave2Path;
    public final AnimatedTextView.AnimatedTextDrawable text;
    public final AnimatedTextView.AnimatedTextDrawable text2;
    public final TextPaint textPaint;
    public float value;
    public final AnimatedFloat valueAnimated;
    public boolean valueIsAnimated;
    public int w;
    public final AnimatedFloat wave1Alpha;
    public final AnimatedFloat wave2Alpha;
    public final Paint whitePaint;

    public SliderView(Context context, int i) {
        super(context);
        this.minVolume = 0.0f;
        this.maxVolume = 1.0f;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.valueAnimated = new AnimatedFloat(this, 0L, 320L, cubicBezierInterpolator);
        Paint paint = new Paint(1);
        this.whitePaint = paint;
        Paint paint2 = new Paint(1);
        this.speaker1Paint = paint2;
        Paint paint3 = new Paint(1);
        this.speaker2Paint = paint3;
        Paint paint4 = new Paint(1);
        this.speakerWave1Paint = paint4;
        Paint paint5 = new Paint(1);
        this.speakerWave2Paint = paint5;
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(false, true, true, false);
        this.text = animatedTextDrawable;
        this.clipPath = new Path();
        this.speaker1Path = new Path();
        this.speaker2Path = new Path();
        this.speakerWave1Path = new Path();
        this.speakerWave2Path = new Path();
        this.wave1Alpha = new AnimatedFloat(this, 0L, 350L, cubicBezierInterpolator);
        this.wave2Alpha = new AnimatedFloat(this, 0L, 350L, cubicBezierInterpolator);
        this.textPaint = new TextPaint(1);
        this.currentType = i;
        Typeface typefaceBold = AndroidUtilities.bold();
        TextPaint textPaint = animatedTextDrawable.textPaint;
        textPaint.setTypeface(typefaceBold);
        animatedTextDrawable.moveAmplitude = 0.3f;
        animatedTextDrawable.animateDuration = 40L;
        animatedTextDrawable.animateWave = 1.0f;
        animatedTextDrawable.animateInterpolator = cubicBezierInterpolator;
        animatedTextDrawable.setCallback(this);
        textPaint.setColor(-1);
        animatedTextDrawable.alpha = Color.alpha(-1);
        animatedTextDrawable.overrideFullWidth = AndroidUtilities.displaySize.x;
        if (i == 0) {
            animatedTextDrawable.setTextSize(AndroidUtilities.dp(15.0f));
            this.text2 = null;
            paint2.setColor(-1);
            paint3.setColor(-1);
            paint4.setColor(-1);
            paint5.setColor(-1);
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeCap(Paint.Cap.ROUND);
        } else {
            animatedTextDrawable.setTextSize(AndroidUtilities.dp(14.0f));
            animatedTextDrawable.gravity = 5;
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = new AnimatedTextView.AnimatedTextDrawable(false, true, true, false);
            this.text2 = animatedTextDrawable2;
            animatedTextDrawable2.overrideFullWidth = AndroidUtilities.displaySize.x;
            animatedTextDrawable2.setTextSize(AndroidUtilities.dp(14.0f));
            Typeface typefaceBold2 = AndroidUtilities.bold();
            TextPaint textPaint2 = animatedTextDrawable2.textPaint;
            textPaint2.setTypeface(typefaceBold2);
            animatedTextDrawable2.moveAmplitude = 0.3f;
            animatedTextDrawable2.animateDuration = 40L;
            animatedTextDrawable2.animateWave = 1.0f;
            animatedTextDrawable2.animateInterpolator = cubicBezierInterpolator;
            animatedTextDrawable2.setCallback(this);
            textPaint2.setColor(-1);
            animatedTextDrawable2.alpha = Color.alpha(-1);
            if (i == 1) {
                animatedTextDrawable2.setText(LocaleController.getString(R.string.FlashWarmth), true, true);
            } else if (i == 2) {
                animatedTextDrawable2.setText(LocaleController.getString(R.string.FlashIntensity), true, true);
            } else if (i == 3) {
                animatedTextDrawable2.setText(LocaleController.getString(R.string.WallpaperDimming), true, true);
            }
        }
        animatedTextDrawable.setText("", true, true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.XOR));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        canvas.save();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, this.w, this.h);
        Path path = this.clipPath;
        path.rewind();
        float f = this.r;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        canvas.clipPath(path);
        float f2 = this.valueIsAnimated ? this.valueAnimated.set(this.value, false) : this.value;
        canvas.saveLayerAlpha(0.0f, 0.0f, this.w, this.h, 255, 31);
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.text;
        int i = this.currentType;
        if (i == 0) {
            animatedTextDrawable.setBounds(AndroidUtilities.dp(42.0f), -AndroidUtilities.dp(1.0f), this.w, this.h - AndroidUtilities.dp(1.0f));
            animatedTextDrawable.draw(canvas);
        } else {
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = this.text2;
            animatedTextDrawable2.setBounds(AndroidUtilities.dp(12.33f), -AndroidUtilities.dp(1.0f), (this.w - ((int) animatedTextDrawable.getCurrentWidth())) - AndroidUtilities.dp(6.0f), this.h - AndroidUtilities.dp(1.0f));
            animatedTextDrawable2.draw(canvas);
            animatedTextDrawable.setBounds(this.w - AndroidUtilities.dp(111.0f), -AndroidUtilities.dp(1.0f), this.w - AndroidUtilities.dp(11.0f), this.h - AndroidUtilities.dp(1.0f));
            animatedTextDrawable.draw(canvas);
        }
        if (i == 0) {
            canvas.drawPath(this.speaker1Path, this.speaker1Paint);
            canvas.drawPath(this.speaker2Path, this.speaker2Paint);
            float f3 = this.maxVolume;
            float f4 = this.minVolume;
            float f5 = f3 - f4;
            double d = f5 != 0.0f ? (f5 * this.value) + f4 : 0.0f;
            float f6 = this.wave1Alpha.set(d > 0.25d);
            canvas.save();
            canvas.translate((1.0f - f6) * (-AndroidUtilities.dpf2(0.33f)), 0.0f);
            Paint paint = this.speakerWave1Paint;
            paint.setAlpha((int) (f6 * 255.0f));
            canvas.drawPath(this.speakerWave1Path, paint);
            canvas.restore();
            float f7 = this.wave2Alpha.set(d > 0.5d);
            canvas.save();
            canvas.translate((1.0f - f7) * (-AndroidUtilities.dpf2(0.66f)), 0.0f);
            Paint paint2 = this.speakerWave2Paint;
            paint2.setAlpha((int) (f7 * 255.0f));
            canvas.drawPath(this.speakerWave2Path, paint2);
            canvas.restore();
        }
        canvas.save();
        canvas.drawRect(0.0f, 0.0f, this.w * f2, this.h, this.whitePaint);
        canvas.restore();
        canvas.restore();
        canvas.restore();
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (this.w <= 0) {
            return false;
        }
        float x = motionEvent.getX();
        if (motionEvent.getAction() == 0) {
            this.pressTime = System.currentTimeMillis();
            this.valueIsAnimated = false;
        } else if (motionEvent.getAction() == 2 || motionEvent.getAction() == 1) {
            float f = this.maxVolume;
            float f2 = this.minVolume;
            float fM = f - f2 != 0.0f ? DiffUtil.m(f, f2, this.value, f2) : 0.0f;
            if (motionEvent.getAction() != 1 || System.currentTimeMillis() - this.pressTime >= ViewConfiguration.getTapTimeout()) {
                this.value = Utilities.clamp(((x - this.lastTouchX) / this.w) + this.value, 1.0f, 0.0f);
                this.valueIsAnimated = false;
                z = true;
            } else {
                this.valueAnimated.set(this.value, true);
                this.value = x / this.w;
                this.valueIsAnimated = true;
            }
            float f3 = this.maxVolume;
            float f4 = this.minVolume;
            float fM2 = f3 - f4 != 0.0f ? DiffUtil.m(f3, f4, this.value, f4) : 0.0f;
            if (z) {
                if ((fM2 <= f4 && fM > fM2) || (fM2 >= f3 && fM < fM2)) {
                    try {
                        performHapticFeedback(3, 1);
                    } catch (Exception unused) {
                    }
                } else if (Math.floor(fM * 5.0f) != Math.floor(5.0f * fM2)) {
                    AndroidUtilities.vibrateCursor(this);
                }
            }
            updateText(fM2);
            Utilities.Callback callback = this.onValueChange;
            if (callback != null) {
                callback.run(Float.valueOf(fM2));
            }
        }
        this.lastTouchX = x;
        return true;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        this.r = AndroidUtilities.dp(12.0f);
        TextPaint textPaint = this.textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        this.text.setTextSize(AndroidUtilities.dp(15.0f));
        int i3 = this.fixWidth;
        int i4 = this.currentType;
        if (i3 > 0) {
            this.w = i3;
            this.h = AndroidUtilities.dp(48.0f);
        } else if (i4 == 0) {
            this.w = (int) Math.min(textPaint.measureText(LocaleController.getString(R.string.StoryAudioRemove)) + AndroidUtilities.dp(88.0f), View.MeasureSpec.getSize(i));
            this.h = AndroidUtilities.dp(48.0f);
        } else {
            this.w = AndroidUtilities.dp(190.0f);
            this.h = AndroidUtilities.dp(44.0f);
        }
        setMeasuredDimension(this.w, this.h);
        if (i4 == 0) {
            float fDp = AndroidUtilities.dp(25.0f);
            float f = this.h / 2.0f;
            this.speaker1Paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dpf2(1.33f)));
            Path path = this.speaker1Path;
            path.rewind();
            path.moveTo(fDp - AndroidUtilities.dpf2(8.66f), f - AndroidUtilities.dpf2(2.9f));
            path.lineTo(fDp - AndroidUtilities.dpf2(3.0f), f - AndroidUtilities.dpf2(2.9f));
            path.lineTo(fDp - AndroidUtilities.dpf2(3.0f), AndroidUtilities.dpf2(2.9f) + f);
            path.lineTo(fDp - AndroidUtilities.dpf2(8.66f), AndroidUtilities.dpf2(2.9f) + f);
            path.close();
            this.speaker2Paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dpf2(2.66f)));
            Path path2 = this.speaker2Path;
            path2.rewind();
            path2.moveTo(fDp - AndroidUtilities.dpf2(7.5f), f);
            path2.lineTo(fDp, f - AndroidUtilities.dpf2(7.33f));
            path2.lineTo(fDp, AndroidUtilities.dpf2(7.33f) + f);
            path2.close();
            Path path3 = this.speakerWave1Path;
            path3.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((fDp - AndroidUtilities.dpf2(0.33f)) - AndroidUtilities.dp(4.33f), f - AndroidUtilities.dp(4.33f), (fDp - AndroidUtilities.dpf2(0.33f)) + AndroidUtilities.dp(4.33f), AndroidUtilities.dp(4.33f) + f);
            path3.arcTo(rectF, -60.0f, 120.0f);
            path3.close();
            Paint paint = this.speakerWave2Paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            Path path4 = this.speakerWave2Path;
            path4.rewind();
            rectF.set((fDp - AndroidUtilities.dpf2(0.33f)) - AndroidUtilities.dp(8.0f), f - AndroidUtilities.dp(8.0f), (fDp - AndroidUtilities.dpf2(0.33f)) + AndroidUtilities.dp(8.0f), f + AndroidUtilities.dp(8.0f));
            path4.arcTo(rectF, -70.0f, 140.0f);
        }
    }

    public final void setMinMax() {
        this.minVolume = 0.0f;
        this.maxVolume = 0.9f;
    }

    public final void setOnValueChange(Utilities.Callback callback) {
        this.onValueChange = callback;
    }

    public final void setValue(float f) {
        float f2 = this.minVolume;
        float f3 = (f - f2) / (this.maxVolume - f2);
        this.value = f3;
        this.valueAnimated.set(f3, true);
        updateText(f);
    }

    public final void updateText(float f) {
        String str = Math.round(100.0f * f) + "%";
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.text;
        if (!TextUtils.equals(animatedTextDrawable.currentText, str)) {
            animatedTextDrawable.cancelAnimation();
            long j = this.valueIsAnimated ? 320L : 40L;
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            animatedTextDrawable.moveAmplitude = 0.3f;
            animatedTextDrawable.animateDuration = j;
            animatedTextDrawable.animateWave = 1.0f;
            animatedTextDrawable.animateInterpolator = cubicBezierInterpolator;
            animatedTextDrawable.setText(str, true, true);
        }
        if (this.currentType == 1) {
            this.whitePaint.setColor(FlashViews.getColor(f));
        }
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.text || drawable == this.text2 || super.verifyDrawable(drawable);
    }
}
