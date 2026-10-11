package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class l1 implements Runnable {
    public final int f28137a;
    public final org.telegram.ui.ActionBar.a2 f28138b;
    public final Context f28139c;

    public l1(int i10, Context context, org.telegram.ui.ActionBar.a2 a2Var) {
        this.f28137a = i10;
        this.f28138b = a2Var;
        this.f28139c = context;
    }

    @Override
    public final void run() {
        switch (this.f28137a) {
            case 0:
                org.telegram.ui.ActionBar.a2 a2Var = this.f28138b;
                if (a2Var != null) {
                    a2Var.dismiss();
                }
                of.f.s(this.f28139c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                return;
            default:
                org.telegram.ui.ActionBar.a2 a2Var2 = this.f28138b;
                if (a2Var2 != null) {
                    a2Var2.dismiss();
                }
                of.f.s(this.f28139c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                return;
        }
    }
}
