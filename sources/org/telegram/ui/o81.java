package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class o81 implements Runnable {
    public final int f36134a;
    public final p81 f36135b;

    public o81(p81 p81Var, int i10) {
        this.f36134a = i10;
        this.f36135b = p81Var;
    }

    @Override
    public final void run() {
        String sb2;
        switch (this.f36134a) {
            case 0:
                p81 p81Var = this.f36135b;
                String str = p81Var.f36472b.text;
                if (str != null && str.equals("AUTH_TOKEN_EXCEPTION")) {
                    sb2 = LocaleController.getString(R.string.AccountAlreadyLoggedIn);
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    org.telegram.messenger.vl.m(R.string.ErrorOccurred, "\n", sb3);
                    sb3.append(p81Var.f36472b.text);
                    sb2 = sb3.toString();
                }
                org.telegram.ui.Components.c5.u0(p81Var.f36473c, LocaleController.getString(R.string.AuthAnotherClient), sb2, null);
                return;
            default:
                org.telegram.ui.Components.c5.u0(this.f36135b.f36473c, LocaleController.getString(R.string.AuthAnotherClient), LocaleController.getString(R.string.ErrorOccurred), null);
                return;
        }
    }
}
