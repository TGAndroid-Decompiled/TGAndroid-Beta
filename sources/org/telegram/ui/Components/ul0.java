package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class ul0 extends Drawable {
    public long f33255a;
    public boolean f33256b;
    public Paint f33257c;
    public float d;
    public float f33258e;
    public float f33259f;
    public int f33260g;
    public int h;
    public int f33261i;
    public org.telegram.ui.Cells.s1 f33262j;
    public float f33263k;
    public int f33264l;
    public int f33265m;
    public org.telegram.ui.ActionBar.c6 f33266n;

    public final void a() {
        if (this.f33256b) {
            return;
        }
        this.f33255a = System.currentTimeMillis();
        this.f33256b = true;
        this.f33262j.invalidate();
    }

    public final void b() {
        if (!this.f33256b) {
            return;
        }
        this.f33256b = false;
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.f33257c;
        paint.setColor(i0.a.d(this.f33263k, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23158ic, this.f33266n), this.f33264l));
        int i10 = this.f33265m;
        if (i10 != 255) {
            paint.setAlpha((int) ((paint.getAlpha() / 255.0f) * i10));
        }
        int i11 = getBounds().left;
        int i12 = getBounds().top;
        int i13 = 0;
        while (i13 < 3) {
            Canvas canvas2 = canvas;
            canvas2.drawRect(AndroidUtilities.dp(2.0f) + i11, AndroidUtilities.dp((this.d * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(4.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            canvas2.drawRect(AndroidUtilities.dp(5.0f) + i11, AndroidUtilities.dp((this.f33258e * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(7.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            canvas2.drawRect(AndroidUtilities.dp(8.0f) + i11, AndroidUtilities.dp((this.f33259f * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(10.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            i13++;
            canvas = canvas2;
        }
        if (this.f33256b) {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.f33255a;
            this.f33255a = currentTimeMillis;
            if (j10 > 50) {
                j10 = 50;
            }
            float f9 = (float) j10;
            float f10 = ((f9 / 300.0f) * this.f33260g) + this.d;
            this.d = f10;
            if (f10 > 1.0f) {
                this.f33260g = -1;
                this.d = 1.0f;
            } else if (f10 < 0.0f) {
                this.f33260g = 1;
                this.d = 0.0f;
            }
            float f11 = ((f9 / 310.0f) * this.h) + this.f33258e;
            this.f33258e = f11;
            if (f11 > 1.0f) {
                this.h = -1;
                this.f33258e = 1.0f;
            } else if (f11 < 0.0f) {
                this.h = 1;
                this.f33258e = 0.0f;
            }
            float f12 = ((f9 / 320.0f) * this.f33261i) + this.f33259f;
            this.f33259f = f12;
            if (f12 > 1.0f) {
                this.f33261i = -1;
                this.f33259f = 1.0f;
            } else if (f12 < 0.0f) {
                this.f33261i = 1;
                this.f33259f = 0.0f;
            }
            this.f33262j.invalidate();
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
        this.f33265m = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
