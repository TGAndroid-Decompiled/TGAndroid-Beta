package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.voip.NativeInstance;
public final class q20 implements org.telegram.ui.ActionBar.r0, org.telegram.ui.Components.hm0, r0.n, NativeInstance.AudioLevelsCallback, org.telegram.ui.ActionBar.l1 {
    public final int f41010a;
    public final g60 f41011b;

    public q20(g60 g60Var, int i10) {
        this.f41010a = i10;
        this.f41011b = g60Var;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        return g60.C(this.f41011b, k1Var);
    }

    @Override
    public boolean d(int i10, View view) {
        switch (this.f41010a) {
            case 1:
                g60 g60Var = this.f41011b;
                if (g60Var.G1(view)) {
                    try {
                        g60Var.Q.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                }
                return false;
            default:
                g60 g60Var2 = this.f41011b;
                if (!g60Var2.s1()) {
                    if (view instanceof org.telegram.ui.Components.voip.l) {
                        return g60Var2.G1(view);
                    }
                    if (view instanceof org.telegram.ui.Cells.e4) {
                        g60Var2.J1();
                        org.telegram.ui.Components.gk0 gk0Var = ((org.telegram.ui.Cells.e4) view).f22035f;
                        if (gk0Var.isEnabled()) {
                            gk0Var.callOnClick();
                            return true;
                        }
                    }
                }
                return false;
        }
    }

    @Override
    public void m(int i10) {
        this.f41011b.O.getActionBarMenuOnItemClick().b(i10);
    }

    @Override
    public void o(KeyEvent keyEvent) {
        g60 g60Var;
        g50 g50Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g50Var = (g60Var = this.f41011b).f37858f3) != null && g50Var.isShowing()) {
            g60Var.f37858f3.dismiss();
        }
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        g60.E(this.f41011b, iArr, fArr);
    }
}
