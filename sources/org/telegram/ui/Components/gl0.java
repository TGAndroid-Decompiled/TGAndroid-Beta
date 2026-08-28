package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
public final class gl0 extends tv0 {
    public float d;
    public final Paint f28796f;
    public boolean f28792a = false;
    public long f28793b = 0;
    public boolean f28794c = false;
    public int f28795e = 1;

    public gl0(boolean z10) {
        if (z10) {
            this.f28796f = new Paint(1);
        }
    }

    @Override
    public final void b(int i9) {
        Paint paint = this.f28796f;
        if (paint != null) {
            paint.setColor(i9);
        }
    }

    @Override
    public final void c(boolean z10) {
        this.f28792a = z10;
    }

    @Override
    public final void d() {
        this.f28793b = System.currentTimeMillis();
        this.f28794c = true;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10;
        Paint paint = this.f28796f;
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.f6.f22979c2;
        }
        paint.setAlpha(((int) (this.d * 200.0f)) + 55);
        float dp = AndroidUtilities.dp(6.0f);
        if (this.f28792a) {
            f10 = 8.0f;
        } else {
            f10 = 9.0f;
        }
        canvas.drawCircle(dp, AndroidUtilities.dp(f10), AndroidUtilities.dp(4.0f), paint);
        if (this.f28794c) {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.f28793b;
            this.f28793b = currentTimeMillis;
            if (j10 > 50) {
                j10 = 50;
            }
            float f11 = this.d;
            int i9 = this.f28795e;
            float f12 = (((float) (i9 * j10)) / 400.0f) + f11;
            this.d = f12;
            if (i9 > 0 && f12 >= 1.0f) {
                this.f28795e = -1;
                this.d = 1.0f;
            } else if (i9 < 0 && f12 <= 0.0f) {
                this.f28795e = 1;
                this.d = 0.0f;
            }
            a();
        }
    }

    @Override
    public final void e() {
        this.f28794c = false;
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
    public final void setAlpha(int i9) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
