package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class cn0 extends Drawable {
    public long f25327a;
    public boolean f25328b;
    public Paint f25329c;
    public float d;
    public float f25330e;
    public float f25331f;
    public int f25332g;
    public int h;
    public int f25333i;
    public org.telegram.ui.Cells.u1 f25334j;
    public float f25335k;
    public int f25336l;
    public int f25337m;
    public org.telegram.ui.ActionBar.e6 f25338n;

    public final void a() {
        if (this.f25328b) {
            return;
        }
        this.f25327a = System.currentTimeMillis();
        this.f25328b = true;
        this.f25334j.invalidate();
    }

    public final void b() {
        if (!this.f25328b) {
            return;
        }
        this.f25328b = false;
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.f25329c;
        paint.setColor(i0.a.d(this.f25335k, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20898ic, this.f25338n), this.f25336l));
        int i10 = this.f25337m;
        if (i10 != 255) {
            paint.setAlpha((int) ((paint.getAlpha() / 255.0f) * i10));
        }
        int i11 = getBounds().left;
        int i12 = getBounds().top;
        int i13 = 0;
        while (i13 < 3) {
            Canvas canvas2 = canvas;
            canvas2.drawRect(AndroidUtilities.dp(2.0f) + i11, AndroidUtilities.dp((this.d * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(4.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            canvas2.drawRect(AndroidUtilities.dp(5.0f) + i11, AndroidUtilities.dp((this.f25330e * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(7.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            canvas2.drawRect(AndroidUtilities.dp(8.0f) + i11, AndroidUtilities.dp((this.f25331f * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(10.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            i13++;
            canvas = canvas2;
        }
        if (this.f25328b) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.f25327a;
            this.f25327a = currentTimeMillis;
            if (j3 > 50) {
                j3 = 50;
            }
            float f7 = (float) j3;
            float f10 = ((f7 / 300.0f) * this.f25332g) + this.d;
            this.d = f10;
            if (f10 > 1.0f) {
                this.f25332g = -1;
                this.d = 1.0f;
            } else if (f10 < 0.0f) {
                this.f25332g = 1;
                this.d = 0.0f;
            }
            float f11 = ((f7 / 310.0f) * this.h) + this.f25330e;
            this.f25330e = f11;
            if (f11 > 1.0f) {
                this.h = -1;
                this.f25330e = 1.0f;
            } else if (f11 < 0.0f) {
                this.h = 1;
                this.f25330e = 0.0f;
            }
            float f12 = ((f7 / 320.0f) * this.f25333i) + this.f25331f;
            this.f25331f = f12;
            if (f12 > 1.0f) {
                this.f25333i = -1;
                this.f25331f = 1.0f;
            } else if (f12 < 0.0f) {
                this.f25333i = 1;
                this.f25331f = 0.0f;
            }
            this.f25334j.invalidate();
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
        this.f25337m = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
