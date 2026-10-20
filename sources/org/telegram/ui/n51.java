package org.telegram.ui;
public final class n51 implements Runnable {
    public final int f39424a;
    public final o51 f39425b;

    public n51(o51 o51Var, int i10) {
        this.f39424a = i10;
        this.f39425b = o51Var;
    }

    @Override
    public final void run() {
        switch (this.f39424a) {
            case 0:
                o51.a(this.f39425b);
                return;
            default:
                this.f39425b.dismiss();
                return;
        }
    }
}
