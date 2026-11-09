package org.telegram.ui.Components;
public final class xe0 implements Runnable {
    public final int f40370a;
    public final af0 f40371b;

    public xe0(af0 af0Var, int i7) {
        this.f40370a = i7;
        this.f40371b = af0Var;
    }

    @Override
    public final void run() {
        switch (this.f40370a) {
            case 0:
                this.f40371b.a(true);
                return;
            default:
                this.f40371b.d();
                return;
        }
    }
}
