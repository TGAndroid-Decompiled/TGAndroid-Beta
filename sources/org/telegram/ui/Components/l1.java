package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class l1 implements Runnable {
    public final int f30014a;
    public final org.telegram.ui.ActionBar.e2 f30015b;
    public final Context f30016c;

    public l1(int i10, Context context, org.telegram.ui.ActionBar.e2 e2Var) {
        this.f30014a = i10;
        this.f30015b = e2Var;
        this.f30016c = context;
    }

    @Override
    public final void run() {
        switch (this.f30014a) {
            case 0:
                org.telegram.ui.ActionBar.e2 e2Var = this.f30015b;
                if (e2Var != null) {
                    e2Var.dismiss();
                }
                qf.d.r(this.f30016c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                return;
            default:
                org.telegram.ui.ActionBar.e2 e2Var2 = this.f30015b;
                if (e2Var2 != null) {
                    e2Var2.dismiss();
                }
                qf.d.r(this.f30016c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                return;
        }
    }
}
