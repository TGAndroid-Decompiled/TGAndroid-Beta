package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.voip.NativeInstance;
public final class a20 implements org.telegram.ui.ActionBar.s0, org.telegram.ui.Components.bl0, r0.o, NativeInstance.AudioLevelsCallback, org.telegram.ui.ActionBar.m1 {
    public final int f36401a;
    public final r50 f36402b;

    public a20(r50 r50Var, int i10) {
        this.f36401a = i10;
        this.f36402b = r50Var;
    }

    @Override
    public r0.m1 I0(View view, r0.m1 m1Var) {
        return r50.A(this.f36402b, m1Var);
    }

    @Override
    public boolean c(int i10, View view) {
        switch (this.f36401a) {
            case 1:
                r50 r50Var = this.f36402b;
                if (r50Var.F1(view)) {
                    try {
                        r50Var.M.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                }
                return false;
            default:
                r50 r50Var2 = this.f36402b;
                if (!r50Var2.r1()) {
                    if (view instanceof org.telegram.ui.Components.voip.l) {
                        return r50Var2.F1(view);
                    }
                    if (view instanceof org.telegram.ui.Cells.c4) {
                        r50Var2.I1();
                        org.telegram.ui.Components.aj0 aj0Var = ((org.telegram.ui.Cells.c4) view).f24157f;
                        if (aj0Var.isEnabled()) {
                            aj0Var.callOnClick();
                            return true;
                        }
                    }
                }
                return false;
        }
    }

    @Override
    public void i(int i10) {
        this.f36402b.K.getActionBarMenuOnItemClick().b(i10);
    }

    @Override
    public void o(KeyEvent keyEvent) {
        r50 r50Var;
        r40 r40Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (r40Var = (r50Var = this.f36402b).f41875b3) != null && r40Var.isShowing()) {
            r50Var.f41875b3.dismiss();
        }
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        r50.C(this.f36402b, iArr, fArr);
    }
}
