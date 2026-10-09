package org.telegram.ui;
public final class a71 implements Runnable {
    public final int f35866a;
    public final b71 f35867b;

    public a71(b71 b71Var, int i10) {
        this.f35866a = i10;
        this.f35867b = b71Var;
    }

    @Override
    public final void run() {
        switch (this.f35866a) {
            case 0:
                b71.a(this.f35867b);
                return;
            default:
                this.f35867b.dismiss();
                return;
        }
    }
}
