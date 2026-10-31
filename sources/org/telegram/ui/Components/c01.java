package org.telegram.ui.Components;
public final class c01 implements Runnable {
    public final int f24926a;
    public final f01 f24927b;
    public final e01 f24928c;

    public c01(f01 f01Var, e01 e01Var, int i10) {
        this.f24926a = i10;
        this.f24927b = f01Var;
        this.f24928c = e01Var;
    }

    @Override
    public final void run() {
        switch (this.f24926a) {
            case 0:
                this.f24927b.a(this.f24928c);
                return;
            case 1:
                this.f24927b.a(this.f24928c);
                return;
            default:
                this.f24927b.a(this.f24928c);
                return;
        }
    }
}
