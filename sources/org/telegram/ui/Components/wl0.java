package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class wl0 extends Drawable {
    public long f29734a;
    public boolean f29735b;
    public Paint f29736c;
    public float d;
    public float e;
    public float f29737f;
    public int f29738g;
    public int h;
    public int f29739i;
    public org.telegram.ui.Cells.t1 f29740j;
    public float f29741k;
    public int f29742l;
    public int f29743m;
    public org.telegram.ui.ActionBar.e6 f29744n;

    public final void a() {
        if (this.f29735b) {
            return;
        }
        this.f29734a = System.currentTimeMillis();
        this.f29735b = true;
        this.f29740j.invalidate();
    }

    public final void b() {
        if (!this.f29735b) {
            return;
        }
        this.f29735b = false;
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.f29736c;
        paint.setColor(i0.a.d(this.f29741k, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18929ic, this.f29744n), this.f29742l));
        int i10 = this.f29743m;
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
            canvas2.drawRect(AndroidUtilities.dp(8.0f) + i11, AndroidUtilities.dp((this.f29737f * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(10.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            i13++;
            canvas = canvas2;
        }
        if (this.f29735b) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.f29734a;
            this.f29734a = currentTimeMillis;
            if (j3 > 50) {
                j3 = 50;
            }
            float f7 = (float) j3;
            float f10 = ((f7 / 300.0f) * this.f29738g) + this.d;
            this.d = f10;
            if (f10 > 1.0f) {
                this.f29738g = -1;
                this.d = 1.0f;
            } else if (f10 < 0.0f) {
                this.f29738g = 1;
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
            float f12 = ((f7 / 320.0f) * this.f29739i) + this.f29737f;
            this.f29737f = f12;
            if (f12 > 1.0f) {
                this.f29739i = -1;
                this.f29737f = 1.0f;
            } else if (f12 < 0.0f) {
                this.f29739i = 1;
                this.f29737f = 0.0f;
            }
            this.f29740j.invalidate();
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
        this.f29743m = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
