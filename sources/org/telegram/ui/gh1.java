package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class gh1 implements Runnable {
    public final int f36219a;
    public final oh1 f36220b;

    public gh1(oh1 oh1Var, int i10) {
        this.f36219a = i10;
        this.f36220b = oh1Var;
    }

    @Override
    public final void run() {
        switch (this.f36219a) {
            case 0:
                oh1 oh1Var = this.f36220b;
                EditTextBoldCursor editTextBoldCursor = oh1Var.f38670n;
                if (editTextBoldCursor != null && editTextBoldCursor.getVisibility() == 0) {
                    oh1Var.f38670n.requestFocus();
                    AndroidUtilities.showKeyboard(oh1Var.f38670n);
                    return;
                }
                return;
            case 1:
                oh1 oh1Var2 = this.f36220b;
                ge0 ge0Var = oh1Var2.f38673w;
                if (ge0Var != null && ge0Var.getVisibility() == 0) {
                    oh1Var2.f38673w.f36645f[0].requestFocus();
                    return;
                }
                return;
            case 2:
                int i10 = 0;
                while (true) {
                    ks[] ksVarArr = this.f36220b.f38673w.f36645f;
                    if (i10 < ksVarArr.length) {
                        ksVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 3:
                oh1 oh1Var3 = this.f36220b;
                EditTextBoldCursor editTextBoldCursor2 = oh1Var3.f38670n;
                if (editTextBoldCursor2 != null) {
                    if (editTextBoldCursor2.length() != 0) {
                        oh1Var3.f38665f0[2].P(49);
                        oh1Var3.f38665f0[2].T(0.0f, false);
                        oh1Var3.f38656a.d();
                        return;
                    }
                    oh1Var3.F0(true);
                    return;
                }
                return;
            case 4:
                oh1 oh1Var4 = this.f36220b;
                if (oh1Var4.f38666g0 != null) {
                    oh1Var4.F0(false);
                    return;
                }
                return;
            case 5:
                oh1.f0(this.f36220b);
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new gh1(this.f36220b, 7), 150L);
                return;
            default:
                for (ks ksVar : this.f36220b.f38673w.f36645f) {
                    ksVar.i(0.0f);
                }
                return;
        }
    }
}
