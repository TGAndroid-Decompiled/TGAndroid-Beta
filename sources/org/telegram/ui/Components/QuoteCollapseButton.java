package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0;

public class QuoteCollapseButton {
    private final Paint backgroundPaint = new Paint(1);
    private final ButtonBounce bounce;
    private final QuoteSpan.ExpandDrawable drawable;
    private boolean pressed;
    private final AnimatedFloat scale;
    private final AnimatedTextView.AnimatedTextDrawable text;
    private boolean textCollapsed;
    private final int textWidth;

    public QuoteCollapseButton(View view) {
        this.scale = new AnimatedFloat(view, 350L, CubicBezierInterpolator.EASE_OUT_QUINT);
        this.drawable = new QuoteSpan.ExpandDrawable(view);
        this.bounce = new ButtonBounce(view);
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable();
        this.text = animatedTextDrawable;
        animatedTextDrawable.setTextSize(AndroidUtilities.dp(11.0f));
        animatedTextDrawable.setHacks(true, true, true);
        animatedTextDrawable.setCallback(view);
        animatedTextDrawable.setOverrideFullWidth((int) (AndroidUtilities.displaySize.x * 0.3f));
        this.textCollapsed = false;
        int i = R.string.QuoteCollapse;
        animatedTextDrawable.setText(LocaleController.getString(i), false);
        this.textWidth = (int) Math.ceil(Math.max(animatedTextDrawable.getPaint().measureText(LocaleController.getString(R.string.QuoteExpand)), animatedTextDrawable.getPaint().measureText(LocaleController.getString(i))));
    }

    public float draw(Canvas canvas, RectF rectF, float f, float f2, int i, boolean z, boolean z2) {
        if (z != this.textCollapsed) {
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.text;
            this.textCollapsed = z;
            animatedTextDrawable.setText(LocaleController.getString(z ? R.string.QuoteExpand : R.string.QuoteCollapse), true);
        }
        int currentWidth = (int) (this.text.getCurrentWidth() + AndroidUtilities.dp(23.66f));
        float fDp = AndroidUtilities.dp(17.66f);
        rectF.set(f - currentWidth, f2 - fDp, f, f2);
        float scale = this.bounce.getScale(0.02f) * this.scale.set(z2);
        if (scale > 0.0f) {
            this.backgroundPaint.setColor(ColorUtils.setAlphaComponent(i, 30));
            canvas.save();
            canvas.scale(scale, scale, f, f2);
            float f3 = fDp / 2.0f;
            canvas.drawRoundRect(rectF, f3, f3, this.backgroundPaint);
            this.text.setBounds((int) (rectF.left + AndroidUtilities.dp(6.0f)), (int) rectF.top, (int) (rectF.right - AndroidUtilities.dp(17.66f)), (int) rectF.bottom);
            this.text.setTextColor(i);
            this.text.draw(canvas);
            int iDp = AndroidUtilities.dp(14.0f);
            QuoteSpan.ExpandDrawable expandDrawable = this.drawable;
            float f4 = iDp;
            int iDp2 = (int) ((rectF.right - AndroidUtilities.dp(3.33f)) - f4);
            float f5 = f4 / 2.0f;
            expandDrawable.setBounds(iDp2, (int) ((rectF.centerY() - f5) + AndroidUtilities.dp(0.33f)), (int) (rectF.right - AndroidUtilities.dp(3.33f)), (int) (rectF.centerY() + f5 + AndroidUtilities.dp(0.33f)));
            this.drawable.setColor(i);
            this.drawable.setState(!z);
            this.drawable.draw(canvas);
            canvas.restore();
        }
        return scale;
    }

    public int height() {
        return AndroidUtilities.dp(17.66f);
    }

    public boolean isPressed() {
        return this.pressed;
    }

    public void setPressed(boolean z) {
        this.pressed = z;
        this.bounce.setPressed(z);
    }

    public boolean verifyDrawable(Drawable drawable) {
        return drawable == this.text || drawable == this.drawable;
    }

    public int width() {
        return RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0.m(3.333f, 2, AndroidUtilities.dp(23.66f) + this.textWidth);
    }
}
