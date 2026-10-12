package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ch1 implements Runnable {
    public final int f36432a;
    public final kh1 f36433b;

    public ch1(kh1 kh1Var, int i10) {
        this.f36432a = i10;
        this.f36433b = kh1Var;
    }

    @Override
    public final void run() {
        switch (this.f36432a) {
            case 0:
                kh1 kh1Var = this.f36433b;
                EditTextBoldCursor editTextBoldCursor = kh1Var.f39512n;
                if (editTextBoldCursor != null && editTextBoldCursor.getVisibility() == 0) {
                    kh1Var.f39512n.requestFocus();
                    AndroidUtilities.showKeyboard(kh1Var.f39512n);
                    return;
                }
                return;
            case 1:
                kh1 kh1Var2 = this.f36433b;
                de0 de0Var = kh1Var2.f39515w;
                if (de0Var != null && de0Var.getVisibility() == 0) {
                    kh1Var2.f39515w.f37837f[0].requestFocus();
                    return;
                }
                return;
            case 2:
                int i10 = 0;
                while (true) {
                    hs[] hsVarArr = this.f36433b.f39515w.f37837f;
                    if (i10 < hsVarArr.length) {
                        hsVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 3:
                kh1 kh1Var3 = this.f36433b;
                EditTextBoldCursor editTextBoldCursor2 = kh1Var3.f39512n;
                if (editTextBoldCursor2 != null) {
                    if (editTextBoldCursor2.length() != 0) {
                        kh1Var3.f39507f0[2].P(49);
                        kh1Var3.f39507f0[2].T(0.0f, false);
                        kh1Var3.f39497a.d();
                        return;
                    }
                    kh1Var3.F0(true);
                    return;
                }
                return;
            case 4:
                kh1 kh1Var4 = this.f36433b;
                if (kh1Var4.f39508g0 != null) {
                    kh1Var4.F0(false);
                    return;
                }
                return;
            case 5:
                kh1.f0(this.f36433b);
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new ch1(this.f36433b, 7), 150L);
                return;
            default:
                for (hs hsVar : this.f36433b.f39515w.f37837f) {
                    hsVar.i(0.0f);
                }
                return;
        }
    }
}
