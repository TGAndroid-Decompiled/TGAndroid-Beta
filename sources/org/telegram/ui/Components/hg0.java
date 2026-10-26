package org.telegram.ui.Components;
public final class hg0 implements Runnable {
    public final int f28965a;
    public final mg0 f28966b;

    public hg0(mg0 mg0Var, int i10) {
        this.f28965a = i10;
        this.f28966b = mg0Var;
    }

    @Override
    public final void run() {
        switch (this.f28965a) {
            case 0:
                this.f28966b.e();
                return;
            default:
                this.f28966b.g();
                return;
        }
    }
}
