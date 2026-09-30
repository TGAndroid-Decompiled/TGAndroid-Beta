package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class k1 implements Runnable {
    public final int f25598a;
    public final org.telegram.ui.ActionBar.a2 f25599b;
    public final Context f25600c;

    public k1(int i10, Context context, org.telegram.ui.ActionBar.a2 a2Var) {
        this.f25598a = i10;
        this.f25599b = a2Var;
        this.f25600c = context;
    }

    @Override
    public final void run() {
        switch (this.f25598a) {
            case 0:
                org.telegram.ui.ActionBar.a2 a2Var = this.f25599b;
                if (a2Var != null) {
                    a2Var.dismiss();
                }
                nf.f.s(this.f25600c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                return;
            default:
                org.telegram.ui.ActionBar.a2 a2Var2 = this.f25599b;
                if (a2Var2 != null) {
                    a2Var2.dismiss();
                }
                nf.f.s(this.f25600c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                return;
        }
    }
}
