package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class b60 extends Drawable {
    public long f31973b;
    public int d;
    public final View e;
    public final Paint f31972a = new Paint(1);
    public float f31974c = 1.0f;

    public b60(View view) {
        this.e = view;
    }

    @Override
    public final void draw(Canvas canvas) {
        int dp;
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        View view = this.e;
        if (view instanceof org.telegram.ui.ActionBar.i5) {
            dp = AndroidUtilities.dp(1.0f) + centerY;
            centerX -= AndroidUtilities.dp(3.0f);
        } else {
            dp = AndroidUtilities.dp(2.0f) + centerY;
        }
        Paint paint = this.f31972a;
        paint.setColor(-1147527);
        paint.setAlpha((int) (this.f31974c * 255.0f));
        canvas.drawCircle(centerX, dp, AndroidUtilities.dp(4.0f), paint);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = elapsedRealtime - this.f31973b;
        if (j3 > 17) {
            j3 = 17;
        }
        this.f31973b = elapsedRealtime;
        int i10 = this.d;
        if (i10 == 0) {
            float f7 = (((float) j3) / 2000.0f) + this.f31974c;
            this.f31974c = f7;
            if (f7 >= 1.0f) {
                this.f31974c = 1.0f;
                this.d = 1;
            }
        } else if (i10 == 1) {
            float f10 = this.f31974c - (((float) j3) / 2000.0f);
            this.f31974c = f10;
            if (f10 < 0.5f) {
                this.f31974c = 0.5f;
                this.d = 0;
            }
        }
        view.invalidate();
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(24.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(24.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
