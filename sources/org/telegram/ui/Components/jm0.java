package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class jm0 extends Drawable {
    public long f25482a;
    public boolean f25483b;
    public Paint f25484c;
    public float d;
    public float e;
    public float f25485f;
    public int f25486g;
    public int h;
    public int f25487i;
    public org.telegram.ui.Cells.u1 f25488j;
    public float f25489k;
    public int f25490l;
    public int f25491m;
    public org.telegram.ui.ActionBar.d6 f25492n;

    public final void a() {
        if (this.f25483b) {
            return;
        }
        this.f25482a = System.currentTimeMillis();
        this.f25483b = true;
        this.f25488j.invalidate();
    }

    public final void b() {
        if (!this.f25483b) {
            return;
        }
        this.f25483b = false;
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.f25484c;
        paint.setColor(i0.a.d(this.f25489k, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19155ic, this.f25492n), this.f25490l));
        int i10 = this.f25491m;
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
            canvas2.drawRect(AndroidUtilities.dp(8.0f) + i11, AndroidUtilities.dp((this.f25485f * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(10.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            i13++;
            canvas = canvas2;
        }
        if (this.f25483b) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.f25482a;
            this.f25482a = currentTimeMillis;
            if (j3 > 50) {
                j3 = 50;
            }
            float f7 = (float) j3;
            float f10 = ((f7 / 300.0f) * this.f25486g) + this.d;
            this.d = f10;
            if (f10 > 1.0f) {
                this.f25486g = -1;
                this.d = 1.0f;
            } else if (f10 < 0.0f) {
                this.f25486g = 1;
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
            float f12 = ((f7 / 320.0f) * this.f25487i) + this.f25485f;
            this.f25485f = f12;
            if (f12 > 1.0f) {
                this.f25487i = -1;
                this.f25485f = 1.0f;
            } else if (f12 < 0.0f) {
                this.f25487i = 1;
                this.f25485f = 0.0f;
            }
            this.f25488j.invalidate();
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
        this.f25491m = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
