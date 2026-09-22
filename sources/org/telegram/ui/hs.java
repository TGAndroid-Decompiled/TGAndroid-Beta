package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class hs extends Drawable {
    public final Drawable f34292a;
    public final Drawable f34293b;
    public int d;
    public int e;
    public final ArrayList f34294c = new ArrayList();
    public boolean f34295f = false;
    public final org.telegram.ui.Components.d6 f34296g = new org.telegram.ui.Components.d6(new dj(this, 13), 420, org.telegram.ui.Components.qr.h);
    public int h = 255;

    public hs(Drawable drawable, Drawable drawable2) {
        this.f34292a = drawable;
        this.f34293b = drawable2;
    }

    public final void a(int i10, int i11) {
        this.d = i10;
        this.e = i11;
    }

    public final void b(boolean z10) {
        if (this.f34295f == z10) {
            return;
        }
        this.f34295f = z10;
        ArrayList arrayList = this.f34294c;
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
        float e = this.f34296g.e(this.f34295f);
        int i10 = this.h;
        Drawable drawable = this.f34292a;
        drawable.setAlpha(i10);
        drawable.setBounds(getBounds());
        drawable.draw(canvas);
        if (e > 0.0f) {
            Drawable drawable2 = this.f34293b;
            drawable2.setAlpha((int) (this.h * e));
            drawable2.setBounds(getBounds().left + this.d, getBounds().top + this.e, drawable2.getIntrinsicWidth() + getBounds().left + this.d, drawable2.getIntrinsicHeight() + getBounds().top + this.e);
            float lerp = AndroidUtilities.lerp(0.5f, 1.0f, e);
            canvas.save();
            canvas.scale(lerp, lerp, drawable2.getBounds().centerX(), drawable2.getBounds().centerY());
            drawable2.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f34292a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f34292a.getIntrinsicWidth();
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
        this.f34292a.setColorFilter(colorFilter);
        this.f34293b.setColorFilter(colorFilter);
    }
}
