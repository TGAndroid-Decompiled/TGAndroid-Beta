package org.telegram.ui.Components;
public final class gh0 implements Runnable {
    public final int f24453a;
    public final jh0 f24454b;

    public gh0(jh0 jh0Var, int i10) {
        this.f24453a = i10;
        this.f24454b = jh0Var;
    }

    @Override
    public final void run() {
        switch (this.f24453a) {
            case 0:
                this.f24454b.a(true);
                return;
            default:
                this.f24454b.d();
                return;
        }
    }
}
