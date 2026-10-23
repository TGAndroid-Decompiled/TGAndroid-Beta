package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class mf1 implements Runnable {
    public final int f39242a;
    public final vf1 f39243b;

    public mf1(vf1 vf1Var, int i10) {
        this.f39242a = i10;
        this.f39243b = vf1Var;
    }

    @Override
    public final void run() {
        switch (this.f39242a) {
            case 0:
                vf1 vf1Var = this.f39243b;
                EditTextBoldCursor editTextBoldCursor = vf1Var.f42248n;
                if (editTextBoldCursor != null && editTextBoldCursor.getVisibility() == 0) {
                    vf1Var.f42248n.requestFocus();
                    AndroidUtilities.showKeyboard(vf1Var.f42248n);
                    return;
                }
                return;
            case 1:
                vf1 vf1Var2 = this.f39243b;
                id0 id0Var = vf1Var2.f42251w;
                if (id0Var != null && id0Var.getVisibility() == 0) {
                    vf1Var2.f42251w.f40963f[0].requestFocus();
                    return;
                }
                return;
            case 2:
                int i10 = 0;
                while (true) {
                    tr[] trVarArr = this.f39243b.f42251w.f40963f;
                    if (i10 < trVarArr.length) {
                        trVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 3:
                vf1 vf1Var3 = this.f39243b;
                EditTextBoldCursor editTextBoldCursor2 = vf1Var3.f42248n;
                if (editTextBoldCursor2 != null) {
                    if (editTextBoldCursor2.length() != 0) {
                        vf1Var3.f42243f0[2].P(49);
                        vf1Var3.f42243f0[2].T(0.0f, false);
                        vf1Var3.f42234a.d();
                        return;
                    }
                    vf1Var3.F0(true);
                    return;
                }
                return;
            case 4:
                vf1 vf1Var4 = this.f39243b;
                if (vf1Var4.f42244g0 != null) {
                    vf1Var4.F0(false);
                    return;
                }
                return;
            case 5:
                vf1.f0(this.f39243b);
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new mf1(this.f39243b, 7), 150L);
                return;
            default:
                for (tr trVar : this.f39243b.f42251w.f40963f) {
                    trVar.i(0.0f);
                }
                return;
        }
    }
}
