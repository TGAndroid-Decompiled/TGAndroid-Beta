package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class mf1 implements Runnable {
    public final int f39238a;
    public final vf1 f39239b;

    public mf1(vf1 vf1Var, int i10) {
        this.f39238a = i10;
        this.f39239b = vf1Var;
    }

    @Override
    public final void run() {
        switch (this.f39238a) {
            case 0:
                vf1 vf1Var = this.f39239b;
                EditTextBoldCursor editTextBoldCursor = vf1Var.f42244n;
                if (editTextBoldCursor != null && editTextBoldCursor.getVisibility() == 0) {
                    vf1Var.f42244n.requestFocus();
                    AndroidUtilities.showKeyboard(vf1Var.f42244n);
                    return;
                }
                return;
            case 1:
                vf1 vf1Var2 = this.f39239b;
                id0 id0Var = vf1Var2.f42247w;
                if (id0Var != null && id0Var.getVisibility() == 0) {
                    vf1Var2.f42247w.f40959f[0].requestFocus();
                    return;
                }
                return;
            case 2:
                int i10 = 0;
                while (true) {
                    tr[] trVarArr = this.f39239b.f42247w.f40959f;
                    if (i10 < trVarArr.length) {
                        trVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 3:
                vf1 vf1Var3 = this.f39239b;
                EditTextBoldCursor editTextBoldCursor2 = vf1Var3.f42244n;
                if (editTextBoldCursor2 != null) {
                    if (editTextBoldCursor2.length() != 0) {
                        vf1Var3.f42239f0[2].P(49);
                        vf1Var3.f42239f0[2].T(0.0f, false);
                        vf1Var3.f42230a.d();
                        return;
                    }
                    vf1Var3.F0(true);
                    return;
                }
                return;
            case 4:
                vf1 vf1Var4 = this.f39239b;
                if (vf1Var4.f42240g0 != null) {
                    vf1Var4.F0(false);
                    return;
                }
                return;
            case 5:
                vf1.f0(this.f39239b);
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new mf1(this.f39239b, 7), 150L);
                return;
            default:
                for (tr trVar : this.f39239b.f42247w.f40959f) {
                    trVar.i(0.0f);
                }
                return;
        }
    }
}
