package org.telegram.ui;

import android.view.KeyEvent;
public final class im0 implements org.telegram.ui.Components.t4, org.telegram.ui.ActionBar.e1 {
    public final int f46688a;
    public final mm0 f46689b;

    public im0(mm0 mm0Var, int i7) {
        this.f46688a = i7;
        this.f46689b = mm0Var;
    }

    @Override
    public void L(int i7, int i10, boolean z9) {
        switch (this.f46688a) {
            case 0:
                mm0 mm0Var = this.f46689b;
                mm0Var.a0(mm0Var.f47836b, mm0Var.f47837c, z9, i7);
                mm0Var.finishFragment();
                return;
            default:
                mm0 mm0Var2 = this.f46689b;
                mm0Var2.a0(mm0Var2.f47836b, mm0Var2.f47837c, z9, i7);
                mm0Var2.finishFragment();
                return;
        }
    }

    @Override
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.g1 g1Var;
        mm0 mm0Var = this.f46689b;
        mm0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g1Var = mm0Var.I) != null && g1Var.isShowing()) {
            mm0Var.I.d(true);
        }
    }
}
