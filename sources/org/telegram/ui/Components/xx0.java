package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.R;
public final class xx0 extends Drawable {
    public boolean f34801a;
    public final y5 f34802b;
    public final Drawable f34803c;
    public final Drawable d;
    public int f34804e = 255;

    public xx0(org.telegram.ui.Cells.t1 t1Var) {
        this.f34802b = new y5(t1Var, 420L, gr.h);
        this.f34803c = t1Var.getContext().getResources().getDrawable(R.drawable.summary_arrow);
        this.d = t1Var.getContext().getResources().getDrawable(R.drawable.summary_stars);
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        Drawable drawable = this.d;
        drawable.setBounds(bounds);
        drawable.setAlpha(this.f34804e);
        drawable.draw(canvas);
        float e10 = this.f34802b.e(this.f34801a);
        float centerX = getBounds().centerX();
        float centerY = getBounds().centerY();
        float width = getBounds().width();
        canvas.save();
        if (e10 < 0.5f) {
            float abs = Math.abs(e10 - 0.5f) + 0.5f;
            canvas.scale(abs, abs, centerX, centerY);
        }
        canvas.save();
        int i9 = (e10 > 0.5f ? 1 : (e10 == 0.5f ? 0 : -1));
        if (i9 > 0) {
            float abs2 = Math.abs(e10 - 0.5f) + 0.5f;
            float f10 = -abs2;
            float f11 = width * 0.32f;
            canvas.scale(f10, f10, getBounds().left + f11, getBounds().bottom - f11);
            float f12 = 1.0f - abs2;
            canvas.translate((-width) * f12 * 0.4f, f12 * width * 0.4f);
        }
        Rect bounds2 = getBounds();
        Drawable drawable2 = this.f34803c;
        drawable2.setBounds(bounds2);
        drawable2.setAlpha(this.f34804e);
        drawable2.draw(canvas);
        canvas.restore();
        canvas.save();
        if (i9 > 0) {
            float f13 = -(Math.abs(e10 - 0.5f) + 0.5f);
            float f14 = 0.32f * width;
            canvas.scale(f13, f13, getBounds().right - f14, getBounds().top + f14);
        }
        canvas.rotate(180.0f, centerX, centerY);
        if (i9 > 0) {
            float abs3 = 1.0f - (Math.abs(e10 - 0.5f) + 0.5f);
            canvas.translate((-width) * abs3 * 0.4f, width * abs3 * 0.4f);
        }
        drawable2.setBounds(getBounds());
        drawable2.setAlpha(this.f34804e);
        drawable2.draw(canvas);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f34803c.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f34803c.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i9) {
        this.f34804e = i9;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f34803c.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
    }
}
