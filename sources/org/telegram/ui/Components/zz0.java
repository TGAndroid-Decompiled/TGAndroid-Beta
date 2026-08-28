package org.telegram.ui.Components;
public final class zz0 implements Runnable {
    public final int f35408a;
    public final b01 f35409b;
    public final a01 f35410c;

    public zz0(b01 b01Var, a01 a01Var, int i9) {
        this.f35408a = i9;
        this.f35409b = b01Var;
        this.f35410c = a01Var;
    }

    @Override
    public final void run() {
        switch (this.f35408a) {
            case 0:
                this.f35409b.b(this.f35410c);
                return;
            case 1:
                this.f35409b.b(this.f35410c);
                return;
            default:
                this.f35409b.b(this.f35410c);
                return;
        }
    }
}
