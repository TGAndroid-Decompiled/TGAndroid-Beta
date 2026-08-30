package org.telegram.ui;
public final class he1 implements Runnable {
    public final int f34845a;
    public final kf1 f34846b;

    public he1(kf1 kf1Var, int i10) {
        this.f34845a = i10;
        this.f34846b = kf1Var;
    }

    @Override
    public final void run() {
        switch (this.f34845a) {
            case 0:
                kf1 kf1Var = this.f34846b;
                kf1Var.x0();
                kf1Var.B0();
                return;
            case 1:
                this.f34846b.x0();
                return;
            case 2:
                this.f34846b.O0(true);
                return;
            case 3:
                this.f34846b.finishPreviewFragment();
                return;
            case 4:
                kf1 kf1Var2 = this.f34846b;
                kf1Var2.f35709x0 = null;
                kf1Var2.U0(true, false);
                return;
            default:
                kf1 kf1Var3 = this.f34846b;
                kf1Var3.K.postOnAnimation(new he1(kf1Var3, 1));
                return;
        }
    }
}
