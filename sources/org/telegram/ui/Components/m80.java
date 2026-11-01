package org.telegram.ui.Components;
public final class m80 implements Runnable {
    public final int f28411a;
    public final ji.a f28412b;
    public final q80 f28413c;

    public m80(ji.a aVar, q80 q80Var, int i10) {
        this.f28411a = i10;
        this.f28412b = aVar;
        this.f28413c = q80Var;
    }

    @Override
    public final void run() {
        switch (this.f28411a) {
            case 0:
                this.f28412b.m(this.f28413c, false);
                return;
            default:
                this.f28412b.m(this.f28413c, false);
                return;
        }
    }
}
