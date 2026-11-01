package org.telegram.ui;
public final class pl0 implements Runnable {
    public final int f40498a;
    public final qm0 f40499b;

    public pl0(qm0 qm0Var, int i10) {
        this.f40498a = i10;
        this.f40499b = qm0Var;
    }

    @Override
    public final void run() {
        switch (this.f40498a) {
            case 0:
                this.f40499b.z0();
                return;
            case 1:
                qm0 qm0Var = this.f40499b;
                qm0Var.getMessagesController().f19189m7 = null;
                if (qm0Var.f40827f1 == 3 && !qm0Var.isFinishing()) {
                    qm0Var.f40827f1 = 4;
                    pm0 pm0Var = qm0Var.Z0;
                    if (pm0Var != null) {
                        pm0Var.e(4);
                    }
                    qm0Var.finishFragment();
                    return;
                } else if (qm0Var.f40827f1 == 1 && !qm0Var.isFinishing()) {
                    qm0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 2:
                qm0 qm0Var2 = this.f40499b;
                if (qm0Var2.f40821d0 != null) {
                    qm0Var2.C0();
                    qm0Var2.f40821d0 = null;
                    return;
                }
                return;
            default:
                qm0 qm0Var3 = this.f40499b;
                qm0Var3.f40825f[0].requestFocus();
                org.telegram.messenger.i0.J3(qm0Var3.f40825f[0]);
                return;
        }
    }
}
