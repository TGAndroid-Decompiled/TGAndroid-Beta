package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class es extends Drawable {
    public final Drawable f33308a;
    public final Drawable f33309b;
    public int d;
    public int e;
    public final ArrayList f33310c = new ArrayList();
    public boolean f33311f = false;
    public boolean f33312g = false;
    public final org.telegram.ui.Components.e6 h = new org.telegram.ui.Components.e6(new cj(this, 13), 420, org.telegram.ui.Components.sr.h);
    public int f33313i = 255;

    public es(Drawable drawable, Drawable drawable2) {
        this.f33308a = drawable;
        this.f33309b = drawable2;
    }

    public final void a(int i10, int i11) {
        this.d = i10;
        this.e = i11;
    }

    public final void b(boolean z10, boolean z11) {
        if (this.f33311f == z10) {
            return;
        }
        this.f33311f = z10;
        if (!z11) {
            this.h.a(z10);
        }
        ArrayList arrayList = this.f33310c;
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
        float e = this.h.e(this.f33311f);
        int i10 = this.f33313i;
        Drawable drawable = this.f33308a;
        drawable.setAlpha(i10);
        drawable.setBounds(getBounds());
        drawable.draw(canvas);
        if (e > 0.0f) {
            boolean z10 = this.f33312g;
            Drawable drawable2 = this.f33309b;
            if (z10) {
                drawable2.setBounds(getBounds());
            } else {
                drawable2.setAlpha((int) (this.f33313i * e));
                drawable2.setBounds(getBounds().left + this.d, getBounds().top + this.e, drawable2.getIntrinsicWidth() + getBounds().left + this.d, drawable2.getIntrinsicHeight() + getBounds().top + this.e);
            }
            float lerp = AndroidUtilities.lerp(0.5f, 1.0f, e);
            canvas.save();
            canvas.scale(lerp, lerp, drawable2.getBounds().centerX(), drawable2.getBounds().centerY());
            drawable2.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f33308a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f33308a.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f33313i = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f33308a.setColorFilter(colorFilter);
        this.f33309b.setColorFilter(colorFilter);
    }
}
