package org.telegram.ui;
public final class h11 implements Runnable {
    public final int f48197a;
    public final i11 f48198b;

    public h11(i11 i11Var, int i7) {
        this.f48197a = i7;
        this.f48198b = i11Var;
    }

    @Override
    public final void run() {
        switch (this.f48197a) {
            case 0:
                i11.a(this.f48198b);
                return;
            default:
                this.f48198b.dismiss();
                return;
        }
    }
}
