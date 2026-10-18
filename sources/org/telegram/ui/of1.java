package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class of1 implements Runnable {
    public final int f39791a;
    public final xf1 f39792b;

    public of1(xf1 xf1Var, int i10) {
        this.f39791a = i10;
        this.f39792b = xf1Var;
    }

    @Override
    public final void run() {
        switch (this.f39791a) {
            case 0:
                xf1 xf1Var = this.f39792b;
                EditTextBoldCursor editTextBoldCursor = xf1Var.f43146n;
                if (editTextBoldCursor != null && editTextBoldCursor.getVisibility() == 0) {
                    xf1Var.f43146n.requestFocus();
                    AndroidUtilities.showKeyboard(xf1Var.f43146n);
                    return;
                }
                return;
            case 1:
                xf1 xf1Var2 = this.f39792b;
                kd0 kd0Var = xf1Var2.f43149w;
                if (kd0Var != null && kd0Var.getVisibility() == 0) {
                    xf1Var2.f43149w.f41512f[0].requestFocus();
                    return;
                }
                return;
            case 2:
                int i10 = 0;
                while (true) {
                    vr[] vrVarArr = this.f39792b.f43149w.f41512f;
                    if (i10 < vrVarArr.length) {
                        vrVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 3:
                xf1 xf1Var3 = this.f39792b;
                EditTextBoldCursor editTextBoldCursor2 = xf1Var3.f43146n;
                if (editTextBoldCursor2 != null) {
                    if (editTextBoldCursor2.length() != 0) {
                        xf1Var3.f43141f0[2].P(49);
                        xf1Var3.f43141f0[2].T(0.0f, false);
                        xf1Var3.f43132a.d();
                        return;
                    }
                    xf1Var3.F0(true);
                    return;
                }
                return;
            case 4:
                xf1 xf1Var4 = this.f39792b;
                if (xf1Var4.f43142g0 != null) {
                    xf1Var4.F0(false);
                    return;
                }
                return;
            case 5:
                xf1.f0(this.f39792b);
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new of1(this.f39792b, 7), 150L);
                return;
            default:
                for (vr vrVar : this.f39792b.f43149w.f41512f) {
                    vrVar.i(0.0f);
                }
                return;
        }
    }
}
