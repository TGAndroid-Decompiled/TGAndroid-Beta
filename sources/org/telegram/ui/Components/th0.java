package org.telegram.ui.Components;
public final class th0 implements Runnable {
    public final int f30845a;
    public final wh0 f30846b;

    public th0(wh0 wh0Var, int i10) {
        this.f30845a = i10;
        this.f30846b = wh0Var;
    }

    @Override
    public final void run() {
        switch (this.f30845a) {
            case 0:
                this.f30846b.a(true);
                return;
            default:
                this.f30846b.d();
                return;
        }
    }
}
