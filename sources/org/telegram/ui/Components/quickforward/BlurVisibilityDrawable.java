package org.telegram.ui.Components.quickforward;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import androidx.core.math.MathUtils;
import org.telegram.messenger.Utilities;

public final class BlurVisibilityDrawable extends Drawable {
    public Bitmap bitmap;
    public float bitmapScale;
    public int blurRadius;
    public Canvas canvas;
    public final DrawRunnable drawRunnable;
    public int left;
    public int top;
    public final Paint emptyPaint = new Paint(2);
    public int alpha = 255;

    public interface DrawRunnable {
        void draw(Canvas canvas, int i);
    }

    public BlurVisibilityDrawable(DrawRunnable drawRunnable) {
        this.drawRunnable = drawRunnable;
    }

    @Override
    public final void draw(Canvas canvas) {
        int i = this.alpha;
        DrawRunnable drawRunnable = this.drawRunnable;
        if (i == 255) {
            canvas.save();
            canvas.translate(this.left, this.top);
            drawRunnable.draw(canvas, 255);
            canvas.restore();
            return;
        }
        if (i == 0) {
            return;
        }
        double d = ((double) i) / 255.0d;
        double d2 = d / ((1.0d - d) * 6.0d);
        double d3 = 1.0d + d2;
        double dSqrt = ((-d3) + Math.sqrt((d3 * d3) - (((-d2) * 4.0d) * (-d)))) / ((-2.0d) * d2);
        int iClamp = MathUtils.clamp((int) (d2 * dSqrt * 255.0d), 0, 255);
        int iClamp2 = MathUtils.clamp((int) (dSqrt * 255.0d), 0, 255);
        if (iClamp2 > 0 && this.bitmap != null) {
            Paint paint = this.emptyPaint;
            paint.setAlpha(iClamp2);
            canvas.save();
            int i2 = this.left;
            int i3 = this.blurRadius;
            canvas.translate(i2 - i3, this.top - i3);
            float f = this.bitmapScale;
            canvas.scale(f, f);
            canvas.drawBitmap(this.bitmap, 0.0f, 0.0f, paint);
            canvas.restore();
        }
        if (iClamp > 0) {
            canvas.save();
            canvas.translate(this.left, this.top);
            drawRunnable.draw(canvas, iClamp);
            canvas.restore();
        }
    }

    @Override
    public final int getAlpha() {
        return this.alpha;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    public final void render(int i, int i2, float f, int i3) {
        int i4 = i3 * 2;
        int i5 = (int) ((i + i4) / f);
        int i6 = (int) ((i2 + i4) / f);
        Bitmap bitmap = this.bitmap;
        if (bitmap != null && bitmap.getWidth() == i5 && this.bitmap.getHeight() == i6) {
            this.bitmap.eraseColor(0);
        } else {
            Bitmap bitmap2 = this.bitmap;
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
            this.bitmap = Bitmap.createBitmap(i5, i6, Bitmap.Config.ARGB_8888);
            this.canvas = new Canvas(this.bitmap);
        }
        this.bitmapScale = f;
        this.blurRadius = i3;
        this.canvas.save();
        float f2 = i3 / f;
        this.canvas.translate(f2, f2);
        float f3 = 1.0f / f;
        this.canvas.scale(f3, f3);
        this.drawRunnable.draw(this.canvas, 255);
        Utilities.stackBlurBitmap(this.bitmap, (int) f2);
        this.canvas.restore();
    }

    @Override
    public final void setAlpha(int i) {
        this.alpha = i;
    }

    @Override
    public final void setBounds(int i, int i2, int i3, int i4) {
        this.left = i;
        this.top = i2;
        super.setBounds(i, i2, i3, i4);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
