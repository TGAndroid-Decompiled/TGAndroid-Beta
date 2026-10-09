package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class l1 implements Runnable {
    public final int f28214a;
    public final org.telegram.ui.ActionBar.b2 f28215b;
    public final Context f28216c;

    public l1(int i10, Context context, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f28214a = i10;
        this.f28215b = b2Var;
        this.f28216c = context;
    }

    @Override
    public final void run() {
        switch (this.f28214a) {
            case 0:
                org.telegram.ui.ActionBar.b2 b2Var = this.f28215b;
                if (b2Var != null) {
                    b2Var.dismiss();
                }
                of.f.s(this.f28216c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                return;
            default:
                org.telegram.ui.ActionBar.b2 b2Var2 = this.f28215b;
                if (b2Var2 != null) {
                    b2Var2.dismiss();
                }
                of.f.s(this.f28216c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                return;
        }
    }
}
