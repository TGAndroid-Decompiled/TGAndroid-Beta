package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
public final class ta extends View {
    public final Paint f28464a;
    public float f28465b;
    public int f28466c;
    public int d;
    public final RectF e;
    public final z4.g f28467f;
    public final int h;
    public int f28468n;
    public int f28469r;

    public ta(Context context, z4.g gVar, int i10) {
        super(context);
        this.f28464a = new Paint(1);
        new DecelerateInterpolator();
        this.e = new RectF();
        this.f28468n = -1;
        this.f28469r = -1;
        this.f28467f = gVar;
        this.h = i10;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        RectF rectF;
        int dp;
        AndroidUtilities.dp(5.0f);
        int i11 = this.f28468n;
        Paint paint = this.f28464a;
        if (i11 >= 0) {
            paint.setColor((org.telegram.ui.ActionBar.h6.w0(null, i11, false) & 16777215) | (-1275068416));
        } else {
            if (org.telegram.ui.ActionBar.h6.A0().q()) {
                i10 = -11184811;
            } else {
                i10 = -4473925;
            }
            paint.setColor(i10);
        }
        this.d = this.f28467f.getCurrentItem();
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
        int i14 = this.f28469r;
        if (i14 >= 0) {
            paint.setColor(org.telegram.ui.ActionBar.h6.w0(null, i14, false));
        } else {
            paint.setColor(-14509328);
        }
        int dp2 = AndroidUtilities.dp(11.0f) * this.d;
        if (this.f28465b != 0.0f) {
            if (this.f28466c >= this.d) {
                rectF.set(dp2, 0.0f, (AndroidUtilities.dp(11.0f) * this.f28465b) + AndroidUtilities.dp(5.0f) + dp2, AndroidUtilities.dp(5.0f));
            } else {
                rectF.set(com.google.android.gms.internal.vision.e2.b(1.0f, this.f28465b, AndroidUtilities.dp(11.0f), dp2), 0.0f, AndroidUtilities.dp(5.0f) + dp2, AndroidUtilities.dp(5.0f));
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
