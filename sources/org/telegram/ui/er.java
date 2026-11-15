package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
public final class er extends Drawable {
    public final Drawable f46899a;
    public final Drawable f46900b;
    public int d;
    public int f46902e;
    public final ArrayList f46901c = new ArrayList();
    public boolean f46903f = false;
    public final org.telegram.ui.Components.u5 f46904g = new org.telegram.ui.Components.u5(new bh(this, 14), 420, org.telegram.ui.Components.er.h);
    public int h = 255;

    public er(Drawable drawable, Drawable drawable2) {
        this.f46899a = drawable;
        this.f46900b = drawable2;
    }

    public final void a(int i7, int i10) {
        this.d = i7;
        this.f46902e = i10;
    }

    public final void b(boolean z10) {
        if (this.f46903f == z10) {
            return;
        }
        this.f46903f = z10;
        ArrayList arrayList = this.f46901c;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((View) obj).invalidate();
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        float d = this.f46904g.d(this.f46903f);
        int i7 = this.h;
        Drawable drawable = this.f46899a;
        drawable.setAlpha(i7);
        drawable.setBounds(getBounds());
        drawable.draw(canvas);
        if (d > 0.0f) {
            Drawable drawable2 = this.f46900b;
            drawable2.setAlpha((int) (this.h * d));
            drawable2.setBounds(getBounds().left + this.d, getBounds().top + this.f46902e, drawable2.getIntrinsicWidth() + getBounds().left + this.d, drawable2.getIntrinsicHeight() + getBounds().top + this.f46902e);
            float T1 = org.telegram.messenger.g0.T1(0.5f, 1.0f, d);
            canvas.save();
            canvas.scale(T1, T1, drawable2.getBounds().centerX(), drawable2.getBounds().centerY());
            drawable2.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f46899a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f46899a.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
        this.h = i7;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f46899a.setColorFilter(colorFilter);
        this.f46900b.setColorFilter(colorFilter);
    }
}
