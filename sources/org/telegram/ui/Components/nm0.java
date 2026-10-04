package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class nm0 extends Drawable {
    public long f29013a;
    public boolean f29014b;
    public Paint f29015c;
    public float d;
    public float f29016e;
    public float f29017f;
    public int f29018g;
    public int h;
    public int f29019i;
    public org.telegram.ui.Cells.u1 f29020j;
    public float f29021k;
    public int f29022l;
    public int f29023m;
    public org.telegram.ui.ActionBar.d6 f29024n;

    public final void a() {
        if (this.f29014b) {
            return;
        }
        this.f29013a = System.currentTimeMillis();
        this.f29014b = true;
        this.f29020j.invalidate();
    }

    public final void b() {
        if (!this.f29014b) {
            return;
        }
        this.f29014b = false;
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.f29015c;
        paint.setColor(i0.a.d(this.f29021k, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20915ic, this.f29024n), this.f29022l));
        int i10 = this.f29023m;
        if (i10 != 255) {
            paint.setAlpha((int) ((paint.getAlpha() / 255.0f) * i10));
        }
        int i11 = getBounds().left;
        int i12 = getBounds().top;
        int i13 = 0;
        while (i13 < 3) {
            Canvas canvas2 = canvas;
            canvas2.drawRect(AndroidUtilities.dp(2.0f) + i11, AndroidUtilities.dp((this.d * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(4.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            canvas2.drawRect(AndroidUtilities.dp(5.0f) + i11, AndroidUtilities.dp((this.f29016e * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(7.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            canvas2.drawRect(AndroidUtilities.dp(8.0f) + i11, AndroidUtilities.dp((this.f29017f * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(10.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            i13++;
            canvas = canvas2;
        }
        if (this.f29014b) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.f29013a;
            this.f29013a = currentTimeMillis;
            if (j3 > 50) {
                j3 = 50;
            }
            float f7 = (float) j3;
            float f10 = ((f7 / 300.0f) * this.f29018g) + this.d;
            this.d = f10;
            if (f10 > 1.0f) {
                this.f29018g = -1;
                this.d = 1.0f;
            } else if (f10 < 0.0f) {
                this.f29018g = 1;
                this.d = 0.0f;
            }
            float f11 = ((f7 / 310.0f) * this.h) + this.f29016e;
            this.f29016e = f11;
            if (f11 > 1.0f) {
                this.h = -1;
                this.f29016e = 1.0f;
            } else if (f11 < 0.0f) {
                this.h = 1;
                this.f29016e = 0.0f;
            }
            float f12 = ((f7 / 320.0f) * this.f29019i) + this.f29017f;
            this.f29017f = f12;
            if (f12 > 1.0f) {
                this.f29019i = -1;
                this.f29017f = 1.0f;
            } else if (f12 < 0.0f) {
                this.f29019i = 1;
                this.f29017f = 0.0f;
            }
            this.f29020j.invalidate();
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
        this.f29023m = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
