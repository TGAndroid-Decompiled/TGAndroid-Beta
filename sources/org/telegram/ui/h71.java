package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class h71 implements Runnable {

    public final int f38696a;

    public final i71 f38697b;

    public h71(i71 i71Var, int i10) {
        this.f38696a = i10;
        this.f38697b = i71Var;
    }

    @Override
    public final void run() {
        String string;
        switch (this.f38696a) {
            case 0:
                i71 i71Var = this.f38697b;
                String str = i71Var.f38991b.text;
                if (str == null || !str.equals("AUTH_TOKEN_EXCEPTION")) {
                    StringBuilder sb2 = new StringBuilder();
                    org.telegram.messenger.rl.j(R.string.ErrorOccurred, "\n", sb2);
                    sb2.append(i71Var.f38991b.text);
                    string = sb2.toString();
                } else {
                    string = LocaleController.getString(R.string.AccountAlreadyLoggedIn);
                }
                org.telegram.ui.Components.y4.u0(i71Var.f38992c, LocaleController.getString(R.string.AuthAnotherClient), string, null);
                break;
            default:
                org.telegram.ui.Components.y4.u0(this.f38697b.f38992c, LocaleController.getString(R.string.AuthAnotherClient), LocaleController.getString(R.string.ErrorOccurred), null);
                break;
        }
    }
}
