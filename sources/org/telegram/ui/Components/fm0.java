package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
public final class fm0 extends ww0 {
    public float d;
    public final Paint f23035f;
    public boolean f23032a = false;
    public long f23033b = 0;
    public boolean f23034c = false;
    public int e = 1;

    public fm0(boolean z10) {
        if (z10) {
            this.f23035f = new Paint(1);
        }
    }

    @Override
    public final void b(int i10) {
        Paint paint = this.f23035f;
        if (paint != null) {
            paint.setColor(i10);
        }
    }

    @Override
    public final void c(boolean z10) {
        this.f23032a = z10;
    }

    @Override
    public final void d() {
        this.f23033b = System.currentTimeMillis();
        this.f23034c = true;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        float f7;
        Paint paint = this.f23035f;
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.j6.f17906c2;
        }
        paint.setAlpha(((int) (this.d * 200.0f)) + 55);
        float dp = AndroidUtilities.dp(6.0f);
        if (this.f23032a) {
            f7 = 8.0f;
        } else {
            f7 = 9.0f;
        }
        canvas.drawCircle(dp, AndroidUtilities.dp(f7), AndroidUtilities.dp(4.0f), paint);
        if (this.f23034c) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.f23033b;
            this.f23033b = currentTimeMillis;
            if (j3 > 50) {
                j3 = 50;
            }
            float f10 = this.d;
            int i10 = this.e;
            float f11 = (((float) (i10 * j3)) / 400.0f) + f10;
            this.d = f11;
            if (i10 > 0 && f11 >= 1.0f) {
                this.e = -1;
                this.d = 1.0f;
            } else if (i10 < 0 && f11 <= 0.0f) {
                this.e = 1;
                this.d = 0.0f;
            }
            a();
        }
    }

    @Override
    public final void e() {
        this.f23034c = false;
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
