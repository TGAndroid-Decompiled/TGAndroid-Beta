package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class u5 extends FrameLayout {
    public final int f25484a;
    public RectF f25485b;

    public u5(Context context, int i10) {
        super(context);
        this.f25484a = i10;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f25484a) {
            case 0:
                RectF rectF = this.f25485b;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.y6.f23444i2);
                return;
            default:
                RectF rectF2 = this.f25485b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.y6.f23444i2);
                return;
        }
    }
}
