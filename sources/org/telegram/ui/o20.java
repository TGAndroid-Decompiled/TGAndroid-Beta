package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.voip.NativeInstance;
public final class o20 implements org.telegram.ui.ActionBar.s0, org.telegram.ui.Components.jl0, r0.o, NativeInstance.AudioLevelsCallback, org.telegram.ui.ActionBar.n1 {
    public final int f36628a;
    public final e60 f36629b;

    public o20(e60 e60Var, int i10) {
        this.f36628a = i10;
        this.f36629b = e60Var;
    }

    @Override
    public r0.m1 M0(View view, r0.m1 m1Var) {
        return e60.A(this.f36629b, m1Var);
    }

    @Override
    public boolean d(int i10, View view) {
        switch (this.f36628a) {
            case 1:
                e60 e60Var = this.f36629b;
                if (e60Var.F1(view)) {
                    try {
                        e60Var.N.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                }
                return false;
            default:
                e60 e60Var2 = this.f36629b;
                if (!e60Var2.r1()) {
                    if (view instanceof org.telegram.ui.Components.voip.l) {
                        return e60Var2.F1(view);
                    }
                    if (view instanceof org.telegram.ui.Cells.d4) {
                        e60Var2.I1();
                        org.telegram.ui.Components.jj0 jj0Var = ((org.telegram.ui.Cells.d4) view).f20923f;
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
    public void m(int i10) {
        this.f36629b.L.getActionBarMenuOnItemClick().b(i10);
    }

    @Override
    public void n(KeyEvent keyEvent) {
        e60 e60Var;
        f50 f50Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (f50Var = (e60Var = this.f36629b).c3) != null && f50Var.isShowing()) {
            e60Var.c3.dismiss();
        }
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        e60.C(this.f36629b, iArr, fArr);
    }
}
