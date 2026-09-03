package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ng1 implements Runnable {
    public final int f39354a;
    public final vg1 f39355b;

    public ng1(vg1 vg1Var, int i10) {
        this.f39354a = i10;
        this.f39355b = vg1Var;
    }

    @Override
    public final void run() {
        switch (this.f39354a) {
            case 0:
                vg1 vg1Var = this.f39355b;
                EditTextBoldCursor editTextBoldCursor = vg1Var.f42122n;
                if (editTextBoldCursor != null && editTextBoldCursor.getVisibility() == 0) {
                    vg1Var.f42122n.requestFocus();
                    AndroidUtilities.showKeyboard(vg1Var.f42122n);
                    return;
                }
                return;
            case 1:
                vg1 vg1Var2 = this.f39355b;
                wd0 wd0Var = vg1Var2.f42125w;
                if (wd0Var != null && wd0Var.getVisibility() == 0) {
                    vg1Var2.f42125w.f44011f[0].requestFocus();
                    return;
                }
                return;
            case 2:
                int i10 = 0;
                while (true) {
                    cs[] csVarArr = this.f39355b.f42125w.f44011f;
                    if (i10 < csVarArr.length) {
                        csVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 3:
                vg1 vg1Var3 = this.f39355b;
                EditTextBoldCursor editTextBoldCursor2 = vg1Var3.f42122n;
                if (editTextBoldCursor2 != null) {
                    if (editTextBoldCursor2.length() != 0) {
                        vg1Var3.f42115c0[2].N(49);
                        vg1Var3.f42115c0[2].Q(0.0f, false);
                        vg1Var3.f42110a.d();
                        return;
                    }
                    vg1Var3.F0(true);
                    return;
                }
                return;
            case 4:
                vg1 vg1Var4 = this.f39355b;
                if (vg1Var4.f42116d0 != null) {
                    vg1Var4.F0(false);
                    return;
                }
                return;
            case 5:
                vg1.f0(this.f39355b);
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new ng1(this.f39355b, 7), 150L);
                return;
            default:
                for (cs csVar : this.f39355b.f42125w.f44011f) {
                    csVar.i(0.0f);
                }
                return;
        }
    }
}
