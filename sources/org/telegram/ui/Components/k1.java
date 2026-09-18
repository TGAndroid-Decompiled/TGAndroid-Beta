package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class k1 implements Runnable {
    public final int f25515a;
    public final org.telegram.ui.ActionBar.c2 f25516b;
    public final Context f25517c;

    public k1(int i10, Context context, org.telegram.ui.ActionBar.c2 c2Var) {
        this.f25515a = i10;
        this.f25516b = c2Var;
        this.f25517c = context;
    }

    @Override
    public final void run() {
        switch (this.f25515a) {
            case 0:
                org.telegram.ui.ActionBar.c2 c2Var = this.f25516b;
                if (c2Var != null) {
                    c2Var.dismiss();
                }
                nf.f.s(this.f25517c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                return;
            default:
                org.telegram.ui.ActionBar.c2 c2Var2 = this.f25516b;
                if (c2Var2 != null) {
                    c2Var2.dismiss();
                }
                nf.f.s(this.f25517c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                return;
        }
    }
}
