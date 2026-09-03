package org.telegram.ui.Components;
public final class dh0 implements Runnable {
    public final int f26276a;
    public final gh0 f26277b;

    public dh0(gh0 gh0Var, int i10) {
        this.f26276a = i10;
        this.f26277b = gh0Var;
    }

    @Override
    public final void run() {
        switch (this.f26276a) {
            case 0:
                this.f26277b.a(true);
                return;
            default:
                this.f26277b.d();
                return;
        }
    }
}
