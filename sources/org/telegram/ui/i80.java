package org.telegram.ui;
public final class i80 implements Runnable {
    public final int f37065a;
    public final p80 f37066b;

    public i80(p80 p80Var, int i10) {
        this.f37065a = i10;
        this.f37066b = p80Var;
    }

    @Override
    public final void run() {
        switch (this.f37065a) {
            case 0:
                p80 p80Var = this.f37066b;
                p80Var.h.postOnAnimation(new i80(p80Var, 1));
                return;
            default:
                this.f37066b.Y();
                return;
        }
    }
}
