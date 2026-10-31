package org.telegram.ui.Components.voip;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public class FabBackgroundDrawable extends Drawable {
    public final Paint f31301a = new Paint(1);
    public final Paint f31302b;
    public Bitmap f31303c;

    public FabBackgroundDrawable() {
        Paint paint = new Paint();
        this.f31302b = paint;
        paint.setColor(1275068416);
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10;
        if (this.f31303c == null) {
            onBoundsChange(getBounds());
        }
        int min = Math.min(getBounds().width(), getBounds().height());
        Bitmap bitmap = this.f31303c;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, getBounds().centerX() - (this.f31303c.getWidth() / 2), getBounds().centerY() - (this.f31303c.getHeight() / 2), this.f31302b);
        }
        float f7 = min / 2;
        canvas.drawCircle(f7, f7, i10 - org.telegram.messenger.i0.L(4.0f), this.f31301a);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final boolean getPadding(Rect rect) {
        int L = org.telegram.messenger.i0.L(4.0f);
        rect.set(L, L, L, L);
        return true;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        int i10;
        int min = Math.min(rect.width(), rect.height());
        if (min <= 0) {
            this.f31303c = null;
            return;
        }
        this.f31303c = Bitmap.createBitmap(min, min, Bitmap.Config.ALPHA_8);
        float f7 = min / 2;
        new Canvas(this.f31303c).drawCircle(f7, f7, i10 - org.telegram.messenger.i0.L(4.0f), new Paint(1));
    }

    public void setColor(int i10) {
        this.f31301a.setColor(i10);
        invalidateSelf();
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
