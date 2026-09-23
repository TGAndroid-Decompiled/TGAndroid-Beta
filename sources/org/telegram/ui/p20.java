package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.voip.NativeInstance;
public final class p20 implements org.telegram.ui.ActionBar.r0, org.telegram.ui.Components.cl0, r0.n, NativeInstance.AudioLevelsCallback, org.telegram.ui.ActionBar.l1 {
    public final int f36010a;
    public final f60 f36011b;

    public p20(f60 f60Var, int i10) {
        this.f36010a = i10;
        this.f36011b = f60Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        return f60.z(this.f36011b, l1Var);
    }

    @Override
    public boolean d(int i10, View view) {
        switch (this.f36010a) {
            case 1:
                f60 f60Var = this.f36011b;
                if (f60Var.F1(view)) {
                    try {
                        f60Var.Q.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                }
                return false;
            default:
                f60 f60Var2 = this.f36011b;
                if (!f60Var2.r1()) {
                    if (view instanceof org.telegram.ui.Components.voip.l) {
                        return f60Var2.F1(view);
                    }
                    if (view instanceof org.telegram.ui.Cells.e4) {
                        f60Var2.I1();
                        org.telegram.ui.Components.bj0 bj0Var = ((org.telegram.ui.Cells.e4) view).f19951f;
                        if (bj0Var.isEnabled()) {
                            bj0Var.callOnClick();
                            return true;
                        }
                    }
                }
                return false;
        }
    }

    @Override
    public void m(int i10) {
        this.f36011b.O.getActionBarMenuOnItemClick().b(i10);
    }

    @Override
    public void o(KeyEvent keyEvent) {
        f60 f60Var;
        f50 f50Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (f50Var = (f60Var = this.f36011b).f33123f3) != null && f50Var.isShowing()) {
            f60Var.f33123f3.dismiss();
        }
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        f60.B(this.f36011b, iArr, fArr);
    }
}
