package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class h81 implements Runnable {
    public final int f37030a;
    public final i81 f37031b;

    public h81(i81 i81Var, int i10) {
        this.f37030a = i10;
        this.f37031b = i81Var;
    }

    @Override
    public final void run() {
        String sb2;
        switch (this.f37030a) {
            case 0:
                i81 i81Var = this.f37031b;
                String str = i81Var.f37319b.text;
                if (str != null && str.equals("AUTH_TOKEN_EXCEPTION")) {
                    sb2 = LocaleController.getString(R.string.AccountAlreadyLoggedIn);
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    org.telegram.ui.Cells.c1.n(R.string.ErrorOccurred, "\n", sb3);
                    sb3.append(i81Var.f37319b.text);
                    sb2 = sb3.toString();
                }
                org.telegram.ui.Components.e5.u0(i81Var.f37320c, LocaleController.getString(R.string.AuthAnotherClient), sb2, null);
                return;
            default:
                org.telegram.ui.Components.e5.u0(this.f37031b.f37320c, LocaleController.getString(R.string.AuthAnotherClient), LocaleController.getString(R.string.ErrorOccurred), null);
                return;
        }
    }
}
