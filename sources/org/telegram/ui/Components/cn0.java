package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class cn0 extends Drawable {
    public long f25389a;
    public boolean f25390b;
    public Paint f25391c;
    public float d;
    public float f25392e;
    public float f25393f;
    public int f25394g;
    public int h;
    public int f25395i;
    public org.telegram.ui.Cells.u1 f25396j;
    public float f25397k;
    public int f25398l;
    public int f25399m;
    public org.telegram.ui.ActionBar.d6 f25400n;

    public final void a() {
        if (this.f25390b) {
            return;
        }
        this.f25389a = System.currentTimeMillis();
        this.f25390b = true;
        this.f25396j.invalidate();
    }

    public final void b() {
        if (!this.f25390b) {
            return;
        }
        this.f25390b = false;
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.f25391c;
        paint.setColor(i0.a.d(this.f25397k, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20919ic, this.f25400n), this.f25398l));
        int i10 = this.f25399m;
        if (i10 != 255) {
            paint.setAlpha((int) ((paint.getAlpha() / 255.0f) * i10));
        }
        int i11 = getBounds().left;
        int i12 = getBounds().top;
        int i13 = 0;
        while (i13 < 3) {
            Canvas canvas2 = canvas;
            canvas2.drawRect(AndroidUtilities.dp(2.0f) + i11, AndroidUtilities.dp((this.d * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(4.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            canvas2.drawRect(AndroidUtilities.dp(5.0f) + i11, AndroidUtilities.dp((this.f25392e * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(7.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            canvas2.drawRect(AndroidUtilities.dp(8.0f) + i11, AndroidUtilities.dp((this.f25393f * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(10.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            i13++;
            canvas = canvas2;
        }
        if (this.f25390b) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.f25389a;
            this.f25389a = currentTimeMillis;
            if (j3 > 50) {
                j3 = 50;
            }
            float f7 = (float) j3;
            float f10 = ((f7 / 300.0f) * this.f25394g) + this.d;
            this.d = f10;
            if (f10 > 1.0f) {
                this.f25394g = -1;
                this.d = 1.0f;
            } else if (f10 < 0.0f) {
                this.f25394g = 1;
                this.d = 0.0f;
            }
            float f11 = ((f7 / 310.0f) * this.h) + this.f25392e;
            this.f25392e = f11;
            if (f11 > 1.0f) {
                this.h = -1;
                this.f25392e = 1.0f;
            } else if (f11 < 0.0f) {
                this.h = 1;
                this.f25392e = 0.0f;
            }
            float f12 = ((f7 / 320.0f) * this.f25395i) + this.f25393f;
            this.f25393f = f12;
            if (f12 > 1.0f) {
                this.f25395i = -1;
                this.f25393f = 1.0f;
            } else if (f12 < 0.0f) {
                this.f25395i = 1;
                this.f25393f = 0.0f;
            }
            this.f25396j.invalidate();
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
        this.f25399m = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
