package org.telegram.ui;
public final class i80 implements Runnable {
    public final int f36753a;
    public final p80 f36754b;

    public i80(p80 p80Var, int i10) {
        this.f36753a = i10;
        this.f36754b = p80Var;
    }

    @Override
    public final void run() {
        switch (this.f36753a) {
            case 0:
                p80 p80Var = this.f36754b;
                p80Var.h.postOnAnimation(new i80(p80Var, 1));
                return;
            default:
                this.f36754b.Y();
                return;
        }
    }
}
