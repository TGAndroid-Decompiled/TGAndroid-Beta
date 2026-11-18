package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
public final class fr extends Drawable {
    public final Drawable f47744a;
    public final Drawable f47745b;
    public int d;
    public int f47747e;
    public final ArrayList f47746c = new ArrayList();
    public boolean f47748f = false;
    public final org.telegram.ui.Components.c6 f47749g = new org.telegram.ui.Components.c6(new bh(this, 14), 420, org.telegram.ui.Components.lr.h);
    public int h = 255;

    public fr(Drawable drawable, Drawable drawable2) {
        this.f47744a = drawable;
        this.f47745b = drawable2;
    }

    public final void a(int i7, int i10) {
        this.d = i7;
        this.f47747e = i10;
    }

    public final void b(boolean z10) {
        if (this.f47748f == z10) {
            return;
        }
        this.f47748f = z10;
        ArrayList arrayList = this.f47746c;
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
        float d = this.f47749g.d(this.f47748f);
        int i7 = this.h;
        Drawable drawable = this.f47744a;
        drawable.setAlpha(i7);
        drawable.setBounds(getBounds());
        drawable.draw(canvas);
        if (d > 0.0f) {
            Drawable drawable2 = this.f47745b;
            drawable2.setAlpha((int) (this.h * d));
            drawable2.setBounds(getBounds().left + this.d, getBounds().top + this.f47747e, drawable2.getIntrinsicWidth() + getBounds().left + this.d, drawable2.getIntrinsicHeight() + getBounds().top + this.f47747e);
            float T1 = org.telegram.messenger.g0.T1(0.5f, 1.0f, d);
            canvas.save();
            canvas.scale(T1, T1, drawable2.getBounds().centerX(), drawable2.getBounds().centerY());
            drawable2.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f47744a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f47744a.getIntrinsicWidth();
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
        this.f47744a.setColorFilter(colorFilter);
        this.f47745b.setColorFilter(colorFilter);
    }
}
