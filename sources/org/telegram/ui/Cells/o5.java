package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class o5 extends FrameLayout {
    public final int f24804a;
    public RectF f24805b;

    public o5(Context context, int i10) {
        super(context);
        this.f24804a = i10;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f24804a) {
            case 0:
                RectF rectF = this.f24805b;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.g6.f23148i2);
                return;
            default:
                RectF rectF2 = this.f24805b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.g6.f23148i2);
                return;
        }
    }
}
