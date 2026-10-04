package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class nm0 extends Drawable {
    public long f29012a;
    public boolean f29013b;
    public Paint f29014c;
    public float d;
    public float f29015e;
    public float f29016f;
    public int f29017g;
    public int h;
    public int f29018i;
    public org.telegram.ui.Cells.u1 f29019j;
    public float f29020k;
    public int f29021l;
    public int f29022m;
    public org.telegram.ui.ActionBar.d6 f29023n;

    public final void a() {
        if (this.f29013b) {
            return;
        }
        this.f29012a = System.currentTimeMillis();
        this.f29013b = true;
        this.f29019j.invalidate();
    }

    public final void b() {
        if (!this.f29013b) {
            return;
        }
        this.f29013b = false;
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.f29014c;
        paint.setColor(i0.a.d(this.f29020k, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20914ic, this.f29023n), this.f29021l));
        int i10 = this.f29022m;
        if (i10 != 255) {
            paint.setAlpha((int) ((paint.getAlpha() / 255.0f) * i10));
        }
        int i11 = getBounds().left;
        int i12 = getBounds().top;
        int i13 = 0;
        while (i13 < 3) {
            Canvas canvas2 = canvas;
            canvas2.drawRect(AndroidUtilities.dp(2.0f) + i11, AndroidUtilities.dp((this.d * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(4.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            canvas2.drawRect(AndroidUtilities.dp(5.0f) + i11, AndroidUtilities.dp((this.f29015e * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(7.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            canvas2.drawRect(AndroidUtilities.dp(8.0f) + i11, AndroidUtilities.dp((this.f29016f * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(10.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            i13++;
            canvas = canvas2;
        }
        if (this.f29013b) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.f29012a;
            this.f29012a = currentTimeMillis;
            if (j3 > 50) {
                j3 = 50;
            }
            float f7 = (float) j3;
            float f10 = ((f7 / 300.0f) * this.f29017g) + this.d;
            this.d = f10;
            if (f10 > 1.0f) {
                this.f29017g = -1;
                this.d = 1.0f;
            } else if (f10 < 0.0f) {
                this.f29017g = 1;
                this.d = 0.0f;
            }
            float f11 = ((f7 / 310.0f) * this.h) + this.f29015e;
            this.f29015e = f11;
            if (f11 > 1.0f) {
                this.h = -1;
                this.f29015e = 1.0f;
            } else if (f11 < 0.0f) {
                this.h = 1;
                this.f29015e = 0.0f;
            }
            float f12 = ((f7 / 320.0f) * this.f29018i) + this.f29016f;
            this.f29016f = f12;
            if (f12 > 1.0f) {
                this.f29018i = -1;
                this.f29016f = 1.0f;
            } else if (f12 < 0.0f) {
                this.f29018i = 1;
                this.f29016f = 0.0f;
            }
            this.f29019j.invalidate();
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
        this.f29022m = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
