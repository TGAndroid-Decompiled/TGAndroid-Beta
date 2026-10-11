package org.telegram.ui.Components;
public final class bi0 implements Runnable {
    public final int f24963a;
    public final ei0 f24964b;

    public bi0(ei0 ei0Var, int i10) {
        this.f24963a = i10;
        this.f24964b = ei0Var;
    }

    @Override
    public final void run() {
        switch (this.f24963a) {
            case 0:
                this.f24964b.a(true);
                return;
            default:
                this.f24964b.d();
                return;
        }
    }
}
