package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class p81 implements Runnable {
    public final int f36555a;
    public final q81 f36556b;

    public p81(q81 q81Var, int i10) {
        this.f36555a = i10;
        this.f36556b = q81Var;
    }

    @Override
    public final void run() {
        String sb2;
        switch (this.f36555a) {
            case 0:
                q81 q81Var = this.f36556b;
                String str = q81Var.f36831b.text;
                if (str != null && str.equals("AUTH_TOKEN_EXCEPTION")) {
                    sb2 = LocaleController.getString(R.string.AccountAlreadyLoggedIn);
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    org.telegram.messenger.wl.l(R.string.ErrorOccurred, "\n", sb3);
                    sb3.append(q81Var.f36831b.text);
                    sb2 = sb3.toString();
                }
                org.telegram.ui.Components.c5.u0(q81Var.f36832c, LocaleController.getString(R.string.AuthAnotherClient), sb2, null);
                return;
            default:
                org.telegram.ui.Components.c5.u0(this.f36556b.f36832c, LocaleController.getString(R.string.AuthAnotherClient), LocaleController.getString(R.string.ErrorOccurred), null);
                return;
        }
    }
}
