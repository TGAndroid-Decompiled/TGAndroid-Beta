package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class j1 implements Runnable {
    public final int f25849a;
    public final org.telegram.ui.ActionBar.d2 f25850b;
    public final Context f25851c;

    public j1(int i10, Context context, org.telegram.ui.ActionBar.d2 d2Var) {
        this.f25849a = i10;
        this.f25850b = d2Var;
        this.f25851c = context;
    }

    @Override
    public final void run() {
        switch (this.f25849a) {
            case 0:
                org.telegram.ui.ActionBar.d2 d2Var = this.f25850b;
                if (d2Var != null) {
                    d2Var.dismiss();
                }
                af.g.s(this.f25851c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                return;
            default:
                org.telegram.ui.ActionBar.d2 d2Var2 = this.f25850b;
                if (d2Var2 != null) {
                    d2Var2.dismiss();
                }
                af.g.s(this.f25851c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                return;
        }
    }
}
