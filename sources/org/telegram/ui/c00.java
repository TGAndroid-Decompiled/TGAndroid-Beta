package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class c00 extends org.telegram.ui.Cells.m4 {
    public final org.telegram.ui.Cells.u3 f37021r;

    public c00(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        int i9;
        org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(context, true, true, true, 3);
        this.f37021r = u3Var;
        if (LocaleController.isRTL) {
            i9 = 3;
        } else {
            i9 = 5;
        }
        u3Var.setGravity(i9);
        u3Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.L6, b6Var));
        u3Var.setTextSize(AndroidUtilities.dpf2(15.0f));
        addView(u3Var, g7.e6.d(-1, 18.0f, (LocaleController.isRTL ? 3 : 5) | 48, 22.0f, 17.0f, 22.0f, 0.0f));
        g7.g6.b(u3Var, 0.04f, 1.2f);
    }
}
