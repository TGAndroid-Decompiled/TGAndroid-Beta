package org.telegram.ui.Components.voip;
public final class w2 implements Runnable {
    public final int f39541a;
    public final b3 f39542b;
    public final int f39543c;

    public w2(b3 b3Var, int i7, int i10) {
        this.f39541a = i10;
        this.f39542b = b3Var;
        this.f39543c = i7;
    }

    @Override
    public final void run() {
        switch (this.f39541a) {
            case 0:
                org.telegram.messenger.g0.h3(new w2(this.f39542b, this.f39543c, 2));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new w2(this.f39542b, this.f39543c, 3));
                return;
            case 2:
                this.f39542b.c(this.f39543c);
                return;
            default:
                this.f39542b.a(this.f39543c);
                return;
        }
    }
}
