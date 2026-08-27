package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.R;

public final class zx0 extends Drawable {

    public boolean f35402a;

    public final y5 f35403b;

    public final Drawable f35404c;
    public final Drawable d;

    public int f35405e = 255;

    public zx0(org.telegram.ui.Cells.s1 s1Var) {
        this.f35403b = new y5(s1Var, 420L, er.h);
        this.f35404c = s1Var.getContext().getResources().getDrawable(R.drawable.summary_arrow);
        this.d = s1Var.getContext().getResources().getDrawable(R.drawable.summary_stars);
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        Drawable drawable = this.d;
        drawable.setBounds(bounds);
        drawable.setAlpha(this.f35405e);
        drawable.draw(canvas);
        float fE = this.f35403b.e(this.f35402a);
        float fCenterX = getBounds().centerX();
        float fCenterY = getBounds().centerY();
        float fWidth = getBounds().width();
        canvas.save();
        if (fE < 0.5f) {
            float fAbs = Math.abs(fE - 0.5f) + 0.5f;
            canvas.scale(fAbs, fAbs, fCenterX, fCenterY);
        }
        canvas.save();
        if (fE > 0.5f) {
            float fAbs2 = Math.abs(fE - 0.5f) + 0.5f;
            float f10 = -fAbs2;
            float f11 = fWidth * 0.32f;
            canvas.scale(f10, f10, getBounds().left + f11, getBounds().bottom - f11);
            float f12 = 1.0f - fAbs2;
            canvas.translate((-fWidth) * f12 * 0.4f, f12 * fWidth * 0.4f);
        }
        Rect bounds2 = getBounds();
        Drawable drawable2 = this.f35404c;
        drawable2.setBounds(bounds2);
        drawable2.setAlpha(this.f35405e);
        drawable2.draw(canvas);
        canvas.restore();
        canvas.save();
        if (fE > 0.5f) {
            float f13 = -(Math.abs(fE - 0.5f) + 0.5f);
            float f14 = 0.32f * fWidth;
            canvas.scale(f13, f13, getBounds().right - f14, getBounds().top + f14);
        }
        canvas.rotate(180.0f, fCenterX, fCenterY);
        if (fE > 0.5f) {
            float fAbs3 = 1.0f - (Math.abs(fE - 0.5f) + 0.5f);
            canvas.translate((-fWidth) * fAbs3 * 0.4f, fWidth * fAbs3 * 0.4f);
        }
        drawable2.setBounds(getBounds());
        drawable2.setAlpha(this.f35405e);
        drawable2.draw(canvas);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f35404c.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f35404c.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f35405e = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f35404c.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
    }
}
