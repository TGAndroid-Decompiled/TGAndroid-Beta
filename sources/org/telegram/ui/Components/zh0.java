package org.telegram.ui.Components;
public final class zh0 implements Runnable {
    public final int f33581a;
    public final di0 f33582b;

    public zh0(di0 di0Var, int i10) {
        this.f33581a = i10;
        this.f33582b = di0Var;
    }

    @Override
    public final void run() {
        switch (this.f33581a) {
            case 0:
                this.f33582b.a(true);
                return;
            default:
                this.f33582b.d();
                return;
        }
    }
}
