package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Premium.PremiumGradient;

public class AvatarsImageView extends View {
    public final AvatarsDrawable avatarsDrawable;
    public Paint plusBgPaint;
    public Text plusText;
    public PremiumGradient.PremiumGradientTools premiumGradient;

    public AvatarsImageView(Context context, boolean z) {
        super(context);
        this.avatarsDrawable = new AvatarsDrawable(this, z);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.avatarsDrawable.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.avatarsDrawable.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.avatarsDrawable.onDraw(canvas);
        if (this.plusText != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(getWidth() - AndroidUtilities.dp(22.0f), getHeight() - AndroidUtilities.dp(22.0f), getWidth() - AndroidUtilities.dp(0.0f), getHeight() - AndroidUtilities.dp(0.0f));
            PremiumGradient.PremiumGradientTools premiumGradientTools = this.premiumGradient;
            premiumGradientTools.getClass();
            premiumGradientTools.gradientMatrix((int) rectF.left, 0.0f, (int) rectF.top, (int) rectF.right, 0.0f, (int) rectF.bottom);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), (rectF.width() / 2.0f) + AndroidUtilities.dp(1.33f), this.plusBgPaint);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.premiumGradient.paint);
            this.plusText.draw(rectF.centerX() - (this.plusText.width / 2.0f), rectF.centerY(), 1.0f, -1, canvas);
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        AvatarsDrawable avatarsDrawable = this.avatarsDrawable;
        avatarsDrawable.width = measuredWidth;
        avatarsDrawable.height = getMeasuredHeight();
    }

    public void setAvatarsTextSize(int i) {
        this.avatarsDrawable.setAvatarsTextSize(i);
    }

    public void setCentered(boolean z) {
        this.avatarsDrawable.centered = z;
    }

    public void setCount(int i) {
        this.avatarsDrawable.setCount(i);
    }

    public void setDelegate(Runnable runnable) {
        this.avatarsDrawable.updateDelegate = runnable;
    }

    public void setSize(int i) {
        this.avatarsDrawable.overrideSize = i;
    }

    public void setStepFactor(float f) {
        this.avatarsDrawable.overrideSizeStepFactor = f;
    }

    public void setStyle(int i) {
        AvatarsDrawable avatarsDrawable = this.avatarsDrawable;
        avatarsDrawable.currentStyle = i;
        View view = avatarsDrawable.parent;
        if (view != null) {
            view.invalidate();
        }
    }
}
