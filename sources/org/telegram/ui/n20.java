package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.voip.NativeInstance;
public final class n20 implements org.telegram.ui.ActionBar.q0, org.telegram.ui.Components.ml0, r0.n, NativeInstance.AudioLevelsCallback, org.telegram.ui.ActionBar.k1 {
    public final int f35737a;
    public final d60 f35738b;

    public n20(d60 d60Var, int i10) {
        this.f35737a = i10;
        this.f35738b = d60Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        return d60.z(this.f35738b, l1Var);
    }

    @Override
    public boolean d(int i10, View view) {
        switch (this.f35737a) {
            case 1:
                d60 d60Var = this.f35738b;
                if (d60Var.F1(view)) {
                    try {
                        d60Var.Q.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                }
                return false;
            default:
                d60 d60Var2 = this.f35738b;
                if (!d60Var2.r1()) {
                    if (view instanceof org.telegram.ui.Components.voip.l) {
                        return d60Var2.F1(view);
                    }
                    if (view instanceof org.telegram.ui.Cells.e4) {
                        d60Var2.I1();
                        org.telegram.ui.Components.lj0 lj0Var = ((org.telegram.ui.Cells.e4) view).f20233f;
                        if (lj0Var.isEnabled()) {
                            lj0Var.callOnClick();
                            return true;
                        }
                    }
                }
                return false;
        }
    }

    @Override
    public void m(int i10) {
        this.f35738b.O.getActionBarMenuOnItemClick().b(i10);
    }

    @Override
    public void p(KeyEvent keyEvent) {
        d60 d60Var;
        d50 d50Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (d50Var = (d60Var = this.f35738b).f32959f3) != null && d50Var.isShowing()) {
            d60Var.f32959f3.dismiss();
        }
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        d60.B(this.f35738b, iArr, fArr);
    }
}
