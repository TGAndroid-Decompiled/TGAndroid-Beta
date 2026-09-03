package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class g81 implements Runnable {
    public final int f34354a;
    public final h81 f34355b;

    public g81(h81 h81Var, int i10) {
        this.f34354a = i10;
        this.f34355b = h81Var;
    }

    @Override
    public final void run() {
        String sb;
        switch (this.f34354a) {
            case 0:
                h81 h81Var = this.f34355b;
                String str = h81Var.f34605b.text;
                if (str != null && str.equals("AUTH_TOKEN_EXCEPTION")) {
                    sb = LocaleController.getString(R.string.AccountAlreadyLoggedIn);
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    b.i(R.string.ErrorOccurred, "\n", sb2);
                    sb2.append(h81Var.f34605b.text);
                    sb = sb2.toString();
                }
                org.telegram.ui.Components.z4.u0(h81Var.f34606c, LocaleController.getString(R.string.AuthAnotherClient), sb, null);
                return;
            default:
                org.telegram.ui.Components.z4.u0(this.f34355b.f34606c, LocaleController.getString(R.string.AuthAnotherClient), LocaleController.getString(R.string.ErrorOccurred), null);
                return;
        }
    }
}
