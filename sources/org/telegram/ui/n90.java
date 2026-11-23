package org.telegram.ui;
public final class n90 implements Runnable {
    public final int f50274a;
    public final r90 f50275b;

    public n90(r90 r90Var, int i7) {
        this.f50274a = i7;
        this.f50275b = r90Var;
    }

    @Override
    public final void run() {
        switch (this.f50274a) {
            case 0:
                this.f50275b.b();
                return;
            default:
                this.f50275b.c();
                return;
        }
    }
}
