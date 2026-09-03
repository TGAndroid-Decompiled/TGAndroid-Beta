package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class ds extends Drawable {
    public final Drawable f36244a;
    public final Drawable f36245b;
    public int d;
    public int f36247e;
    public final ArrayList f36246c = new ArrayList();
    public boolean f36248f = false;
    public final org.telegram.ui.Components.z5 f36249g = new org.telegram.ui.Components.z5(new zi(this, 13), 420, org.telegram.ui.Components.pr.h);
    public int h = 255;

    public ds(Drawable drawable, Drawable drawable2) {
        this.f36244a = drawable;
        this.f36245b = drawable2;
    }

    public final void a(int i10, int i11) {
        this.d = i10;
        this.f36247e = i11;
    }

    public final void b(boolean z4) {
        if (this.f36248f == z4) {
            return;
        }
        this.f36248f = z4;
        ArrayList arrayList = this.f36246c;
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
        float e6 = this.f36249g.e(this.f36248f);
        int i10 = this.h;
        Drawable drawable = this.f36244a;
        drawable.setAlpha(i10);
        drawable.setBounds(getBounds());
        drawable.draw(canvas);
        if (e6 > 0.0f) {
            Drawable drawable2 = this.f36245b;
            drawable2.setAlpha((int) (this.h * e6));
            drawable2.setBounds(getBounds().left + this.d, getBounds().top + this.f36247e, drawable2.getIntrinsicWidth() + getBounds().left + this.d, drawable2.getIntrinsicHeight() + getBounds().top + this.f36247e);
            float lerp = AndroidUtilities.lerp(0.5f, 1.0f, e6);
            canvas.save();
            canvas.scale(lerp, lerp, drawable2.getBounds().centerX(), drawable2.getBounds().centerY());
            drawable2.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f36244a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f36244a.getIntrinsicWidth();
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
        this.f36244a.setColorFilter(colorFilter);
        this.f36245b.setColorFilter(colorFilter);
    }
}
