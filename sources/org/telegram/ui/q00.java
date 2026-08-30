package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class q00 extends org.telegram.ui.Cells.m4 {
    public final org.telegram.ui.Cells.t3 f37564r;

    public q00(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        int i10;
        org.telegram.ui.Cells.t3 t3Var = new org.telegram.ui.Cells.t3(context, true, true, true, 3);
        this.f37564r = t3Var;
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        t3Var.setGravity(i10);
        t3Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.L6, f6Var));
        t3Var.setTextSize(AndroidUtilities.dpf2(15.0f));
        addView(t3Var, k7.b6.d(-1, 18.0f, (LocaleController.isRTL ? 3 : 5) | 48, 22.0f, 17.0f, 22.0f, 0.0f));
        k7.d6.b(t3Var, 0.04f, 1.2f);
    }
}
