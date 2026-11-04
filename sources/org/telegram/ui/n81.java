package org.telegram.ui;
public final class n81 implements Runnable {
    public final int f47917a;
    public final m91 f47918b;

    public n81(m91 m91Var, int i3) {
        this.f47917a = i3;
        this.f47918b = m91Var;
    }

    @Override
    public final void run() {
        switch (this.f47917a) {
            case 0:
                m91 m91Var = this.f47918b;
                m91Var.B0();
                m91Var.F0();
                return;
            case 1:
                this.f47918b.B0();
                return;
            case 2:
                this.f47918b.S0(true);
                return;
            case 3:
                this.f47918b.finishPreviewFragment();
                return;
            case 4:
                m91 m91Var2 = this.f47918b;
                m91Var2.B0 = null;
                m91Var2.Z0(true, false);
                return;
            default:
                m91 m91Var3 = this.f47918b;
                m91Var3.O.postOnAnimation(new n81(m91Var3, 1));
                return;
        }
    }
}
