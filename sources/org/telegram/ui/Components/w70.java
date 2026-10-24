package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class w70 implements org.telegram.ui.ActionBar.k1 {
    public final int f32140a;
    public final h80 f32141b;

    public w70(h80 h80Var, int i10) {
        this.f32140a = i10;
        this.f32141b = h80Var;
    }

    @Override
    public final void j(KeyEvent keyEvent) {
        h80 h80Var;
        c80 c80Var;
        h80 h80Var2;
        c80 c80Var2;
        switch (this.f32140a) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (c80Var = (h80Var = this.f32141b).f26919m) != null && c80Var.isShowing()) {
                    h80Var.u();
                    return;
                }
                return;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (c80Var2 = (h80Var2 = this.f32141b).f26919m) != null && c80Var2.isShowing()) {
                    h80Var2.u();
                    return;
                }
                return;
        }
    }
}
