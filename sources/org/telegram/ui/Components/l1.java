package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class l1 implements Runnable {
    public final int f28025a;
    public final org.telegram.ui.ActionBar.b2 f28026b;
    public final Context f28027c;

    public l1(int i10, Context context, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f28025a = i10;
        this.f28026b = b2Var;
        this.f28027c = context;
    }

    @Override
    public final void run() {
        switch (this.f28025a) {
            case 0:
                org.telegram.ui.ActionBar.b2 b2Var = this.f28026b;
                if (b2Var != null) {
                    b2Var.dismiss();
                }
                of.f.s(this.f28027c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                return;
            default:
                org.telegram.ui.ActionBar.b2 b2Var2 = this.f28026b;
                if (b2Var2 != null) {
                    b2Var2.dismiss();
                }
                of.f.s(this.f28027c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                return;
        }
    }
}
