package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class y70 implements org.telegram.ui.ActionBar.k1 {
    public final int f32825a;
    public final j80 f32826b;

    public y70(j80 j80Var, int i10) {
        this.f32825a = i10;
        this.f32826b = j80Var;
    }

    @Override
    public final void j(KeyEvent keyEvent) {
        j80 j80Var;
        e80 e80Var;
        j80 j80Var2;
        e80 e80Var2;
        switch (this.f32825a) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (e80Var = (j80Var = this.f32826b).f27570m) != null && e80Var.isShowing()) {
                    j80Var.u();
                    return;
                }
                return;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (e80Var2 = (j80Var2 = this.f32826b).f27570m) != null && e80Var2.isShowing()) {
                    j80Var2.u();
                    return;
                }
                return;
        }
    }
}
