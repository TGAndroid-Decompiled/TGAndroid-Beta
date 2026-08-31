package org.telegram.ui.Components;
public final class dh0 implements Runnable {
    public final int f26273a;
    public final gh0 f26274b;

    public dh0(gh0 gh0Var, int i10) {
        this.f26273a = i10;
        this.f26274b = gh0Var;
    }

    @Override
    public final void run() {
        switch (this.f26273a) {
            case 0:
                this.f26274b.a(true);
                return;
            default:
                this.f26274b.d();
                return;
        }
    }
}
