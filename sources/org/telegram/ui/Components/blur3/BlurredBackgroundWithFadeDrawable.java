package org.telegram.ui.Components.blur3;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSource;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceBitmap;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceColor;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceRenderNode;

public class BlurredBackgroundWithFadeDrawable extends Drawable {
    private final Matrix bitmapMatrix;
    private final Paint bitmapPaint;
    private BitmapShader bitmapShader;
    private int colorStaticLast;
    private final Paint colorStaticPaint;
    private Shader composeShader;
    private final BlurredBackgroundDrawable drawable;
    private int fadeHeight;
    private Shader gradientShader;
    private Bitmap lastBitmap;
    private final Paint maskFadeGradientPaint;
    private final Matrix matrix;
    private final Matrix matrixTmp;
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
        this.matrixTmp = new Matrix();
        this.bitmapMatrix = new Matrix();
        Paint paint2 = new Paint(1);
        this.bitmapPaint = paint2;
        this.colorStaticPaint = new Paint(1);
        this.drawable = blurredBackgroundDrawable;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint2.setFilterBitmap(true);
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
        int iHeight;
        int i;
        boolean z;
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            return;
        }
        BlurredBackgroundSource unwrappedSource = this.drawable.getUnwrappedSource();
        if (unwrappedSource instanceof BlurredBackgroundSourceColor) {
            int color = ((BlurredBackgroundSourceColor) unwrappedSource).getColor();
            if (this.colorStaticLast != color || this.gradientShader == null) {
                LinearGradient linearGradientCreateGradient = createGradient(color, this.opacity);
                this.gradientShader = linearGradientCreateGradient;
                this.colorStaticLast = color;
                this.colorStaticPaint.setShader(linearGradientCreateGradient);
            }
            iHeight = this.fadeHeight < 0 ? bounds.height() + this.fadeHeight : 0;
            this.matrixTmp.set(this.matrix);
            this.matrixTmp.postTranslate(bounds.left, bounds.top + iHeight);
            this.gradientShader.setLocalMatrix(this.matrixTmp);
            canvas.drawRect(bounds, this.colorStaticPaint);
            return;
        }
        if ((unwrappedSource instanceof BlurredBackgroundSourceBitmap) && (i = Build.VERSION.SDK_INT) >= 28) {
            BlurredBackgroundSourceBitmap blurredBackgroundSourceBitmap = (BlurredBackgroundSourceBitmap) unwrappedSource;
            Bitmap bitmap = blurredBackgroundSourceBitmap.getBitmap();
            if (bitmap == null) {
                return;
            }
            boolean z2 = true;
            if (this.colorStaticLast != -16777216 || this.gradientShader == null) {
                this.gradientShader = createGradient(-16777216, this.opacity);
                this.colorStaticLast = -16777216;
                z = true;
            } else {
                z = false;
            }
            if (this.bitmapShader == null || this.lastBitmap != bitmap) {
                this.lastBitmap = bitmap;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                this.bitmapShader = bitmapShader;
                if (i >= 33) {
                    bitmapShader.setFilterMode(2);
                }
            } else {
                z2 = z;
            }
            if (z2 || this.composeShader == null) {
                ComposeShader composeShader = new ComposeShader(this.bitmapShader, this.gradientShader, PorterDuff.Mode.DST_IN);
                this.composeShader = composeShader;
                this.bitmapPaint.setShader(composeShader);
            }
            iHeight = this.fadeHeight < 0 ? this.fadeHeight + bounds.height() : 0;
            this.matrixTmp.set(this.matrix);
            this.matrixTmp.postTranslate(bounds.left, bounds.top + iHeight);
            this.gradientShader.setLocalMatrix(this.matrixTmp);
            this.bitmapMatrix.set(blurredBackgroundSourceBitmap.getMatrix());
            this.bitmapMatrix.postTranslate(-this.drawable.getSourceOffsetX(), -this.drawable.getSourceOffsetY());
            this.bitmapShader.setLocalMatrix(this.bitmapMatrix);
            canvas.drawRect(bounds, this.bitmapPaint);
            return;
        }
        if (unwrappedSource instanceof BlurredBackgroundSourceRenderNode) {
            return;
        }
        int iSaveLayer = canvas.saveLayer(bounds.left, bounds.top, bounds.right, bounds.bottom, null);
        iHeight = this.fadeHeight < 0 ? this.fadeHeight + bounds.height() : 0;
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
