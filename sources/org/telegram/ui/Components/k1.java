package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class k1 implements Runnable {
    public final int f27800a;
    public final org.telegram.ui.ActionBar.c2 f27801b;
    public final Context f27802c;

    public k1(int i10, Context context, org.telegram.ui.ActionBar.c2 c2Var) {
        this.f27800a = i10;
        this.f27801b = c2Var;
        this.f27802c = context;
    }

    @Override
    public final void run() {
        switch (this.f27800a) {
            case 0:
                org.telegram.ui.ActionBar.c2 c2Var = this.f27801b;
                if (c2Var != null) {
                    c2Var.dismiss();
                }
                pf.d.r(this.f27802c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                return;
            default:
                org.telegram.ui.ActionBar.c2 c2Var2 = this.f27801b;
                if (c2Var2 != null) {
                    c2Var2.dismiss();
                }
                pf.d.r(this.f27802c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                return;
        }
    }
}
