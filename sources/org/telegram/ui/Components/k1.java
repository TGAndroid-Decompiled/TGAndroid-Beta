package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class k1 implements Runnable {
    public final int f27937a;
    public final org.telegram.ui.ActionBar.b2 f27938b;
    public final Context f27939c;

    public k1(int i10, Context context, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f27937a = i10;
        this.f27938b = b2Var;
        this.f27939c = context;
    }

    @Override
    public final void run() {
        switch (this.f27937a) {
            case 0:
                org.telegram.ui.ActionBar.b2 b2Var = this.f27938b;
                if (b2Var != null) {
                    b2Var.dismiss();
                }
                nf.f.s(this.f27939c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                return;
            default:
                org.telegram.ui.ActionBar.b2 b2Var2 = this.f27938b;
                if (b2Var2 != null) {
                    b2Var2.dismiss();
                }
                nf.f.s(this.f27939c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                return;
        }
    }
}
