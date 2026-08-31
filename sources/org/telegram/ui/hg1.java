package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class hg1 implements Runnable {
    public final int f37494a;
    public final qg1 f37495b;

    public hg1(qg1 qg1Var, int i10) {
        this.f37494a = i10;
        this.f37495b = qg1Var;
    }

    @Override
    public final void run() {
        switch (this.f37494a) {
            case 0:
                qg1 qg1Var = this.f37495b;
                EditTextBoldCursor editTextBoldCursor = qg1Var.f40492n;
                if (editTextBoldCursor != null && editTextBoldCursor.getVisibility() == 0) {
                    qg1Var.f40492n.requestFocus();
                    AndroidUtilities.showKeyboard(qg1Var.f40492n);
                    return;
                }
                return;
            case 1:
                qg1 qg1Var2 = this.f37495b;
                wd0 wd0Var = qg1Var2.f40495w;
                if (wd0Var != null && wd0Var.getVisibility() == 0) {
                    qg1Var2.f40495w.f43982f[0].requestFocus();
                    return;
                }
                return;
            case 2:
                int i10 = 0;
                while (true) {
                    cs[] csVarArr = this.f37495b.f40495w.f43982f;
                    if (i10 < csVarArr.length) {
                        csVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 3:
                qg1 qg1Var3 = this.f37495b;
                EditTextBoldCursor editTextBoldCursor2 = qg1Var3.f40492n;
                if (editTextBoldCursor2 != null) {
                    if (editTextBoldCursor2.length() != 0) {
                        qg1Var3.f40485c0[2].N(49);
                        qg1Var3.f40485c0[2].Q(0.0f, false);
                        qg1Var3.f40480a.d();
                        return;
                    }
                    qg1Var3.F0(true);
                    return;
                }
                return;
            case 4:
                qg1 qg1Var4 = this.f37495b;
                if (qg1Var4.f40486d0 != null) {
                    qg1Var4.F0(false);
                    return;
                }
                return;
            case 5:
                qg1.f0(this.f37495b);
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new hg1(this.f37495b, 7), 150L);
                return;
            default:
                for (cs csVar : this.f37495b.f40495w.f43982f) {
                    csVar.i(0.0f);
                }
                return;
        }
    }
}
