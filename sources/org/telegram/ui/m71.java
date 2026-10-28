package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class m71 implements Runnable {
    public final int f41347a;
    public final o71 f41348b;

    public m71(o71 o71Var, int i10) {
        this.f41347a = i10;
        this.f41348b = o71Var;
    }

    @Override
    public final void run() {
        String sb2;
        switch (this.f41347a) {
            case 0:
                o71 o71Var = this.f41348b;
                String str = o71Var.f42008b.text;
                if (str != null && str.equals("AUTH_TOKEN_EXCEPTION")) {
                    sb2 = LocaleController.getString(R.string.AccountAlreadyLoggedIn);
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    d3.p(R.string.ErrorOccurred, "\n", sb3);
                    sb3.append(o71Var.f42008b.text);
                    sb2 = sb3.toString();
                }
                org.telegram.ui.Components.g5.t0(o71Var.f42009c, LocaleController.getString(R.string.AuthAnotherClient), sb2, null);
                return;
            default:
                org.telegram.ui.Components.g5.t0(this.f41348b.f42009c, LocaleController.getString(R.string.AuthAnotherClient), LocaleController.getString(R.string.ErrorOccurred), null);
                return;
        }
    }
}
