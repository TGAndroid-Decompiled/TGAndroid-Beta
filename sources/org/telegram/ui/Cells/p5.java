package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class p5 extends FrameLayout {
    public final int f20601a;
    public RectF f20602b;

    public p5(Context context, int i10) {
        super(context);
        this.f20601a = i10;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f20601a) {
            case 0:
                RectF rectF = this.f20602b;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.j6.f18949i2);
                return;
            default:
                RectF rectF2 = this.f20602b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.j6.f18949i2);
                return;
        }
    }
}
