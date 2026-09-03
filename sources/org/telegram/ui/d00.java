package org.telegram.ui;
public final class d00 implements Runnable {
    public final int f35919a;
    public final b10 f35920b;

    public d00(b10 b10Var, int i10) {
        this.f35919a = i10;
        this.f35920b = b10Var;
    }

    @Override
    public final void run() {
        switch (this.f35919a) {
            case 0:
                b10.V(this.f35920b);
                return;
            default:
                b10.W(this.f35920b);
                return;
        }
    }
}
