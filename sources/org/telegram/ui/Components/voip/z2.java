package org.telegram.ui.Components.voip;
public final class z2 implements Runnable {
    public final int f41479a;
    public final e3 f41480b;
    public final int f41481c;

    public z2(e3 e3Var, int i7, int i10) {
        this.f41479a = i10;
        this.f41480b = e3Var;
        this.f41481c = i7;
    }

    @Override
    public final void run() {
        switch (this.f41479a) {
            case 0:
                org.telegram.messenger.g0.g3(new z2(this.f41480b, this.f41481c, 2));
                return;
            case 1:
                org.telegram.messenger.g0.g3(new z2(this.f41480b, this.f41481c, 3));
                return;
            case 2:
                this.f41480b.c(this.f41481c);
                return;
            default:
                this.f41480b.a(this.f41481c);
                return;
        }
    }
}
