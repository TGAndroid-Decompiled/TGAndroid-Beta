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
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceWrapped;

public final class BlurredBackgroundWithFadeDrawable extends Drawable {
    public int alpha;
    public final Matrix bitmapMatrix;
    public final Paint bitmapPaint;
    public BitmapShader bitmapShader;
    public int colorStaticLast;
    public final Paint colorStaticPaint;
    public ComposeShader composeShader;
    public final BlurredBackgroundDrawable drawable;
    public int fadeHeight;
    public LinearGradient gradientShader;
    public boolean ignoreFastWay;
    public Bitmap lastBitmap;
    public final Paint maskFadeGradientPaint;
    public final Matrix matrix;
    public final Matrix matrixTmp;
    public boolean opacity;
    public LinearGradient shader;

    public BlurredBackgroundWithFadeDrawable(BlurredBackgroundDrawable blurredBackgroundDrawable) {
        Paint paint = new Paint(1);
        this.maskFadeGradientPaint = paint;
        this.matrix = new Matrix();
        this.matrixTmp = new Matrix();
        this.bitmapMatrix = new Matrix();
        Paint paint2 = new Paint(1);
        this.bitmapPaint = paint2;
        this.colorStaticPaint = new Paint(1);
        this.alpha = 255;
        this.drawable = blurredBackgroundDrawable;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint2.setFilterBitmap(true);
        setFadeHeight(AndroidUtilities.dp(40.0f), false);
    }

    public static LinearGradient createGradient(int i, boolean z) {
        int iAlpha = Color.alpha(i);
        return z ? new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{ColorUtils.setAlphaComponent(i, 0), ColorUtils.setAlphaComponent(i, (iAlpha * 96) / 285), ColorUtils.setAlphaComponent(i, (iAlpha * 176) / 285), ColorUtils.setAlphaComponent(i, (iAlpha * 232) / 285)}, (float[]) null, Shader.TileMode.CLAMP) : new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{ColorUtils.setAlphaComponent(i, 0), ColorUtils.setAlphaComponent(i, (iAlpha * 96) / 255), ColorUtils.setAlphaComponent(i, (iAlpha * 176) / 255), ColorUtils.setAlphaComponent(i, (iAlpha * 232) / 255), ColorUtils.setAlphaComponent(i, (iAlpha * 255) / 255)}, (float[]) null, Shader.TileMode.CLAMP);
    }

    @Override
    public final void draw(Canvas canvas) {
        int iHeight;
        int i;
        boolean z;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || this.alpha == 0) {
            return;
        }
        BlurredBackgroundDrawable blurredBackgroundDrawable = this.drawable;
        BlurredBackgroundSource source = blurredBackgroundDrawable.getSource();
        while (source instanceof BlurredBackgroundSourceWrapped) {
            source = ((BlurredBackgroundSourceWrapped) source).sourceInternal;
        }
        boolean z2 = this.ignoreFastWay;
        Matrix matrix = this.matrix;
        Matrix matrix2 = this.matrixTmp;
        if (!z2 && (source instanceof BlurredBackgroundSourceColor)) {
            int color = ((BlurredBackgroundSourceColor) source).paint.getColor();
            int i2 = this.colorStaticLast;
            Paint paint = this.colorStaticPaint;
            if (i2 != color || this.gradientShader == null) {
                LinearGradient linearGradientCreateGradient = createGradient(color, this.opacity);
                this.gradientShader = linearGradientCreateGradient;
                this.colorStaticLast = color;
                paint.setShader(linearGradientCreateGradient);
            }
            iHeight = this.fadeHeight < 0 ? bounds.height() + this.fadeHeight : 0;
            matrix2.set(matrix);
            matrix2.postTranslate(bounds.left, bounds.top + iHeight);
            this.gradientShader.setLocalMatrix(matrix2);
            paint.setAlpha(this.alpha);
            canvas.drawRect(bounds, paint);
            return;
        }
        if (z2 || !(source instanceof BlurredBackgroundSourceBitmap) || (i = Build.VERSION.SDK_INT) < 28) {
            int iSaveLayerAlpha = canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, this.alpha);
            iHeight = this.fadeHeight < 0 ? bounds.height() + this.fadeHeight : 0;
            blurredBackgroundDrawable.draw(canvas);
            canvas.translate(bounds.left, bounds.top + iHeight);
            canvas.drawRect(0.0f, -iHeight, bounds.width(), bounds.height() - iHeight, this.maskFadeGradientPaint);
            canvas.restoreToCount(iSaveLayerAlpha);
            return;
        }
        BlurredBackgroundSourceBitmap blurredBackgroundSourceBitmap = (BlurredBackgroundSourceBitmap) source;
        Bitmap bitmap = blurredBackgroundSourceBitmap.bitmap;
        if (bitmap == null) {
            return;
        }
        boolean z3 = true;
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
            z3 = z;
        }
        Paint paint2 = this.bitmapPaint;
        if (z3 || this.composeShader == null) {
            ComposeShader composeShader = new ComposeShader(this.bitmapShader, this.gradientShader, PorterDuff.Mode.DST_IN);
            this.composeShader = composeShader;
            paint2.setShader(composeShader);
        }
        iHeight = this.fadeHeight < 0 ? bounds.height() + this.fadeHeight : 0;
        matrix2.set(matrix);
        matrix2.postTranslate(bounds.left, bounds.top + iHeight);
        this.gradientShader.setLocalMatrix(matrix2);
        Matrix matrix3 = this.bitmapMatrix;
        matrix3.set(blurredBackgroundSourceBitmap.bitmapMatrix);
        matrix3.postTranslate(-blurredBackgroundDrawable.sourceOffsetX, -blurredBackgroundDrawable.sourceOffsetY);
        this.bitmapShader.setLocalMatrix(matrix3);
        paint2.setAlpha(this.alpha);
        canvas.drawRect(bounds, paint2);
    }

    @Override
    public final int getAlpha() {
        return this.alpha;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.drawable.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i) {
        this.alpha = i;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void setFadeHeight(int i, boolean z) {
        if (this.fadeHeight == i && this.opacity == z) {
            return;
        }
        this.fadeHeight = i;
        this.opacity = z;
        LinearGradient linearGradientCreateGradient = createGradient(-16777216, z);
        this.shader = linearGradientCreateGradient;
        this.maskFadeGradientPaint.setShader(linearGradientCreateGradient);
        this.colorStaticPaint.setShader(null);
        Matrix matrix = this.matrix;
        matrix.reset();
        matrix.setScale(1.0f, i);
        if (i < 0) {
            matrix.postTranslate(0.0f, -i);
        }
        this.shader.setLocalMatrix(matrix);
    }
}
