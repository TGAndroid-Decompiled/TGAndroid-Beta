package org.telegram.ui.Components;
public final class ya0 implements Runnable {
    public final int f42396a;
    public final za0 f42397b;

    public ya0(za0 za0Var, int i7) {
        this.f42396a = i7;
        this.f42397b = za0Var;
    }

    @Override
    public final void run() {
        switch (this.f42396a) {
            case 0:
                this.f42397b.y();
                return;
            default:
                this.f42397b.m(true);
                return;
        }
    }
}
