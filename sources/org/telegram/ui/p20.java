package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.voip.NativeInstance;
public final class p20 implements org.telegram.ui.ActionBar.q0, org.telegram.ui.Components.im0, r0.n, NativeInstance.AudioLevelsCallback, org.telegram.ui.ActionBar.k1 {
    public final int f40696a;
    public final g60 f40697b;

    public p20(g60 g60Var, int i10) {
        this.f40696a = i10;
        this.f40697b = g60Var;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        return g60.C(this.f40697b, k1Var);
    }

    @Override
    public boolean d(int i10, View view) {
        switch (this.f40696a) {
            case 1:
                g60 g60Var = this.f40697b;
                if (g60Var.G1(view)) {
                    try {
                        g60Var.Q.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                }
                return false;
            default:
                g60 g60Var2 = this.f40697b;
                if (!g60Var2.s1()) {
                    if (view instanceof org.telegram.ui.Components.voip.m) {
                        return g60Var2.G1(view);
                    }
                    if (view instanceof org.telegram.ui.Cells.e4) {
                        g60Var2.J1();
                        org.telegram.ui.Components.hk0 hk0Var = ((org.telegram.ui.Cells.e4) view).f22023f;
                        if (hk0Var.isEnabled()) {
                            hk0Var.callOnClick();
                            return true;
                        }
                    }
                }
                return false;
        }
    }

    @Override
    public void m(int i10) {
        this.f40697b.O.getActionBarMenuOnItemClick().b(i10);
    }

    @Override
    public void o(KeyEvent keyEvent) {
        g60 g60Var;
        g50 g50Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g50Var = (g60Var = this.f40697b).f37894f3) != null && g50Var.isShowing()) {
            g60Var.f37894f3.dismiss();
        }
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        g60.E(this.f40697b, iArr, fArr);
    }
}
