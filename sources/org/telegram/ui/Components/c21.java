package org.telegram.ui.Components;
public final class c21 implements Runnable {
    public final int f27039a;
    public final e21 f27040b;
    public final d21 f27041c;

    public c21(e21 e21Var, d21 d21Var, int i10) {
        this.f27039a = i10;
        this.f27040b = e21Var;
        this.f27041c = d21Var;
    }

    @Override
    public final void run() {
        switch (this.f27039a) {
            case 0:
                this.f27040b.b(this.f27041c);
                return;
            case 1:
                this.f27040b.b(this.f27041c);
                return;
            default:
                this.f27040b.b(this.f27041c);
                return;
        }
    }
}
