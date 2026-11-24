package org.telegram.ui.Components.voip;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public class FabBackgroundDrawable extends Drawable {
    public final Paint a = new Paint(1);
    public final Paint b;
    public Bitmap c;

    public FabBackgroundDrawable() {
        Paint paint = new Paint();
        this.b = paint;
        paint.setColor(1275068416);
    }

    @Override
    public final void draw(Canvas canvas) {
        int i;
        if (this.c == null) {
            onBoundsChange(getBounds());
        }
        int min = Math.min(getBounds().width(), getBounds().height());
        Bitmap bitmap = this.c;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, getBounds().centerX() - (this.c.getWidth() / 2), getBounds().centerY() - (this.c.getHeight() / 2), this.b);
        }
        float f = min / 2;
        canvas.drawCircle(f, f, i - gl.L(4.0f), this.a);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final boolean getPadding(Rect rect) {
        int L = gl.L(4.0f);
        rect.set(L, L, L, L);
        return true;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        int i;
        int min = Math.min(rect.width(), rect.height());
        if (min <= 0) {
            this.c = null;
            return;
        }
        this.c = Bitmap.createBitmap(min, min, Bitmap.Config.ALPHA_8);
        float f = min / 2;
        new Canvas(this.c).drawCircle(f, f, i - gl.L(4.0f), new Paint(1));
    }

    public void setColor(int i) {
        this.a.setColor(i);
        invalidateSelf();
    }

    @Override
    public final void setAlpha(int i) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
