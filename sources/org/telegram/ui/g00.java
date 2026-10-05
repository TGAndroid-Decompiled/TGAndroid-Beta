package org.telegram.ui;
public final class g00 implements Runnable {
    public final int f36468a;
    public final f10 f36469b;

    public g00(f10 f10Var, int i10) {
        this.f36468a = i10;
        this.f36469b = f10Var;
    }

    @Override
    public final void run() {
        switch (this.f36468a) {
            case 0:
                f10.T(this.f36469b);
                return;
            default:
                f10.U(this.f36469b);
                return;
        }
    }
}
