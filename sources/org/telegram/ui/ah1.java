package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ah1 implements Runnable {
    public final int f31866a;
    public final ih1 f31867b;

    public ah1(ih1 ih1Var, int i10) {
        this.f31866a = i10;
        this.f31867b = ih1Var;
    }

    @Override
    public final void run() {
        switch (this.f31866a) {
            case 0:
                ih1 ih1Var = this.f31867b;
                EditTextBoldCursor editTextBoldCursor = ih1Var.f34585n;
                if (editTextBoldCursor != null && editTextBoldCursor.getVisibility() == 0) {
                    ih1Var.f34585n.requestFocus();
                    AndroidUtilities.showKeyboard(ih1Var.f34585n);
                    return;
                }
                return;
            case 1:
                ih1 ih1Var2 = this.f31867b;
                fe0 fe0Var = ih1Var2.f34588w;
                if (fe0Var != null && fe0Var.getVisibility() == 0) {
                    ih1Var2.f34588w.f33749f[0].requestFocus();
                    return;
                }
                return;
            case 2:
                int i10 = 0;
                while (true) {
                    is[] isVarArr = this.f31867b.f34588w.f33749f;
                    if (i10 < isVarArr.length) {
                        isVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 3:
                ih1 ih1Var3 = this.f31867b;
                EditTextBoldCursor editTextBoldCursor2 = ih1Var3.f34585n;
                if (editTextBoldCursor2 != null) {
                    if (editTextBoldCursor2.length() != 0) {
                        ih1Var3.f34580f0[2].P(49);
                        ih1Var3.f34580f0[2].S(0.0f, false);
                        ih1Var3.f34571a.d();
                        return;
                    }
                    ih1Var3.F0(true);
                    return;
                }
                return;
            case 4:
                ih1 ih1Var4 = this.f31867b;
                if (ih1Var4.f34581g0 != null) {
                    ih1Var4.F0(false);
                    return;
                }
                return;
            case 5:
                ih1.f0(this.f31867b);
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new ah1(this.f31867b, 7), 150L);
                return;
            default:
                for (is isVar : this.f31867b.f34588w.f33749f) {
                    isVar.i(0.0f);
                }
                return;
        }
    }
}
