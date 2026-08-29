package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class e00 extends org.telegram.ui.Cells.k4 {
    public final org.telegram.ui.Cells.r3 f37661r;

    public e00(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        int i10;
        org.telegram.ui.Cells.r3 r3Var = new org.telegram.ui.Cells.r3(context, true, true, true, 3);
        this.f37661r = r3Var;
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        r3Var.setGravity(i10);
        r3Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.L6, c6Var));
        r3Var.setTextSize(AndroidUtilities.dpf2(15.0f));
        addView(r3Var, i7.f6.d(-1, 18.0f, (LocaleController.isRTL ? 3 : 5) | 48, 22.0f, 17.0f, 22.0f, 0.0f));
        i7.h6.b(r3Var, 0.04f, 1.2f);
    }
}
