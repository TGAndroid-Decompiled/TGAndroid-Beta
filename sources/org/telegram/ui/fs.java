package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class fs extends Drawable {
    public final Drawable f36375a;
    public final Drawable f36376b;
    public int d;
    public int f36378e;
    public final ArrayList f36377c = new ArrayList();
    public boolean f36379f = false;
    public final org.telegram.ui.Components.e6 f36380g = new org.telegram.ui.Components.e6(new bj(this, 13), 420, org.telegram.ui.Components.tr.h);
    public int h = 255;

    public fs(Drawable drawable, Drawable drawable2) {
        this.f36375a = drawable;
        this.f36376b = drawable2;
    }

    public final void a(int i10, int i11) {
        this.d = i10;
        this.f36378e = i11;
    }

    public final void b(boolean z10) {
        if (this.f36379f == z10) {
            return;
        }
        this.f36379f = z10;
        ArrayList arrayList = this.f36377c;
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
        float e7 = this.f36380g.e(this.f36379f);
        int i10 = this.h;
        Drawable drawable = this.f36375a;
        drawable.setAlpha(i10);
        drawable.setBounds(getBounds());
        drawable.draw(canvas);
        if (e7 > 0.0f) {
            Drawable drawable2 = this.f36376b;
            drawable2.setAlpha((int) (this.h * e7));
            drawable2.setBounds(getBounds().left + this.d, getBounds().top + this.f36378e, drawable2.getIntrinsicWidth() + getBounds().left + this.d, drawable2.getIntrinsicHeight() + getBounds().top + this.f36378e);
            float lerp = AndroidUtilities.lerp(0.5f, 1.0f, e7);
            canvas.save();
            canvas.scale(lerp, lerp, drawable2.getBounds().centerX(), drawable2.getBounds().centerY());
            drawable2.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f36375a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f36375a.getIntrinsicWidth();
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
        this.f36375a.setColorFilter(colorFilter);
        this.f36376b.setColorFilter(colorFilter);
    }
}
