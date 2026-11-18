package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class p5 extends FrameLayout {
    public final int f31217a;
    public RectF f31218b;

    public p5(Context context, int i7) {
        super(context);
        this.f31217a = i7;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f31217a) {
            case 0:
                RectF rectF = this.f31218b;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.ui.ActionBar.n6.f29482i2);
                return;
            default:
                RectF rectF2 = this.f31218b;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.ui.ActionBar.n6.f29482i2);
                return;
        }
    }
}
