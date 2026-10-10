package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class ck0 implements Runnable {
    public final int f25317a;
    public final dk0 f25318b;

    public ck0(dk0 dk0Var, int i10) {
        this.f25317a = i10;
        this.f25318b = dk0Var;
    }

    @Override
    public final void run() {
        switch (this.f25317a) {
            case 0:
                dk0 dk0Var = this.f25318b;
                dk0Var.getClass();
                try {
                    yf.e eVar = dk0Var.B0;
                    if (eVar != null) {
                        eVar.b();
                    }
                } catch (Throwable unused) {
                }
                AndroidUtilities.runOnUIThread(dk0Var.f25760z0);
                return;
            case 1:
                dk0 dk0Var2 = this.f25318b;
                dk0Var2.P = null;
                dk0Var2.p();
                return;
            case 2:
                dk0.h(this.f25318b);
                return;
            case 3:
                dk0.e(this.f25318b);
                return;
            case 4:
                dk0.d(this.f25318b);
                return;
            case 5:
                dk0.f(this.f25318b);
                return;
            default:
                this.f25318b.m();
                return;
        }
    }
}
