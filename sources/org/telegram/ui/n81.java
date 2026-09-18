package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class n81 implements Runnable {
    public final int f35841a;
    public final o81 f35842b;

    public n81(o81 o81Var, int i10) {
        this.f35841a = i10;
        this.f35842b = o81Var;
    }

    @Override
    public final void run() {
        String sb2;
        switch (this.f35841a) {
            case 0:
                o81 o81Var = this.f35842b;
                String str = o81Var.f36127b.text;
                if (str != null && str.equals("AUTH_TOKEN_EXCEPTION")) {
                    sb2 = LocaleController.getString(R.string.AccountAlreadyLoggedIn);
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    org.telegram.ui.Cells.c1.l(R.string.ErrorOccurred, "\n", sb3);
                    sb3.append(o81Var.f36127b.text);
                    sb2 = sb3.toString();
                }
                org.telegram.ui.Components.e5.u0(o81Var.f36128c, LocaleController.getString(R.string.AuthAnotherClient), sb2, null);
                return;
            default:
                org.telegram.ui.Components.e5.u0(this.f35842b.f36128c, LocaleController.getString(R.string.AuthAnotherClient), LocaleController.getString(R.string.ErrorOccurred), null);
                return;
        }
    }
}
