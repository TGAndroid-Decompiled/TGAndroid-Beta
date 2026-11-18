package org.telegram.ui.Components.voip;
public final class z2 implements Runnable {
    public final int f41381a;
    public final e3 f41382b;
    public final int f41383c;

    public z2(e3 e3Var, int i7, int i10) {
        this.f41381a = i10;
        this.f41382b = e3Var;
        this.f41383c = i7;
    }

    @Override
    public final void run() {
        switch (this.f41381a) {
            case 0:
                org.telegram.messenger.g0.g3(new z2(this.f41382b, this.f41383c, 2));
                return;
            case 1:
                org.telegram.messenger.g0.g3(new z2(this.f41382b, this.f41383c, 3));
                return;
            case 2:
                this.f41382b.c(this.f41383c);
                return;
            default:
                this.f41382b.a(this.f41383c);
                return;
        }
    }
}
