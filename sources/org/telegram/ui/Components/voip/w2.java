package org.telegram.ui.Components.voip;
public final class w2 implements Runnable {
    public final int f39544a;
    public final b3 f39545b;
    public final int f39546c;

    public w2(b3 b3Var, int i7, int i10) {
        this.f39544a = i10;
        this.f39545b = b3Var;
        this.f39546c = i7;
    }

    @Override
    public final void run() {
        switch (this.f39544a) {
            case 0:
                org.telegram.messenger.g0.h3(new w2(this.f39545b, this.f39546c, 2));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new w2(this.f39545b, this.f39546c, 3));
                return;
            case 2:
                this.f39545b.c(this.f39546c);
                return;
            default:
                this.f39545b.a(this.f39546c);
                return;
        }
    }
}
