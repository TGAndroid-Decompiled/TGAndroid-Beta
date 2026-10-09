package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.voip.NativeInstance;
public final class q20 implements org.telegram.ui.ActionBar.r0, org.telegram.ui.Components.gm0, r0.n, NativeInstance.AudioLevelsCallback, org.telegram.ui.ActionBar.l1 {
    public final int f40964a;
    public final g60 f40965b;

    public q20(g60 g60Var, int i10) {
        this.f40964a = i10;
        this.f40965b = g60Var;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        return g60.C(this.f40965b, k1Var);
    }

    @Override
    public boolean d(int i10, View view) {
        switch (this.f40964a) {
            case 1:
                g60 g60Var = this.f40965b;
                if (g60Var.G1(view)) {
                    try {
                        g60Var.Q.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                }
                return false;
            default:
                g60 g60Var2 = this.f40965b;
                if (!g60Var2.s1()) {
                    if (view instanceof org.telegram.ui.Components.voip.l) {
                        return g60Var2.G1(view);
                    }
                    if (view instanceof org.telegram.ui.Cells.e4) {
                        g60Var2.J1();
                        org.telegram.ui.Components.fk0 fk0Var = ((org.telegram.ui.Cells.e4) view).f22031f;
                        if (fk0Var.isEnabled()) {
                            fk0Var.callOnClick();
                            return true;
                        }
                    }
                }
                return false;
        }
    }

    @Override
    public void m(int i10) {
        this.f40965b.O.getActionBarMenuOnItemClick().b(i10);
    }

    @Override
    public void o(KeyEvent keyEvent) {
        g60 g60Var;
        g50 g50Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g50Var = (g60Var = this.f40965b).f37812f3) != null && g50Var.isShowing()) {
            g60Var.f37812f3.dismiss();
        }
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        g60.E(this.f40965b, iArr, fArr);
    }
}
