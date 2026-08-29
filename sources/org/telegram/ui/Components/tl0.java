package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
public final class tl0 extends dw0 {
    public float d;
    public final Paint f32974f;
    public boolean f32970a = false;
    public long f32971b = 0;
    public boolean f32972c = false;
    public int f32973e = 1;

    public tl0(boolean z10) {
        if (z10) {
            this.f32974f = new Paint(1);
        }
    }

    @Override
    public final void b(int i10) {
        Paint paint = this.f32974f;
        if (paint != null) {
            paint.setColor(i10);
        }
    }

    @Override
    public final void c(boolean z10) {
        this.f32970a = z10;
    }

    @Override
    public final void d() {
        this.f32971b = System.currentTimeMillis();
        this.f32972c = true;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        float f9;
        Paint paint = this.f32974f;
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.g6.f23042c2;
        }
        paint.setAlpha(((int) (this.d * 200.0f)) + 55);
        float dp = AndroidUtilities.dp(6.0f);
        if (this.f32970a) {
            f9 = 8.0f;
        } else {
            f9 = 9.0f;
        }
        canvas.drawCircle(dp, AndroidUtilities.dp(f9), AndroidUtilities.dp(4.0f), paint);
        if (this.f32972c) {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.f32971b;
            this.f32971b = currentTimeMillis;
            if (j10 > 50) {
                j10 = 50;
            }
            float f10 = this.d;
            int i10 = this.f32973e;
            float f11 = (((float) (i10 * j10)) / 400.0f) + f10;
            this.d = f11;
            if (i10 > 0 && f11 >= 1.0f) {
                this.f32973e = -1;
                this.d = 1.0f;
            } else if (i10 < 0 && f11 <= 0.0f) {
                this.f32973e = 1;
                this.d = 0.0f;
            }
            a();
        }
    }

    @Override
    public final void e() {
        this.f32972c = false;
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(10.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(12.0f);
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
