package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class QuoteCollapseButton {
    public final Paint backgroundPaint = new Paint(1);
    public final ButtonBounce bounce;
    public final QuoteSpan.ExpandDrawable drawable;
    public boolean pressed;
    public final AnimatedFloat scale;
    public final AnimatedTextView.AnimatedTextDrawable text;
    public boolean textCollapsed;
    public final int textWidth;

    public QuoteCollapseButton(View view) {
        this.scale = new AnimatedFloat(350L, view, CubicBezierInterpolator.EASE_OUT_QUINT);
        this.drawable = new QuoteSpan.ExpandDrawable(view);
        this.bounce = new ButtonBounce(view, 1.0f, 5.0f);
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(false, false, false, false);
        this.text = animatedTextDrawable;
        animatedTextDrawable.setTextSize(AndroidUtilities.dp(11.0f));
        animatedTextDrawable.setHacks(true, true);
        animatedTextDrawable.setCallback(view);
        animatedTextDrawable.overrideFullWidth = (int) (AndroidUtilities.displaySize.x * 0.3f);
        this.textCollapsed = false;
        int i = R.string.QuoteCollapse;
        animatedTextDrawable.setText(LocaleController.getString(i), false, true);
        TextPaint textPaint = animatedTextDrawable.textPaint;
        this.textWidth = (int) Math.ceil(Math.max(textPaint.measureText(LocaleController.getString(R.string.QuoteExpand)), textPaint.measureText(LocaleController.getString(i))));
    }

    public final void draw(Canvas canvas, RectF rectF, float f, float f2, int i, boolean z, boolean z2) {
        boolean z3 = this.textCollapsed;
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.text;
        if (z != z3) {
            this.textCollapsed = z;
            animatedTextDrawable.setText(LocaleController.getString(z ? R.string.QuoteExpand : R.string.QuoteCollapse), true, true);
        }
        int currentWidth = (int) (animatedTextDrawable.getCurrentWidth() + AndroidUtilities.dp(23.66f));
        float fDp = AndroidUtilities.dp(17.66f);
        rectF.set(f - currentWidth, f2 - fDp, f, f2);
        float scale = this.bounce.getScale(0.02f) * this.scale.set(z2);
        if (scale > 0.0f) {
            Paint paint = this.backgroundPaint;
            paint.setColor(ColorUtils.setAlphaComponent(i, 30));
            canvas.save();
            canvas.scale(scale, scale, f, f2);
            float f3 = fDp / 2.0f;
            canvas.drawRoundRect(rectF, f3, f3, paint);
            animatedTextDrawable.setBounds((int) (rectF.left + AndroidUtilities.dp(6.0f)), (int) rectF.top, (int) (rectF.right - AndroidUtilities.dp(17.66f)), (int) rectF.bottom);
            animatedTextDrawable.textPaint.setColor(i);
            animatedTextDrawable.alpha = Color.alpha(i);
            animatedTextDrawable.draw(canvas);
            float fDp2 = AndroidUtilities.dp(14.0f);
            int iDp = (int) ((rectF.right - AndroidUtilities.dp(3.33f)) - fDp2);
            float f4 = fDp2 / 2.0f;
            int iCenterY = (int) ((rectF.centerY() - f4) + AndroidUtilities.dp(0.33f));
            int iDp2 = (int) (rectF.right - AndroidUtilities.dp(3.33f));
            int iCenterY2 = (int) (rectF.centerY() + f4 + AndroidUtilities.dp(0.33f));
            QuoteSpan.ExpandDrawable expandDrawable = this.drawable;
            expandDrawable.setBounds(iDp, iCenterY, iDp2, iCenterY2);
            Paint paint2 = expandDrawable.paint;
            paint2.setColor(i);
            paint2.setAlpha(expandDrawable.alpha);
            boolean z4 = !z;
            if (expandDrawable.state != z4) {
                expandDrawable.state = z4;
                expandDrawable.view.invalidate();
            }
            expandDrawable.draw(canvas);
            canvas.restore();
        }
    }
}
