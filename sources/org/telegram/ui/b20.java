package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.voip.NativeInstance;
public final class b20 implements org.telegram.ui.ActionBar.q0, org.telegram.ui.Components.yl0, r0.n, NativeInstance.AudioLevelsCallback, org.telegram.ui.ActionBar.k1 {
    public final int f35573a;
    public final s50 f35574b;

    public b20(s50 s50Var, int i10) {
        this.f35573a = i10;
        this.f35574b = s50Var;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        return s50.B(this.f35574b, k1Var);
    }

    @Override
    public boolean a(int i10, View view) {
        switch (this.f35573a) {
            case 1:
                s50 s50Var = this.f35574b;
                if (s50Var.G1(view)) {
                    try {
                        s50Var.Q.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                }
                return false;
            default:
                s50 s50Var2 = this.f35574b;
                if (!s50Var2.s1()) {
                    if (view instanceof org.telegram.ui.Components.voip.l) {
                        return s50Var2.G1(view);
                    }
                    if (view instanceof org.telegram.ui.Cells.d4) {
                        s50Var2.J1();
                        org.telegram.ui.Components.xj0 xj0Var = ((org.telegram.ui.Cells.d4) view).f22132f;
                        if (xj0Var.isEnabled()) {
                            xj0Var.callOnClick();
                            return true;
                        }
                    }
                }
                return false;
        }
    }

    @Override
    public void j(int i10) {
        this.f35574b.O.getActionBarMenuOnItemClick().b(i10);
    }

    @Override
    public void n(KeyEvent keyEvent) {
        s50 s50Var;
        s40 s40Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (s40Var = (s50Var = this.f35574b).f40958f3) != null && s40Var.isShowing()) {
            s50Var.f40958f3.dismiss();
        }
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        s50.D(this.f35574b, iArr, fArr);
    }
}
