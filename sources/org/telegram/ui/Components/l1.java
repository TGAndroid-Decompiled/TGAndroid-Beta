package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class l1 implements Runnable {
    public final int f26575a;
    public final org.telegram.ui.ActionBar.a2 f26576b;
    public final Context f26577c;

    public l1(int i10, Context context, org.telegram.ui.ActionBar.a2 a2Var) {
        this.f26575a = i10;
        this.f26576b = a2Var;
        this.f26577c = context;
    }

    @Override
    public final void run() {
        switch (this.f26575a) {
            case 0:
                org.telegram.ui.ActionBar.a2 a2Var = this.f26576b;
                if (a2Var != null) {
                    a2Var.dismiss();
                }
                pf.d.r(this.f26577c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                return;
            default:
                org.telegram.ui.ActionBar.a2 a2Var2 = this.f26576b;
                if (a2Var2 != null) {
                    a2Var2.dismiss();
                }
                pf.d.r(this.f26577c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                return;
        }
    }
}
