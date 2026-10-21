package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
public final class sa extends View {
    public final Paint f30233a;
    public float f30234b;
    public int f30235c;
    public int d;
    public final RectF e;
    public final z4.g f30236f;
    public final int h;
    public int f30237n;
    public int f30238r;

    public sa(Context context, z4.g gVar, int i10) {
        super(context);
        this.f30233a = new Paint(1);
        new DecelerateInterpolator();
        this.e = new RectF();
        this.f30237n = -1;
        this.f30238r = -1;
        this.f30236f = gVar;
        this.h = i10;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        RectF rectF;
        int dp;
        AndroidUtilities.dp(5.0f);
        int i11 = this.f30237n;
        Paint paint = this.f30233a;
        if (i11 >= 0) {
            paint.setColor((org.telegram.ui.ActionBar.h6.x0(null, i11, false) & 16777215) | (-1275068416));
        } else {
            if (org.telegram.ui.ActionBar.h6.B0().q()) {
                i10 = -11184811;
            } else {
                i10 = -4473925;
            }
            paint.setColor(i10);
        }
        this.d = this.f30236f.getCurrentItem();
        int i12 = 0;
        while (true) {
            int i13 = this.h;
            rectF = this.e;
            if (i12 >= i13) {
                break;
            }
            if (i12 != this.d) {
                rectF.set(AndroidUtilities.dp(11.0f) * i12, 0.0f, AndroidUtilities.dp(5.0f) + dp, AndroidUtilities.dp(5.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.5f), AndroidUtilities.dp(2.5f), paint);
            }
            i12++;
        }
        int i14 = this.f30238r;
        if (i14 >= 0) {
            paint.setColor(org.telegram.ui.ActionBar.h6.x0(null, i14, false));
        } else {
            paint.setColor(-14509328);
        }
        int dp2 = AndroidUtilities.dp(11.0f) * this.d;
        if (this.f30234b != 0.0f) {
            if (this.f30235c >= this.d) {
                rectF.set(dp2, 0.0f, (AndroidUtilities.dp(11.0f) * this.f30234b) + AndroidUtilities.dp(5.0f) + dp2, AndroidUtilities.dp(5.0f));
            } else {
                rectF.set(com.google.android.gms.internal.play_billing.k3.D(1.0f, this.f30234b, AndroidUtilities.dp(11.0f), dp2), 0.0f, AndroidUtilities.dp(5.0f) + dp2, AndroidUtilities.dp(5.0f));
            }
        } else {
            rectF.set(dp2, 0.0f, AndroidUtilities.dp(5.0f) + dp2, AndroidUtilities.dp(5.0f));
        }
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.5f), AndroidUtilities.dp(2.5f), paint);
    }

    public void setCurrentPage(int i10) {
        this.d = i10;
        invalidate();
    }
}
