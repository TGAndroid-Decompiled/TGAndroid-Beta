package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class q5 extends FrameLayout {
    public final int f24905a;
    public RectF f24906b;

    public q5(Context context, int i9) {
        super(context);
        this.f24905a = i9;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f24905a) {
            case 0:
                RectF rectF = this.f24906b;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.f6.f23088i2);
                return;
            default:
                RectF rectF2 = this.f24906b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.f6.f23088i2);
                return;
        }
    }
}
