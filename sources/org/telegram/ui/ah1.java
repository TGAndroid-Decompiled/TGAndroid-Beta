package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ah1 implements Runnable {
    public final int f35933a;
    public final ih1 f35934b;

    public ah1(ih1 ih1Var, int i10) {
        this.f35933a = i10;
        this.f35934b = ih1Var;
    }

    @Override
    public final void run() {
        switch (this.f35933a) {
            case 0:
                ih1 ih1Var = this.f35934b;
                EditTextBoldCursor editTextBoldCursor = ih1Var.f38657n;
                if (editTextBoldCursor != null && editTextBoldCursor.getVisibility() == 0) {
                    ih1Var.f38657n.requestFocus();
                    AndroidUtilities.showKeyboard(ih1Var.f38657n);
                    return;
                }
                return;
            case 1:
                ih1 ih1Var2 = this.f35934b;
                ce0 ce0Var = ih1Var2.f38660w;
                if (ce0Var != null && ce0Var.getVisibility() == 0) {
                    ih1Var2.f38660w.f36734f[0].requestFocus();
                    return;
                }
                return;
            case 2:
                int i10 = 0;
                while (true) {
                    es[] esVarArr = this.f35934b.f38660w.f36734f;
                    if (i10 < esVarArr.length) {
                        esVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 3:
                ih1 ih1Var3 = this.f35934b;
                EditTextBoldCursor editTextBoldCursor2 = ih1Var3.f38657n;
                if (editTextBoldCursor2 != null) {
                    if (editTextBoldCursor2.length() != 0) {
                        ih1Var3.f38652f0[2].P(49);
                        ih1Var3.f38652f0[2].T(0.0f, false);
                        ih1Var3.f38642a.d();
                        return;
                    }
                    ih1Var3.F0(true);
                    return;
                }
                return;
            case 4:
                ih1 ih1Var4 = this.f35934b;
                if (ih1Var4.f38653g0 != null) {
                    ih1Var4.F0(false);
                    return;
                }
                return;
            case 5:
                ih1.f0(this.f35934b);
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new ah1(this.f35934b, 7), 150L);
                return;
            default:
                for (es esVar : this.f35934b.f38660w.f36734f) {
                    esVar.i(0.0f);
                }
                return;
        }
    }
}
