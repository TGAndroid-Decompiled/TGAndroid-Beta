package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class es extends Drawable {
    public final Drawable f37432a;
    public final Drawable f37433b;
    public int d;
    public int f37435e;
    public final ArrayList f37434c = new ArrayList();
    public boolean f37436f = false;
    public final org.telegram.ui.Components.g6 f37437g = new org.telegram.ui.Components.g6(new cj(this, 14), 420, org.telegram.ui.Components.is.h);
    public int h = 255;

    public es(Drawable drawable, Drawable drawable2) {
        this.f37432a = drawable;
        this.f37433b = drawable2;
    }

    public final void a(int i10, int i11) {
        this.d = i10;
        this.f37435e = i11;
    }

    public final void b(boolean z10) {
        if (this.f37436f == z10) {
            return;
        }
        this.f37436f = z10;
        ArrayList arrayList = this.f37434c;
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
        float e7 = this.f37437g.e(this.f37436f);
        int i10 = this.h;
        Drawable drawable = this.f37432a;
        drawable.setAlpha(i10);
        drawable.setBounds(getBounds());
        drawable.draw(canvas);
        if (e7 > 0.0f) {
            Drawable drawable2 = this.f37433b;
            drawable2.setAlpha((int) (this.h * e7));
            drawable2.setBounds(getBounds().left + this.d, getBounds().top + this.f37435e, drawable2.getIntrinsicWidth() + getBounds().left + this.d, drawable2.getIntrinsicHeight() + getBounds().top + this.f37435e);
            float lerp = AndroidUtilities.lerp(0.5f, 1.0f, e7);
            canvas.save();
            canvas.scale(lerp, lerp, drawable2.getBounds().centerX(), drawable2.getBounds().centerY());
            drawable2.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f37432a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f37432a.getIntrinsicWidth();
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
        this.f37432a.setColorFilter(colorFilter);
        this.f37433b.setColorFilter(colorFilter);
    }
}
