package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ng1 implements Runnable {
    public final int f36512a;
    public final wg1 f36513b;

    public ng1(wg1 wg1Var, int i10) {
        this.f36512a = i10;
        this.f36513b = wg1Var;
    }

    @Override
    public final void run() {
        switch (this.f36512a) {
            case 0:
                wg1 wg1Var = this.f36513b;
                EditTextBoldCursor editTextBoldCursor = wg1Var.f39692n;
                if (editTextBoldCursor != null && editTextBoldCursor.getVisibility() == 0) {
                    wg1Var.f39692n.requestFocus();
                    AndroidUtilities.showKeyboard(wg1Var.f39692n);
                    return;
                }
                return;
            case 1:
                wg1 wg1Var2 = this.f36513b;
                xd0 xd0Var = wg1Var2.f39695w;
                if (xd0Var != null && xd0Var.getVisibility() == 0) {
                    wg1Var2.f39695w.f32635f[0].requestFocus();
                    return;
                }
                return;
            case 2:
                int i10 = 0;
                while (true) {
                    ds[] dsVarArr = this.f36513b.f39695w.f32635f;
                    if (i10 < dsVarArr.length) {
                        dsVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 3:
                wg1 wg1Var3 = this.f36513b;
                EditTextBoldCursor editTextBoldCursor2 = wg1Var3.f39692n;
                if (editTextBoldCursor2 != null) {
                    if (editTextBoldCursor2.length() != 0) {
                        wg1Var3.f39686c0[2].N(49);
                        wg1Var3.f39686c0[2].Q(0.0f, false);
                        wg1Var3.f39681a.d();
                        return;
                    }
                    wg1Var3.F0(true);
                    return;
                }
                return;
            case 4:
                wg1 wg1Var4 = this.f36513b;
                if (wg1Var4.f39687d0 != null) {
                    wg1Var4.F0(false);
                    return;
                }
                return;
            case 5:
                wg1.f0(this.f36513b);
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new ng1(this.f36513b, 7), 150L);
                return;
            default:
                for (ds dsVar : this.f36513b.f39695w.f32635f) {
                    dsVar.i(0.0f);
                }
                return;
        }
    }
}
