package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class j1 implements Runnable {

    public final int f29535a;

    public final org.telegram.ui.ActionBar.b2 f29536b;

    public final Context f29537c;

    public j1(int i10, Context context, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f29535a = i10;
        this.f29536b = b2Var;
        this.f29537c = context;
    }

    @Override
    public final void run() {
        switch (this.f29535a) {
            case 0:
                org.telegram.ui.ActionBar.b2 b2Var = this.f29536b;
                if (b2Var != null) {
                    b2Var.dismiss();
                }
                we.e.s(this.f29537c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                break;
            default:
                org.telegram.ui.ActionBar.b2 b2Var2 = this.f29536b;
                if (b2Var2 != null) {
                    b2Var2.dismiss();
                }
                we.e.s(this.f29537c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                break;
        }
    }
}
