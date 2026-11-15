package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class oa1 implements Runnable {
    public final int f49886a;
    public final xa1 f49887b;

    public oa1(xa1 xa1Var, int i7) {
        this.f49886a = i7;
        this.f49887b = xa1Var;
    }

    @Override
    public final void run() {
        switch (this.f49886a) {
            case 0:
                int i7 = 0;
                while (true) {
                    dr[] drVarArr = this.f49887b.f53159x.f45491f;
                    if (i7 < drVarArr.length) {
                        drVarArr[i7].A(0.0f);
                        i7++;
                    } else {
                        return;
                    }
                }
            case 1:
                xa1 xa1Var = this.f49887b;
                EditTextBoldCursor editTextBoldCursor = xa1Var.f53155n;
                if (editTextBoldCursor != null) {
                    if (editTextBoldCursor.length() != 0) {
                        xa1Var.f53150g0[2].P(49);
                        xa1Var.f53150g0[2].T(false, 0.0f);
                        xa1Var.f53139a.d();
                        return;
                    }
                    xa1Var.K0(true);
                    return;
                }
                return;
            case 2:
                xa1 xa1Var2 = this.f49887b;
                EditTextBoldCursor editTextBoldCursor2 = xa1Var2.f53155n;
                if (editTextBoldCursor2 != null && editTextBoldCursor2.getVisibility() == 0) {
                    xa1Var2.f53155n.requestFocus();
                    org.telegram.messenger.g0.J3(xa1Var2.f53155n);
                    return;
                }
                return;
            case 3:
                xa1 xa1Var3 = this.f49887b;
                lb0 lb0Var = xa1Var3.f53159x;
                if (lb0Var != null && lb0Var.getVisibility() == 0) {
                    xa1Var3.f53159x.f45491f[0].requestFocus();
                    return;
                }
                return;
            case 4:
                xa1 xa1Var4 = this.f49887b;
                if (xa1Var4.f53151h0 != null) {
                    xa1Var4.K0(false);
                    return;
                }
                return;
            case 5:
                xa1.k0(this.f49887b);
                return;
            case 6:
                org.telegram.messenger.g0.i3(new oa1(this.f49887b, 7), 150L);
                return;
            default:
                for (dr drVar : this.f49887b.f53159x.f45491f) {
                    drVar.A(0.0f);
                }
                return;
        }
    }
}
