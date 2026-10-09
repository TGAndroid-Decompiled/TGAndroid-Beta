package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ah1 implements Runnable {
    public final int f35931a;
    public final ih1 f35932b;

    public ah1(ih1 ih1Var, int i10) {
        this.f35931a = i10;
        this.f35932b = ih1Var;
    }

    @Override
    public final void run() {
        switch (this.f35931a) {
            case 0:
                ih1 ih1Var = this.f35932b;
                EditTextBoldCursor editTextBoldCursor = ih1Var.f38655n;
                if (editTextBoldCursor != null && editTextBoldCursor.getVisibility() == 0) {
                    ih1Var.f38655n.requestFocus();
                    AndroidUtilities.showKeyboard(ih1Var.f38655n);
                    return;
                }
                return;
            case 1:
                ih1 ih1Var2 = this.f35932b;
                ce0 ce0Var = ih1Var2.f38658w;
                if (ce0Var != null && ce0Var.getVisibility() == 0) {
                    ih1Var2.f38658w.f36732f[0].requestFocus();
                    return;
                }
                return;
            case 2:
                int i10 = 0;
                while (true) {
                    es[] esVarArr = this.f35932b.f38658w.f36732f;
                    if (i10 < esVarArr.length) {
                        esVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 3:
                ih1 ih1Var3 = this.f35932b;
                EditTextBoldCursor editTextBoldCursor2 = ih1Var3.f38655n;
                if (editTextBoldCursor2 != null) {
                    if (editTextBoldCursor2.length() != 0) {
                        ih1Var3.f38650f0[2].P(49);
                        ih1Var3.f38650f0[2].T(0.0f, false);
                        ih1Var3.f38640a.d();
                        return;
                    }
                    ih1Var3.F0(true);
                    return;
                }
                return;
            case 4:
                ih1 ih1Var4 = this.f35932b;
                if (ih1Var4.f38651g0 != null) {
                    ih1Var4.F0(false);
                    return;
                }
                return;
            case 5:
                ih1.f0(this.f35932b);
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new ah1(this.f35932b, 7), 150L);
                return;
            default:
                for (es esVar : this.f35932b.f38658w.f36732f) {
                    esVar.i(0.0f);
                }
                return;
        }
    }
}
