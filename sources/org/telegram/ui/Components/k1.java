package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class k1 implements Runnable {
    public final int f25512a;
    public final org.telegram.ui.ActionBar.c2 f25513b;
    public final Context f25514c;

    public k1(int i10, Context context, org.telegram.ui.ActionBar.c2 c2Var) {
        this.f25512a = i10;
        this.f25513b = c2Var;
        this.f25514c = context;
    }

    @Override
    public final void run() {
        switch (this.f25512a) {
            case 0:
                org.telegram.ui.ActionBar.c2 c2Var = this.f25513b;
                if (c2Var != null) {
                    c2Var.dismiss();
                }
                nf.f.s(this.f25514c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                return;
            default:
                org.telegram.ui.ActionBar.c2 c2Var2 = this.f25513b;
                if (c2Var2 != null) {
                    c2Var2.dismiss();
                }
                nf.f.s(this.f25514c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                return;
        }
    }
}
