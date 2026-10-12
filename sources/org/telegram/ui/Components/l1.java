package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class l1 implements Runnable {
    public final int f27971a;
    public final org.telegram.ui.ActionBar.a2 f27972b;
    public final Context f27973c;

    public l1(int i10, Context context, org.telegram.ui.ActionBar.a2 a2Var) {
        this.f27971a = i10;
        this.f27972b = a2Var;
        this.f27973c = context;
    }

    @Override
    public final void run() {
        switch (this.f27971a) {
            case 0:
                org.telegram.ui.ActionBar.a2 a2Var = this.f27972b;
                if (a2Var != null) {
                    a2Var.dismiss();
                }
                of.f.s(this.f27973c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                return;
            default:
                org.telegram.ui.ActionBar.a2 a2Var2 = this.f27972b;
                if (a2Var2 != null) {
                    a2Var2.dismiss();
                }
                of.f.s(this.f27973c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                return;
        }
    }
}
