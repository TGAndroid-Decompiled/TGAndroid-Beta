package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ch1 implements Runnable {
    public final int f36434a;
    public final kh1 f36435b;

    public ch1(kh1 kh1Var, int i10) {
        this.f36434a = i10;
        this.f36435b = kh1Var;
    }

    @Override
    public final void run() {
        switch (this.f36434a) {
            case 0:
                kh1 kh1Var = this.f36435b;
                EditTextBoldCursor editTextBoldCursor = kh1Var.f39506n;
                if (editTextBoldCursor != null && editTextBoldCursor.getVisibility() == 0) {
                    kh1Var.f39506n.requestFocus();
                    AndroidUtilities.showKeyboard(kh1Var.f39506n);
                    return;
                }
                return;
            case 1:
                kh1 kh1Var2 = this.f36435b;
                de0 de0Var = kh1Var2.f39509w;
                if (de0Var != null && de0Var.getVisibility() == 0) {
                    kh1Var2.f39509w.f37834f[0].requestFocus();
                    return;
                }
                return;
            case 2:
                int i10 = 0;
                while (true) {
                    hs[] hsVarArr = this.f36435b.f39509w.f37834f;
                    if (i10 < hsVarArr.length) {
                        hsVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 3:
                kh1 kh1Var3 = this.f36435b;
                EditTextBoldCursor editTextBoldCursor2 = kh1Var3.f39506n;
                if (editTextBoldCursor2 != null) {
                    if (editTextBoldCursor2.length() != 0) {
                        kh1Var3.f39501f0[2].P(49);
                        kh1Var3.f39501f0[2].T(0.0f, false);
                        kh1Var3.f39491a.d();
                        return;
                    }
                    kh1Var3.F0(true);
                    return;
                }
                return;
            case 4:
                kh1 kh1Var4 = this.f36435b;
                if (kh1Var4.f39502g0 != null) {
                    kh1Var4.F0(false);
                    return;
                }
                return;
            case 5:
                kh1.f0(this.f36435b);
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new ch1(this.f36435b, 7), 150L);
                return;
            default:
                for (hs hsVar : this.f36435b.f39509w.f37834f) {
                    hsVar.i(0.0f);
                }
                return;
        }
    }
}
