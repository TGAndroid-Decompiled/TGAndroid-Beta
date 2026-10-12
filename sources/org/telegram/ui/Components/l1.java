package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class l1 implements Runnable {
    public final int f27986a;
    public final org.telegram.ui.ActionBar.a2 f27987b;
    public final Context f27988c;

    public l1(int i10, Context context, org.telegram.ui.ActionBar.a2 a2Var) {
        this.f27986a = i10;
        this.f27987b = a2Var;
        this.f27988c = context;
    }

    @Override
    public final void run() {
        switch (this.f27986a) {
            case 0:
                org.telegram.ui.ActionBar.a2 a2Var = this.f27987b;
                if (a2Var != null) {
                    a2Var.dismiss();
                }
                of.f.s(this.f27988c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                return;
            default:
                org.telegram.ui.ActionBar.a2 a2Var2 = this.f27987b;
                if (a2Var2 != null) {
                    a2Var2.dismiss();
                }
                of.f.s(this.f27988c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                return;
        }
    }
}
