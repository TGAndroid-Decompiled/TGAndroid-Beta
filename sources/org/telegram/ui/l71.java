package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class l71 implements Runnable {
    public final int f40112a;
    public final m71 f40113b;

    public l71(m71 m71Var, int i10) {
        this.f40112a = i10;
        this.f40113b = m71Var;
    }

    @Override
    public final void run() {
        String sb2;
        switch (this.f40112a) {
            case 0:
                m71 m71Var = this.f40113b;
                String str = m71Var.f40483b.text;
                if (str != null && str.equals("AUTH_TOKEN_EXCEPTION")) {
                    sb2 = LocaleController.getString(R.string.AccountAlreadyLoggedIn);
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    b.j(R.string.ErrorOccurred, "\n", sb3);
                    sb3.append(m71Var.f40483b.text);
                    sb2 = sb3.toString();
                }
                org.telegram.ui.Components.c5.u0(m71Var.f40484c, LocaleController.getString(R.string.AuthAnotherClient), sb2, null);
                return;
            default:
                org.telegram.ui.Components.c5.u0(this.f40113b.f40484c, LocaleController.getString(R.string.AuthAnotherClient), LocaleController.getString(R.string.ErrorOccurred), null);
                return;
        }
    }
}
