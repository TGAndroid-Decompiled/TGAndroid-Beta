package org.telegram.ui.Components.blur3;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
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
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceRenderNode;

public class BlurredBackgroundWithFadeDrawable extends Drawable {
    private final Matrix bitmapMatrix;
    private final Paint bitmapPaint;
    private int colorStaticLast;
    private final Paint colorStaticPaint;
    private final BlurredBackgroundDrawable drawable;
    private int fadeHeight;
    private final Paint maskFadeGradientPaint;
    private final Matrix matrix;
    private boolean opacity;
    private Shader shader;

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
        this.matrix = new Matrix();
        this.bitmapMatrix = new Matrix();
        this.bitmapPaint = new Paint(1);
        this.colorStaticPaint = new Paint(1);
        this.drawable = blurredBackgroundDrawable;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        setFadeHeight(AndroidUtilities.dp(40.0f), false);
    }

    public void setFadeHeight(int i, boolean z) {
        this.fadeHeight = i;
        this.opacity = z;
        Paint paint = this.maskFadeGradientPaint;
        LinearGradient linearGradientCreateGradient = createGradient(-16777216, z);
        this.shader = linearGradientCreateGradient;
        paint.setShader(linearGradientCreateGradient);
        this.colorStaticPaint.setShader(null);
        this.matrix.reset();
        this.matrix.setScale(1.0f, i);
        if (i < 0) {
            this.matrix.postTranslate(0.0f, -i);
        }
        this.shader.setLocalMatrix(this.matrix);
    }

    @Override
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.drawable.setBounds(rect);
    }

    @Override
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            return;
        }
        BlurredBackgroundSource unwrappedSource = this.drawable.getUnwrappedSource();
        if (unwrappedSource instanceof BlurredBackgroundSourceColor) {
            int color = ((BlurredBackgroundSourceColor) unwrappedSource).getColor();
            if (this.colorStaticLast != color || this.colorStaticPaint.getShader() == null) {
                LinearGradient linearGradientCreateGradient = createGradient(color, this.opacity);
                this.colorStaticLast = color;
                this.colorStaticPaint.setShader(linearGradientCreateGradient);
                linearGradientCreateGradient.setLocalMatrix(this.matrix);
            }
            canvas.save();
            canvas.translate(bounds.left, bounds.top);
            canvas.drawRect(0.0f, 0.0f, bounds.width(), bounds.height(), this.colorStaticPaint);
            canvas.restore();
            return;
        }
        if (unwrappedSource instanceof BlurredBackgroundSourceRenderNode) {
            return;
        }
        int iSaveLayer = canvas.saveLayer(bounds.left, bounds.top, bounds.right, bounds.bottom, null);
        int iHeight = this.fadeHeight < 0 ? bounds.height() + this.fadeHeight : 0;
        this.drawable.draw(canvas);
        canvas.translate(bounds.left, bounds.top + iHeight);
        canvas.drawRect(0.0f, -iHeight, bounds.width(), bounds.height() - iHeight, this.maskFadeGradientPaint);
        canvas.restoreToCount(iSaveLayer);
    }

    private static LinearGradient createGradient(int i, boolean z) {
        int iAlpha = Color.alpha(i);
        if (z) {
            return new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{ColorUtils.setAlphaComponent(i, 0), ColorUtils.setAlphaComponent(i, (iAlpha * 96) / 255), ColorUtils.setAlphaComponent(i, (iAlpha * 176) / 255), ColorUtils.setAlphaComponent(i, (iAlpha * 232) / 255)}, (float[]) null, Shader.TileMode.CLAMP);
        }
        return new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{ColorUtils.setAlphaComponent(i, 0), ColorUtils.setAlphaComponent(i, (iAlpha * 96) / 255), ColorUtils.setAlphaComponent(i, (iAlpha * 176) / 255), ColorUtils.setAlphaComponent(i, (iAlpha * 232) / 255), ColorUtils.setAlphaComponent(i, (iAlpha * 255) / 255)}, (float[]) null, Shader.TileMode.CLAMP);
    }
}
