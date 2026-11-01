package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
public final class mo extends org.telegram.ui.Cells.p8 {
    public mo(Context context) {
        super(context);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i10;
        if (org.telegram.messenger.dd.X) {
            L = 0.0f;
        } else {
            L = org.telegram.messenger.i0.L(20.0f);
        }
        float f7 = L;
        float measuredHeight = getMeasuredHeight() - 1;
        int measuredWidth = getMeasuredWidth();
        if (org.telegram.messenger.dd.X) {
            i10 = org.telegram.messenger.i0.L(20.0f);
        } else {
            i10 = 0;
        }
        canvas.drawLine(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.f21053k0);
    }
}
