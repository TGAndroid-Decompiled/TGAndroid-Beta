package org.telegram.ui.Components;
public final class zf0 implements Runnable {
    public final int f33051a;
    public final cg0 f33052b;

    public zf0(cg0 cg0Var, int i10) {
        this.f33051a = i10;
        this.f33052b = cg0Var;
    }

    @Override
    public final void run() {
        switch (this.f33051a) {
            case 0:
                this.f33052b.a(true);
                return;
            default:
                this.f33052b.d();
                return;
        }
    }
}
