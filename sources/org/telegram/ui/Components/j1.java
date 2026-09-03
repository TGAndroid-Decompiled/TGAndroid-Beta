package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class j1 implements Runnable {
    public final int f25805a;
    public final org.telegram.ui.ActionBar.d2 f25806b;
    public final Context f25807c;

    public j1(int i10, Context context, org.telegram.ui.ActionBar.d2 d2Var) {
        this.f25805a = i10;
        this.f25806b = d2Var;
        this.f25807c = context;
    }

    @Override
    public final void run() {
        switch (this.f25805a) {
            case 0:
                org.telegram.ui.ActionBar.d2 d2Var = this.f25806b;
                if (d2Var != null) {
                    d2Var.dismiss();
                }
                ze.d.s(this.f25807c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                return;
            default:
                org.telegram.ui.ActionBar.d2 d2Var2 = this.f25806b;
                if (d2Var2 != null) {
                    d2Var2.dismiss();
                }
                ze.d.s(this.f25807c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                return;
        }
    }
}
