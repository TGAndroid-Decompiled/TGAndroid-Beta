package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class k50 extends Drawable {
    public long f39707b;
    public int d;
    public final View f39709e;
    public final Paint f39706a = new Paint(1);
    public float f39708c = 1.0f;

    public k50(View view) {
        this.f39709e = view;
    }

    @Override
    public final void draw(Canvas canvas) {
        int dp;
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        View view = this.f39709e;
        if (view instanceof org.telegram.ui.ActionBar.h5) {
            dp = AndroidUtilities.dp(1.0f) + centerY;
            centerX -= AndroidUtilities.dp(3.0f);
        } else {
            dp = AndroidUtilities.dp(2.0f) + centerY;
        }
        Paint paint = this.f39706a;
        paint.setColor(-1147527);
        paint.setAlpha((int) (this.f39708c * 255.0f));
        canvas.drawCircle(centerX, dp, AndroidUtilities.dp(4.0f), paint);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - this.f39707b;
        if (j10 > 17) {
            j10 = 17;
        }
        this.f39707b = elapsedRealtime;
        int i9 = this.d;
        if (i9 == 0) {
            float f10 = (((float) j10) / 2000.0f) + this.f39708c;
            this.f39708c = f10;
            if (f10 >= 1.0f) {
                this.f39708c = 1.0f;
                this.d = 1;
            }
        } else if (i9 == 1) {
            float f11 = this.f39708c - (((float) j10) / 2000.0f);
            this.f39708c = f11;
            if (f11 < 0.5f) {
                this.f39708c = 0.5f;
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
    public final void setAlpha(int i9) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
