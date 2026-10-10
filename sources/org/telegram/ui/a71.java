package org.telegram.ui;
public final class a71 implements Runnable {
    public final int f35912a;
    public final b71 f35913b;

    public a71(b71 b71Var, int i10) {
        this.f35912a = i10;
        this.f35913b = b71Var;
    }

    @Override
    public final void run() {
        switch (this.f35912a) {
            case 0:
                b71.a(this.f35913b);
                return;
            default:
                this.f35913b.dismiss();
                return;
        }
    }
}
