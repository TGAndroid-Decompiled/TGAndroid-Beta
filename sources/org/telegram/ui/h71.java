package org.telegram.ui;
public final class h71 implements Runnable {
    public final int f36431a;
    public final i71 f36432b;

    public h71(i71 i71Var, int i10) {
        this.f36431a = i10;
        this.f36432b = i71Var;
    }

    @Override
    public final void run() {
        switch (this.f36431a) {
            case 0:
                i71.a(this.f36432b);
                return;
            default:
                this.f36432b.dismiss();
                return;
        }
    }
}
