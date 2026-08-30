package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
public final class dm0 extends mw0 {
    public float d;
    public final Paint f24303f;
    public boolean f24300a = false;
    public long f24301b = 0;
    public boolean f24302c = false;
    public int e = 1;

    public dm0(boolean z4) {
        if (z4) {
            this.f24303f = new Paint(1);
        }
    }

    @Override
    public final void b(int i10) {
        Paint paint = this.f24303f;
        if (paint != null) {
            paint.setColor(i10);
        }
    }

    @Override
    public final void c(boolean z4) {
        this.f24300a = z4;
    }

    @Override
    public final void d() {
        this.f24301b = System.currentTimeMillis();
        this.f24302c = true;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10;
        Paint paint = this.f24303f;
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.j6.f19885c2;
        }
        paint.setAlpha(((int) (this.d * 200.0f)) + 55);
        float dp = AndroidUtilities.dp(6.0f);
        if (this.f24300a) {
            f10 = 8.0f;
        } else {
            f10 = 9.0f;
        }
        canvas.drawCircle(dp, AndroidUtilities.dp(f10), AndroidUtilities.dp(4.0f), paint);
        if (this.f24302c) {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.f24301b;
            this.f24301b = currentTimeMillis;
            if (j10 > 50) {
                j10 = 50;
            }
            float f11 = this.d;
            int i10 = this.e;
            float f12 = (((float) (i10 * j10)) / 400.0f) + f11;
            this.d = f12;
            if (i10 > 0 && f12 >= 1.0f) {
                this.e = -1;
                this.d = 1.0f;
            } else if (i10 < 0 && f12 <= 0.0f) {
                this.e = 1;
                this.d = 0.0f;
            }
            a();
        }
    }

    @Override
    public final void e() {
        this.f24302c = false;
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
