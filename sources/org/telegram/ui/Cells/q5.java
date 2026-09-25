package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class q5 extends FrameLayout {
    public final int f20841a;
    public RectF f20842b;

    public q5(Context context, int i10) {
        super(context);
        this.f20841a = i10;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f20841a) {
            case 0:
                RectF rectF = this.f20842b;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.h6.f19145i2);
                return;
            default:
                RectF rectF2 = this.f20842b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.h6.f19145i2);
                return;
        }
    }
}
