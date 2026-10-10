package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ah1 implements Runnable {
    public final int f35977a;
    public final ih1 f35978b;

    public ah1(ih1 ih1Var, int i10) {
        this.f35977a = i10;
        this.f35978b = ih1Var;
    }

    @Override
    public final void run() {
        switch (this.f35977a) {
            case 0:
                ih1 ih1Var = this.f35978b;
                EditTextBoldCursor editTextBoldCursor = ih1Var.f38701n;
                if (editTextBoldCursor != null && editTextBoldCursor.getVisibility() == 0) {
                    ih1Var.f38701n.requestFocus();
                    AndroidUtilities.showKeyboard(ih1Var.f38701n);
                    return;
                }
                return;
            case 1:
                ih1 ih1Var2 = this.f35978b;
                ce0 ce0Var = ih1Var2.f38704w;
                if (ce0Var != null && ce0Var.getVisibility() == 0) {
                    ih1Var2.f38704w.f36778f[0].requestFocus();
                    return;
                }
                return;
            case 2:
                int i10 = 0;
                while (true) {
                    es[] esVarArr = this.f35978b.f38704w.f36778f;
                    if (i10 < esVarArr.length) {
                        esVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 3:
                ih1 ih1Var3 = this.f35978b;
                EditTextBoldCursor editTextBoldCursor2 = ih1Var3.f38701n;
                if (editTextBoldCursor2 != null) {
                    if (editTextBoldCursor2.length() != 0) {
                        ih1Var3.f38696f0[2].P(49);
                        ih1Var3.f38696f0[2].T(0.0f, false);
                        ih1Var3.f38686a.d();
                        return;
                    }
                    ih1Var3.F0(true);
                    return;
                }
                return;
            case 4:
                ih1 ih1Var4 = this.f35978b;
                if (ih1Var4.f38697g0 != null) {
                    ih1Var4.F0(false);
                    return;
                }
                return;
            case 5:
                ih1.f0(this.f35978b);
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new ah1(this.f35978b, 7), 150L);
                return;
            default:
                for (es esVar : this.f35978b.f38704w.f36778f) {
                    esVar.i(0.0f);
                }
                return;
        }
    }
}
