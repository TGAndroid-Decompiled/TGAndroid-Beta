package org.telegram.ui.Components;
public final class gh0 implements Runnable {
    public final int f24388a;
    public final jh0 f24389b;

    public gh0(jh0 jh0Var, int i10) {
        this.f24388a = i10;
        this.f24389b = jh0Var;
    }

    @Override
    public final void run() {
        switch (this.f24388a) {
            case 0:
                this.f24389b.a(true);
                return;
            default:
                this.f24389b.d();
                return;
        }
    }
}
