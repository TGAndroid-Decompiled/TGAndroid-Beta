package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class o50 extends Drawable {

    public long f40989b;
    public int d;

    public final View f40991e;

    public final Paint f40988a = new Paint(1);

    public float f40990c = 1.0f;

    public o50(View view) {
        this.f40991e = view;
    }

    @Override
    public final void draw(Canvas canvas) {
        int iDp;
        int iCenterX = getBounds().centerX();
        int iCenterY = getBounds().centerY();
        View view = this.f40991e;
        if (view instanceof org.telegram.ui.ActionBar.h5) {
            iDp = AndroidUtilities.dp(1.0f) + iCenterY;
            iCenterX -= AndroidUtilities.dp(3.0f);
        } else {
            iDp = AndroidUtilities.dp(2.0f) + iCenterY;
        }
        Paint paint = this.f40988a;
        paint.setColor(-1147527);
        paint.setAlpha((int) (this.f40990c * 255.0f));
        canvas.drawCircle(iCenterX, iDp, AndroidUtilities.dp(4.0f), paint);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = jElapsedRealtime - this.f40989b;
        if (j10 > 17) {
            j10 = 17;
        }
        this.f40989b = jElapsedRealtime;
        int i10 = this.d;
        if (i10 == 0) {
            float f10 = (j10 / 2000.0f) + this.f40990c;
            this.f40990c = f10;
            if (f10 >= 1.0f) {
                this.f40990c = 1.0f;
                this.d = 1;
            }
        } else if (i10 == 1) {
            float f11 = this.f40990c - (j10 / 2000.0f);
            this.f40990c = f11;
            if (f11 < 0.5f) {
                this.f40990c = 0.5f;
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
