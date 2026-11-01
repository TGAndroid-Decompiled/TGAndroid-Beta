package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class ic1 implements Runnable {
    public final int f38003a;
    public final rc1 f38004b;

    public ic1(rc1 rc1Var, int i10) {
        this.f38003a = i10;
        this.f38004b = rc1Var;
    }

    @Override
    public final void run() {
        switch (this.f38003a) {
            case 0:
                int i10 = 0;
                while (true) {
                    bs[] bsVarArr = this.f38004b.f41055x.f44045f;
                    if (i10 < bsVarArr.length) {
                        bsVarArr[i10].z(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 1:
                rc1 rc1Var = this.f38004b;
                EditTextBoldCursor editTextBoldCursor = rc1Var.f41051n;
                if (editTextBoldCursor != null) {
                    if (editTextBoldCursor.length() != 0) {
                        rc1Var.f41046f0[2].P(49);
                        rc1Var.f41046f0[2].T(false, 0.0f);
                        rc1Var.f41037a.d();
                        return;
                    }
                    rc1Var.K0(true);
                    return;
                }
                return;
            case 2:
                rc1 rc1Var2 = this.f38004b;
                EditTextBoldCursor editTextBoldCursor2 = rc1Var2.f41051n;
                if (editTextBoldCursor2 != null && editTextBoldCursor2.getVisibility() == 0) {
                    rc1Var2.f41051n.requestFocus();
                    org.telegram.messenger.i0.J3(rc1Var2.f41051n);
                    return;
                }
                return;
            case 3:
                rc1 rc1Var3 = this.f38004b;
                tc0 tc0Var = rc1Var3.f41055x;
                if (tc0Var != null && tc0Var.getVisibility() == 0) {
                    rc1Var3.f41055x.f44045f[0].requestFocus();
                    return;
                }
                return;
            case 4:
                rc1 rc1Var4 = this.f38004b;
                if (rc1Var4.f41047g0 != null) {
                    rc1Var4.K0(false);
                    return;
                }
                return;
            case 5:
                rc1.k0(this.f38004b);
                return;
            case 6:
                org.telegram.messenger.i0.h3(new ic1(this.f38004b, 7), 150L);
                return;
            default:
                for (bs bsVar : this.f38004b.f41055x.f44045f) {
                    bsVar.z(0.0f);
                }
                return;
        }
    }
}
