package org.telegram.ui;
public final class oa0 implements Runnable {
    public final int f40120a;
    public final ta0 f40121b;

    public oa0(ta0 ta0Var, int i10) {
        this.f40120a = i10;
        this.f40121b = ta0Var;
    }

    @Override
    public final void run() {
        switch (this.f40120a) {
            case 0:
                this.f40121b.b();
                return;
            default:
                this.f40121b.c();
                return;
        }
    }
}
