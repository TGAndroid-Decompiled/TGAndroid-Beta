package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class e3 extends Drawable {
    public final Paint f22897a;
    public final Rect f22898b;
    public final Rect f22899c;

    public e3() {
        Paint paint = new Paint(1);
        this.f22897a = paint;
        this.f22898b = new Rect();
        this.f22899c = new Rect();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setColor(-16777216);
    }

    public final void a(int i9) {
        Rect rect = this.f22898b;
        if (rect.left == 0 && rect.top == 0 && rect.right == 0 && rect.bottom == i9) {
            return;
        }
        rect.set(0, 0, 0, i9);
        onBoundsChange(getBounds());
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect rect = this.f22899c;
        if (!rect.isEmpty()) {
            Paint paint = this.f22897a;
            if (paint.getAlpha() != 0 && !AndroidUtilities.makingGlobalBlurBitmap) {
                canvas.drawRect(rect, paint);
            }
        }
    }

    @Override
    public final int getAlpha() {
        return this.f22897a.getAlpha();
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect rect2 = this.f22899c;
        rect2.set(rect);
        int i9 = rect2.left;
        Rect rect3 = this.f22898b;
        rect2.left = Math.max(0, rect3.left) + i9;
        rect2.top = Math.max(0, rect3.top) + rect2.top;
        rect2.right -= Math.max(0, rect3.right);
        rect2.bottom -= Math.max(0, rect3.bottom);
    }

    @Override
    public final void setAlpha(int i9) {
        this.f22897a.setAlpha(i9);
        invalidateSelf();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f22897a.setColorFilter(colorFilter);
    }
}
