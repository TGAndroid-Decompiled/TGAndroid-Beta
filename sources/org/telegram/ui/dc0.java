package org.telegram.ui;
public final class dc0 implements Runnable {
    public final int f35229a;
    public final jc0 f35230b;

    public dc0(jc0 jc0Var, int i10) {
        this.f35229a = i10;
        this.f35230b = jc0Var;
    }

    @Override
    public final void run() {
        switch (this.f35229a) {
            case 0:
                this.f35230b.b();
                return;
            default:
                this.f35230b.c();
                return;
        }
    }
}
