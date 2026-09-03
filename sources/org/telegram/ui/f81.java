package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class f81 implements Runnable {
    public final int f36708a;
    public final g81 f36709b;

    public f81(g81 g81Var, int i10) {
        this.f36708a = i10;
        this.f36709b = g81Var;
    }

    @Override
    public final void run() {
        String sb;
        switch (this.f36708a) {
            case 0:
                g81 g81Var = this.f36709b;
                String str = g81Var.f37025b.text;
                if (str != null && str.equals("AUTH_TOKEN_EXCEPTION")) {
                    sb = LocaleController.getString(R.string.AccountAlreadyLoggedIn);
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    b.i(R.string.ErrorOccurred, "\n", sb2);
                    sb2.append(g81Var.f37025b.text);
                    sb = sb2.toString();
                }
                org.telegram.ui.Components.z4.u0(g81Var.f37026c, LocaleController.getString(R.string.AuthAnotherClient), sb, null);
                return;
            default:
                org.telegram.ui.Components.z4.u0(this.f36709b.f37026c, LocaleController.getString(R.string.AuthAnotherClient), LocaleController.getString(R.string.ErrorOccurred), null);
                return;
        }
    }
}
