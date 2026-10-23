package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class e71 implements Runnable {
    public final int f36569a;
    public final g71 f36570b;

    public e71(g71 g71Var, int i10) {
        this.f36569a = i10;
        this.f36570b = g71Var;
    }

    @Override
    public final void run() {
        String sb2;
        switch (this.f36569a) {
            case 0:
                g71 g71Var = this.f36570b;
                String str = g71Var.f37217b.text;
                if (str != null && str.equals("AUTH_TOKEN_EXCEPTION")) {
                    sb2 = LocaleController.getString(R.string.AccountAlreadyLoggedIn);
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    org.telegram.ui.Cells.c1.n(R.string.ErrorOccurred, "\n", sb3);
                    sb3.append(g71Var.f37217b.text);
                    sb2 = sb3.toString();
                }
                org.telegram.ui.Components.f5.t0(g71Var.f37218c, LocaleController.getString(R.string.AuthAnotherClient), sb2, null);
                return;
            default:
                org.telegram.ui.Components.f5.t0(this.f36570b.f37218c, LocaleController.getString(R.string.AuthAnotherClient), LocaleController.getString(R.string.ErrorOccurred), null);
                return;
        }
    }
}
