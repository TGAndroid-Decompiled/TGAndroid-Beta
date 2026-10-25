package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class lo extends org.telegram.ui.Cells.v8 {
    public lo(Context context) {
        super(context);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        if (LocaleController.isRTL) {
            dp = 0.0f;
        } else {
            dp = AndroidUtilities.dp(20.0f);
        }
        float f7 = dp;
        float measuredHeight = getMeasuredHeight() - 1;
        int measuredWidth = getMeasuredWidth();
        if (LocaleController.isRTL) {
            i10 = AndroidUtilities.dp(20.0f);
        } else {
            i10 = 0;
        }
        canvas.drawLine(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.y6.f23476k0);
    }
}
