package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class hm0 extends Drawable {
    public long f24828a;
    public boolean f24829b;
    public Paint f24830c;
    public float d;
    public float e;
    public float f24831f;
    public int f24832g;
    public int h;
    public int f24833i;
    public org.telegram.ui.Cells.u1 f24834j;
    public float f24835k;
    public int f24836l;
    public int f24837m;
    public org.telegram.ui.ActionBar.d6 f24838n;

    public final void a() {
        if (this.f24829b) {
            return;
        }
        this.f24828a = System.currentTimeMillis();
        this.f24829b = true;
        this.f24834j.invalidate();
    }

    public final void b() {
        if (!this.f24829b) {
            return;
        }
        this.f24829b = false;
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.f24830c;
        paint.setColor(i0.a.d(this.f24835k, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19154ic, this.f24838n), this.f24836l));
        int i10 = this.f24837m;
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
            canvas2.drawRect(AndroidUtilities.dp(8.0f) + i11, AndroidUtilities.dp((this.f24831f * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(10.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            i13++;
            canvas = canvas2;
        }
        if (this.f24829b) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.f24828a;
            this.f24828a = currentTimeMillis;
            if (j3 > 50) {
                j3 = 50;
            }
            float f7 = (float) j3;
            float f10 = ((f7 / 300.0f) * this.f24832g) + this.d;
            this.d = f10;
            if (f10 > 1.0f) {
                this.f24832g = -1;
                this.d = 1.0f;
            } else if (f10 < 0.0f) {
                this.f24832g = 1;
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
            float f12 = ((f7 / 320.0f) * this.f24833i) + this.f24831f;
            this.f24831f = f12;
            if (f12 > 1.0f) {
                this.f24833i = -1;
                this.f24831f = 1.0f;
            } else if (f12 < 0.0f) {
                this.f24833i = 1;
                this.f24831f = 0.0f;
            }
            this.f24834j.invalidate();
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
        this.f24837m = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
