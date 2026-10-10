package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class l1 implements Runnable {
    public final int f28133a;
    public final org.telegram.ui.ActionBar.b2 f28134b;
    public final Context f28135c;

    public l1(int i10, Context context, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f28133a = i10;
        this.f28134b = b2Var;
        this.f28135c = context;
    }

    @Override
    public final void run() {
        switch (this.f28133a) {
            case 0:
                org.telegram.ui.ActionBar.b2 b2Var = this.f28134b;
                if (b2Var != null) {
                    b2Var.dismiss();
                }
                of.f.s(this.f28135c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                return;
            default:
                org.telegram.ui.ActionBar.b2 b2Var2 = this.f28134b;
                if (b2Var2 != null) {
                    b2Var2.dismiss();
                }
                of.f.s(this.f28135c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                return;
        }
    }
}
