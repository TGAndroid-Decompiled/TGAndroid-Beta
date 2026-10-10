package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class c60 extends Drawable {
    public long f36579b;
    public int d;
    public final View f36581e;
    public final Paint f36578a = new Paint(1);
    public float f36580c = 1.0f;

    public c60(View view) {
        this.f36581e = view;
    }

    @Override
    public final void draw(Canvas canvas) {
        int dp;
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        View view = this.f36581e;
        if (view instanceof org.telegram.ui.ActionBar.j5) {
            dp = AndroidUtilities.dp(1.0f) + centerY;
            centerX -= AndroidUtilities.dp(3.0f);
        } else {
            dp = AndroidUtilities.dp(2.0f) + centerY;
        }
        Paint paint = this.f36578a;
        paint.setColor(-1147527);
        paint.setAlpha((int) (this.f36580c * 255.0f));
        canvas.drawCircle(centerX, dp, AndroidUtilities.dp(4.0f), paint);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = elapsedRealtime - this.f36579b;
        if (j3 > 17) {
            j3 = 17;
        }
        this.f36579b = elapsedRealtime;
        int i10 = this.d;
        if (i10 == 0) {
            float f7 = (((float) j3) / 2000.0f) + this.f36580c;
            this.f36580c = f7;
            if (f7 >= 1.0f) {
                this.f36580c = 1.0f;
                this.d = 1;
            }
        } else if (i10 == 1) {
            float f10 = this.f36580c - (((float) j3) / 2000.0f);
            this.f36580c = f10;
            if (f10 < 0.5f) {
                this.f36580c = 0.5f;
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
