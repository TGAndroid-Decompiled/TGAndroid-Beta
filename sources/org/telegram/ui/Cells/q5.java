package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class q5 extends FrameLayout {
    public final int f21728a;
    public RectF f21729b;

    public q5(Context context, int i10) {
        super(context);
        this.f21728a = i10;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f21728a) {
            case 0:
                RectF rectF = this.f21729b;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.g6.f19986i2);
                return;
            default:
                RectF rectF2 = this.f21729b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.g6.f19986i2);
                return;
        }
    }
}
