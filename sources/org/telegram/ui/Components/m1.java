package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class m1 implements Runnable {
    public final int f25140a;
    public final org.telegram.ui.ActionBar.d2 f25141b;
    public final Context f25142c;

    public m1(int i10, Context context, org.telegram.ui.ActionBar.d2 d2Var) {
        this.f25140a = i10;
        this.f25141b = d2Var;
        this.f25142c = context;
    }

    @Override
    public final void run() {
        switch (this.f25140a) {
            case 0:
                org.telegram.ui.ActionBar.d2 d2Var = this.f25141b;
                if (d2Var != null) {
                    d2Var.dismiss();
                }
                nf.f.s(this.f25142c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                return;
            default:
                org.telegram.ui.ActionBar.d2 d2Var2 = this.f25141b;
                if (d2Var2 != null) {
                    d2Var2.dismiss();
                }
                nf.f.s(this.f25142c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                return;
        }
    }
}
