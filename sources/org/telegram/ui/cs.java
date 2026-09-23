package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class cs extends Drawable {
    public final Drawable f32394a;
    public final Drawable f32395b;
    public int d;
    public int e;
    public final ArrayList f32396c = new ArrayList();
    public boolean f32397f = false;
    public final org.telegram.ui.Components.e6 f32398g = new org.telegram.ui.Components.e6(new aj(this, 13), 420, org.telegram.ui.Components.rr.h);
    public int h = 255;

    public cs(Drawable drawable, Drawable drawable2) {
        this.f32394a = drawable;
        this.f32395b = drawable2;
    }

    public final void a(int i10, int i11) {
        this.d = i10;
        this.e = i11;
    }

    public final void b(boolean z10) {
        if (this.f32397f == z10) {
            return;
        }
        this.f32397f = z10;
        ArrayList arrayList = this.f32396c;
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
        float e = this.f32398g.e(this.f32397f);
        int i10 = this.h;
        Drawable drawable = this.f32394a;
        drawable.setAlpha(i10);
        drawable.setBounds(getBounds());
        drawable.draw(canvas);
        if (e > 0.0f) {
            Drawable drawable2 = this.f32395b;
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
        return this.f32394a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f32394a.getIntrinsicWidth();
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
        this.f32394a.setColorFilter(colorFilter);
        this.f32395b.setColorFilter(colorFilter);
    }
}
