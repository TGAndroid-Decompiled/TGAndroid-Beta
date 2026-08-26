package org.telegram.ui.Components.Premium.boosts;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.ScrimOptions$$ExternalSyntheticLambda2;

public final class BoostCounterView extends View {
    public final Paint bgPaint;
    public ValueAnimator countAnimator;
    public float countScale;
    public final AnimatedTextView.AnimatedTextDrawable countText;
    public int lastCount;

    public BoostCounterView(Context context) {
        super(context);
        this.countScale = 1.0f;
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(false, false, true, false);
        this.countText = animatedTextDrawable;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        animatedTextDrawable.moveAmplitude = 0.3f;
        animatedTextDrawable.animateDuration = 250L;
        animatedTextDrawable.animateWave = 1.0f;
        animatedTextDrawable.animateInterpolator = cubicBezierInterpolator;
        animatedTextDrawable.setCallback(this);
        animatedTextDrawable.setTextSize(AndroidUtilities.dp(11.5f));
        Typeface typefaceBold = AndroidUtilities.bold();
        TextPaint textPaint = animatedTextDrawable.textPaint;
        textPaint.setTypeface(typefaceBold);
        textPaint.setColor(-1);
        animatedTextDrawable.alpha = Color.alpha(-1);
        animatedTextDrawable.setText("", true, true);
        animatedTextDrawable.gravity = 17;
        Paint paint = new Paint(1);
        this.bgPaint = paint;
        paint.setColor(-6915073);
        setVisibility(8);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        Rect rect = AndroidUtilities.rectTmp2;
        int iDp = AndroidUtilities.dp(8.0f);
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.countText;
        rect.set(0, 0, iDp + ((int) animatedTextDrawable.getCurrentWidth()), AndroidUtilities.dp(20.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(rect);
        if (this.countScale != 1.0f) {
            canvas.save();
            float f = this.countScale;
            canvas.scale(f, f, rect.centerX(), rect.centerY());
        }
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), this.bgPaint);
        rect.set(0, 0, (int) rectF.width(), AndroidUtilities.dp(19.0f));
        animatedTextDrawable.setBounds(rect);
        animatedTextDrawable.draw(canvas);
        if (this.countScale != 1.0f) {
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        float fDp = AndroidUtilities.dp(15.0f);
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.countText;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (Math.max(animatedTextDrawable.currentWidth, animatedTextDrawable.oldWidth) + fDp), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(26.0f), 1073741824));
    }

    public final void setCount(int i, boolean z) {
        if (!BoostRepository.isMultiBoostsAvailable()) {
            i = 0;
        }
        if (i > 0) {
            setVisibility(0);
        }
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.countText;
        if (z) {
            animatedTextDrawable.cancelAnimation();
        }
        if (z && i != this.lastCount && i > 0) {
            ValueAnimator valueAnimator = this.countAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.countAnimator = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.countAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ScrimOptions$$ExternalSyntheticLambda2(this, 1));
            this.countAnimator.addListener(new ItemOptions.AnonymousClass3(this, 20));
            this.countAnimator.setInterpolator(new OvershootInterpolator(2.0f));
            this.countAnimator.setDuration(200L);
            this.countAnimator.start();
        }
        this.lastCount = i;
        int length = animatedTextDrawable.currentText.length();
        animatedTextDrawable.setText("x" + i, z, true);
        int length2 = animatedTextDrawable.currentText.length();
        invalidate();
        if (length != length2) {
            requestLayout();
        }
    }
}
