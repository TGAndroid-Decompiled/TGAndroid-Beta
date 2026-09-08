package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.R;
public final class py0 extends Drawable {
    public boolean f29547a;
    public final e6 f29548b;
    public final Drawable f29549c;
    public final Drawable d;
    public int f29550e = 255;

    public py0(org.telegram.ui.Cells.t1 t1Var) {
        this.f29548b = new e6(t1Var, 420L, pr.h);
        this.f29549c = t1Var.getContext().getResources().getDrawable(R.drawable.summary_arrow);
        this.d = t1Var.getContext().getResources().getDrawable(R.drawable.summary_stars);
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        Drawable drawable = this.d;
        drawable.setBounds(bounds);
        drawable.setAlpha(this.f29550e);
        drawable.draw(canvas);
        float e7 = this.f29548b.e(this.f29547a);
        float centerX = getBounds().centerX();
        float centerY = getBounds().centerY();
        float width = getBounds().width();
        canvas.save();
        if (e7 < 0.5f) {
            float abs = Math.abs(e7 - 0.5f) + 0.5f;
            canvas.scale(abs, abs, centerX, centerY);
        }
        canvas.save();
        int i10 = (e7 > 0.5f ? 1 : (e7 == 0.5f ? 0 : -1));
        if (i10 > 0) {
            float abs2 = Math.abs(e7 - 0.5f) + 0.5f;
            float f7 = -abs2;
            float f10 = width * 0.32f;
            canvas.scale(f7, f7, getBounds().left + f10, getBounds().bottom - f10);
            float f11 = 1.0f - abs2;
            canvas.translate((-width) * f11 * 0.4f, f11 * width * 0.4f);
        }
        Rect bounds2 = getBounds();
        Drawable drawable2 = this.f29549c;
        drawable2.setBounds(bounds2);
        drawable2.setAlpha(this.f29550e);
        drawable2.draw(canvas);
        canvas.restore();
        canvas.save();
        if (i10 > 0) {
            float f12 = -(Math.abs(e7 - 0.5f) + 0.5f);
            float f13 = 0.32f * width;
            canvas.scale(f12, f12, getBounds().right - f13, getBounds().top + f13);
        }
        canvas.rotate(180.0f, centerX, centerY);
        if (i10 > 0) {
            float abs3 = 1.0f - (Math.abs(e7 - 0.5f) + 0.5f);
            canvas.translate((-width) * abs3 * 0.4f, width * abs3 * 0.4f);
        }
        drawable2.setBounds(getBounds());
        drawable2.setAlpha(this.f29550e);
        drawable2.draw(canvas);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f29549c.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f29549c.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f29550e = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f29549c.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
    }
}
