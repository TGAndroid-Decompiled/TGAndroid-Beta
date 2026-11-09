package org.telegram.ui.Components;
public final class xd0 implements Runnable {
    public final int f40364a;
    public final be0 f40365b;

    public xd0(be0 be0Var, int i7) {
        this.f40364a = i7;
        this.f40365b = be0Var;
    }

    @Override
    public final void run() {
        switch (this.f40364a) {
            case 0:
                this.f40365b.e();
                return;
            default:
                this.f40365b.g();
                return;
        }
    }
}
