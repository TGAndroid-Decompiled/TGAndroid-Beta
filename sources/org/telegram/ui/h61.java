package org.telegram.ui;
public final class h61 implements Runnable {
    public final int f37337a;
    public final i61 f37338b;

    public h61(i61 i61Var, int i10) {
        this.f37337a = i10;
        this.f37338b = i61Var;
    }

    @Override
    public final void run() {
        switch (this.f37337a) {
            case 0:
                i61.a(this.f37338b);
                return;
            default:
                this.f37338b.dismiss();
                return;
        }
    }
}
