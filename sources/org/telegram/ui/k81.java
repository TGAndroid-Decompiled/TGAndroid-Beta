package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class k81 implements Runnable {
    public final int f37894a;
    public final l81 f37895b;

    public k81(l81 l81Var, int i10) {
        this.f37894a = i10;
        this.f37895b = l81Var;
    }

    @Override
    public final void run() {
        String sb2;
        switch (this.f37894a) {
            case 0:
                l81 l81Var = this.f37895b;
                String str = l81Var.f38202b.text;
                if (str != null && str.equals("AUTH_TOKEN_EXCEPTION")) {
                    sb2 = LocaleController.getString(R.string.AccountAlreadyLoggedIn);
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    org.telegram.ui.Cells.c1.n(R.string.ErrorOccurred, "\n", sb3);
                    sb3.append(l81Var.f38202b.text);
                    sb2 = sb3.toString();
                }
                org.telegram.ui.Components.e5.u0(l81Var.f38203c, LocaleController.getString(R.string.AuthAnotherClient), sb2, null);
                return;
            default:
                org.telegram.ui.Components.e5.u0(this.f37895b.f38203c, LocaleController.getString(R.string.AuthAnotherClient), LocaleController.getString(R.string.ErrorOccurred), null);
                return;
        }
    }
}
