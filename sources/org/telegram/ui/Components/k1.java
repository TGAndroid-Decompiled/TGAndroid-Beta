package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class k1 implements Runnable {
    public final int f25588a;
    public final org.telegram.ui.ActionBar.c2 f25589b;
    public final Context f25590c;

    public k1(int i10, Context context, org.telegram.ui.ActionBar.c2 c2Var) {
        this.f25588a = i10;
        this.f25589b = c2Var;
        this.f25590c = context;
    }

    @Override
    public final void run() {
        switch (this.f25588a) {
            case 0:
                org.telegram.ui.ActionBar.c2 c2Var = this.f25589b;
                if (c2Var != null) {
                    c2Var.dismiss();
                }
                nf.f.s(this.f25590c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                return;
            default:
                org.telegram.ui.ActionBar.c2 c2Var2 = this.f25589b;
                if (c2Var2 != null) {
                    c2Var2.dismiss();
                }
                nf.f.s(this.f25590c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                return;
        }
    }
}
