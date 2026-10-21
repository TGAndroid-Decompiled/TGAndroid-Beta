package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class e71 implements Runnable {
    public final int f36565a;
    public final g71 f36566b;

    public e71(g71 g71Var, int i10) {
        this.f36565a = i10;
        this.f36566b = g71Var;
    }

    @Override
    public final void run() {
        String sb2;
        switch (this.f36565a) {
            case 0:
                g71 g71Var = this.f36566b;
                String str = g71Var.f37213b.text;
                if (str != null && str.equals("AUTH_TOKEN_EXCEPTION")) {
                    sb2 = LocaleController.getString(R.string.AccountAlreadyLoggedIn);
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    org.telegram.ui.Cells.c1.n(R.string.ErrorOccurred, "\n", sb3);
                    sb3.append(g71Var.f37213b.text);
                    sb2 = sb3.toString();
                }
                org.telegram.ui.Components.f5.t0(g71Var.f37214c, LocaleController.getString(R.string.AuthAnotherClient), sb2, null);
                return;
            default:
                org.telegram.ui.Components.f5.t0(this.f36566b.f37214c, LocaleController.getString(R.string.AuthAnotherClient), LocaleController.getString(R.string.ErrorOccurred), null);
                return;
        }
    }
}
