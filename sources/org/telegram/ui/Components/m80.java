package org.telegram.ui.Components;
public final class m80 implements Runnable {
    public final int f28342a;
    public final ji.a f28343b;
    public final q80 f28344c;

    public m80(ji.a aVar, q80 q80Var, int i10) {
        this.f28342a = i10;
        this.f28343b = aVar;
        this.f28344c = q80Var;
    }

    @Override
    public final void run() {
        switch (this.f28342a) {
            case 0:
                this.f28343b.m(this.f28344c, false);
                return;
            default:
                this.f28343b.m(this.f28344c, false);
                return;
        }
    }
}
