package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class g81 implements Runnable {
    public final int f33486a;
    public final h81 f33487b;

    public g81(h81 h81Var, int i10) {
        this.f33486a = i10;
        this.f33487b = h81Var;
    }

    @Override
    public final void run() {
        String sb2;
        switch (this.f33486a) {
            case 0:
                h81 h81Var = this.f33487b;
                String str = h81Var.f33777b.text;
                if (str != null && str.equals("AUTH_TOKEN_EXCEPTION")) {
                    sb2 = LocaleController.getString(R.string.AccountAlreadyLoggedIn);
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    org.telegram.messenger.ul.m(R.string.ErrorOccurred, "\n", sb3);
                    sb3.append(h81Var.f33777b.text);
                    sb2 = sb3.toString();
                }
                org.telegram.ui.Components.e5.u0(h81Var.f33778c, LocaleController.getString(R.string.AuthAnotherClient), sb2, null);
                return;
            default:
                org.telegram.ui.Components.e5.u0(this.f33487b.f33778c, LocaleController.getString(R.string.AuthAnotherClient), LocaleController.getString(R.string.ErrorOccurred), null);
                return;
        }
    }
}
