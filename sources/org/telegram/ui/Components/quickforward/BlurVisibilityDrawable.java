package org.telegram.ui.Components.quickforward;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import androidx.core.math.MathUtils;
import org.telegram.messenger.Utilities;

public class BlurVisibilityDrawable extends Drawable {
    private Bitmap bitmap;
    private float bitmapScale;
    private int blurRadius;
    private Canvas canvas;
    private final DrawRunnable drawRunnable;
    private int height;
    private int left;
    private int top;
    private int width;
    private final Paint emptyPaint = new Paint(2);
    private int alpha = 255;

    public interface DrawRunnable {
        void draw(Canvas canvas, int i);
    }

    @Override
    public int getOpacity() {
        return 0;
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public BlurVisibilityDrawable(DrawRunnable drawRunnable) {
        this.drawRunnable = drawRunnable;
    }

    public boolean hasBitmap() {
        return this.bitmap != null;
    }

    public void render(int i, int i2, int i3, float f) {
        int i4 = i3 * 2;
        int i5 = (int) ((i + i4) / f);
        int i6 = (int) ((i4 + i2) / f);
        Bitmap bitmap = this.bitmap;
        if (bitmap == null || bitmap.getWidth() != i5 || this.bitmap.getHeight() != i6) {
            Bitmap bitmap2 = this.bitmap;
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
            this.bitmap = Bitmap.createBitmap(i5, i6, Bitmap.Config.ARGB_8888);
            this.canvas = new Canvas(this.bitmap);
        } else {
            this.bitmap.eraseColor(0);
        }
        this.bitmapScale = f;
        this.blurRadius = i3;
        this.width = i;
        this.height = i2;
        this.canvas.save();
        float f2 = i3 / f;
        this.canvas.translate(f2, f2);
        float f3 = 1.0f / f;
        this.canvas.scale(f3, f3);
        this.drawRunnable.draw(this.canvas, 255);
        Utilities.stackBlurBitmap(this.bitmap, (int) f2);
        this.canvas.restore();
    }

    public void recycle() {
        Bitmap bitmap = this.bitmap;
        if (bitmap != null) {
            bitmap.recycle();
            this.bitmap = null;
        }
    }

    @Override
    public void draw(Canvas canvas) {
        int i = this.alpha;
        if (i == 255) {
            drawNormal(canvas, 255);
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
        drawBlur(canvas, MathUtils.clamp((int) (dSqrt * 255.0d), 0, 255));
        drawNormal(canvas, iClamp);
    }

    private void drawNormal(Canvas canvas, int i) {
        if (i > 0) {
            canvas.save();
            canvas.translate(this.left, this.top);
            this.drawRunnable.draw(canvas, i);
            canvas.restore();
        }
    }

    private void drawBlur(Canvas canvas, int i) {
        if (i <= 0 || this.bitmap == null) {
            return;
        }
        this.emptyPaint.setAlpha(i);
        canvas.save();
        int i2 = this.left;
        int i3 = this.blurRadius;
        canvas.translate(i2 - i3, this.top - i3);
        float f = this.bitmapScale;
        canvas.scale(f, f);
        canvas.drawBitmap(this.bitmap, 0.0f, 0.0f, this.emptyPaint);
        canvas.restore();
    }

    @Override
    public void setBounds(int i, int i2, int i3, int i4) {
        this.left = i;
        this.top = i2;
        super.setBounds(i, i2, i3, i4);
    }

    @Override
    public void setAlpha(int i) {
        this.alpha = i;
    }

    @Override
    public int getAlpha() {
        return this.alpha;
    }
}
