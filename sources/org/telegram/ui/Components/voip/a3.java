package org.telegram.ui.Components.voip;
public final class a3 implements Runnable {
    public final int f40500a;
    public final f3 f40501b;
    public final int f40502c;

    public a3(f3 f3Var, int i7, int i10) {
        this.f40500a = i10;
        this.f40501b = f3Var;
        this.f40502c = i7;
    }

    @Override
    public final void run() {
        switch (this.f40500a) {
            case 0:
                org.telegram.messenger.g0.h3(new a3(this.f40501b, this.f40502c, 2));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new a3(this.f40501b, this.f40502c, 3));
                return;
            case 2:
                this.f40501b.c(this.f40502c);
                return;
            default:
                this.f40501b.a(this.f40502c);
                return;
        }
    }
}
