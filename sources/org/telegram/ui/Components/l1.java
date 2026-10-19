package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class l1 implements Runnable {
    public final int f28042a;
    public final org.telegram.ui.ActionBar.b2 f28043b;
    public final Context f28044c;

    public l1(int i10, Context context, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f28042a = i10;
        this.f28043b = b2Var;
        this.f28044c = context;
    }

    @Override
    public final void run() {
        switch (this.f28042a) {
            case 0:
                org.telegram.ui.ActionBar.b2 b2Var = this.f28043b;
                if (b2Var != null) {
                    b2Var.dismiss();
                }
                pf.d.r(this.f28044c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                return;
            default:
                org.telegram.ui.ActionBar.b2 b2Var2 = this.f28043b;
                if (b2Var2 != null) {
                    b2Var2.dismiss();
                }
                pf.d.r(this.f28044c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                return;
        }
    }
}
