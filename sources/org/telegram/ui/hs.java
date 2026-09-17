package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class hs extends Drawable {
    public final Drawable f37127a;
    public final Drawable f37128b;
    public int d;
    public int f37130e;
    public final ArrayList f37129c = new ArrayList();
    public boolean f37131f = false;
    public final org.telegram.ui.Components.e6 f37132g = new org.telegram.ui.Components.e6(new dj(this, 13), 420, org.telegram.ui.Components.pr.h);
    public int h = 255;

    public hs(Drawable drawable, Drawable drawable2) {
        this.f37127a = drawable;
        this.f37128b = drawable2;
    }

    public final void a(int i10, int i11) {
        this.d = i10;
        this.f37130e = i11;
    }

    public final void b(boolean z10) {
        if (this.f37131f == z10) {
            return;
        }
        this.f37131f = z10;
        ArrayList arrayList = this.f37129c;
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
        float e7 = this.f37132g.e(this.f37131f);
        int i10 = this.h;
        Drawable drawable = this.f37127a;
        drawable.setAlpha(i10);
        drawable.setBounds(getBounds());
        drawable.draw(canvas);
        if (e7 > 0.0f) {
            Drawable drawable2 = this.f37128b;
            drawable2.setAlpha((int) (this.h * e7));
            drawable2.setBounds(getBounds().left + this.d, getBounds().top + this.f37130e, drawable2.getIntrinsicWidth() + getBounds().left + this.d, drawable2.getIntrinsicHeight() + getBounds().top + this.f37130e);
            float lerp = AndroidUtilities.lerp(0.5f, 1.0f, e7);
            canvas.save();
            canvas.scale(lerp, lerp, drawable2.getBounds().centerX(), drawable2.getBounds().centerY());
            drawable2.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f37127a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f37127a.getIntrinsicWidth();
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
        this.f37127a.setColorFilter(colorFilter);
        this.f37128b.setColorFilter(colorFilter);
    }
}
