package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class cn0 extends Drawable {
    public long f27204a;
    public boolean f27205b;
    public Paint f27206c;
    public float d;
    public float e;
    public float f27207f;
    public int f27208g;
    public int h;
    public int f27209i;
    public org.telegram.ui.Cells.s1 f27210j;
    public float f27211k;
    public int f27212l;
    public int f27213m;
    public org.telegram.ui.ActionBar.u6 f27214n;

    public final void a() {
        if (this.f27205b) {
            return;
        }
        this.f27204a = System.currentTimeMillis();
        this.f27205b = true;
        this.f27210j.invalidate();
    }

    public final void b() {
        if (!this.f27205b) {
            return;
        }
        this.f27205b = false;
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.f27206c;
        paint.setColor(i0.a.f(this.f27211k, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23451ic, this.f27214n), this.f27212l));
        int i10 = this.f27213m;
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
            canvas2.drawRect(AndroidUtilities.dp(8.0f) + i11, AndroidUtilities.dp((this.f27207f * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(10.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            i13++;
            canvas = canvas2;
        }
        if (this.f27205b) {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.f27204a;
            this.f27204a = currentTimeMillis;
            if (j10 > 50) {
                j10 = 50;
            }
            float f7 = (float) j10;
            float f10 = ((f7 / 300.0f) * this.f27208g) + this.d;
            this.d = f10;
            if (f10 > 1.0f) {
                this.f27208g = -1;
                this.d = 1.0f;
            } else if (f10 < 0.0f) {
                this.f27208g = 1;
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
            float f12 = ((f7 / 320.0f) * this.f27209i) + this.f27207f;
            this.f27207f = f12;
            if (f12 > 1.0f) {
                this.f27209i = -1;
                this.f27207f = 1.0f;
            } else if (f12 < 0.0f) {
                this.f27209i = 1;
                this.f27207f = 0.0f;
            }
            this.f27210j.invalidate();
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
        this.f27213m = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
