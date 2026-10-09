package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class c implements Runnable {
    public final int f25185a;
    public final e0 f25186b;

    public c(e0 e0Var, int i10) {
        this.f25185a = i10;
        this.f25186b = e0Var;
    }

    @Override
    public final void run() {
        switch (this.f25185a) {
            case 0:
                e0 e0Var = this.f25186b;
                if (!e0Var.K0) {
                    e0Var.D0.setVisibility(8);
                    return;
                }
                return;
            case 1:
                e0 e0Var2 = this.f25186b;
                if (e0Var2.K0) {
                    e0Var2.C0.setVisibility(8);
                    return;
                }
                return;
            case 2:
                AndroidUtilities.showKeyboard(this.f25186b.A0.f22297b);
                return;
            case 3:
                e0 e0Var3 = this.f25186b;
                e0Var3.m0(0, 0, false);
                e0Var3.dismiss();
                return;
            default:
                e0.R(this.f25186b);
                return;
        }
    }
}
