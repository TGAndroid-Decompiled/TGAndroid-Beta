package org.telegram.ui.Stories.recorder;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.CubicBezierInterpolator;
public class VolumeSliderView extends View {
    private final Path clipPath;
    private int h;
    private float lastTouchX;
    private float maxVolume;
    private float minVolume;
    private Utilities.Callback<Float> onValueChange;
    private long pressTime;
    private float r;
    private final Paint speaker1Paint;
    private final Path speaker1Path;
    private final Paint speaker2Paint;
    private final Path speaker2Path;
    private final Paint speakerWave1Paint;
    private final Path speakerWave1Path;
    private final Paint speakerWave2Paint;
    private final Path speakerWave2Path;
    private final AnimatedTextView.AnimatedTextDrawable text;
    private final TextPaint textPaint;
    private float value;
    private AnimatedFloat valueAnimated;
    private boolean valueIsAnimated;
    private int w;
    private final AnimatedFloat wave1Alpha;
    private final AnimatedFloat wave2Alpha;
    private final Paint whitePaint;

    public VolumeSliderView(Context context) {
        super(context);
        this.minVolume = 0.0f;
        this.maxVolume = 1.5f;
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
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(false, true, true);
        this.text = animatedTextDrawable;
        this.clipPath = new Path();
        this.speaker1Path = new Path();
        this.speaker2Path = new Path();
        this.speakerWave1Path = new Path();
        this.speakerWave2Path = new Path();
        this.wave1Alpha = new AnimatedFloat(this, 0L, 350L, cubicBezierInterpolator);
        this.wave2Alpha = new AnimatedFloat(this, 0L, 350L, cubicBezierInterpolator);
        this.textPaint = new TextPaint(1);
        animatedTextDrawable.setTextSize(AndroidUtilities.dp(15.0f));
        animatedTextDrawable.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        animatedTextDrawable.setAnimationProperties(0.3f, 0L, 40L, cubicBezierInterpolator);
        animatedTextDrawable.setCallback(this);
        animatedTextDrawable.setTextColor(-1);
        animatedTextDrawable.setText("");
        paint2.setColor(-1);
        paint3.setColor(-1);
        paint4.setColor(-1);
        paint5.setColor(-1);
        paint5.setStyle(Paint.Style.STROKE);
        paint5.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.XOR));
    }

    public VolumeSliderView setVolume(float f) {
        float f2 = this.minVolume;
        this.value = (f - f2) / (this.maxVolume - f2);
        updateText(f);
        return this;
    }

    public VolumeSliderView setOnValueChange(Utilities.Callback<Float> callback) {
        this.onValueChange = callback;
        return this;
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        canvas.save();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, this.w, this.h);
        this.clipPath.rewind();
        Path path = this.clipPath;
        float f = this.r;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        canvas.clipPath(this.clipPath);
        float f2 = this.valueIsAnimated ? this.valueAnimated.set(this.value) : this.value;
        canvas.saveLayerAlpha(0.0f, 0.0f, this.w, this.h, 255, 31);
        this.text.setBounds(AndroidUtilities.dp(42.0f), -AndroidUtilities.dp(1.0f), this.w, this.h - AndroidUtilities.dp(1.0f));
        this.text.draw(canvas);
        canvas.drawPath(this.speaker1Path, this.speaker1Paint);
        canvas.drawPath(this.speaker2Path, this.speaker2Paint);
        float f3 = this.maxVolume;
        float f4 = this.minVolume;
        double d = f3 - f4 != 0.0f ? f4 + (this.value * (f3 - f4)) : 0.0f;
        float f5 = this.wave1Alpha.set(d > 0.25d);
        canvas.save();
        canvas.translate((-AndroidUtilities.dpf2(0.33f)) * (1.0f - f5), 0.0f);
        this.speakerWave1Paint.setAlpha((int) (f5 * 255.0f));
        canvas.drawPath(this.speakerWave1Path, this.speakerWave1Paint);
        canvas.restore();
        float f6 = this.wave2Alpha.set(d > 0.5d);
        canvas.save();
        canvas.translate((-AndroidUtilities.dpf2(0.66f)) * (1.0f - f6), 0.0f);
        this.speakerWave2Paint.setAlpha((int) (f6 * 255.0f));
        canvas.drawPath(this.speakerWave2Path, this.speakerWave2Paint);
        canvas.restore();
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
            float f3 = f - f2 != 0.0f ? f2 + (this.value * (f - f2)) : 0.0f;
            if (motionEvent.getAction() == 1 && System.currentTimeMillis() - this.pressTime < ViewConfiguration.getTapTimeout()) {
                this.valueAnimated.set(this.value, true);
                this.value = x / this.w;
                this.valueIsAnimated = true;
            } else {
                this.value = Utilities.clamp(this.value + ((x - this.lastTouchX) / this.w), 1.0f, 0.0f);
                this.valueIsAnimated = false;
                z = true;
            }
            float f4 = this.maxVolume;
            float f5 = this.minVolume;
            float f6 = f4 - f5 != 0.0f ? f5 + (this.value * (f4 - f5)) : 0.0f;
            if (z) {
                try {
                    if ((f6 <= f5 && f3 > f6) || (f6 >= f4 && f3 < f6)) {
                        performHapticFeedback(3, 1);
                    } else if (Math.floor(f3 * 5.0f) != Math.floor(5.0f * f6)) {
                        performHapticFeedback(9, 1);
                    }
                } catch (Exception unused) {
                }
            }
            updateText(f6);
            Utilities.Callback<Float> callback = this.onValueChange;
            if (callback != null) {
                callback.run(Float.valueOf(f6));
            }
            invalidate();
        }
        this.lastTouchX = x;
        return true;
    }

    private void updateText(float f) {
        String str = Math.round(f * 100.0f) + "%";
        if (TextUtils.equals(this.text.getText(), str)) {
            return;
        }
        this.text.cancelAnimation();
        this.text.setAnimationProperties(0.3f, 0L, this.valueIsAnimated ? 320L : 40L, CubicBezierInterpolator.EASE_OUT_QUINT);
        this.text.setText(str);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        this.r = AndroidUtilities.dpf2(6.33f);
        this.textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        this.text.setTextSize(AndroidUtilities.dp(15.0f));
        this.w = (int) Math.min(this.textPaint.measureText(LocaleController.getString(R.string.StoryAudioRemove)) + AndroidUtilities.dp(88.0f), View.MeasureSpec.getSize(i));
        int dp = AndroidUtilities.dp(48.0f);
        this.h = dp;
        setMeasuredDimension(this.w, dp);
        float dp2 = AndroidUtilities.dp(25.0f);
        float f = this.h / 2.0f;
        this.speaker1Paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dpf2(1.33f)));
        this.speaker1Path.rewind();
        this.speaker1Path.moveTo(dp2 - AndroidUtilities.dpf2(8.66f), f - AndroidUtilities.dpf2(2.9f));
        this.speaker1Path.lineTo(dp2 - AndroidUtilities.dpf2(3.0f), f - AndroidUtilities.dpf2(2.9f));
        this.speaker1Path.lineTo(dp2 - AndroidUtilities.dpf2(3.0f), AndroidUtilities.dpf2(2.9f) + f);
        this.speaker1Path.lineTo(dp2 - AndroidUtilities.dpf2(8.66f), AndroidUtilities.dpf2(2.9f) + f);
        this.speaker1Path.close();
        this.speaker2Paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dpf2(2.66f)));
        this.speaker2Path.rewind();
        this.speaker2Path.moveTo(dp2 - AndroidUtilities.dpf2(7.5f), f);
        this.speaker2Path.lineTo(dp2, f - AndroidUtilities.dpf2(7.33f));
        this.speaker2Path.lineTo(dp2, AndroidUtilities.dpf2(7.33f) + f);
        this.speaker2Path.close();
        this.speakerWave1Path.rewind();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((dp2 - AndroidUtilities.dpf2(0.33f)) - AndroidUtilities.dp(4.33f), f - AndroidUtilities.dp(4.33f), (dp2 - AndroidUtilities.dpf2(0.33f)) + AndroidUtilities.dp(4.33f), AndroidUtilities.dp(4.33f) + f);
        this.speakerWave1Path.arcTo(rectF, -60.0f, 120.0f);
        this.speakerWave1Path.close();
        this.speakerWave2Paint.setStyle(Paint.Style.STROKE);
        this.speakerWave2Paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        this.speakerWave2Path.rewind();
        rectF.set((dp2 - AndroidUtilities.dpf2(0.33f)) - AndroidUtilities.dp(8.0f), f - AndroidUtilities.dp(8.0f), (dp2 - AndroidUtilities.dpf2(0.33f)) + AndroidUtilities.dp(8.0f), f + AndroidUtilities.dp(8.0f));
        this.speakerWave2Path.arcTo(rectF, -70.0f, 140.0f);
    }

    @Override
    protected boolean verifyDrawable(Drawable drawable) {
        return drawable == this.text || super.verifyDrawable(drawable);
    }
}
