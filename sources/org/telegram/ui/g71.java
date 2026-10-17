package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class g71 implements Runnable {
    public final int f37147a;
    public final i71 f37148b;

    public g71(i71 i71Var, int i10) {
        this.f37147a = i10;
        this.f37148b = i71Var;
    }

    @Override
    public final void run() {
        String sb2;
        switch (this.f37147a) {
            case 0:
                i71 i71Var = this.f37148b;
                String str = i71Var.f37771b.text;
                if (str != null && str.equals("AUTH_TOKEN_EXCEPTION")) {
                    sb2 = LocaleController.getString(R.string.AccountAlreadyLoggedIn);
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    org.telegram.ui.Cells.t0.n(R.string.ErrorOccurred, "\n", sb3);
                    sb3.append(i71Var.f37771b.text);
                    sb2 = sb3.toString();
                }
                org.telegram.ui.Components.f5.t0(i71Var.f37772c, LocaleController.getString(R.string.AuthAnotherClient), sb2, null);
                return;
            default:
                org.telegram.ui.Components.f5.t0(this.f37148b.f37772c, LocaleController.getString(R.string.AuthAnotherClient), LocaleController.getString(R.string.ErrorOccurred), null);
                return;
        }
    }
}
