package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;

public final class jl0 extends vv0 {
    public float d;

    public final Paint f29722f;

    public boolean f29718a = false;

    public long f29719b = 0;

    public boolean f29720c = false;

    public int f29721e = 1;

    public jl0(boolean z10) {
        if (z10) {
            this.f29722f = new Paint(1);
        }
    }

    @Override
    public final void b(int i10) {
        Paint paint = this.f29722f;
        if (paint != null) {
            paint.setColor(i10);
        }
    }

    @Override
    public final void c(boolean z10) {
        this.f29718a = z10;
    }

    @Override
    public final void d() {
        this.f29719b = System.currentTimeMillis();
        this.f29720c = true;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.f29722f;
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.g6.f23032c2;
        }
        paint.setAlpha(((int) (this.d * 200.0f)) + 55);
        canvas.drawCircle(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(this.f29718a ? 8.0f : 9.0f), AndroidUtilities.dp(4.0f), paint);
        if (this.f29720c) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j10 = jCurrentTimeMillis - this.f29719b;
            this.f29719b = jCurrentTimeMillis;
            if (j10 > 50) {
                j10 = 50;
            }
            float f10 = this.d;
            int i10 = this.f29721e;
            float f11 = ((((long) i10) * j10) / 400.0f) + f10;
            this.d = f11;
            if (i10 > 0 && f11 >= 1.0f) {
                this.f29721e = -1;
                this.d = 1.0f;
            } else if (i10 < 0 && f11 <= 0.0f) {
                this.f29721e = 1;
                this.d = 0.0f;
            }
            a();
        }
    }

    @Override
    public final void e() {
        this.f29720c = false;
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
