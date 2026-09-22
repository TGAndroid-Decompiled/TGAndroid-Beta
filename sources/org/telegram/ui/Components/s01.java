package org.telegram.ui.Components;
public final class s01 implements Runnable {
    public final int f27731a;
    public final v01 f27732b;
    public final u01 f27733c;

    public s01(v01 v01Var, u01 u01Var, int i10) {
        this.f27731a = i10;
        this.f27732b = v01Var;
        this.f27733c = u01Var;
    }

    @Override
    public final void run() {
        switch (this.f27731a) {
            case 0:
                this.f27732b.b(this.f27733c);
                return;
            case 1:
                this.f27732b.b(this.f27733c);
                return;
            default:
                this.f27732b.b(this.f27733c);
                return;
        }
    }
}
