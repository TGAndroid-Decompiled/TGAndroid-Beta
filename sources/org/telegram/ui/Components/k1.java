package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class k1 implements Runnable {
    public final int f27825a;
    public final org.telegram.ui.ActionBar.c2 f27826b;
    public final Context f27827c;

    public k1(int i10, Context context, org.telegram.ui.ActionBar.c2 c2Var) {
        this.f27825a = i10;
        this.f27826b = c2Var;
        this.f27827c = context;
    }

    @Override
    public final void run() {
        switch (this.f27825a) {
            case 0:
                org.telegram.ui.ActionBar.c2 c2Var = this.f27826b;
                if (c2Var != null) {
                    c2Var.dismiss();
                }
                pf.d.r(this.f27827c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                return;
            default:
                org.telegram.ui.ActionBar.c2 c2Var2 = this.f27826b;
                if (c2Var2 != null) {
                    c2Var2.dismiss();
                }
                pf.d.r(this.f27827c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                return;
        }
    }
}
