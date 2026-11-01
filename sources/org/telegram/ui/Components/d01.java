package org.telegram.ui.Components;
public final class d01 implements Runnable {
    public final int f25308a;
    public final g01 f25309b;
    public final f01 f25310c;

    public d01(g01 g01Var, f01 f01Var, int i10) {
        this.f25308a = i10;
        this.f25309b = g01Var;
        this.f25310c = f01Var;
    }

    @Override
    public final void run() {
        switch (this.f25308a) {
            case 0:
                this.f25309b.a(this.f25310c);
                return;
            case 1:
                this.f25309b.a(this.f25310c);
                return;
            default:
                this.f25309b.a(this.f25310c);
                return;
        }
    }
}
