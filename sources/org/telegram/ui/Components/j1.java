package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class j1 implements Runnable {
    public final int f27963a;
    public final org.telegram.ui.ActionBar.d2 f27964b;
    public final Context f27965c;

    public j1(int i10, Context context, org.telegram.ui.ActionBar.d2 d2Var) {
        this.f27963a = i10;
        this.f27964b = d2Var;
        this.f27965c = context;
    }

    @Override
    public final void run() {
        switch (this.f27963a) {
            case 0:
                org.telegram.ui.ActionBar.d2 d2Var = this.f27964b;
                if (d2Var != null) {
                    d2Var.dismiss();
                }
                af.g.s(this.f27965c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                return;
            default:
                org.telegram.ui.ActionBar.d2 d2Var2 = this.f27964b;
                if (d2Var2 != null) {
                    d2Var2.dismiss();
                }
                af.g.s(this.f27965c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                return;
        }
    }
}
