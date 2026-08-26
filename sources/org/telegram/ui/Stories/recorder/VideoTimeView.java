package org.telegram.ui.Stories.recorder;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.CubicBezierInterpolator;

public final class VideoTimeView extends View {
    public final Paint backgroundPaint;
    public boolean shown;
    public final AnimatedTextView.AnimatedTextDrawable textDrawable;

    public VideoTimeView(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.backgroundPaint = paint;
        this.shown = true;
        paint.setColor(Integer.MIN_VALUE);
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(false, true, true, false);
        this.textDrawable = animatedTextDrawable;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        animatedTextDrawable.moveAmplitude = 0.2f;
        animatedTextDrawable.animateDuration = 200L;
        animatedTextDrawable.animateWave = 1.0f;
        animatedTextDrawable.animateInterpolator = cubicBezierInterpolator;
        animatedTextDrawable.setTextSize(AndroidUtilities.dp(13.0f));
        TextPaint textPaint = animatedTextDrawable.textPaint;
        textPaint.setColor(-1);
        animatedTextDrawable.alpha = Color.alpha(-1);
        textPaint.setTypeface(AndroidUtilities.bold());
        animatedTextDrawable.setCallback(this);
        animatedTextDrawable.gravity = 1;
        StringBuilder sb = new StringBuilder(8);
        sb.append("00:00:00");
        if (TextUtils.equals(sb, animatedTextDrawable.currentText)) {
            return;
        }
        animatedTextDrawable.cancelAnimation();
        animatedTextDrawable.setText(sb, false, true);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.textDrawable;
        float currentWidth = animatedTextDrawable.getCurrentWidth();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(((getWidth() - currentWidth) / 2.0f) - AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f), ((getWidth() + currentWidth) / 2.0f) + AndroidUtilities.dp(6.0f), AndroidUtilities.dp(23.0f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), this.backgroundPaint);
        animatedTextDrawable.setBounds((int) rectF.left, ((int) rectF.top) - AndroidUtilities.dp(1.0f), (int) rectF.right, (int) rectF.bottom);
        animatedTextDrawable.draw(canvas);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(25.0f), 1073741824));
    }

    public final void show(boolean z) {
        if (this.shown || !z) {
            this.shown = false;
            animate().cancel();
            if (z) {
                OKLCH.m(animate().translationY(AndroidUtilities.dp(6.0f)).alpha(0.0f).scaleX(0.8f).scaleY(0.8f), CubicBezierInterpolator.EASE_OUT_QUINT, 220L);
                return;
            }
            setTranslationY(AndroidUtilities.dp(6.0f));
            setScaleX(0.8f);
            setScaleY(0.8f);
            setAlpha(0.0f);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return this.textDrawable == drawable || super.verifyDrawable(drawable);
    }
}
