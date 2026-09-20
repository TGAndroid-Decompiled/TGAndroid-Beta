package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class r5 extends FrameLayout {
    public final int f20879a;
    public RectF f20880b;

    public r5(Context context, int i10) {
        super(context);
        this.f20879a = i10;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f20879a) {
            case 0:
                RectF rectF = this.f20880b;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.j6.f19180i2);
                return;
            default:
                RectF rectF2 = this.f20880b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.j6.f19180i2);
                return;
        }
    }
}
