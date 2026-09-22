package org.telegram.ui.Components;
public final class j90 implements Runnable {
    public final int f25328a;
    public final k90 f25329b;
    public final o90 f25330c;

    public j90(k90 k90Var, o90 o90Var, int i10) {
        this.f25328a = i10;
        this.f25329b = k90Var;
        this.f25330c = o90Var;
    }

    @Override
    public final void run() {
        switch (this.f25328a) {
            case 0:
                this.f25329b.k(this.f25330c, false);
                return;
            default:
                this.f25329b.k(this.f25330c, false);
                return;
        }
    }
}
