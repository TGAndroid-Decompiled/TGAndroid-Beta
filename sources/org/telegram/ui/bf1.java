package org.telegram.ui;
public final class bf1 implements Runnable {
    public final int f32152a;
    public final dg1 f32153b;

    public bf1(dg1 dg1Var, int i10) {
        this.f32152a = i10;
        this.f32153b = dg1Var;
    }

    @Override
    public final void run() {
        switch (this.f32152a) {
            case 0:
                dg1 dg1Var = this.f32153b;
                dg1Var.x0();
                dg1Var.B0();
                return;
            case 1:
                this.f32153b.x0();
                return;
            case 2:
                this.f32153b.O0(true);
                return;
            case 3:
                this.f32153b.finishPreviewFragment();
                return;
            case 4:
                dg1 dg1Var2 = this.f32153b;
                dg1Var2.A0 = null;
                dg1Var2.U0(true, false);
                return;
            default:
                dg1 dg1Var3 = this.f32153b;
                dg1Var3.N.postOnAnimation(new bf1(dg1Var3, 1));
                return;
        }
    }
}
