package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class l1 implements Runnable {
    public final int f28024a;
    public final org.telegram.ui.ActionBar.b2 f28025b;
    public final Context f28026c;

    public l1(int i10, Context context, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f28024a = i10;
        this.f28025b = b2Var;
        this.f28026c = context;
    }

    @Override
    public final void run() {
        switch (this.f28024a) {
            case 0:
                org.telegram.ui.ActionBar.b2 b2Var = this.f28025b;
                if (b2Var != null) {
                    b2Var.dismiss();
                }
                of.f.s(this.f28026c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                return;
            default:
                org.telegram.ui.ActionBar.b2 b2Var2 = this.f28025b;
                if (b2Var2 != null) {
                    b2Var2.dismiss();
                }
                of.f.s(this.f28026c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                return;
        }
    }
}
