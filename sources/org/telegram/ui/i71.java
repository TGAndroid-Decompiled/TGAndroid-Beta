package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class i71 implements Runnable {
    public final int f38161a;
    public final j71 f38162b;

    public i71(j71 j71Var, int i10) {
        this.f38161a = i10;
        this.f38162b = j71Var;
    }

    @Override
    public final void run() {
        String sb2;
        switch (this.f38161a) {
            case 0:
                j71 j71Var = this.f38162b;
                String str = j71Var.f38486b.text;
                if (str != null && str.equals("AUTH_TOKEN_EXCEPTION")) {
                    sb2 = LocaleController.getString(R.string.AccountAlreadyLoggedIn);
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    org.telegram.ui.Cells.b1.o(R.string.ErrorOccurred, "\n", sb3);
                    sb3.append(j71Var.f38486b.text);
                    sb2 = sb3.toString();
                }
                org.telegram.ui.Components.d5.t0(j71Var.f38487c, LocaleController.getString(R.string.AuthAnotherClient), sb2, null);
                return;
            default:
                org.telegram.ui.Components.d5.t0(this.f38162b.f38487c, LocaleController.getString(R.string.AuthAnotherClient), LocaleController.getString(R.string.ErrorOccurred), null);
                return;
        }
    }
}
