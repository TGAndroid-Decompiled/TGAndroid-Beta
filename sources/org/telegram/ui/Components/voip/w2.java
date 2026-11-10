package org.telegram.ui.Components.voip;
public final class w2 implements Runnable {
    public final int f39607a;
    public final b3 f39608b;
    public final int f39609c;

    public w2(b3 b3Var, int i7, int i10) {
        this.f39607a = i10;
        this.f39608b = b3Var;
        this.f39609c = i7;
    }

    @Override
    public final void run() {
        switch (this.f39607a) {
            case 0:
                org.telegram.messenger.g0.h3(new w2(this.f39608b, this.f39609c, 2));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new w2(this.f39608b, this.f39609c, 3));
                return;
            case 2:
                this.f39608b.c(this.f39609c);
                return;
            default:
                this.f39608b.a(this.f39609c);
                return;
        }
    }
}
