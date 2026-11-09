package org.telegram.ui.Components.voip;
public final class w2 implements Runnable {
    public final int f39686a;
    public final b3 f39687b;
    public final int f39688c;

    public w2(b3 b3Var, int i7, int i10) {
        this.f39686a = i10;
        this.f39687b = b3Var;
        this.f39688c = i7;
    }

    @Override
    public final void run() {
        switch (this.f39686a) {
            case 0:
                org.telegram.messenger.g0.h3(new w2(this.f39687b, this.f39688c, 2));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new w2(this.f39687b, this.f39688c, 3));
                return;
            case 2:
                this.f39687b.c(this.f39688c);
                return;
            default:
                this.f39687b.a(this.f39688c);
                return;
        }
    }
}
