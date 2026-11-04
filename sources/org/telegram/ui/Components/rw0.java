package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class rw0 extends Drawable {
    public boolean f37821a;
    public final u5 f37822b;
    public final Drawable f37823c;
    public final Drawable d;
    public int f37824e = 255;

    public rw0(org.telegram.ui.Cells.q1 q1Var) {
        this.f37822b = new u5(q1Var, 420L, xq.h);
        this.f37823c = q1Var.getContext().getResources().getDrawable(2131232767);
        this.d = q1Var.getContext().getResources().getDrawable(2131232768);
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        Drawable drawable = this.d;
        drawable.setBounds(bounds);
        drawable.setAlpha(this.f37824e);
        drawable.draw(canvas);
        float d = this.f37822b.d(this.f37821a);
        float centerX = getBounds().centerX();
        float centerY = getBounds().centerY();
        float width = getBounds().width();
        canvas.save();
        if (d < 0.5f) {
            float abs = Math.abs(d - 0.5f) + 0.5f;
            canvas.scale(abs, abs, centerX, centerY);
        }
        canvas.save();
        int i3 = (d > 0.5f ? 1 : (d == 0.5f ? 0 : -1));
        if (i3 > 0) {
            float abs2 = Math.abs(d - 0.5f) + 0.5f;
            float f10 = -abs2;
            float f11 = width * 0.32f;
            canvas.scale(f10, f10, getBounds().left + f11, getBounds().bottom - f11);
            float f12 = 1.0f - abs2;
            canvas.translate((-width) * f12 * 0.4f, f12 * width * 0.4f);
        }
        Rect bounds2 = getBounds();
        Drawable drawable2 = this.f37823c;
        drawable2.setBounds(bounds2);
        drawable2.setAlpha(this.f37824e);
        drawable2.draw(canvas);
        canvas.restore();
        canvas.save();
        if (i3 > 0) {
            float f13 = -(Math.abs(d - 0.5f) + 0.5f);
            float f14 = 0.32f * width;
            canvas.scale(f13, f13, getBounds().right - f14, getBounds().top + f14);
        }
        canvas.rotate(180.0f, centerX, centerY);
        if (i3 > 0) {
            float abs3 = 1.0f - (Math.abs(d - 0.5f) + 0.5f);
            canvas.translate((-width) * abs3 * 0.4f, width * abs3 * 0.4f);
        }
        drawable2.setBounds(getBounds());
        drawable2.setAlpha(this.f37824e);
        drawable2.draw(canvas);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f37823c.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f37823c.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i3) {
        this.f37824e = i3;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f37823c.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
    }
}
