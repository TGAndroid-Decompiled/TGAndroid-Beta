package org.telegram.ui.Components;
public final class i11 implements Runnable {
    public final int f24975a;
    public final l11 f24976b;
    public final k11 f24977c;

    public i11(l11 l11Var, k11 k11Var, int i10) {
        this.f24975a = i10;
        this.f24976b = l11Var;
        this.f24977c = k11Var;
    }

    @Override
    public final void run() {
        switch (this.f24975a) {
            case 0:
                this.f24976b.b(this.f24977c);
                return;
            case 1:
                this.f24976b.b(this.f24977c);
                return;
            default:
                this.f24976b.b(this.f24977c);
                return;
        }
    }
}
