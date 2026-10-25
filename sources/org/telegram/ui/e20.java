package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.voip.NativeInstance;
public final class e20 implements org.telegram.ui.ActionBar.r0, org.telegram.ui.Components.bm0, r0.n, NativeInstance.AudioLevelsCallback, org.telegram.ui.ActionBar.m1 {
    public final int f38968a;
    public final v50 f38969b;

    public e20(v50 v50Var, int i10) {
        this.f38968a = i10;
        this.f38969b = v50Var;
    }

    @Override
    public r0.k1 P0(View view, r0.k1 k1Var) {
        return v50.A(this.f38969b, k1Var);
    }

    @Override
    public boolean c(int i10, View view) {
        switch (this.f38968a) {
            case 1:
                v50 v50Var = this.f38969b;
                if (v50Var.G1(view)) {
                    try {
                        v50Var.Q.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                }
                return false;
            default:
                v50 v50Var2 = this.f38969b;
                if (!v50Var2.r1()) {
                    if (view instanceof org.telegram.ui.Components.voip.l) {
                        return v50Var2.G1(view);
                    }
                    if (view instanceof org.telegram.ui.Cells.i4) {
                        v50Var2.J1();
                        org.telegram.ui.Components.ak0 ak0Var = ((org.telegram.ui.Cells.i4) view).f24227f;
                        if (ak0Var.isEnabled()) {
                            ak0Var.callOnClick();
                            return true;
                        }
                    }
                }
                return false;
        }
    }

    @Override
    public void g(int i10) {
        this.f38969b.O.getActionBarMenuOnItemClick().b(i10);
    }

    @Override
    public void n(KeyEvent keyEvent) {
        v50 v50Var;
        v40 v40Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (v40Var = (v50Var = this.f38969b).f44631f3) != null && v40Var.isShowing()) {
            v50Var.f44631f3.dismiss();
        }
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        v50.C(this.f38969b, iArr, fArr);
    }
}
