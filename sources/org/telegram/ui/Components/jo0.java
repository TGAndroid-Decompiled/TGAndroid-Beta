package org.telegram.ui.Components;
public final class jo0 implements Runnable {
    public final int f27458a;
    public final op0 f27459b;

    public jo0(op0 op0Var, int i10) {
        this.f27458a = i10;
        this.f27459b = op0Var;
    }

    @Override
    public final void run() {
        switch (this.f27458a) {
            case 0:
                op0 op0Var = this.f27459b;
                op0Var.f29140s2 = true;
                h10 h10Var = op0Var.f29136q2;
                h10Var.f26588r.setText("");
                org.telegram.messenger.i0.J3(h10Var.f26588r);
                return;
            default:
                org.telegram.messenger.rz rzVar = new org.telegram.messenger.rz(24);
                op0 op0Var2 = this.f27459b;
                if (op0Var2.d) {
                    h10 h10Var2 = op0Var2.f29136q2;
                    if (h10Var2 != null) {
                        org.telegram.messenger.i0.v1(h10Var2.f26588r);
                    }
                    org.telegram.messenger.i0.h3(rzVar, 300L);
                    return;
                }
                rzVar.run();
                return;
        }
    }
}
