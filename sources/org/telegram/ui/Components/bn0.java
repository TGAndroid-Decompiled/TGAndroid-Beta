package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class bn0 extends Drawable {
    public long f25052a;
    public boolean f25053b;
    public Paint f25054c;
    public float d;
    public float f25055e;
    public float f25056f;
    public int f25057g;
    public int h;
    public int f25058i;
    public org.telegram.ui.Cells.u1 f25059j;
    public float f25060k;
    public int f25061l;
    public int f25062m;
    public org.telegram.ui.ActionBar.e6 f25063n;

    public final void a() {
        if (this.f25053b) {
            return;
        }
        this.f25052a = System.currentTimeMillis();
        this.f25053b = true;
        this.f25059j.invalidate();
    }

    public final void b() {
        if (!this.f25053b) {
            return;
        }
        this.f25053b = false;
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.f25054c;
        paint.setColor(i0.a.d(this.f25060k, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20894ic, this.f25063n), this.f25061l));
        int i10 = this.f25062m;
        if (i10 != 255) {
            paint.setAlpha((int) ((paint.getAlpha() / 255.0f) * i10));
        }
        int i11 = getBounds().left;
        int i12 = getBounds().top;
        int i13 = 0;
        while (i13 < 3) {
            Canvas canvas2 = canvas;
            canvas2.drawRect(AndroidUtilities.dp(2.0f) + i11, AndroidUtilities.dp((this.d * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(4.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            canvas2.drawRect(AndroidUtilities.dp(5.0f) + i11, AndroidUtilities.dp((this.f25055e * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(7.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            canvas2.drawRect(AndroidUtilities.dp(8.0f) + i11, AndroidUtilities.dp((this.f25056f * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(10.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            i13++;
            canvas = canvas2;
        }
        if (this.f25053b) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.f25052a;
            this.f25052a = currentTimeMillis;
            if (j3 > 50) {
                j3 = 50;
            }
            float f7 = (float) j3;
            float f10 = ((f7 / 300.0f) * this.f25057g) + this.d;
            this.d = f10;
            if (f10 > 1.0f) {
                this.f25057g = -1;
                this.d = 1.0f;
            } else if (f10 < 0.0f) {
                this.f25057g = 1;
                this.d = 0.0f;
            }
            float f11 = ((f7 / 310.0f) * this.h) + this.f25055e;
            this.f25055e = f11;
            if (f11 > 1.0f) {
                this.h = -1;
                this.f25055e = 1.0f;
            } else if (f11 < 0.0f) {
                this.h = 1;
                this.f25055e = 0.0f;
            }
            float f12 = ((f7 / 320.0f) * this.f25058i) + this.f25056f;
            this.f25056f = f12;
            if (f12 > 1.0f) {
                this.f25058i = -1;
                this.f25056f = 1.0f;
            } else if (f12 < 0.0f) {
                this.f25058i = 1;
                this.f25056f = 0.0f;
            }
            this.f25059j.invalidate();
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
        this.f25062m = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
