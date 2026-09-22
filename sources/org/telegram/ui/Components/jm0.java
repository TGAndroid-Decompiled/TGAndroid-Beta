package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class jm0 extends Drawable {
    public long f25405a;
    public boolean f25406b;
    public Paint f25407c;
    public float d;
    public float e;
    public float f25408f;
    public int f25409g;
    public int h;
    public int f25410i;
    public org.telegram.ui.Cells.u1 f25411j;
    public float f25412k;
    public int f25413l;
    public int f25414m;
    public org.telegram.ui.ActionBar.f6 f25415n;

    public final void a() {
        if (this.f25406b) {
            return;
        }
        this.f25405a = System.currentTimeMillis();
        this.f25406b = true;
        this.f25411j.invalidate();
    }

    public final void b() {
        if (!this.f25406b) {
            return;
        }
        this.f25406b = false;
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.f25407c;
        paint.setColor(i0.a.d(this.f25412k, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19205ic, this.f25415n), this.f25413l));
        int i10 = this.f25414m;
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
            canvas2.drawRect(AndroidUtilities.dp(8.0f) + i11, AndroidUtilities.dp((this.f25408f * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(10.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            i13++;
            canvas = canvas2;
        }
        if (this.f25406b) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.f25405a;
            this.f25405a = currentTimeMillis;
            if (j3 > 50) {
                j3 = 50;
            }
            float f7 = (float) j3;
            float f10 = ((f7 / 300.0f) * this.f25409g) + this.d;
            this.d = f10;
            if (f10 > 1.0f) {
                this.f25409g = -1;
                this.d = 1.0f;
            } else if (f10 < 0.0f) {
                this.f25409g = 1;
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
            float f12 = ((f7 / 320.0f) * this.f25410i) + this.f25408f;
            this.f25408f = f12;
            if (f12 > 1.0f) {
                this.f25410i = -1;
                this.f25408f = 1.0f;
            } else if (f12 < 0.0f) {
                this.f25410i = 1;
                this.f25408f = 0.0f;
            }
            this.f25411j.invalidate();
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
        this.f25414m = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
