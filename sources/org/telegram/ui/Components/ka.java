package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
public final class ka extends View {
    public final Paint f30043a;
    public float f30044b;
    public int f30045c;
    public int d;
    public final RectF f30046e;
    public final m2.g f30047f;
    public final int h;
    public int f30048n;
    public int f30049r;

    public ka(Context context, m2.g gVar, int i9) {
        super(context);
        this.f30043a = new Paint(1);
        new DecelerateInterpolator();
        this.f30046e = new RectF();
        this.f30048n = -1;
        this.f30049r = -1;
        this.f30047f = gVar;
        this.h = i9;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i9;
        RectF rectF;
        int dp;
        AndroidUtilities.dp(5.0f);
        int i10 = this.f30048n;
        Paint paint = this.f30043a;
        if (i10 >= 0) {
            paint.setColor((org.telegram.ui.ActionBar.f6.w0(null, i10, false) & 16777215) | (-1275068416));
        } else {
            if (org.telegram.ui.ActionBar.f6.A0().q()) {
                i9 = -11184811;
            } else {
                i9 = -4473925;
            }
            paint.setColor(i9);
        }
        this.d = this.f30047f.getCurrentItem();
        int i11 = 0;
        while (true) {
            int i12 = this.h;
            rectF = this.f30046e;
            if (i11 >= i12) {
                break;
            }
            if (i11 != this.d) {
                rectF.set(AndroidUtilities.dp(11.0f) * i11, 0.0f, AndroidUtilities.dp(5.0f) + dp, AndroidUtilities.dp(5.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.5f), AndroidUtilities.dp(2.5f), paint);
            }
            i11++;
        }
        int i13 = this.f30049r;
        if (i13 >= 0) {
            paint.setColor(org.telegram.ui.ActionBar.f6.w0(null, i13, false));
        } else {
            paint.setColor(-14509328);
        }
        int dp2 = AndroidUtilities.dp(11.0f) * this.d;
        if (this.f30044b != 0.0f) {
            if (this.f30045c >= this.d) {
                rectF.set(dp2, 0.0f, (AndroidUtilities.dp(11.0f) * this.f30044b) + AndroidUtilities.dp(5.0f) + dp2, AndroidUtilities.dp(5.0f));
            } else {
                rectF.set(j3.r0.C(1.0f, this.f30044b, AndroidUtilities.dp(11.0f), dp2), 0.0f, AndroidUtilities.dp(5.0f) + dp2, AndroidUtilities.dp(5.0f));
            }
        } else {
            rectF.set(dp2, 0.0f, AndroidUtilities.dp(5.0f) + dp2, AndroidUtilities.dp(5.0f));
        }
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.5f), AndroidUtilities.dp(2.5f), paint);
    }

    public void setCurrentPage(int i9) {
        this.d = i9;
        invalidate();
    }
}
