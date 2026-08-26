package org.telegram.ui.Stories.recorder;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
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
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(false, true, true);
        this.textDrawable = animatedTextDrawable;
        animatedTextDrawable.setAnimationProperties(0.2f, 0L, 200L, CubicBezierInterpolator.EASE_OUT_QUINT);
        animatedTextDrawable.setTextSize(AndroidUtilities.dp(13.0f));
        animatedTextDrawable.setTextColor(-1);
        animatedTextDrawable.setTypeface(AndroidUtilities.bold());
        animatedTextDrawable.setCallback(this);
        animatedTextDrawable.setGravity(1);
        StringBuilder sb = new StringBuilder(8);
        sb.append("00:00:00");
        if (TextUtils.equals(sb, animatedTextDrawable.getText())) {
            return;
        }
        animatedTextDrawable.cancelAnimation();
        animatedTextDrawable.setText(sb, false);
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
