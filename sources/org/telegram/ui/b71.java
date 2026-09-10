package org.telegram.ui;
public final class b71 implements Runnable {
    public final int f31176a;
    public final c71 f31177b;

    public b71(c71 c71Var, int i10) {
        this.f31176a = i10;
        this.f31177b = c71Var;
    }

    @Override
    public final void run() {
        switch (this.f31176a) {
            case 0:
                c71.a(this.f31177b);
                return;
            default:
                this.f31177b.dismiss();
                return;
        }
    }
}
