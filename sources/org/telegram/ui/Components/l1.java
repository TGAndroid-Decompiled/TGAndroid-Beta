package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class l1 implements Runnable {
    public final int f28052a;
    public final org.telegram.ui.ActionBar.b2 f28053b;
    public final Context f28054c;

    public l1(int i10, Context context, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f28052a = i10;
        this.f28053b = b2Var;
        this.f28054c = context;
    }

    @Override
    public final void run() {
        switch (this.f28052a) {
            case 0:
                org.telegram.ui.ActionBar.b2 b2Var = this.f28053b;
                if (b2Var != null) {
                    b2Var.dismiss();
                }
                of.f.s(this.f28054c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                return;
            default:
                org.telegram.ui.ActionBar.b2 b2Var2 = this.f28053b;
                if (b2Var2 != null) {
                    b2Var2.dismiss();
                }
                of.f.s(this.f28054c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                return;
        }
    }
}
