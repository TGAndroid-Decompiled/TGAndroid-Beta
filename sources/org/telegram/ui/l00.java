package org.telegram.ui;
public final class l00 implements Runnable {
    public final int f37565a;
    public final k10 f37566b;

    public l00(k10 k10Var, int i10) {
        this.f37565a = i10;
        this.f37566b = k10Var;
    }

    @Override
    public final void run() {
        switch (this.f37565a) {
            case 0:
                k10.V(this.f37566b);
                return;
            default:
                k10.W(this.f37566b);
                return;
        }
    }
}
