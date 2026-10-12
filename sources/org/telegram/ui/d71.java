package org.telegram.ui;
public final class d71 implements Runnable {
    public final int f36672a;
    public final e71 f36673b;

    public d71(e71 e71Var, int i10) {
        this.f36672a = i10;
        this.f36673b = e71Var;
    }

    @Override
    public final void run() {
        switch (this.f36672a) {
            case 0:
                e71.a(this.f36673b);
                return;
            default:
                this.f36673b.dismiss();
                return;
        }
    }
}
