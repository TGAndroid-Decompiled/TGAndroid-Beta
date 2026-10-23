package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class j71 implements Runnable {
    public final int f38475a;
    public final k71 f38476b;

    public j71(k71 k71Var, int i10) {
        this.f38475a = i10;
        this.f38476b = k71Var;
    }

    @Override
    public final void run() {
        String sb2;
        switch (this.f38475a) {
            case 0:
                k71 k71Var = this.f38476b;
                String str = k71Var.f38844b.text;
                if (str != null && str.equals("AUTH_TOKEN_EXCEPTION")) {
                    sb2 = LocaleController.getString(R.string.AccountAlreadyLoggedIn);
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    org.telegram.ui.Cells.b1.o(R.string.ErrorOccurred, "\n", sb3);
                    sb3.append(k71Var.f38844b.text);
                    sb2 = sb3.toString();
                }
                org.telegram.ui.Components.f5.u0(k71Var.f38845c, LocaleController.getString(R.string.AuthAnotherClient), sb2, null);
                return;
            default:
                org.telegram.ui.Components.f5.u0(this.f38476b.f38845c, LocaleController.getString(R.string.AuthAnotherClient), LocaleController.getString(R.string.ErrorOccurred), null);
                return;
        }
    }
}
