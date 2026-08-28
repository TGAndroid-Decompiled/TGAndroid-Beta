package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class i71 implements Runnable {
    public final int f39054a;
    public final j71 f39055b;

    public i71(j71 j71Var, int i9) {
        this.f39054a = i9;
        this.f39055b = j71Var;
    }

    @Override
    public final void run() {
        String sb2;
        switch (this.f39054a) {
            case 0:
                j71 j71Var = this.f39055b;
                String str = j71Var.f39394b.text;
                if (str != null && str.equals("AUTH_TOKEN_EXCEPTION")) {
                    sb2 = LocaleController.getString(R.string.AccountAlreadyLoggedIn);
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    org.telegram.ui.Cells.j2.k(R.string.ErrorOccurred, "\n", sb3);
                    sb3.append(j71Var.f39394b.text);
                    sb2 = sb3.toString();
                }
                org.telegram.ui.Components.y4.u0(j71Var.f39395c, LocaleController.getString(R.string.AuthAnotherClient), sb2, null);
                return;
            default:
                org.telegram.ui.Components.y4.u0(this.f39055b.f39395c, LocaleController.getString(R.string.AuthAnotherClient), LocaleController.getString(R.string.ErrorOccurred), null);
                return;
        }
    }
}
