package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class u5 extends FrameLayout {
    public final int f25482a;
    public RectF f25483b;

    public u5(Context context, int i10) {
        super(context);
        this.f25482a = i10;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f25482a) {
            case 0:
                RectF rectF = this.f25483b;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.y6.f23442i2);
                return;
            default:
                RectF rectF2 = this.f25483b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.y6.f23442i2);
                return;
        }
    }
}
