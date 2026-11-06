package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class rw0 extends Drawable {
    public boolean f37766a;
    public final w5 f37767b;
    public final Drawable f37768c;
    public final Drawable d;
    public int f37769e = 255;

    public rw0(org.telegram.ui.Cells.q1 q1Var) {
        this.f37767b = new w5(q1Var, 420L, xq.h);
        this.f37768c = q1Var.getContext().getResources().getDrawable(2131232769);
        this.d = q1Var.getContext().getResources().getDrawable(2131232770);
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        Drawable drawable = this.d;
        drawable.setBounds(bounds);
        drawable.setAlpha(this.f37769e);
        drawable.draw(canvas);
        float d = this.f37767b.d(this.f37766a);
        float centerX = getBounds().centerX();
        float centerY = getBounds().centerY();
        float width = getBounds().width();
        canvas.save();
        if (d < 0.5f) {
            float abs = Math.abs(d - 0.5f) + 0.5f;
            canvas.scale(abs, abs, centerX, centerY);
        }
        canvas.save();
        int i7 = (d > 0.5f ? 1 : (d == 0.5f ? 0 : -1));
        if (i7 > 0) {
            float abs2 = Math.abs(d - 0.5f) + 0.5f;
            float f10 = -abs2;
            float f11 = width * 0.32f;
            canvas.scale(f10, f10, getBounds().left + f11, getBounds().bottom - f11);
            float f12 = 1.0f - abs2;
            canvas.translate((-width) * f12 * 0.4f, f12 * width * 0.4f);
        }
        Rect bounds2 = getBounds();
        Drawable drawable2 = this.f37768c;
        drawable2.setBounds(bounds2);
        drawable2.setAlpha(this.f37769e);
        drawable2.draw(canvas);
        canvas.restore();
        canvas.save();
        if (i7 > 0) {
            float f13 = -(Math.abs(d - 0.5f) + 0.5f);
            float f14 = 0.32f * width;
            canvas.scale(f13, f13, getBounds().right - f14, getBounds().top + f14);
        }
        canvas.rotate(180.0f, centerX, centerY);
        if (i7 > 0) {
            float abs3 = 1.0f - (Math.abs(d - 0.5f) + 0.5f);
            canvas.translate((-width) * abs3 * 0.4f, width * abs3 * 0.4f);
        }
        drawable2.setBounds(getBounds());
        drawable2.setAlpha(this.f37769e);
        drawable2.draw(canvas);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f37768c.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f37768c.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
        this.f37769e = i7;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f37768c.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
    }
}
