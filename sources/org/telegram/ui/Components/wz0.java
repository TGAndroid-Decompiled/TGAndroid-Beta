package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.R;
public final class wz0 extends Drawable {
    public boolean f34569a;
    public final h6 f34570b;
    public final Drawable f34571c;
    public final Drawable d;
    public int e = 255;

    public wz0(org.telegram.ui.Cells.s1 s1Var) {
        this.f34570b = new h6(s1Var, 420L, ds.h);
        this.f34571c = s1Var.getContext().getResources().getDrawable(R.drawable.summary_arrow);
        this.d = s1Var.getContext().getResources().getDrawable(R.drawable.summary_stars);
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        Drawable drawable = this.d;
        drawable.setBounds(bounds);
        drawable.setAlpha(this.e);
        drawable.draw(canvas);
        float e = this.f34570b.e(this.f34569a);
        float centerX = getBounds().centerX();
        float centerY = getBounds().centerY();
        float width = getBounds().width();
        canvas.save();
        if (e < 0.5f) {
            float abs = Math.abs(e - 0.5f) + 0.5f;
            canvas.scale(abs, abs, centerX, centerY);
        }
        canvas.save();
        int i10 = (e > 0.5f ? 1 : (e == 0.5f ? 0 : -1));
        if (i10 > 0) {
            float abs2 = Math.abs(e - 0.5f) + 0.5f;
            float f7 = -abs2;
            float f10 = width * 0.32f;
            canvas.scale(f7, f7, getBounds().left + f10, getBounds().bottom - f10);
            float f11 = 1.0f - abs2;
            canvas.translate((-width) * f11 * 0.4f, f11 * width * 0.4f);
        }
        Rect bounds2 = getBounds();
        Drawable drawable2 = this.f34571c;
        drawable2.setBounds(bounds2);
        drawable2.setAlpha(this.e);
        drawable2.draw(canvas);
        canvas.restore();
        canvas.save();
        if (i10 > 0) {
            float f12 = -(Math.abs(e - 0.5f) + 0.5f);
            float f13 = 0.32f * width;
            canvas.scale(f12, f12, getBounds().right - f13, getBounds().top + f13);
        }
        canvas.rotate(180.0f, centerX, centerY);
        if (i10 > 0) {
            float abs3 = 1.0f - (Math.abs(e - 0.5f) + 0.5f);
            canvas.translate((-width) * abs3 * 0.4f, width * abs3 * 0.4f);
        }
        drawable2.setBounds(getBounds());
        drawable2.setAlpha(this.e);
        drawable2.draw(canvas);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f34571c.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f34571c.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.e = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f34571c.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
    }
}
