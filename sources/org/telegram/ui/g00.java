package org.telegram.ui;
public final class g00 implements Runnable {
    public final int f36454a;
    public final f10 f36455b;

    public g00(f10 f10Var, int i10) {
        this.f36454a = i10;
        this.f36455b = f10Var;
    }

    @Override
    public final void run() {
        switch (this.f36454a) {
            case 0:
                f10.T(this.f36455b);
                return;
            default:
                f10.U(this.f36455b);
                return;
        }
    }
}
