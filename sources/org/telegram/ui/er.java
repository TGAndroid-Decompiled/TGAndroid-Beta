package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
public final class er extends Drawable {
    public final Drawable f46883a;
    public final Drawable f46884b;
    public int d;
    public int f46886e;
    public final ArrayList f46885c = new ArrayList();
    public boolean f46887f = false;
    public final org.telegram.ui.Components.u5 f46888g = new org.telegram.ui.Components.u5(new bh(this, 14), 420, org.telegram.ui.Components.er.h);
    public int h = 255;

    public er(Drawable drawable, Drawable drawable2) {
        this.f46883a = drawable;
        this.f46884b = drawable2;
    }

    public final void a(int i7, int i10) {
        this.d = i7;
        this.f46886e = i10;
    }

    public final void b(boolean z10) {
        if (this.f46887f == z10) {
            return;
        }
        this.f46887f = z10;
        ArrayList arrayList = this.f46885c;
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
        float d = this.f46888g.d(this.f46887f);
        int i7 = this.h;
        Drawable drawable = this.f46883a;
        drawable.setAlpha(i7);
        drawable.setBounds(getBounds());
        drawable.draw(canvas);
        if (d > 0.0f) {
            Drawable drawable2 = this.f46884b;
            drawable2.setAlpha((int) (this.h * d));
            drawable2.setBounds(getBounds().left + this.d, getBounds().top + this.f46886e, drawable2.getIntrinsicWidth() + getBounds().left + this.d, drawable2.getIntrinsicHeight() + getBounds().top + this.f46886e);
            float T1 = org.telegram.messenger.g0.T1(0.5f, 1.0f, d);
            canvas.save();
            canvas.scale(T1, T1, drawable2.getBounds().centerX(), drawable2.getBounds().centerY());
            drawable2.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f46883a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f46883a.getIntrinsicWidth();
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
        this.f46883a.setColorFilter(colorFilter);
        this.f46884b.setColorFilter(colorFilter);
    }
}
