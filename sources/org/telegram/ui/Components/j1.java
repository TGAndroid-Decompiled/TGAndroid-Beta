package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class j1 implements Runnable {
    public final int f27953a;
    public final org.telegram.ui.ActionBar.d2 f27954b;
    public final Context f27955c;

    public j1(int i10, Context context, org.telegram.ui.ActionBar.d2 d2Var) {
        this.f27953a = i10;
        this.f27954b = d2Var;
        this.f27955c = context;
    }

    @Override
    public final void run() {
        switch (this.f27953a) {
            case 0:
                org.telegram.ui.ActionBar.d2 d2Var = this.f27954b;
                if (d2Var != null) {
                    d2Var.dismiss();
                }
                af.g.s(this.f27955c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                return;
            default:
                org.telegram.ui.ActionBar.d2 d2Var2 = this.f27954b;
                if (d2Var2 != null) {
                    d2Var2.dismiss();
                }
                af.g.s(this.f27955c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                return;
        }
    }
}
