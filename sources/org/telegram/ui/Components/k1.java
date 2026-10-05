package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class k1 implements Runnable {
    public final int f28023a;
    public final org.telegram.ui.ActionBar.b2 f28024b;
    public final Context f28025c;

    public k1(int i10, Context context, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f28023a = i10;
        this.f28024b = b2Var;
        this.f28025c = context;
    }

    @Override
    public final void run() {
        switch (this.f28023a) {
            case 0:
                org.telegram.ui.ActionBar.b2 b2Var = this.f28024b;
                if (b2Var != null) {
                    b2Var.dismiss();
                }
                nf.f.s(this.f28025c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                return;
            default:
                org.telegram.ui.ActionBar.b2 b2Var2 = this.f28024b;
                if (b2Var2 != null) {
                    b2Var2.dismiss();
                }
                nf.f.s(this.f28025c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                return;
        }
    }
}
