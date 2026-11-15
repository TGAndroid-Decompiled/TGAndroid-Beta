package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class oa1 implements Runnable {
    public final int f49876a;
    public final xa1 f49877b;

    public oa1(xa1 xa1Var, int i7) {
        this.f49876a = i7;
        this.f49877b = xa1Var;
    }

    @Override
    public final void run() {
        switch (this.f49876a) {
            case 0:
                int i7 = 0;
                while (true) {
                    dr[] drVarArr = this.f49877b.f53158x.f45485f;
                    if (i7 < drVarArr.length) {
                        drVarArr[i7].A(0.0f);
                        i7++;
                    } else {
                        return;
                    }
                }
            case 1:
                xa1 xa1Var = this.f49877b;
                EditTextBoldCursor editTextBoldCursor = xa1Var.f53154n;
                if (editTextBoldCursor != null) {
                    if (editTextBoldCursor.length() != 0) {
                        xa1Var.f53149g0[2].P(49);
                        xa1Var.f53149g0[2].T(false, 0.0f);
                        xa1Var.f53138a.d();
                        return;
                    }
                    xa1Var.K0(true);
                    return;
                }
                return;
            case 2:
                xa1 xa1Var2 = this.f49877b;
                EditTextBoldCursor editTextBoldCursor2 = xa1Var2.f53154n;
                if (editTextBoldCursor2 != null && editTextBoldCursor2.getVisibility() == 0) {
                    xa1Var2.f53154n.requestFocus();
                    org.telegram.messenger.g0.J3(xa1Var2.f53154n);
                    return;
                }
                return;
            case 3:
                xa1 xa1Var3 = this.f49877b;
                lb0 lb0Var = xa1Var3.f53158x;
                if (lb0Var != null && lb0Var.getVisibility() == 0) {
                    xa1Var3.f53158x.f45485f[0].requestFocus();
                    return;
                }
                return;
            case 4:
                xa1 xa1Var4 = this.f49877b;
                if (xa1Var4.f53150h0 != null) {
                    xa1Var4.K0(false);
                    return;
                }
                return;
            case 5:
                xa1.k0(this.f49877b);
                return;
            case 6:
                org.telegram.messenger.g0.i3(new oa1(this.f49877b, 7), 150L);
                return;
            default:
                for (dr drVar : this.f49877b.f53158x.f45485f) {
                    drVar.A(0.0f);
                }
                return;
        }
    }
}
