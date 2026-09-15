package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class k1 implements Runnable {
    public final int f25502a;
    public final org.telegram.ui.ActionBar.b2 f25503b;
    public final Context f25504c;

    public k1(int i10, Context context, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f25502a = i10;
        this.f25503b = b2Var;
        this.f25504c = context;
    }

    @Override
    public final void run() {
        switch (this.f25502a) {
            case 0:
                org.telegram.ui.ActionBar.b2 b2Var = this.f25503b;
                if (b2Var != null) {
                    b2Var.dismiss();
                }
                nf.f.s(this.f25504c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                return;
            default:
                org.telegram.ui.ActionBar.b2 b2Var2 = this.f25503b;
                if (b2Var2 != null) {
                    b2Var2.dismiss();
                }
                nf.f.s(this.f25504c, LocaleController.getString(R.string.BotWebViewStartPermissionLink));
                return;
        }
    }
}
