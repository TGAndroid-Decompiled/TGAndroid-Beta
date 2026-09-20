package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ah1 implements Runnable {
    public final int f32066a;
    public final ih1 f32067b;

    public ah1(ih1 ih1Var, int i10) {
        this.f32066a = i10;
        this.f32067b = ih1Var;
    }

    @Override
    public final void run() {
        switch (this.f32066a) {
            case 0:
                ih1 ih1Var = this.f32067b;
                EditTextBoldCursor editTextBoldCursor = ih1Var.f34584n;
                if (editTextBoldCursor != null && editTextBoldCursor.getVisibility() == 0) {
                    ih1Var.f34584n.requestFocus();
                    AndroidUtilities.showKeyboard(ih1Var.f34584n);
                    return;
                }
                return;
            case 1:
                ih1 ih1Var2 = this.f32067b;
                fe0 fe0Var = ih1Var2.f34587w;
                if (fe0Var != null && fe0Var.getVisibility() == 0) {
                    ih1Var2.f34587w.f33125f[0].requestFocus();
                    return;
                }
                return;
            case 2:
                int i10 = 0;
                while (true) {
                    gs[] gsVarArr = this.f32067b.f34587w.f33125f;
                    if (i10 < gsVarArr.length) {
                        gsVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 3:
                ih1 ih1Var3 = this.f32067b;
                EditTextBoldCursor editTextBoldCursor2 = ih1Var3.f34584n;
                if (editTextBoldCursor2 != null) {
                    if (editTextBoldCursor2.length() != 0) {
                        ih1Var3.f34579f0[2].P(49);
                        ih1Var3.f34579f0[2].T(0.0f, false);
                        ih1Var3.f34570a.d();
                        return;
                    }
                    ih1Var3.F0(true);
                    return;
                }
                return;
            case 4:
                ih1 ih1Var4 = this.f32067b;
                if (ih1Var4.f34580g0 != null) {
                    ih1Var4.F0(false);
                    return;
                }
                return;
            case 5:
                ih1.f0(this.f32067b);
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new ah1(this.f32067b, 7), 150L);
                return;
            default:
                for (gs gsVar : this.f32067b.f34587w.f33125f) {
                    gsVar.i(0.0f);
                }
                return;
        }
    }
}
