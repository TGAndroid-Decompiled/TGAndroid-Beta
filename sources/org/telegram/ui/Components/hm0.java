package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class hm0 extends Drawable {
    public long f24695a;
    public boolean f24696b;
    public Paint f24697c;
    public float d;
    public float e;
    public float f24698f;
    public int f24699g;
    public int h;
    public int f24700i;
    public org.telegram.ui.Cells.u1 f24701j;
    public float f24702k;
    public int f24703l;
    public int f24704m;
    public org.telegram.ui.ActionBar.e6 f24705n;

    public final void a() {
        if (this.f24696b) {
            return;
        }
        this.f24695a = System.currentTimeMillis();
        this.f24696b = true;
        this.f24701j.invalidate();
    }

    public final void b() {
        if (!this.f24696b) {
            return;
        }
        this.f24696b = false;
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.f24697c;
        paint.setColor(i0.a.d(this.f24702k, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19158ic, this.f24705n), this.f24703l));
        int i10 = this.f24704m;
        if (i10 != 255) {
            paint.setAlpha((int) ((paint.getAlpha() / 255.0f) * i10));
        }
        int i11 = getBounds().left;
        int i12 = getBounds().top;
        int i13 = 0;
        while (i13 < 3) {
            Canvas canvas2 = canvas;
            canvas2.drawRect(AndroidUtilities.dp(2.0f) + i11, AndroidUtilities.dp((this.d * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(4.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            canvas2.drawRect(AndroidUtilities.dp(5.0f) + i11, AndroidUtilities.dp((this.e * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(7.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            canvas2.drawRect(AndroidUtilities.dp(8.0f) + i11, AndroidUtilities.dp((this.f24698f * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(10.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            i13++;
            canvas = canvas2;
        }
        if (this.f24696b) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.f24695a;
            this.f24695a = currentTimeMillis;
            if (j3 > 50) {
                j3 = 50;
            }
            float f7 = (float) j3;
            float f10 = ((f7 / 300.0f) * this.f24699g) + this.d;
            this.d = f10;
            if (f10 > 1.0f) {
                this.f24699g = -1;
                this.d = 1.0f;
            } else if (f10 < 0.0f) {
                this.f24699g = 1;
                this.d = 0.0f;
            }
            float f11 = ((f7 / 310.0f) * this.h) + this.e;
            this.e = f11;
            if (f11 > 1.0f) {
                this.h = -1;
                this.e = 1.0f;
            } else if (f11 < 0.0f) {
                this.h = 1;
                this.e = 0.0f;
            }
            float f12 = ((f7 / 320.0f) * this.f24700i) + this.f24698f;
            this.f24698f = f12;
            if (f12 > 1.0f) {
                this.f24700i = -1;
                this.f24698f = 1.0f;
            } else if (f12 < 0.0f) {
                this.f24700i = 1;
                this.f24698f = 0.0f;
            }
            this.f24701j.invalidate();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(12.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(12.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f24704m = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
