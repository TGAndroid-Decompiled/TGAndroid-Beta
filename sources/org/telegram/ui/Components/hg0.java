package org.telegram.ui.Components;
public final class hg0 implements Runnable {
    public final int f28963a;
    public final mg0 f28964b;

    public hg0(mg0 mg0Var, int i10) {
        this.f28963a = i10;
        this.f28964b = mg0Var;
    }

    @Override
    public final void run() {
        switch (this.f28963a) {
            case 0:
                this.f28964b.e();
                return;
            default:
                this.f28964b.g();
                return;
        }
    }
}
