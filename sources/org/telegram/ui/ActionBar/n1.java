package org.telegram.ui.ActionBar;

import org.telegram.messenger.dd;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.wb;
import org.telegram.ui.LaunchActivity;
public final class n1 implements Runnable {
    public final int f20609a;
    public final x1 f20610b;

    public n1(x1 x1Var, int i10) {
        this.f20609a = i10;
        this.f20610b = x1Var;
    }

    @Override
    public final void run() {
        int i10 = this.f20609a;
        x1 x1Var = this.f20610b;
        switch (i10) {
            case 0:
                x1Var.dismiss();
                return;
            case 1:
                if (!x1Var.isShowing()) {
                    try {
                        x1Var.show();
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 2:
                x1Var.dismiss();
                k2 T = LaunchActivity.T();
                if (T != null) {
                    wb Q = cc.a0(T).Q(2131624011, 36, dd.L0(2131748567, null));
                    Q.f32211t = true;
                    Q.j();
                    return;
                }
                return;
            default:
                x1Var.dismiss();
                return;
        }
    }
}
