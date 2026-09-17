package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class wl0 extends Drawable {
    public long f32307a;
    public boolean f32308b;
    public Paint f32309c;
    public float d;
    public float f32310e;
    public float f32311f;
    public int f32312g;
    public int h;
    public int f32313i;
    public org.telegram.ui.Cells.t1 f32314j;
    public float f32315k;
    public int f32316l;
    public int f32317m;
    public org.telegram.ui.ActionBar.f6 f32318n;

    public final void a() {
        if (this.f32308b) {
            return;
        }
        this.f32307a = System.currentTimeMillis();
        this.f32308b = true;
        this.f32314j.invalidate();
    }

    public final void b() {
        if (!this.f32308b) {
            return;
        }
        this.f32308b = false;
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.f32309c;
        paint.setColor(i0.a.d(this.f32315k, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20787ic, this.f32318n), this.f32316l));
        int i10 = this.f32317m;
        if (i10 != 255) {
            paint.setAlpha((int) ((paint.getAlpha() / 255.0f) * i10));
        }
        int i11 = getBounds().left;
        int i12 = getBounds().top;
        int i13 = 0;
        while (i13 < 3) {
            Canvas canvas2 = canvas;
            canvas2.drawRect(AndroidUtilities.dp(2.0f) + i11, AndroidUtilities.dp((this.d * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(4.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            canvas2.drawRect(AndroidUtilities.dp(5.0f) + i11, AndroidUtilities.dp((this.f32310e * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(7.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            canvas2.drawRect(AndroidUtilities.dp(8.0f) + i11, AndroidUtilities.dp((this.f32311f * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(10.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            i13++;
            canvas = canvas2;
        }
        if (this.f32308b) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.f32307a;
            this.f32307a = currentTimeMillis;
            if (j3 > 50) {
                j3 = 50;
            }
            float f7 = (float) j3;
            float f10 = ((f7 / 300.0f) * this.f32312g) + this.d;
            this.d = f10;
            if (f10 > 1.0f) {
                this.f32312g = -1;
                this.d = 1.0f;
            } else if (f10 < 0.0f) {
                this.f32312g = 1;
                this.d = 0.0f;
            }
            float f11 = ((f7 / 310.0f) * this.h) + this.f32310e;
            this.f32310e = f11;
            if (f11 > 1.0f) {
                this.h = -1;
                this.f32310e = 1.0f;
            } else if (f11 < 0.0f) {
                this.h = 1;
                this.f32310e = 0.0f;
            }
            float f12 = ((f7 / 320.0f) * this.f32313i) + this.f32311f;
            this.f32311f = f12;
            if (f12 > 1.0f) {
                this.f32313i = -1;
                this.f32311f = 1.0f;
            } else if (f12 < 0.0f) {
                this.f32313i = 1;
                this.f32311f = 0.0f;
            }
            this.f32314j.invalidate();
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
        this.f32317m = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
