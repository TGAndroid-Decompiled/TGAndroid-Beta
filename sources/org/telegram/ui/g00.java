package org.telegram.ui;
public final class g00 implements Runnable {
    public final int f33662a;
    public final f10 f33663b;

    public g00(f10 f10Var, int i10) {
        this.f33662a = i10;
        this.f33663b = f10Var;
    }

    @Override
    public final void run() {
        switch (this.f33662a) {
            case 0:
                f10.V(this.f33663b);
                return;
            default:
                f10.W(this.f33663b);
                return;
        }
    }
}
