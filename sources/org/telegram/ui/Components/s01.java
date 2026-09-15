package org.telegram.ui.Components;
public final class s01 implements Runnable {
    public final int f27734a;
    public final v01 f27735b;
    public final u01 f27736c;

    public s01(v01 v01Var, u01 u01Var, int i10) {
        this.f27734a = i10;
        this.f27735b = v01Var;
        this.f27736c = u01Var;
    }

    @Override
    public final void run() {
        switch (this.f27734a) {
            case 0:
                this.f27735b.b(this.f27736c);
                return;
            case 1:
                this.f27735b.b(this.f27736c);
                return;
            default:
                this.f27735b.b(this.f27736c);
                return;
        }
    }
}
