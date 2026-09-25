package org.telegram.ui.Components;
public final class gh0 implements Runnable {
    public final int f24459a;
    public final jh0 f24460b;

    public gh0(jh0 jh0Var, int i10) {
        this.f24459a = i10;
        this.f24460b = jh0Var;
    }

    @Override
    public final void run() {
        switch (this.f24459a) {
            case 0:
                this.f24460b.a(true);
                return;
            default:
                this.f24460b.d();
                return;
        }
    }
}
