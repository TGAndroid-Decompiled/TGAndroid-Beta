package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class hm0 extends Drawable {
    public long f24802a;
    public boolean f24803b;
    public Paint f24804c;
    public float d;
    public float e;
    public float f24805f;
    public int f24806g;
    public int h;
    public int f24807i;
    public org.telegram.ui.Cells.u1 f24808j;
    public float f24809k;
    public int f24810l;
    public int f24811m;
    public org.telegram.ui.ActionBar.d6 f24812n;

    public final void a() {
        if (this.f24803b) {
            return;
        }
        this.f24802a = System.currentTimeMillis();
        this.f24803b = true;
        this.f24808j.invalidate();
    }

    public final void b() {
        if (!this.f24803b) {
            return;
        }
        this.f24803b = false;
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.f24804c;
        paint.setColor(i0.a.d(this.f24809k, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19140ic, this.f24812n), this.f24810l));
        int i10 = this.f24811m;
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
            canvas2.drawRect(AndroidUtilities.dp(8.0f) + i11, AndroidUtilities.dp((this.f24805f * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(10.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            i13++;
            canvas = canvas2;
        }
        if (this.f24803b) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.f24802a;
            this.f24802a = currentTimeMillis;
            if (j3 > 50) {
                j3 = 50;
            }
            float f7 = (float) j3;
            float f10 = ((f7 / 300.0f) * this.f24806g) + this.d;
            this.d = f10;
            if (f10 > 1.0f) {
                this.f24806g = -1;
                this.d = 1.0f;
            } else if (f10 < 0.0f) {
                this.f24806g = 1;
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
            float f12 = ((f7 / 320.0f) * this.f24807i) + this.f24805f;
            this.f24805f = f12;
            if (f12 > 1.0f) {
                this.f24807i = -1;
                this.f24805f = 1.0f;
            } else if (f12 < 0.0f) {
                this.f24807i = 1;
                this.f24805f = 0.0f;
            }
            this.f24808j.invalidate();
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
        this.f24811m = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
