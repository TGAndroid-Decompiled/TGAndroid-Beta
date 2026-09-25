package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class k1 implements Runnable {
    public final int f25592a;
    public final org.telegram.ui.ActionBar.a2 f25593b;
    public final Context f25594c;

    public k1(int i10, Context context, org.telegram.ui.ActionBar.a2 a2Var) {
        this.f25592a = i10;
        this.f25593b = a2Var;
        this.f25594c = context;
    }

    @Override
    public final void run() {
        switch (this.f25592a) {
            case 0:
                org.telegram.ui.ActionBar.a2 a2Var = this.f25593b;
                if (a2Var != null) {
                    a2Var.dismiss();
                }
                nf.f.s(this.f25594c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                return;
            default:
                org.telegram.ui.ActionBar.a2 a2Var2 = this.f25593b;
                if (a2Var2 != null) {
                    a2Var2.dismiss();
                }
                nf.f.s(this.f25594c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                return;
        }
    }
}
