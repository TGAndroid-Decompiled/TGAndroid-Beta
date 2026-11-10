package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
public final class fr extends Drawable {
    public final Drawable f45823a;
    public final Drawable f45824b;
    public int d;
    public int f45826e;
    public final ArrayList f45825c = new ArrayList();
    public boolean f45827f = false;
    public final org.telegram.ui.Components.v5 f45828g = new org.telegram.ui.Components.v5(new dh(this, 14), 420, org.telegram.ui.Components.wq.h);
    public int h = 255;

    public fr(Drawable drawable, Drawable drawable2) {
        this.f45823a = drawable;
        this.f45824b = drawable2;
    }

    public final void a(int i7, int i10) {
        this.d = i7;
        this.f45826e = i10;
    }

    public final void b(boolean z9) {
        if (this.f45827f == z9) {
            return;
        }
        this.f45827f = z9;
        ArrayList arrayList = this.f45825c;
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
        float d = this.f45828g.d(this.f45827f);
        int i7 = this.h;
        Drawable drawable = this.f45823a;
        drawable.setAlpha(i7);
        drawable.setBounds(getBounds());
        drawable.draw(canvas);
        if (d > 0.0f) {
            Drawable drawable2 = this.f45824b;
            drawable2.setAlpha((int) (this.h * d));
            drawable2.setBounds(getBounds().left + this.d, getBounds().top + this.f45826e, drawable2.getIntrinsicWidth() + getBounds().left + this.d, drawable2.getIntrinsicHeight() + getBounds().top + this.f45826e);
            float T1 = org.telegram.messenger.g0.T1(0.5f, 1.0f, d);
            canvas.save();
            canvas.scale(T1, T1, drawable2.getBounds().centerX(), drawable2.getBounds().centerY());
            drawable2.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f45823a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f45823a.getIntrinsicWidth();
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
        this.f45823a.setColorFilter(colorFilter);
        this.f45824b.setColorFilter(colorFilter);
    }
}
