package org.telegram.ui.ActionBar;

import org.telegram.messenger.cd;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.wb;
import org.telegram.ui.LaunchActivity;
public final class n1 implements Runnable {
    public final int f20608a;
    public final x1 f20609b;

    public n1(x1 x1Var, int i10) {
        this.f20608a = i10;
        this.f20609b = x1Var;
    }

    @Override
    public final void run() {
        int i10 = this.f20608a;
        x1 x1Var = this.f20609b;
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
                    wb Q = cc.a0(T).Q(2131624011, 36, cd.L0(2131748567, null));
                    Q.f32145t = true;
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
