package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class kc1 implements Runnable {
    public final int f38741a;
    public final tc1 f38742b;

    public kc1(tc1 tc1Var, int i10) {
        this.f38741a = i10;
        this.f38742b = tc1Var;
    }

    @Override
    public final void run() {
        switch (this.f38741a) {
            case 0:
                int i10 = 0;
                while (true) {
                    bs[] bsVarArr = this.f38742b.f41812x.f44219f;
                    if (i10 < bsVarArr.length) {
                        bsVarArr[i10].z(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 1:
                tc1 tc1Var = this.f38742b;
                EditTextBoldCursor editTextBoldCursor = tc1Var.f41808n;
                if (editTextBoldCursor != null) {
                    if (editTextBoldCursor.length() != 0) {
                        tc1Var.f41803f0[2].P(49);
                        tc1Var.f41803f0[2].T(false, 0.0f);
                        tc1Var.f41794a.d();
                        return;
                    }
                    tc1Var.J0(true);
                    return;
                }
                return;
            case 2:
                tc1 tc1Var2 = this.f38742b;
                EditTextBoldCursor editTextBoldCursor2 = tc1Var2.f41808n;
                if (editTextBoldCursor2 != null && editTextBoldCursor2.getVisibility() == 0) {
                    tc1Var2.f41808n.requestFocus();
                    org.telegram.messenger.i0.J3(tc1Var2.f41808n);
                    return;
                }
                return;
            case 3:
                tc1 tc1Var3 = this.f38742b;
                uc0 uc0Var = tc1Var3.f41812x;
                if (uc0Var != null && uc0Var.getVisibility() == 0) {
                    tc1Var3.f41812x.f44219f[0].requestFocus();
                    return;
                }
                return;
            case 4:
                tc1 tc1Var4 = this.f38742b;
                if (tc1Var4.f41804g0 != null) {
                    tc1Var4.J0(false);
                    return;
                }
                return;
            case 5:
                tc1.j0(this.f38742b);
                return;
            case 6:
                org.telegram.messenger.i0.h3(new kc1(this.f38742b, 7), 150L);
                return;
            default:
                for (bs bsVar : this.f38742b.f41812x.f44219f) {
                    bsVar.z(0.0f);
                }
                return;
        }
    }
}
