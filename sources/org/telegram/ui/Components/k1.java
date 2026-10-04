package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class k1 implements Runnable {
    public final int f27932a;
    public final org.telegram.ui.ActionBar.b2 f27933b;
    public final Context f27934c;

    public k1(int i10, Context context, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f27932a = i10;
        this.f27933b = b2Var;
        this.f27934c = context;
    }

    @Override
    public final void run() {
        switch (this.f27932a) {
            case 0:
                org.telegram.ui.ActionBar.b2 b2Var = this.f27933b;
                if (b2Var != null) {
                    b2Var.dismiss();
                }
                nf.f.s(this.f27934c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                return;
            default:
                org.telegram.ui.ActionBar.b2 b2Var2 = this.f27933b;
                if (b2Var2 != null) {
                    b2Var2.dismiss();
                }
                nf.f.s(this.f27934c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                return;
        }
    }
}
