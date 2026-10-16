package org.telegram.ui.Components;
public final class wh0 implements Runnable {
    public final int f30579a;
    public final zh0 f30580b;

    public wh0(zh0 zh0Var, int i10) {
        this.f30579a = i10;
        this.f30580b = zh0Var;
    }

    @Override
    public final void run() {
        switch (this.f30579a) {
            case 0:
                this.f30580b.a(true);
                return;
            default:
                this.f30580b.d();
                return;
        }
    }
}
