package org.telegram.ui.Components;

import android.view.KeyEvent;
public final class b80 implements org.telegram.ui.ActionBar.k1 {
    public final int f23715a;
    public final m80 f23716b;

    public b80(m80 m80Var, int i10) {
        this.f23715a = i10;
        this.f23716b = m80Var;
    }

    @Override
    public final void n(KeyEvent keyEvent) {
        m80 m80Var;
        h80 h80Var;
        m80 m80Var2;
        h80 h80Var2;
        switch (this.f23715a) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (h80Var = (m80Var = this.f23716b).f27288m) != null && h80Var.isShowing()) {
                    m80Var.u();
                    return;
                }
                return;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (h80Var2 = (m80Var2 = this.f23716b).f27288m) != null && h80Var2.isShowing()) {
                    m80Var2.u();
                    return;
                }
                return;
        }
    }
}
