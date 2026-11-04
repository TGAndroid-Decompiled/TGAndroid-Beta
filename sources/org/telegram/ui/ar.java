package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
public final class ar extends Drawable {
    public final Drawable f43827a;
    public final Drawable f43828b;
    public int d;
    public int f43830e;
    public final ArrayList f43829c = new ArrayList();
    public boolean f43831f = false;
    public final org.telegram.ui.Components.u5 f43832g = new org.telegram.ui.Components.u5(new xg(this, 14), 420, org.telegram.ui.Components.xq.h);
    public int h = 255;

    public ar(Drawable drawable, Drawable drawable2) {
        this.f43827a = drawable;
        this.f43828b = drawable2;
    }

    public final void a(int i3, int i10) {
        this.d = i3;
        this.f43830e = i10;
    }

    public final void b(boolean z10) {
        if (this.f43831f == z10) {
            return;
        }
        this.f43831f = z10;
        ArrayList arrayList = this.f43829c;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((View) obj).invalidate();
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        float d = this.f43832g.d(this.f43831f);
        int i3 = this.h;
        Drawable drawable = this.f43827a;
        drawable.setAlpha(i3);
        drawable.setBounds(getBounds());
        drawable.draw(canvas);
        if (d > 0.0f) {
            Drawable drawable2 = this.f43828b;
            drawable2.setAlpha((int) (this.h * d));
            drawable2.setBounds(getBounds().left + this.d, getBounds().top + this.f43830e, drawable2.getIntrinsicWidth() + getBounds().left + this.d, drawable2.getIntrinsicHeight() + getBounds().top + this.f43830e);
            float T1 = org.telegram.messenger.g0.T1(0.5f, 1.0f, d);
            canvas.save();
            canvas.scale(T1, T1, drawable2.getBounds().centerX(), drawable2.getBounds().centerY());
            drawable2.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f43827a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f43827a.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i3) {
        this.h = i3;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f43827a.setColorFilter(colorFilter);
        this.f43828b.setColorFilter(colorFilter);
    }
}
