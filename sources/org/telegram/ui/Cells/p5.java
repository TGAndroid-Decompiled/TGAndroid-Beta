package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class p5 extends FrameLayout {
    public final int f22755a;
    public RectF f22756b;

    public p5(Context context, int i10) {
        super(context);
        this.f22755a = i10;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f22755a) {
            case 0:
                RectF rectF = this.f22756b;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.h6.f21079i2);
                return;
            default:
                RectF rectF2 = this.f22756b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.h6.f21079i2);
                return;
        }
    }
}
