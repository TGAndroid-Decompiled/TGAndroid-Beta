package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class gm0 extends Drawable {
    public long f24415a;
    public boolean f24416b;
    public Paint f24417c;
    public float d;
    public float e;
    public float f24418f;
    public int f24419g;
    public int h;
    public int f24420i;
    public org.telegram.ui.Cells.u1 f24421j;
    public float f24422k;
    public int f24423l;
    public int f24424m;
    public org.telegram.ui.ActionBar.f6 f24425n;

    public final void a() {
        if (this.f24416b) {
            return;
        }
        this.f24415a = System.currentTimeMillis();
        this.f24416b = true;
        this.f24421j.invalidate();
    }

    public final void b() {
        if (!this.f24416b) {
            return;
        }
        this.f24416b = false;
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.f24417c;
        paint.setColor(i0.a.d(this.f24422k, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19190ic, this.f24425n), this.f24423l));
        int i10 = this.f24424m;
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
            canvas2.drawRect(AndroidUtilities.dp(8.0f) + i11, AndroidUtilities.dp((this.f24418f * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(10.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            i13++;
            canvas = canvas2;
        }
        if (this.f24416b) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.f24415a;
            this.f24415a = currentTimeMillis;
            if (j3 > 50) {
                j3 = 50;
            }
            float f7 = (float) j3;
            float f10 = ((f7 / 300.0f) * this.f24419g) + this.d;
            this.d = f10;
            if (f10 > 1.0f) {
                this.f24419g = -1;
                this.d = 1.0f;
            } else if (f10 < 0.0f) {
                this.f24419g = 1;
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
            float f12 = ((f7 / 320.0f) * this.f24420i) + this.f24418f;
            this.f24418f = f12;
            if (f12 > 1.0f) {
                this.f24420i = -1;
                this.f24418f = 1.0f;
            } else if (f12 < 0.0f) {
                this.f24420i = 1;
                this.f24418f = 0.0f;
            }
            this.f24421j.invalidate();
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
        this.f24424m = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
