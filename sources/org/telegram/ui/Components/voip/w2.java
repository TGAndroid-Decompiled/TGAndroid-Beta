package org.telegram.ui.Components.voip;
public final class w2 implements Runnable {
    public final int f39562a;
    public final b3 f39563b;
    public final int f39564c;

    public w2(b3 b3Var, int i7, int i10) {
        this.f39562a = i10;
        this.f39563b = b3Var;
        this.f39564c = i7;
    }

    @Override
    public final void run() {
        switch (this.f39562a) {
            case 0:
                org.telegram.messenger.g0.h3(new w2(this.f39563b, this.f39564c, 2));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new w2(this.f39563b, this.f39564c, 3));
                return;
            case 2:
                this.f39563b.c(this.f39564c);
                return;
            default:
                this.f39563b.a(this.f39564c);
                return;
        }
    }
}
