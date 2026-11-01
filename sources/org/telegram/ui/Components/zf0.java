package org.telegram.ui.Components;
public final class zf0 implements Runnable {
    public final int f33147a;
    public final cg0 f33148b;

    public zf0(cg0 cg0Var, int i10) {
        this.f33147a = i10;
        this.f33148b = cg0Var;
    }

    @Override
    public final void run() {
        switch (this.f33147a) {
            case 0:
                this.f33148b.a(true);
                return;
            default:
                this.f33148b.d();
                return;
        }
    }
}
