package org.telegram.ui;
public final class g00 implements Runnable {
    public final int f36545a;
    public final f10 f36546b;

    public g00(f10 f10Var, int i10) {
        this.f36545a = i10;
        this.f36546b = f10Var;
    }

    @Override
    public final void run() {
        switch (this.f36545a) {
            case 0:
                f10.V(this.f36546b);
                return;
            default:
                f10.W(this.f36546b);
                return;
        }
    }
}
