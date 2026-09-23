package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class k1 implements Runnable {
    public final int f25455a;
    public final org.telegram.ui.ActionBar.b2 f25456b;
    public final Context f25457c;

    public k1(int i10, Context context, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f25455a = i10;
        this.f25456b = b2Var;
        this.f25457c = context;
    }

    @Override
    public final void run() {
        switch (this.f25455a) {
            case 0:
                org.telegram.ui.ActionBar.b2 b2Var = this.f25456b;
                if (b2Var != null) {
                    b2Var.dismiss();
                }
                nf.f.s(this.f25457c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                return;
            default:
                org.telegram.ui.ActionBar.b2 b2Var2 = this.f25456b;
                if (b2Var2 != null) {
                    b2Var2.dismiss();
                }
                nf.f.s(this.f25457c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                return;
        }
    }
}
