package org.telegram.ui.Components;
public final class qd0 implements Runnable {
    public final int f37446a;
    public final ud0 f37447b;

    public qd0(ud0 ud0Var, int i3) {
        this.f37446a = i3;
        this.f37447b = ud0Var;
    }

    @Override
    public final void run() {
        switch (this.f37446a) {
            case 0:
                this.f37447b.e();
                return;
            default:
                this.f37447b.g();
                return;
        }
    }
}
