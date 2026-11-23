package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
public final class b40 extends Drawable {
    public long f45772b;
    public int d;
    public final View f45774e;
    public final Paint f45771a = new Paint(1);
    public float f45773c = 1.0f;

    public b40(View view) {
        this.f45774e = view;
    }

    @Override
    public final void draw(Canvas canvas) {
        int L;
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        View view = this.f45774e;
        if (view instanceof org.telegram.ui.ActionBar.m5) {
            L = org.telegram.messenger.g0.L(1.0f) + centerY;
            centerX -= org.telegram.messenger.g0.L(3.0f);
        } else {
            L = org.telegram.messenger.g0.L(2.0f) + centerY;
        }
        Paint paint = this.f45771a;
        paint.setColor(-1147527);
        paint.setAlpha((int) (this.f45773c * 255.0f));
        canvas.drawCircle(centerX, L, org.telegram.messenger.g0.L(4.0f), paint);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = elapsedRealtime - this.f45772b;
        if (j3 > 17) {
            j3 = 17;
        }
        this.f45772b = elapsedRealtime;
        int i7 = this.d;
        if (i7 == 0) {
            float f10 = (((float) j3) / 2000.0f) + this.f45773c;
            this.f45773c = f10;
            if (f10 >= 1.0f) {
                this.f45773c = 1.0f;
                this.d = 1;
            }
        } else if (i7 == 1) {
            float f11 = this.f45773c - (((float) j3) / 2000.0f);
            this.f45773c = f11;
            if (f11 < 0.5f) {
                this.f45773c = 0.5f;
                this.d = 0;
            }
        }
        view.invalidate();
    }

    @Override
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.g0.L(24.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.g0.L(24.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
