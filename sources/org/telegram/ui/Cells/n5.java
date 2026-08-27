package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

public final class n5 extends FrameLayout {

    public final int f24723a;

    public RectF f24724b;

    public n5(Context context, int i10) {
        super(context);
        this.f24723a = i10;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f24723a) {
            case 0:
                RectF rectF = this.f24724b;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.g6.f23140i2);
                break;
            default:
                RectF rectF2 = this.f24724b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.g6.f23140i2);
                break;
        }
    }
}
