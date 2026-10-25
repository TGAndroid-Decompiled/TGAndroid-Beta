package org.telegram.ui.Components;
public final class c21 implements Runnable {
    public final int f27037a;
    public final e21 f27038b;
    public final d21 f27039c;

    public c21(e21 e21Var, d21 d21Var, int i10) {
        this.f27037a = i10;
        this.f27038b = e21Var;
        this.f27039c = d21Var;
    }

    @Override
    public final void run() {
        switch (this.f27037a) {
            case 0:
                this.f27038b.b(this.f27039c);
                return;
            case 1:
                this.f27038b.b(this.f27039c);
                return;
            default:
                this.f27038b.b(this.f27039c);
                return;
        }
    }
}
