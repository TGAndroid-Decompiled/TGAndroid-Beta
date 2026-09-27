package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.voip.NativeInstance;
public final class q20 implements org.telegram.ui.ActionBar.s0, org.telegram.ui.Components.ol0, r0.n, NativeInstance.AudioLevelsCallback, org.telegram.ui.ActionBar.m1 {
    public final int f36603a;
    public final g60 f36604b;

    public q20(g60 g60Var, int i10) {
        this.f36603a = i10;
        this.f36604b = g60Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        return g60.z(this.f36604b, l1Var);
    }

    @Override
    public boolean d(int i10, View view) {
        switch (this.f36603a) {
            case 1:
                g60 g60Var = this.f36604b;
                if (g60Var.F1(view)) {
                    try {
                        g60Var.Q.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                }
                return false;
            default:
                g60 g60Var2 = this.f36604b;
                if (!g60Var2.r1()) {
                    if (view instanceof org.telegram.ui.Components.voip.l) {
                        return g60Var2.F1(view);
                    }
                    if (view instanceof org.telegram.ui.Cells.e4) {
                        g60Var2.I1();
                        org.telegram.ui.Components.nj0 nj0Var = ((org.telegram.ui.Cells.e4) view).f20235f;
                        if (nj0Var.isEnabled()) {
                            nj0Var.callOnClick();
                            return true;
                        }
                    }
                }
                return false;
        }
    }

    @Override
    public void m(int i10) {
        this.f36604b.O.getActionBarMenuOnItemClick().b(i10);
    }

    @Override
    public void p(KeyEvent keyEvent) {
        g60 g60Var;
        g50 g50Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g50Var = (g60Var = this.f36604b).f33750f3) != null && g50Var.isShowing()) {
            g60Var.f33750f3.dismiss();
        }
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        g60.B(this.f36604b, iArr, fArr);
    }
}
