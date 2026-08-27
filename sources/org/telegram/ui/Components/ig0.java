package org.telegram.ui.Components;

public final class ig0 implements Runnable {

    public final int f29363a;

    public final mg0 f29364b;

    public ig0(mg0 mg0Var, int i10) {
        this.f29363a = i10;
        this.f29364b = mg0Var;
    }

    @Override
    public final void run() {
        switch (this.f29363a) {
            case 0:
                this.f29364b.a(true);
                break;
            default:
                this.f29364b.d();
                break;
        }
    }
}
