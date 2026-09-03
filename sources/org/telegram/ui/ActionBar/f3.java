package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class f3 extends Drawable {
    public final Paint f19655a;
    public final Rect f19656b;
    public final Rect f19657c;

    public f3() {
        Paint paint = new Paint(1);
        this.f19655a = paint;
        this.f19656b = new Rect();
        this.f19657c = new Rect();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setColor(-16777216);
    }

    public final void a(int i10) {
        Rect rect = this.f19656b;
        if (rect.left == 0 && rect.top == 0 && rect.right == 0 && rect.bottom == i10) {
            return;
        }
        rect.set(0, 0, 0, i10);
        onBoundsChange(getBounds());
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect rect = this.f19657c;
        if (!rect.isEmpty()) {
            Paint paint = this.f19655a;
            if (paint.getAlpha() != 0 && !AndroidUtilities.makingGlobalBlurBitmap) {
                canvas.drawRect(rect, paint);
            }
        }
    }

    @Override
    public final int getAlpha() {
        return this.f19655a.getAlpha();
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect rect2 = this.f19657c;
        rect2.set(rect);
        int i10 = rect2.left;
        Rect rect3 = this.f19656b;
        rect2.left = Math.max(0, rect3.left) + i10;
        rect2.top = Math.max(0, rect3.top) + rect2.top;
        rect2.right -= Math.max(0, rect3.right);
        rect2.bottom -= Math.max(0, rect3.bottom);
    }

    @Override
    public final void setAlpha(int i10) {
        this.f19655a.setAlpha(i10);
        invalidateSelf();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f19655a.setColorFilter(colorFilter);
    }
}
