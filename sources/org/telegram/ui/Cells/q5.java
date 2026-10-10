package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class q5 extends FrameLayout {
    public final int f22689a;
    public RectF f22690b;

    public q5(Context context, int i10) {
        super(context);
        this.f22689a = i10;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f22689a) {
            case 0:
                RectF rectF = this.f22690b;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.i6.f20888i2);
                return;
            default:
                RectF rectF2 = this.f22690b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.i6.f20888i2);
                return;
        }
    }
}
