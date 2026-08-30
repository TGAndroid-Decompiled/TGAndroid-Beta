package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class fg1 implements Runnable {
    public final int f34254a;
    public final og1 f34255b;

    public fg1(og1 og1Var, int i10) {
        this.f34254a = i10;
        this.f34255b = og1Var;
    }

    @Override
    public final void run() {
        switch (this.f34254a) {
            case 0:
                og1 og1Var = this.f34255b;
                EditTextBoldCursor editTextBoldCursor = og1Var.f36904n;
                if (editTextBoldCursor != null && editTextBoldCursor.getVisibility() == 0) {
                    og1Var.f36904n.requestFocus();
                    AndroidUtilities.showKeyboard(og1Var.f36904n);
                    return;
                }
                return;
            case 1:
                og1 og1Var2 = this.f34255b;
                vd0 vd0Var = og1Var2.f36907w;
                if (vd0Var != null && vd0Var.getVisibility() == 0) {
                    og1Var2.f36907w.f40565f[0].requestFocus();
                    return;
                }
                return;
            case 2:
                int i10 = 0;
                while (true) {
                    bs[] bsVarArr = this.f34255b.f36907w.f40565f;
                    if (i10 < bsVarArr.length) {
                        bsVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 3:
                og1 og1Var3 = this.f34255b;
                EditTextBoldCursor editTextBoldCursor2 = og1Var3.f36904n;
                if (editTextBoldCursor2 != null) {
                    if (editTextBoldCursor2.length() != 0) {
                        og1Var3.f36898c0[2].N(49);
                        og1Var3.f36898c0[2].Q(0.0f, false);
                        og1Var3.f36893a.d();
                        return;
                    }
                    og1Var3.F0(true);
                    return;
                }
                return;
            case 4:
                og1 og1Var4 = this.f34255b;
                if (og1Var4.f36899d0 != null) {
                    og1Var4.F0(false);
                    return;
                }
                return;
            case 5:
                og1.f0(this.f34255b);
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new fg1(this.f34255b, 7), 150L);
                return;
            default:
                for (bs bsVar : this.f34255b.f36907w.f40565f) {
                    bsVar.i(0.0f);
                }
                return;
        }
    }
}
