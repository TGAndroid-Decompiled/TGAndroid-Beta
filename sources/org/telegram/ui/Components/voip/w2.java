package org.telegram.ui.Components.voip;
public final class w2 implements Runnable {
    public final int f39597a;
    public final b3 f39598b;
    public final int f39599c;

    public w2(b3 b3Var, int i7, int i10) {
        this.f39597a = i10;
        this.f39598b = b3Var;
        this.f39599c = i7;
    }

    @Override
    public final void run() {
        switch (this.f39597a) {
            case 0:
                org.telegram.messenger.g0.h3(new w2(this.f39598b, this.f39599c, 2));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new w2(this.f39598b, this.f39599c, 3));
                return;
            case 2:
                this.f39598b.c(this.f39599c);
                return;
            default:
                this.f39598b.a(this.f39599c);
                return;
        }
    }
}
