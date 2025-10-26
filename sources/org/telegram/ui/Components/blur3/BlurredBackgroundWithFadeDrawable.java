package org.telegram.ui.Components.blur3;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;

public class BlurredBackgroundWithFadeDrawable extends Drawable {
    private final Drawable drawable;
    private final Paint maskFadeGradientPaint;

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
        this.drawable = blurredBackgroundDrawable;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(36.0f), new int[]{0, 1610612736, -1342177280, -469762048, -16777216}, (float[]) null, Shader.TileMode.CLAMP));
    }

    @Override
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.drawable.setBounds(rect);
    }

    @Override
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int min = Math.min(AndroidUtilities.dp(36.0f), bounds.height());
        int height = bounds.height() - min;
        if (min > 0) {
            int saveLayer = canvas.saveLayer(bounds.left, bounds.top, bounds.right, r3 + min, null);
            this.drawable.draw(canvas);
            canvas.translate(bounds.left, bounds.top);
            canvas.drawRect(0.0f, 0.0f, bounds.width(), min, this.maskFadeGradientPaint);
            canvas.restoreToCount(saveLayer);
            if (height > 0) {
                canvas.save();
                canvas.clipRect(bounds.left, bounds.top + min, bounds.right, bounds.bottom);
                this.drawable.draw(canvas);
                canvas.restore();
            }
        }
    }
}
