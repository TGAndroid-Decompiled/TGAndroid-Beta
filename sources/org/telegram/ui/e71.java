package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class e71 implements Runnable {
    public final int f36564a;
    public final g71 f36565b;

    public e71(g71 g71Var, int i10) {
        this.f36564a = i10;
        this.f36565b = g71Var;
    }

    @Override
    public final void run() {
        String sb2;
        switch (this.f36564a) {
            case 0:
                g71 g71Var = this.f36565b;
                String str = g71Var.f37212b.text;
                if (str != null && str.equals("AUTH_TOKEN_EXCEPTION")) {
                    sb2 = LocaleController.getString(R.string.AccountAlreadyLoggedIn);
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    org.telegram.ui.Cells.c1.n(R.string.ErrorOccurred, "\n", sb3);
                    sb3.append(g71Var.f37212b.text);
                    sb2 = sb3.toString();
                }
                org.telegram.ui.Components.f5.t0(g71Var.f37213c, LocaleController.getString(R.string.AuthAnotherClient), sb2, null);
                return;
            default:
                org.telegram.ui.Components.f5.t0(this.f36565b.f37213c, LocaleController.getString(R.string.AuthAnotherClient), LocaleController.getString(R.string.ErrorOccurred), null);
                return;
        }
    }
}
