package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class k81 implements Runnable {
    public final int f34948a;
    public final l81 f34949b;

    public k81(l81 l81Var, int i10) {
        this.f34948a = i10;
        this.f34949b = l81Var;
    }

    @Override
    public final void run() {
        String sb2;
        switch (this.f34948a) {
            case 0:
                l81 l81Var = this.f34949b;
                String str = l81Var.f35284b.text;
                if (str != null && str.equals("AUTH_TOKEN_EXCEPTION")) {
                    sb2 = LocaleController.getString(R.string.AccountAlreadyLoggedIn);
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    org.telegram.ui.Cells.c1.o(R.string.ErrorOccurred, "\n", sb3);
                    sb3.append(l81Var.f35284b.text);
                    sb2 = sb3.toString();
                }
                org.telegram.ui.Components.e5.u0(l81Var.f35285c, LocaleController.getString(R.string.AuthAnotherClient), sb2, null);
                return;
            default:
                org.telegram.ui.Components.e5.u0(this.f34949b.f35285c, LocaleController.getString(R.string.AuthAnotherClient), LocaleController.getString(R.string.ErrorOccurred), null);
                return;
        }
    }
}
