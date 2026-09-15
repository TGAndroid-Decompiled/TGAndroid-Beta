package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class p5 extends FrameLayout {
    public final int f20590a;
    public RectF f20591b;

    public p5(Context context, int i10) {
        super(context);
        this.f20590a = i10;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f20590a) {
            case 0:
                RectF rectF = this.f20591b;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.i6.f18922i2);
                return;
            default:
                RectF rectF2 = this.f20591b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.i6.f18922i2);
                return;
        }
    }
}
