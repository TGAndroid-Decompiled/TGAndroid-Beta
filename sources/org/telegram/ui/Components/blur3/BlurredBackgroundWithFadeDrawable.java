package org.telegram.ui.Components.blur3;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSource;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceColor;

public class BlurredBackgroundWithFadeDrawable extends Drawable {
    private int colorStaticLast;
    private final Paint colorStaticPaint;
    private final BlurredBackgroundDrawable drawable;
    private int fadeHeight;
    private final Paint maskFadeGradientPaint;
    private boolean opacity;

    @Override
    public int getOpacity() {
        return 0;
    }

    @Override
    public void setAlpha(int i) {
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public BlurredBackgroundWithFadeDrawable(BlurredBackgroundDrawable blurredBackgroundDrawable) {
        Paint paint = new Paint(1);
        this.maskFadeGradientPaint = paint;
        this.colorStaticPaint = new Paint(1);
        this.drawable = blurredBackgroundDrawable;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        setFadeHeight(AndroidUtilities.dp(40.0f), false);
    }

    public void setFadeHeight(int i, boolean z) {
        this.fadeHeight = i;
        this.opacity = z;
        this.maskFadeGradientPaint.setShader(createGradient(-16777216, i, z));
        this.colorStaticPaint.setShader(null);
    }

    @Override
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.drawable.setBounds(rect);
    }

    @Override
    public void draw(Canvas canvas) {
        if (getBounds().isEmpty()) {
            return;
        }
        BlurredBackgroundSource unwrappedSource = this.drawable.getUnwrappedSource();
        if (unwrappedSource instanceof BlurredBackgroundSourceColor) {
            int color = ((BlurredBackgroundSourceColor) unwrappedSource).getColor();
            if (this.colorStaticLast != color || this.colorStaticPaint.getShader() == null) {
                this.colorStaticLast = color;
                this.colorStaticPaint.setShader(createGradient(color, this.fadeHeight, this.opacity));
            }
            canvas.save();
            canvas.translate(r0.left, r0.top);
            canvas.drawRect(0.0f, 0.0f, r0.width(), r0.height(), this.colorStaticPaint);
            canvas.restore();
            return;
        }
        this.colorStaticPaint.setShader(null);
        int iSaveLayer = canvas.saveLayer(r0.left, r0.top, r0.right, r0.bottom, null);
        this.drawable.draw(canvas);
        canvas.translate(r0.left, r0.top);
        canvas.drawRect(0.0f, 0.0f, r0.width(), r0.height(), this.maskFadeGradientPaint);
        canvas.restoreToCount(iSaveLayer);
    }

    private static LinearGradient createGradient(int i, int i2, boolean z) {
        int iAlpha = Color.alpha(i);
        if (z) {
            return new LinearGradient(0.0f, 0.0f, 0.0f, i2, new int[]{ColorUtils.setAlphaComponent(i, 0), ColorUtils.setAlphaComponent(i, (iAlpha * 96) / 255), ColorUtils.setAlphaComponent(i, (iAlpha * 176) / 255), ColorUtils.setAlphaComponent(i, (iAlpha * 232) / 255)}, (float[]) null, Shader.TileMode.CLAMP);
        }
        return new LinearGradient(0.0f, 0.0f, 0.0f, i2, new int[]{ColorUtils.setAlphaComponent(i, 0), ColorUtils.setAlphaComponent(i, (iAlpha * 96) / 255), ColorUtils.setAlphaComponent(i, (iAlpha * 176) / 255), ColorUtils.setAlphaComponent(i, (iAlpha * 232) / 255), ColorUtils.setAlphaComponent(i, (iAlpha * 255) / 255)}, (float[]) null, Shader.TileMode.CLAMP);
    }
}
