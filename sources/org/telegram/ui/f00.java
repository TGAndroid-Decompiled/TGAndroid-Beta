package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class f00 extends org.telegram.ui.Cells.q4 {
    public final org.telegram.ui.Cells.y3 f39119r;

    public f00(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        int i10;
        org.telegram.ui.Cells.y3 y3Var = new org.telegram.ui.Cells.y3(context, true, true, true, 3);
        this.f39119r = y3Var;
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        y3Var.setGravity(i10);
        org.telegram.ui.ActionBar.f7.Z(y3Var, org.telegram.ui.ActionBar.y6.L6, u6Var);
        y3Var.setTextSize(AndroidUtilities.dpf2(15.0f));
        addView(y3Var, org.telegram.ui.Components.kb1.h(-1, 18.0f, (LocaleController.isRTL ? 3 : 5) | 48, 22.0f, 17.0f, 22.0f, 0.0f));
        org.telegram.ui.Components.kb1.c(y3Var, 0.04f, 1.2f);
    }
}
