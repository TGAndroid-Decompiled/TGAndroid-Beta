package org.telegram.ui.Components;
public final class bh0 implements Runnable {
    public final int f23672a;
    public final eh0 f23673b;

    public bh0(eh0 eh0Var, int i10) {
        this.f23672a = i10;
        this.f23673b = eh0Var;
    }

    @Override
    public final void run() {
        switch (this.f23672a) {
            case 0:
                this.f23673b.a(true);
                return;
            default:
                this.f23673b.d();
                return;
        }
    }
}
