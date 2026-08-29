package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
public final class pa extends View {
    public final Paint f31621a;
    public float f31622b;
    public int f31623c;
    public int d;
    public final RectF f31624e;
    public final m2.g f31625f;
    public final int h;
    public int f31626n;
    public int f31627r;

    public pa(Context context, m2.g gVar, int i10) {
        super(context);
        this.f31621a = new Paint(1);
        new DecelerateInterpolator();
        this.f31624e = new RectF();
        this.f31626n = -1;
        this.f31627r = -1;
        this.f31625f = gVar;
        this.h = i10;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        RectF rectF;
        int dp;
        AndroidUtilities.dp(5.0f);
        int i11 = this.f31626n;
        Paint paint = this.f31621a;
        if (i11 >= 0) {
            paint.setColor((org.telegram.ui.ActionBar.g6.w0(null, i11, false) & 16777215) | (-1275068416));
        } else {
            if (org.telegram.ui.ActionBar.g6.A0().q()) {
                i10 = -11184811;
            } else {
                i10 = -4473925;
            }
            paint.setColor(i10);
        }
        this.d = this.f31625f.getCurrentItem();
        int i12 = 0;
        while (true) {
            int i13 = this.h;
            rectF = this.f31624e;
            if (i12 >= i13) {
                break;
            }
            if (i12 != this.d) {
                rectF.set(AndroidUtilities.dp(11.0f) * i12, 0.0f, AndroidUtilities.dp(5.0f) + dp, AndroidUtilities.dp(5.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.5f), AndroidUtilities.dp(2.5f), paint);
            }
            i12++;
        }
        int i14 = this.f31627r;
        if (i14 >= 0) {
            paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
        } else {
            paint.setColor(-14509328);
        }
        int dp2 = AndroidUtilities.dp(11.0f) * this.d;
        if (this.f31622b != 0.0f) {
            if (this.f31623c >= this.d) {
                rectF.set(dp2, 0.0f, (AndroidUtilities.dp(11.0f) * this.f31622b) + AndroidUtilities.dp(5.0f) + dp2, AndroidUtilities.dp(5.0f));
            } else {
                rectF.set(org.telegram.ui.th.b(1.0f, this.f31622b, AndroidUtilities.dp(11.0f), dp2), 0.0f, AndroidUtilities.dp(5.0f) + dp2, AndroidUtilities.dp(5.0f));
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
