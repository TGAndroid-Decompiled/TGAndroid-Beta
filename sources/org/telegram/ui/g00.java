package org.telegram.ui;
public final class g00 implements Runnable {
    public final int f36455a;
    public final f10 f36456b;

    public g00(f10 f10Var, int i10) {
        this.f36455a = i10;
        this.f36456b = f10Var;
    }

    @Override
    public final void run() {
        switch (this.f36455a) {
            case 0:
                f10.T(this.f36456b);
                return;
            default:
                f10.U(this.f36456b);
                return;
        }
    }
}
