package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
public final class cs extends Drawable {
    public final Drawable f36389a;
    public final Drawable f36390b;
    public int d;
    public int e;
    public final ArrayList f36391c = new ArrayList();
    public boolean f36392f = false;
    public final org.telegram.ui.Components.t5 f36393g = new org.telegram.ui.Components.t5(new rh(this, 15), 420, org.telegram.ui.Components.gr.h);
    public int h = 255;

    public cs(Drawable drawable, Drawable drawable2) {
        this.f36389a = drawable;
        this.f36390b = drawable2;
    }

    public final void a(int i10, int i11) {
        this.d = i10;
        this.e = i11;
    }

    public final void b(boolean z10) {
        if (this.f36392f == z10) {
            return;
        }
        this.f36392f = z10;
        ArrayList arrayList = this.f36391c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((View) obj).invalidate();
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        float d = this.f36393g.d(this.f36392f);
        int i10 = this.h;
        Drawable drawable = this.f36389a;
        drawable.setAlpha(i10);
        drawable.setBounds(getBounds());
        drawable.draw(canvas);
        if (d > 0.0f) {
            Drawable drawable2 = this.f36390b;
            drawable2.setAlpha((int) (this.h * d));
            drawable2.setBounds(getBounds().left + this.d, getBounds().top + this.e, drawable2.getIntrinsicWidth() + getBounds().left + this.d, drawable2.getIntrinsicHeight() + getBounds().top + this.e);
            float T1 = org.telegram.messenger.i0.T1(0.5f, 1.0f, d);
            canvas.save();
            canvas.scale(T1, T1, drawable2.getBounds().centerX(), drawable2.getBounds().centerY());
            drawable2.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f36389a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f36389a.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.h = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f36389a.setColorFilter(colorFilter);
        this.f36390b.setColorFilter(colorFilter);
    }
}
