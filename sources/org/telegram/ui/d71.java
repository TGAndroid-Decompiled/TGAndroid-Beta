package org.telegram.ui;
public final class d71 implements Runnable {
    public final int f36670a;
    public final e71 f36671b;

    public d71(e71 e71Var, int i10) {
        this.f36670a = i10;
        this.f36671b = e71Var;
    }

    @Override
    public final void run() {
        switch (this.f36670a) {
            case 0:
                e71.a(this.f36671b);
                return;
            default:
                this.f36671b.dismiss();
                return;
        }
    }
}
