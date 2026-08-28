package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class j1 implements Runnable {
    public final int f29574a;
    public final org.telegram.ui.ActionBar.c2 f29575b;
    public final Context f29576c;

    public j1(int i9, Context context, org.telegram.ui.ActionBar.c2 c2Var) {
        this.f29574a = i9;
        this.f29575b = c2Var;
        this.f29576c = context;
    }

    @Override
    public final void run() {
        switch (this.f29574a) {
            case 0:
                org.telegram.ui.ActionBar.c2 c2Var = this.f29575b;
                if (c2Var != null) {
                    c2Var.dismiss();
                }
                ve.e.s(this.f29576c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                return;
            default:
                org.telegram.ui.ActionBar.c2 c2Var2 = this.f29575b;
                if (c2Var2 != null) {
                    c2Var2.dismiss();
                }
                ve.e.s(this.f29576c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                return;
        }
    }
}
