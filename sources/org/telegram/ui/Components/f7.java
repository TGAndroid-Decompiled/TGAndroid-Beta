package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class f7 implements Runnable {
    public final int f35102a;
    public final f8 f35103b;
    public final a70 f35104c;

    public f7(f8 f8Var, a70 a70Var, int i7) {
        this.f35102a = i7;
        this.f35103b = f8Var;
        this.f35104c = a70Var;
    }

    @Override
    public final void run() {
        int i7 = this.f35102a;
        a70 a70Var = this.f35104c;
        f8 f8Var = this.f35103b;
        switch (i7) {
            case 0:
                f8Var.getClass();
                a70Var.v();
                f8Var.Q0(1);
                return;
            case 1:
                f8Var.getClass();
                a70Var.v();
                f8Var.Q0(2);
                return;
            case 2:
                f8Var.getClass();
                a70Var.v();
                f8Var.Q0(4);
                return;
            case 3:
                f8Var.getClass();
                a70Var.v();
                f8Var.Q0(7);
                return;
            default:
                f8Var.V0(true);
                org.telegram.messenger.f3.n(null, 2131753909, new lc((FrameLayout) f8Var.f30173b, f8Var.J0), 2131624191, 36);
                a70Var.v();
                return;
        }
    }
}
