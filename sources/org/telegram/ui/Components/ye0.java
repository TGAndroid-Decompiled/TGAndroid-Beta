package org.telegram.ui.Components;
public final class ye0 implements Runnable {
    public final int f40691a;
    public final bf0 f40692b;

    public ye0(bf0 bf0Var, int i3) {
        this.f40691a = i3;
        this.f40692b = bf0Var;
    }

    @Override
    public final void run() {
        switch (this.f40691a) {
            case 0:
                this.f40692b.a(true);
                return;
            default:
                this.f40692b.d();
                return;
        }
    }
}
