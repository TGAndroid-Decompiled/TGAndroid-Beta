package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.voip.NativeInstance;
public final class c20 implements org.telegram.ui.ActionBar.q0, org.telegram.ui.Components.cm0, r0.n, NativeInstance.AudioLevelsCallback, org.telegram.ui.ActionBar.k1 {
    public final int f36223a;
    public final u50 f36224b;

    public c20(u50 u50Var, int i10) {
        this.f36223a = i10;
        this.f36224b = u50Var;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        return u50.A(this.f36224b, k1Var);
    }

    @Override
    public boolean d(int i10, View view) {
        switch (this.f36223a) {
            case 1:
                u50 u50Var = this.f36224b;
                if (u50Var.G1(view)) {
                    try {
                        u50Var.Q.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                }
                return false;
            default:
                u50 u50Var2 = this.f36224b;
                if (!u50Var2.r1()) {
                    if (view instanceof org.telegram.ui.Components.voip.l) {
                        return u50Var2.G1(view);
                    }
                    if (view instanceof org.telegram.ui.Cells.d4) {
                        u50Var2.J1();
                        org.telegram.ui.Components.bk0 bk0Var = ((org.telegram.ui.Cells.d4) view).f22266f;
                        if (bk0Var.isEnabled()) {
                            bk0Var.callOnClick();
                            return true;
                        }
                    }
                }
                return false;
        }
    }

    @Override
    public void h(int i10) {
        this.f36224b.O.getActionBarMenuOnItemClick().b(i10);
    }

    @Override
    public void j(KeyEvent keyEvent) {
        u50 u50Var;
        t40 t40Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (t40Var = (u50Var = this.f36224b).f42195f3) != null && t40Var.isShowing()) {
            u50Var.f42195f3.dismiss();
        }
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        u50.C(this.f36224b, iArr, fArr);
    }
}
