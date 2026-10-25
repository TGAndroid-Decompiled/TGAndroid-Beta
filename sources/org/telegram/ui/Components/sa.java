package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
public final class sa extends View {
    public final Paint f32492a;
    public float f32493b;
    public int f32494c;
    public int d;
    public final RectF e;
    public final a5.m f32495f;
    public final int h;
    public int f32496n;
    public int f32497r;

    public sa(Context context, a5.m mVar, int i10) {
        super(context);
        this.f32492a = new Paint(1);
        new DecelerateInterpolator();
        this.e = new RectF();
        this.f32496n = -1;
        this.f32497r = -1;
        this.f32495f = mVar;
        this.h = i10;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        RectF rectF;
        int dp;
        AndroidUtilities.dp(5.0f);
        int i11 = this.f32496n;
        Paint paint = this.f32492a;
        if (i11 >= 0) {
            paint.setColor((org.telegram.ui.ActionBar.y6.x0(null, i11, false) & 16777215) | (-1275068416));
        } else {
            if (org.telegram.ui.ActionBar.y6.C0().q()) {
                i10 = -11184811;
            } else {
                i10 = -4473925;
            }
            paint.setColor(i10);
        }
        this.d = this.f32495f.getCurrentItem();
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
        int i14 = this.f32497r;
        if (i14 >= 0) {
            paint.setColor(org.telegram.ui.ActionBar.y6.x0(null, i14, false));
        } else {
            paint.setColor(-14509328);
        }
        int dp2 = AndroidUtilities.dp(11.0f) * this.d;
        if (this.f32493b != 0.0f) {
            if (this.f32494c >= this.d) {
                rectF.set(dp2, 0.0f, (AndroidUtilities.dp(11.0f) * this.f32493b) + AndroidUtilities.dp(5.0f) + dp2, AndroidUtilities.dp(5.0f));
            } else {
                rectF.set(ic.a.d(1.0f, this.f32493b, AndroidUtilities.dp(11.0f), dp2), 0.0f, AndroidUtilities.dp(5.0f) + dp2, AndroidUtilities.dp(5.0f));
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
