package org.telegram.ui;
public final class g00 implements Runnable {
    public final int f36544a;
    public final f10 f36545b;

    public g00(f10 f10Var, int i10) {
        this.f36544a = i10;
        this.f36545b = f10Var;
    }

    @Override
    public final void run() {
        switch (this.f36544a) {
            case 0:
                f10.V(this.f36545b);
                return;
            default:
                f10.W(this.f36545b);
                return;
        }
    }
}
