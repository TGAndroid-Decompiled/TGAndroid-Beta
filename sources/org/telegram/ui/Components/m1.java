package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class m1 implements Runnable {
    public final int f30521a;
    public final org.telegram.ui.ActionBar.c2 f30522b;
    public final Context f30523c;

    public m1(int i10, Context context, org.telegram.ui.ActionBar.c2 c2Var) {
        this.f30521a = i10;
        this.f30522b = c2Var;
        this.f30523c = context;
    }

    @Override
    public final void run() {
        switch (this.f30521a) {
            case 0:
                org.telegram.ui.ActionBar.c2 c2Var = this.f30522b;
                if (c2Var != null) {
                    c2Var.dismiss();
                }
                ye.d.s(this.f30523c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                return;
            default:
                org.telegram.ui.ActionBar.c2 c2Var2 = this.f30522b;
                if (c2Var2 != null) {
                    c2Var2.dismiss();
                }
                ye.d.s(this.f30523c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                return;
        }
    }
}
