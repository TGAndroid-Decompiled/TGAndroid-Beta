package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class gh1 implements Runnable {
    public final int f36402a;
    public final oh1 f36403b;

    public gh1(oh1 oh1Var, int i10) {
        this.f36402a = i10;
        this.f36403b = oh1Var;
    }

    @Override
    public final void run() {
        switch (this.f36402a) {
            case 0:
                oh1 oh1Var = this.f36403b;
                EditTextBoldCursor editTextBoldCursor = oh1Var.f38974n;
                if (editTextBoldCursor != null && editTextBoldCursor.getVisibility() == 0) {
                    oh1Var.f38974n.requestFocus();
                    AndroidUtilities.showKeyboard(oh1Var.f38974n);
                    return;
                }
                return;
            case 1:
                oh1 oh1Var2 = this.f36403b;
                ie0 ie0Var = oh1Var2.f38977w;
                if (ie0Var != null && ie0Var.getVisibility() == 0) {
                    oh1Var2.f38977w.f36949f[0].requestFocus();
                    return;
                }
                return;
            case 2:
                int i10 = 0;
                while (true) {
                    ks[] ksVarArr = this.f36403b.f38977w.f36949f;
                    if (i10 < ksVarArr.length) {
                        ksVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 3:
                oh1 oh1Var3 = this.f36403b;
                EditTextBoldCursor editTextBoldCursor2 = oh1Var3.f38974n;
                if (editTextBoldCursor2 != null) {
                    if (editTextBoldCursor2.length() != 0) {
                        oh1Var3.f38969f0[2].P(49);
                        oh1Var3.f38969f0[2].T(0.0f, false);
                        oh1Var3.f38960a.d();
                        return;
                    }
                    oh1Var3.F0(true);
                    return;
                }
                return;
            case 4:
                oh1 oh1Var4 = this.f36403b;
                if (oh1Var4.f38970g0 != null) {
                    oh1Var4.F0(false);
                    return;
                }
                return;
            case 5:
                oh1.f0(this.f36403b);
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new gh1(this.f36403b, 7), 150L);
                return;
            default:
                for (ks ksVar : this.f36403b.f38977w.f36949f) {
                    ksVar.i(0.0f);
                }
                return;
        }
    }
}
