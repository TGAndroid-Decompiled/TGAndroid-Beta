package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class n81 implements Runnable {
    public final int f35905a;
    public final o81 f35906b;

    public n81(o81 o81Var, int i10) {
        this.f35905a = i10;
        this.f35906b = o81Var;
    }

    @Override
    public final void run() {
        String sb2;
        switch (this.f35905a) {
            case 0:
                o81 o81Var = this.f35906b;
                String str = o81Var.f36126b.text;
                if (str != null && str.equals("AUTH_TOKEN_EXCEPTION")) {
                    sb2 = LocaleController.getString(R.string.AccountAlreadyLoggedIn);
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    org.telegram.messenger.wl.l(R.string.ErrorOccurred, "\n", sb3);
                    sb3.append(o81Var.f36126b.text);
                    sb2 = sb3.toString();
                }
                org.telegram.ui.Components.c5.u0(o81Var.f36127c, LocaleController.getString(R.string.AuthAnotherClient), sb2, null);
                return;
            default:
                org.telegram.ui.Components.c5.u0(this.f35906b.f36127c, LocaleController.getString(R.string.AuthAnotherClient), LocaleController.getString(R.string.ErrorOccurred), null);
                return;
        }
    }
}
