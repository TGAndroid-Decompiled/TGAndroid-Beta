package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class hn0 extends Drawable {
    public long f26838a;
    public boolean f26839b;
    public Paint f26840c;
    public float d;
    public float f26841e;
    public float f26842f;
    public int f26843g;
    public int h;
    public int f26844i;
    public org.telegram.ui.Cells.u1 f26845j;
    public float f26846k;
    public int f26847l;
    public int f26848m;
    public org.telegram.ui.ActionBar.c6 f26849n;

    public final void a() {
        if (this.f26839b) {
            return;
        }
        this.f26838a = System.currentTimeMillis();
        this.f26839b = true;
        this.f26845j.invalidate();
    }

    public final void b() {
        if (!this.f26839b) {
            return;
        }
        this.f26839b = false;
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.f26840c;
        paint.setColor(i0.a.d(this.f26846k, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20656ic, this.f26849n), this.f26847l));
        int i10 = this.f26848m;
        if (i10 != 255) {
            paint.setAlpha((int) ((paint.getAlpha() / 255.0f) * i10));
        }
        int i11 = getBounds().left;
        int i12 = getBounds().top;
        int i13 = 0;
        while (i13 < 3) {
            Canvas canvas2 = canvas;
            canvas2.drawRect(AndroidUtilities.dp(2.0f) + i11, AndroidUtilities.dp((this.d * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(4.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            canvas2.drawRect(AndroidUtilities.dp(5.0f) + i11, AndroidUtilities.dp((this.f26841e * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(7.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            canvas2.drawRect(AndroidUtilities.dp(8.0f) + i11, AndroidUtilities.dp((this.f26842f * 7.0f) + 2.0f) + i12, AndroidUtilities.dp(10.0f) + i11, AndroidUtilities.dp(10.0f) + i12, paint);
            i13++;
            canvas = canvas2;
        }
        if (this.f26839b) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.f26838a;
            this.f26838a = currentTimeMillis;
            if (j3 > 50) {
                j3 = 50;
            }
            float f7 = (float) j3;
            float f10 = ((f7 / 300.0f) * this.f26843g) + this.d;
            this.d = f10;
            if (f10 > 1.0f) {
                this.f26843g = -1;
                this.d = 1.0f;
            } else if (f10 < 0.0f) {
                this.f26843g = 1;
                this.d = 0.0f;
            }
            float f11 = ((f7 / 310.0f) * this.h) + this.f26841e;
            this.f26841e = f11;
            if (f11 > 1.0f) {
                this.h = -1;
                this.f26841e = 1.0f;
            } else if (f11 < 0.0f) {
                this.h = 1;
                this.f26841e = 0.0f;
            }
            float f12 = ((f7 / 320.0f) * this.f26844i) + this.f26842f;
            this.f26842f = f12;
            if (f12 > 1.0f) {
                this.f26844i = -1;
                this.f26842f = 1.0f;
            } else if (f12 < 0.0f) {
                this.f26844i = 1;
                this.f26842f = 0.0f;
            }
            this.f26845j.invalidate();
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
        this.f26848m = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
