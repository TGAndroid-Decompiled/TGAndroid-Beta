package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class k1 implements Runnable {
    public final int f25560a;
    public final org.telegram.ui.ActionBar.a2 f25561b;
    public final Context f25562c;

    public k1(int i10, Context context, org.telegram.ui.ActionBar.a2 a2Var) {
        this.f25560a = i10;
        this.f25561b = a2Var;
        this.f25562c = context;
    }

    @Override
    public final void run() {
        switch (this.f25560a) {
            case 0:
                org.telegram.ui.ActionBar.a2 a2Var = this.f25561b;
                if (a2Var != null) {
                    a2Var.dismiss();
                }
                nf.f.s(this.f25562c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                return;
            default:
                org.telegram.ui.ActionBar.a2 a2Var2 = this.f25561b;
                if (a2Var2 != null) {
                    a2Var2.dismiss();
                }
                nf.f.s(this.f25562c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                return;
        }
    }
}
