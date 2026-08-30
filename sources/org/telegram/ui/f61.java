package org.telegram.ui;
public final class f61 implements Runnable {
    public final int f34175a;
    public final g61 f34176b;

    public f61(g61 g61Var, int i10) {
        this.f34175a = i10;
        this.f34176b = g61Var;
    }

    @Override
    public final void run() {
        switch (this.f34175a) {
            case 0:
                g61.a(this.f34176b);
                return;
            default:
                this.f34176b.dismiss();
                return;
        }
    }
}
