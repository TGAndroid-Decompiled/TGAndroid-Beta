package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class n50 extends Drawable {
    public long f40715b;
    public int d;
    public final View f40717e;
    public final Paint f40714a = new Paint(1);
    public float f40716c = 1.0f;

    public n50(View view) {
        this.f40717e = view;
    }

    @Override
    public final void draw(Canvas canvas) {
        int dp;
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        View view = this.f40717e;
        if (view instanceof org.telegram.ui.ActionBar.h5) {
            dp = AndroidUtilities.dp(1.0f) + centerY;
            centerX -= AndroidUtilities.dp(3.0f);
        } else {
            dp = AndroidUtilities.dp(2.0f) + centerY;
        }
        Paint paint = this.f40714a;
        paint.setColor(-1147527);
        paint.setAlpha((int) (this.f40716c * 255.0f));
        canvas.drawCircle(centerX, dp, AndroidUtilities.dp(4.0f), paint);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - this.f40715b;
        if (j10 > 17) {
            j10 = 17;
        }
        this.f40715b = elapsedRealtime;
        int i10 = this.d;
        if (i10 == 0) {
            float f9 = (((float) j10) / 2000.0f) + this.f40716c;
            this.f40716c = f9;
            if (f9 >= 1.0f) {
                this.f40716c = 1.0f;
                this.d = 1;
            }
        } else if (i10 == 1) {
            float f10 = this.f40716c - (((float) j10) / 2000.0f);
            this.f40716c = f10;
            if (f10 < 0.5f) {
                this.f40716c = 0.5f;
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
