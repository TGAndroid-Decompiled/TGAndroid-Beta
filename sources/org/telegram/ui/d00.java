package org.telegram.ui;
public final class d00 implements Runnable {
    public final int f35953a;
    public final b10 f35954b;

    public d00(b10 b10Var, int i10) {
        this.f35953a = i10;
        this.f35954b = b10Var;
    }

    @Override
    public final void run() {
        switch (this.f35953a) {
            case 0:
                b10.V(this.f35954b);
                return;
            default:
                b10.W(this.f35954b);
                return;
        }
    }
}
