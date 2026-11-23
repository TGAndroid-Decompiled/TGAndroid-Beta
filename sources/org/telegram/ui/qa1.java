package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class qa1 implements Runnable {
    public final int f51393a;
    public final za1 f51394b;

    public qa1(za1 za1Var, int i7) {
        this.f51393a = i7;
        this.f51394b = za1Var;
    }

    @Override
    public final void run() {
        switch (this.f51393a) {
            case 0:
                int i7 = 0;
                while (true) {
                    er[] erVarArr = this.f51394b.f54580x.f46491f;
                    if (i7 < erVarArr.length) {
                        erVarArr[i7].A(0.0f);
                        i7++;
                    } else {
                        return;
                    }
                }
            case 1:
                za1 za1Var = this.f51394b;
                EditTextBoldCursor editTextBoldCursor = za1Var.f54576n;
                if (editTextBoldCursor != null) {
                    if (editTextBoldCursor.length() != 0) {
                        za1Var.f54571g0[2].P(49);
                        za1Var.f54571g0[2].T(false, 0.0f);
                        za1Var.f54560a.d();
                        return;
                    }
                    za1Var.K0(true);
                    return;
                }
                return;
            case 2:
                za1 za1Var2 = this.f51394b;
                EditTextBoldCursor editTextBoldCursor2 = za1Var2.f54576n;
                if (editTextBoldCursor2 != null && editTextBoldCursor2.getVisibility() == 0) {
                    za1Var2.f54576n.requestFocus();
                    org.telegram.messenger.g0.I3(za1Var2.f54576n);
                    return;
                }
                return;
            case 3:
                za1 za1Var3 = this.f51394b;
                lb0 lb0Var = za1Var3.f54580x;
                if (lb0Var != null && lb0Var.getVisibility() == 0) {
                    za1Var3.f54580x.f46491f[0].requestFocus();
                    return;
                }
                return;
            case 4:
                za1 za1Var4 = this.f51394b;
                if (za1Var4.f54572h0 != null) {
                    za1Var4.K0(false);
                    return;
                }
                return;
            case 5:
                za1.k0(this.f51394b);
                return;
            case 6:
                org.telegram.messenger.g0.h3(new qa1(this.f51394b, 7), 150L);
                return;
            default:
                for (er erVar : this.f51394b.f54580x.f46491f) {
                    erVar.A(0.0f);
                }
                return;
        }
    }
}
