package org.telegram.ui;
public final class if1 implements Runnable {
    public final int f36797a;
    public final kg1 f36798b;

    public if1(kg1 kg1Var, int i10) {
        this.f36797a = i10;
        this.f36798b = kg1Var;
    }

    @Override
    public final void run() {
        switch (this.f36797a) {
            case 0:
                kg1 kg1Var = this.f36798b;
                kg1Var.x0();
                kg1Var.B0();
                return;
            case 1:
                this.f36798b.x0();
                return;
            case 2:
                this.f36798b.O0(true);
                return;
            case 3:
                this.f36798b.finishPreviewFragment();
                return;
            case 4:
                kg1 kg1Var2 = this.f36798b;
                kg1Var2.A0 = null;
                kg1Var2.U0(true, false);
                return;
            default:
                kg1 kg1Var3 = this.f36798b;
                kg1Var3.N.postOnAnimation(new if1(kg1Var3, 1));
                return;
        }
    }
}
