package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.voip.NativeInstance;

public final class b20 implements org.telegram.ui.ActionBar.r0, org.telegram.ui.Components.rk0, r0.o, NativeInstance.AudioLevelsCallback, org.telegram.ui.ActionBar.l1 {

    public final int f36678a;

    public final s50 f36679b;

    public b20(s50 s50Var, int i10) {
        this.f36678a = i10;
        this.f36679b = s50Var;
    }

    @Override
    public r0.m1 I0(View view, r0.m1 m1Var) {
        return s50.B(this.f36679b, m1Var);
    }

    @Override
    public boolean a(int i10, View view) {
        switch (this.f36678a) {
            case 1:
                s50 s50Var = this.f36679b;
                if (s50Var.F1(view)) {
                    try {
                        s50Var.M.performHapticFeedback(0);
                        break;
                    } catch (Exception unused) {
                    }
                }
                return false;
            default:
                s50 s50Var2 = this.f36679b;
                if (!s50Var2.r1()) {
                    if (view instanceof org.telegram.ui.Components.voip.l) {
                        return s50Var2.F1(view);
                    }
                    if (view instanceof org.telegram.ui.Cells.b4) {
                        s50Var2.I1();
                        org.telegram.ui.Components.ri0 ri0Var = ((org.telegram.ui.Cells.b4) view).f24100f;
                        if (ri0Var.isEnabled()) {
                            ri0Var.callOnClick();
                            return true;
                        }
                    }
                }
                return false;
        }
    }

    @Override
    public void h(int i10) {
        this.f36679b.K.getActionBarMenuOnItemClick().b(i10);
    }

    @Override
    public void k(KeyEvent keyEvent) {
        s50 s50Var;
        s40 s40Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (s40Var = (s50Var = this.f36679b).f42416b3) != null && s40Var.isShowing()) {
            s50Var.f42416b3.dismiss();
        }
    }

    @Override
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        s50.D(this.f36679b, iArr, fArr);
    }
}
