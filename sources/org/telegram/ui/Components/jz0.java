package org.telegram.ui.Components;
public final class jz0 implements Runnable {
    public final int f36568a;
    public final lz0 f36569b;
    public final kz0 f36570c;

    public jz0(lz0 lz0Var, kz0 kz0Var, int i7) {
        this.f36568a = i7;
        this.f36569b = lz0Var;
        this.f36570c = kz0Var;
    }

    @Override
    public final void run() {
        switch (this.f36568a) {
            case 0:
                this.f36569b.a(this.f36570c);
                return;
            case 1:
                this.f36569b.a(this.f36570c);
                return;
            default:
                this.f36569b.a(this.f36570c);
                return;
        }
    }
}
