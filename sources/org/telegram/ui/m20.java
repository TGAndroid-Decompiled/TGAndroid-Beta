package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.voip.NativeInstance;
public final class m20 implements org.telegram.ui.ActionBar.s0, org.telegram.ui.Components.kl0, r0.o, NativeInstance.AudioLevelsCallback, org.telegram.ui.ActionBar.n1 {
    public final int f36167a;
    public final c60 f36168b;

    public m20(c60 c60Var, int i10) {
        this.f36167a = i10;
        this.f36168b = c60Var;
    }

    @Override
    public r0.m1 N0(View view, r0.m1 m1Var) {
        return c60.A(this.f36168b, m1Var);
    }

    @Override
    public boolean f(int i10, View view) {
        switch (this.f36167a) {
            case 1:
                c60 c60Var = this.f36168b;
                if (c60Var.F1(view)) {
                    try {
                        c60Var.N.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                }
                return false;
            default:
                c60 c60Var2 = this.f36168b;
                if (!c60Var2.r1()) {
                    if (view instanceof org.telegram.ui.Components.voip.l) {
                        return c60Var2.F1(view);
                    }
                    if (view instanceof org.telegram.ui.Cells.e4) {
                        c60Var2.I1();
                        org.telegram.ui.Components.jj0 jj0Var = ((org.telegram.ui.Cells.e4) view).f21006f;
                        if (jj0Var.isEnabled()) {
                            jj0Var.callOnClick();
                            return true;
                        }
                    }
                }
                return false;
        }
    }

    @Override
    public void l(int i10) {
        this.f36168b.L.getActionBarMenuOnItemClick().b(i10);
    }

    @Override
    public void n(KeyEvent keyEvent) {
        c60 c60Var;
        d50 d50Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (d50Var = (c60Var = this.f36168b).c3) != null && d50Var.isShowing()) {
            c60Var.c3.dismiss();
        }
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        c60.C(this.f36168b, iArr, fArr);
    }
}
