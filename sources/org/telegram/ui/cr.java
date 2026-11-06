package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
public final class cr extends Drawable {
    public final Drawable f44872a;
    public final Drawable f44873b;
    public int d;
    public int f44875e;
    public final ArrayList f44874c = new ArrayList();
    public boolean f44876f = false;
    public final org.telegram.ui.Components.w5 f44877g = new org.telegram.ui.Components.w5(new bh(this, 14), 420, org.telegram.ui.Components.xq.h);
    public int h = 255;

    public cr(Drawable drawable, Drawable drawable2) {
        this.f44872a = drawable;
        this.f44873b = drawable2;
    }

    public final void a(int i7, int i10) {
        this.d = i7;
        this.f44875e = i10;
    }

    public final void b(boolean z9) {
        if (this.f44876f == z9) {
            return;
        }
        this.f44876f = z9;
        ArrayList arrayList = this.f44874c;
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
        float d = this.f44877g.d(this.f44876f);
        int i7 = this.h;
        Drawable drawable = this.f44872a;
        drawable.setAlpha(i7);
        drawable.setBounds(getBounds());
        drawable.draw(canvas);
        if (d > 0.0f) {
            Drawable drawable2 = this.f44873b;
            drawable2.setAlpha((int) (this.h * d));
            drawable2.setBounds(getBounds().left + this.d, getBounds().top + this.f44875e, drawable2.getIntrinsicWidth() + getBounds().left + this.d, drawable2.getIntrinsicHeight() + getBounds().top + this.f44875e);
            float T1 = org.telegram.messenger.g0.T1(0.5f, 1.0f, d);
            canvas.save();
            canvas.scale(T1, T1, drawable2.getBounds().centerX(), drawable2.getBounds().centerY());
            drawable2.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f44872a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f44872a.getIntrinsicWidth();
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
        this.f44872a.setColorFilter(colorFilter);
        this.f44873b.setColorFilter(colorFilter);
    }
}
