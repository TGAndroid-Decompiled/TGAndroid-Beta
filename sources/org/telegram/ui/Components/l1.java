package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class l1 implements Runnable {
    public final int f26904a;
    public final org.telegram.ui.ActionBar.a2 f26905b;
    public final Context f26906c;

    public l1(int i10, Context context, org.telegram.ui.ActionBar.a2 a2Var) {
        this.f26904a = i10;
        this.f26905b = a2Var;
        this.f26906c = context;
    }

    @Override
    public final void run() {
        switch (this.f26904a) {
            case 0:
                org.telegram.ui.ActionBar.a2 a2Var = this.f26905b;
                if (a2Var != null) {
                    a2Var.dismiss();
                }
                pf.d.s(this.f26906c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                return;
            default:
                org.telegram.ui.ActionBar.a2 a2Var2 = this.f26905b;
                if (a2Var2 != null) {
                    a2Var2.dismiss();
                }
                pf.d.s(this.f26906c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                return;
        }
    }
}
