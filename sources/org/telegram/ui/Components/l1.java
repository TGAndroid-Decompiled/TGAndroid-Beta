package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class l1 implements Runnable {
    public final int f30079a;
    public final org.telegram.ui.ActionBar.e2 f30080b;
    public final Context f30081c;

    public l1(int i10, Context context, org.telegram.ui.ActionBar.e2 e2Var) {
        this.f30079a = i10;
        this.f30080b = e2Var;
        this.f30081c = context;
    }

    @Override
    public final void run() {
        switch (this.f30079a) {
            case 0:
                org.telegram.ui.ActionBar.e2 e2Var = this.f30080b;
                if (e2Var != null) {
                    e2Var.dismiss();
                }
                qf.d.r(this.f30081c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                return;
            default:
                org.telegram.ui.ActionBar.e2 e2Var2 = this.f30080b;
                if (e2Var2 != null) {
                    e2Var2.dismiss();
                }
                qf.d.r(this.f30081c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                return;
        }
    }
}
