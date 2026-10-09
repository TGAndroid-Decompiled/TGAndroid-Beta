package org.telegram.ui;
public final class a71 implements Runnable {
    public final int f35868a;
    public final b71 f35869b;

    public a71(b71 b71Var, int i10) {
        this.f35868a = i10;
        this.f35869b = b71Var;
    }

    @Override
    public final void run() {
        switch (this.f35868a) {
            case 0:
                b71.a(this.f35869b);
                return;
            default:
                this.f35869b.dismiss();
                return;
        }
    }
}
