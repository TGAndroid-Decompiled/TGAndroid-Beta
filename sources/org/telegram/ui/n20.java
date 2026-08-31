package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.voip.NativeInstance;
public final class n20 implements org.telegram.ui.ActionBar.s0, org.telegram.ui.Components.ll0, r0.o, NativeInstance.AudioLevelsCallback, org.telegram.ui.ActionBar.n1 {
    public final int f39267a;
    public final d60 f39268b;

    public n20(d60 d60Var, int i10) {
        this.f39267a = i10;
        this.f39268b = d60Var;
    }

    @Override
    public r0.m1 M0(View view, r0.m1 m1Var) {
        return d60.A(this.f39268b, m1Var);
    }

    @Override
    public boolean f(int i10, View view) {
        switch (this.f39267a) {
            case 1:
                d60 d60Var = this.f39268b;
                if (d60Var.F1(view)) {
                    try {
                        d60Var.N.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                }
                return false;
            default:
                d60 d60Var2 = this.f39268b;
                if (!d60Var2.r1()) {
                    if (view instanceof org.telegram.ui.Components.voip.l) {
                        return d60Var2.F1(view);
                    }
                    if (view instanceof org.telegram.ui.Cells.e4) {
                        d60Var2.I1();
                        org.telegram.ui.Components.lj0 lj0Var = ((org.telegram.ui.Cells.e4) view).f22746f;
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
    public void h(int i10) {
        this.f39268b.L.getActionBarMenuOnItemClick().b(i10);
    }

    @Override
    public void n(KeyEvent keyEvent) {
        d60 d60Var;
        e50 e50Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (e50Var = (d60Var = this.f39268b).c3) != null && e50Var.isShowing()) {
            d60Var.c3.dismiss();
        }
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        d60.C(this.f39268b, iArr, fArr);
    }
}
