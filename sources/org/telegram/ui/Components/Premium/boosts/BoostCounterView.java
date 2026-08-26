package org.telegram.ui.Components.Premium.boosts;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.google.android.gms.internal.mlkit_vision_common.zzkk;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.BotButton$$ExternalSyntheticLambda0;
import org.telegram.ui.Charts.BaseChartView;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.CubicBezierInterpolator;

public final class BoostCounterView extends View {
    public final Paint bgPaint;
    public ValueAnimator countAnimator;
    public float countScale;
    public final AnimatedTextView.AnimatedTextDrawable countText;
    public int lastCount;

    public BoostCounterView(Context context) {
        super(context);
        this.countScale = 1.0f;
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(false, false, true);
        this.countText = animatedTextDrawable;
        animatedTextDrawable.setAnimationProperties(0.3f, 0L, 250L, CubicBezierInterpolator.EASE_OUT_QUINT);
        animatedTextDrawable.setCallback(this);
        animatedTextDrawable.setTextSize(AndroidUtilities.dp(11.5f));
        animatedTextDrawable.setTypeface(AndroidUtilities.bold());
        animatedTextDrawable.setTextColor(-1);
        animatedTextDrawable.setText("");
        animatedTextDrawable.setGravity(17);
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (this.countText.getWidth() + AndroidUtilities.dp(15.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(26.0f), 1073741824));
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
            valueAnimatorOfFloat.addUpdateListener(new BotButton$$ExternalSyntheticLambda0(this, 17));
            this.countAnimator.addListener(new BaseChartView.AnonymousClass4(this, 10));
            zzkk.m(2.0f, this.countAnimator);
            this.countAnimator.setDuration(200L);
            this.countAnimator.start();
        }
        this.lastCount = i;
        int length = animatedTextDrawable.getText().length();
        animatedTextDrawable.setText("x" + i, z);
        int length2 = animatedTextDrawable.getText().length();
        invalidate();
        if (length != length2) {
            requestLayout();
        }
    }
}
