package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ah1 implements Runnable {
    public final int f32087a;
    public final ih1 f32088b;

    public ah1(ih1 ih1Var, int i10) {
        this.f32087a = i10;
        this.f32088b = ih1Var;
    }

    @Override
    public final void run() {
        switch (this.f32087a) {
            case 0:
                ih1 ih1Var = this.f32088b;
                EditTextBoldCursor editTextBoldCursor = ih1Var.f34604n;
                if (editTextBoldCursor != null && editTextBoldCursor.getVisibility() == 0) {
                    ih1Var.f34604n.requestFocus();
                    AndroidUtilities.showKeyboard(ih1Var.f34604n);
                    return;
                }
                return;
            case 1:
                ih1 ih1Var2 = this.f32088b;
                fe0 fe0Var = ih1Var2.f34607w;
                if (fe0Var != null && fe0Var.getVisibility() == 0) {
                    ih1Var2.f34607w.f33145f[0].requestFocus();
                    return;
                }
                return;
            case 2:
                int i10 = 0;
                while (true) {
                    gs[] gsVarArr = this.f32088b.f34607w.f33145f;
                    if (i10 < gsVarArr.length) {
                        gsVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 3:
                ih1 ih1Var3 = this.f32088b;
                EditTextBoldCursor editTextBoldCursor2 = ih1Var3.f34604n;
                if (editTextBoldCursor2 != null) {
                    if (editTextBoldCursor2.length() != 0) {
                        ih1Var3.f34599f0[2].P(49);
                        ih1Var3.f34599f0[2].T(0.0f, false);
                        ih1Var3.f34590a.d();
                        return;
                    }
                    ih1Var3.F0(true);
                    return;
                }
                return;
            case 4:
                ih1 ih1Var4 = this.f32088b;
                if (ih1Var4.f34600g0 != null) {
                    ih1Var4.F0(false);
                    return;
                }
                return;
            case 5:
                ih1.f0(this.f32088b);
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new ah1(this.f32088b, 7), 150L);
                return;
            default:
                for (gs gsVar : this.f32088b.f34607w.f33145f) {
                    gsVar.i(0.0f);
                }
                return;
        }
    }
}
