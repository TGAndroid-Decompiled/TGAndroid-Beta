package org.telegram.ui.Components;
public final class u11 implements Runnable {
    public final int f31058a;
    public final w11 f31059b;
    public final v11 f31060c;

    public u11(w11 w11Var, v11 v11Var, int i10) {
        this.f31058a = i10;
        this.f31059b = w11Var;
        this.f31060c = v11Var;
    }

    @Override
    public final void run() {
        switch (this.f31058a) {
            case 0:
                this.f31059b.b(this.f31060c);
                return;
            case 1:
                this.f31059b.b(this.f31060c);
                return;
            default:
                this.f31059b.b(this.f31060c);
                return;
        }
    }
}
