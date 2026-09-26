package org.telegram.ui.Components;
public final class gh0 implements Runnable {
    public final int f24458a;
    public final jh0 f24459b;

    public gh0(jh0 jh0Var, int i10) {
        this.f24458a = i10;
        this.f24459b = jh0Var;
    }

    @Override
    public final void run() {
        switch (this.f24458a) {
            case 0:
                this.f24459b.a(true);
                return;
            default:
                this.f24459b.d();
                return;
        }
    }
}
