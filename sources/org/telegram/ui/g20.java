package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.voip.NativeInstance;
public final class g20 implements org.telegram.ui.ActionBar.r0, org.telegram.ui.Components.cm0, r0.n, NativeInstance.AudioLevelsCallback, org.telegram.ui.ActionBar.m1 {
    public final int f39480a;
    public final x50 f39481b;

    public g20(x50 x50Var, int i10) {
        this.f39480a = i10;
        this.f39481b = x50Var;
    }

    @Override
    public r0.k1 P0(View view, r0.k1 k1Var) {
        return x50.A(this.f39481b, k1Var);
    }

    @Override
    public boolean c(int i10, View view) {
        switch (this.f39480a) {
            case 1:
                x50 x50Var = this.f39481b;
                if (x50Var.G1(view)) {
                    try {
                        x50Var.Q.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                }
                return false;
            default:
                x50 x50Var2 = this.f39481b;
                if (!x50Var2.r1()) {
                    if (view instanceof org.telegram.ui.Components.voip.l) {
                        return x50Var2.G1(view);
                    }
                    if (view instanceof org.telegram.ui.Cells.i4) {
                        x50Var2.J1();
                        org.telegram.ui.Components.bk0 bk0Var = ((org.telegram.ui.Cells.i4) view).f24231f;
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
    public void g(int i10) {
        this.f39481b.O.getActionBarMenuOnItemClick().b(i10);
    }

    @Override
    public void n(KeyEvent keyEvent) {
        x50 x50Var;
        x40 x40Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (x40Var = (x50Var = this.f39481b).f45515f3) != null && x40Var.isShowing()) {
            x50Var.f45515f3.dismiss();
        }
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        x50.C(this.f39481b, iArr, fArr);
    }
}
