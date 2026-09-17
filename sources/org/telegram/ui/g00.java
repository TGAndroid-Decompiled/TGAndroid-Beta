package org.telegram.ui;
public final class g00 implements Runnable {
    public final int f36518a;
    public final f10 f36519b;

    public g00(f10 f10Var, int i10) {
        this.f36518a = i10;
        this.f36519b = f10Var;
    }

    @Override
    public final void run() {
        switch (this.f36518a) {
            case 0:
                f10.V(this.f36519b);
                return;
            default:
                f10.W(this.f36519b);
                return;
        }
    }
}
