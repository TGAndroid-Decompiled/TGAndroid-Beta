package org.telegram.ui.Components.voip;
public final class a3 implements Runnable {
    public final int f40776a;
    public final f3 f40777b;
    public final int f40778c;

    public a3(f3 f3Var, int i7, int i10) {
        this.f40776a = i10;
        this.f40777b = f3Var;
        this.f40778c = i7;
    }

    @Override
    public final void run() {
        switch (this.f40776a) {
            case 0:
                org.telegram.messenger.g0.g3(new a3(this.f40777b, this.f40778c, 2));
                return;
            case 1:
                org.telegram.messenger.g0.g3(new a3(this.f40777b, this.f40778c, 3));
                return;
            case 2:
                this.f40777b.c(this.f40778c);
                return;
            default:
                this.f40777b.a(this.f40778c);
                return;
        }
    }
}
