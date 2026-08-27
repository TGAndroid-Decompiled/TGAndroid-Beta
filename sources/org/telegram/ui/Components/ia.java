package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;

public final class ia extends View {

    public final Paint f29319a;

    public float f29320b;

    public int f29321c;
    public int d;

    public final RectF f29322e;

    public final m2.g f29323f;
    public final int h;

    public int f29324n;

    public int f29325r;

    public ia(Context context, m2.g gVar, int i10) {
        super(context);
        this.f29319a = new Paint(1);
        new DecelerateInterpolator();
        this.f29322e = new RectF();
        this.f29324n = -1;
        this.f29325r = -1;
        this.f29323f = gVar;
        this.h = i10;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        RectF rectF;
        AndroidUtilities.dp(5.0f);
        int i10 = this.f29324n;
        Paint paint = this.f29319a;
        if (i10 >= 0) {
            paint.setColor((org.telegram.ui.ActionBar.g6.w0(null, i10, false) & 16777215) | (-1275068416));
        } else {
            paint.setColor(org.telegram.ui.ActionBar.g6.A0().q() ? -11184811 : -4473925);
        }
        this.d = this.f29323f.getCurrentItem();
        int i11 = 0;
        while (true) {
            int i12 = this.h;
            rectF = this.f29322e;
            if (i11 >= i12) {
                break;
            }
            if (i11 != this.d) {
                int iDp = AndroidUtilities.dp(11.0f) * i11;
                rectF.set(iDp, 0.0f, AndroidUtilities.dp(5.0f) + iDp, AndroidUtilities.dp(5.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.5f), AndroidUtilities.dp(2.5f), paint);
            }
            i11++;
        }
        int i13 = this.f29325r;
        if (i13 >= 0) {
            paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
        } else {
            paint.setColor(-14509328);
        }
        int iDp2 = AndroidUtilities.dp(11.0f) * this.d;
        if (this.f29320b == 0.0f) {
            rectF.set(iDp2, 0.0f, AndroidUtilities.dp(5.0f) + iDp2, AndroidUtilities.dp(5.0f));
        } else if (this.f29321c >= this.d) {
            rectF.set(iDp2, 0.0f, (AndroidUtilities.dp(11.0f) * this.f29320b) + AndroidUtilities.dp(5.0f) + iDp2, AndroidUtilities.dp(5.0f));
        } else {
            rectF.set(org.telegram.ui.Cells.pa.b(1.0f, this.f29320b, AndroidUtilities.dp(11.0f), iDp2), 0.0f, AndroidUtilities.dp(5.0f) + iDp2, AndroidUtilities.dp(5.0f));
        }
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.5f), AndroidUtilities.dp(2.5f), paint);
    }

    public void setCurrentPage(int i10) {
        this.d = i10;
        invalidate();
    }
}
