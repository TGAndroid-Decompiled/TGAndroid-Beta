package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class q5 extends FrameLayout {
    public final int f20804a;
    public RectF f20805b;

    public q5(Context context, int i10) {
        super(context);
        this.f20804a = i10;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f20804a) {
            case 0:
                RectF rectF = this.f20805b;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.j6.f19148i2);
                return;
            default:
                RectF rectF2 = this.f20805b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.j6.f19148i2);
                return;
        }
    }
}
