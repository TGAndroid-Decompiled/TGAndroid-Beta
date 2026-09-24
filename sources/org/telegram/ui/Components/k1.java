package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class k1 implements Runnable {
    public final int f25573a;
    public final org.telegram.ui.ActionBar.a2 f25574b;
    public final Context f25575c;

    public k1(int i10, Context context, org.telegram.ui.ActionBar.a2 a2Var) {
        this.f25573a = i10;
        this.f25574b = a2Var;
        this.f25575c = context;
    }

    @Override
    public final void run() {
        switch (this.f25573a) {
            case 0:
                org.telegram.ui.ActionBar.a2 a2Var = this.f25574b;
                if (a2Var != null) {
                    a2Var.dismiss();
                }
                nf.f.s(this.f25575c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                return;
            default:
                org.telegram.ui.ActionBar.a2 a2Var2 = this.f25574b;
                if (a2Var2 != null) {
                    a2Var2.dismiss();
                }
                nf.f.s(this.f25575c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                return;
        }
    }
}
