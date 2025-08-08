package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.Premium.PremiumGradient;

public class AvatarsImageView extends View {
    public final AvatarsDrawable avatarsDrawable;
    private Paint plusBgPaint;
    private Text plusText;
    private PremiumGradient.PremiumGradientTools premiumGradient;

    public AvatarsImageView(Context context, boolean z) {
        super(context);
        this.avatarsDrawable = new AvatarsDrawable(this, z);
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.avatarsDrawable.width = getMeasuredWidth();
        this.avatarsDrawable.height = getMeasuredHeight();
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.avatarsDrawable.onAttachedToWindow();
    }

    public void setPlus(int i, int i2) {
        this.premiumGradient = new PremiumGradient.PremiumGradientTools(Theme.key_premiumGradient1, Theme.key_premiumGradient2, -1, -1, -1, null);
        this.plusText = new Text("+" + i, 12.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
        Paint paint = new Paint(1);
        this.plusBgPaint = paint;
        paint.setColor(i2);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.avatarsDrawable.onDraw(canvas);
        if (this.plusText != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(getWidth() - AndroidUtilities.dp(22.0f), getHeight() - AndroidUtilities.dp(22.0f), getWidth() - AndroidUtilities.dp(0.0f), getHeight() - AndroidUtilities.dp(0.0f));
            this.premiumGradient.gradientMatrix(rectF);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), (rectF.width() / 2.0f) + AndroidUtilities.dp(1.33f), this.plusBgPaint);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.premiumGradient.paint);
            this.plusText.draw(canvas, rectF.centerX() - (this.plusText.getCurrentWidth() / 2.0f), rectF.centerY(), -1, 1.0f);
        }
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.avatarsDrawable.onDetachedFromWindow();
    }

    public void setStyle(int i) {
        this.avatarsDrawable.setStyle(i);
    }

    public void setDelegate(Runnable runnable) {
        this.avatarsDrawable.setDelegate(runnable);
    }

    public void setObject(int i, int i2, TLObject tLObject) {
        this.avatarsDrawable.setObject(i, i2, tLObject);
    }

    public void setAvatarsTextSize(int i) {
        this.avatarsDrawable.setAvatarsTextSize(i);
    }

    public void setSize(int i) {
        this.avatarsDrawable.setSize(i);
    }

    public void setStepFactor(float f) {
        this.avatarsDrawable.setStepFactor(f);
    }

    public void reset() {
        this.avatarsDrawable.reset();
    }

    public void setCount(int i) {
        this.avatarsDrawable.setCount(i);
    }

    public void commitTransition(boolean z) {
        this.avatarsDrawable.commitTransition(z);
    }

    public void updateAfterTransitionEnd() {
        this.avatarsDrawable.updateAfterTransitionEnd();
    }

    public void setCentered(boolean z) {
        this.avatarsDrawable.setCentered(z);
    }
}
