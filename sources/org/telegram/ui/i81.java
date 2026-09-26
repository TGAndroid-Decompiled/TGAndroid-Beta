package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class i81 implements Runnable {
    public final int f34435a;
    public final j81 f34436b;

    public i81(j81 j81Var, int i10) {
        this.f34435a = i10;
        this.f34436b = j81Var;
    }

    @Override
    public final void run() {
        String sb2;
        switch (this.f34435a) {
            case 0:
                j81 j81Var = this.f34436b;
                String str = j81Var.f34688b.text;
                if (str != null && str.equals("AUTH_TOKEN_EXCEPTION")) {
                    sb2 = LocaleController.getString(R.string.AccountAlreadyLoggedIn);
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    org.telegram.ui.Cells.c1.n(R.string.ErrorOccurred, "\n", sb3);
                    sb3.append(j81Var.f34688b.text);
                    sb2 = sb3.toString();
                }
                org.telegram.ui.Components.e5.u0(j81Var.f34689c, LocaleController.getString(R.string.AuthAnotherClient), sb2, null);
                return;
            default:
                org.telegram.ui.Components.e5.u0(this.f34436b.f34689c, LocaleController.getString(R.string.AuthAnotherClient), LocaleController.getString(R.string.ErrorOccurred), null);
                return;
        }
    }
}
