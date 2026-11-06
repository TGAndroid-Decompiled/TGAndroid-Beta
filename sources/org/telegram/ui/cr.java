package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
public final class cr extends Drawable {
    public final Drawable f44856a;
    public final Drawable f44857b;
    public int d;
    public int f44859e;
    public final ArrayList f44858c = new ArrayList();
    public boolean f44860f = false;
    public final org.telegram.ui.Components.w5 f44861g = new org.telegram.ui.Components.w5(new bh(this, 14), 420, org.telegram.ui.Components.xq.h);
    public int h = 255;

    public cr(Drawable drawable, Drawable drawable2) {
        this.f44856a = drawable;
        this.f44857b = drawable2;
    }

    public final void a(int i7, int i10) {
        this.d = i7;
        this.f44859e = i10;
    }

    public final void b(boolean z9) {
        if (this.f44860f == z9) {
            return;
        }
        this.f44860f = z9;
        ArrayList arrayList = this.f44858c;
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
        float d = this.f44861g.d(this.f44860f);
        int i7 = this.h;
        Drawable drawable = this.f44856a;
        drawable.setAlpha(i7);
        drawable.setBounds(getBounds());
        drawable.draw(canvas);
        if (d > 0.0f) {
            Drawable drawable2 = this.f44857b;
            drawable2.setAlpha((int) (this.h * d));
            drawable2.setBounds(getBounds().left + this.d, getBounds().top + this.f44859e, drawable2.getIntrinsicWidth() + getBounds().left + this.d, drawable2.getIntrinsicHeight() + getBounds().top + this.f44859e);
            float T1 = org.telegram.messenger.g0.T1(0.5f, 1.0f, d);
            canvas.save();
            canvas.scale(T1, T1, drawable2.getBounds().centerX(), drawable2.getBounds().centerY());
            drawable2.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f44856a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f44856a.getIntrinsicWidth();
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
        this.f44856a.setColorFilter(colorFilter);
        this.f44857b.setColorFilter(colorFilter);
    }
}
