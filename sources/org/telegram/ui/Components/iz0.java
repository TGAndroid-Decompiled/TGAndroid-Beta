package org.telegram.ui.Components;
public final class iz0 implements Runnable {
    public final int f36270a;
    public final kz0 f36271b;
    public final jz0 f36272c;

    public iz0(kz0 kz0Var, jz0 jz0Var, int i7) {
        this.f36270a = i7;
        this.f36271b = kz0Var;
        this.f36272c = jz0Var;
    }

    @Override
    public final void run() {
        switch (this.f36270a) {
            case 0:
                this.f36271b.a(this.f36272c);
                return;
            case 1:
                this.f36271b.a(this.f36272c);
                return;
            default:
                this.f36271b.a(this.f36272c);
                return;
        }
    }
}
