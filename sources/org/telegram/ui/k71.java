package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class k71 implements Runnable {
    public final int f40815a;
    public final m71 f40816b;

    public k71(m71 m71Var, int i10) {
        this.f40815a = i10;
        this.f40816b = m71Var;
    }

    @Override
    public final void run() {
        String sb2;
        switch (this.f40815a) {
            case 0:
                m71 m71Var = this.f40816b;
                String str = m71Var.f41486b.text;
                if (str != null && str.equals("AUTH_TOKEN_EXCEPTION")) {
                    sb2 = LocaleController.getString(R.string.AccountAlreadyLoggedIn);
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    d3.p(R.string.ErrorOccurred, "\n", sb3);
                    sb3.append(m71Var.f41486b.text);
                    sb2 = sb3.toString();
                }
                org.telegram.ui.Components.g5.t0(m71Var.f41487c, LocaleController.getString(R.string.AuthAnotherClient), sb2, null);
                return;
            default:
                org.telegram.ui.Components.g5.t0(this.f40816b.f41487c, LocaleController.getString(R.string.AuthAnotherClient), LocaleController.getString(R.string.ErrorOccurred), null);
                return;
        }
    }
}
