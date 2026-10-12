package org.telegram.ui;
public final class h71 implements Runnable {
    public final int f36641a;
    public final i71 f36642b;

    public h71(i71 i71Var, int i10) {
        this.f36641a = i10;
        this.f36642b = i71Var;
    }

    @Override
    public final void run() {
        switch (this.f36641a) {
            case 0:
                i71.a(this.f36642b);
                return;
            default:
                this.f36642b.dismiss();
                return;
        }
    }
}
