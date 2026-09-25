package org.telegram.ui.Components;
public final class j90 implements Runnable {
    public final int f25361a;
    public final k90 f25362b;
    public final o90 f25363c;

    public j90(k90 k90Var, o90 o90Var, int i10) {
        this.f25361a = i10;
        this.f25362b = k90Var;
        this.f25363c = o90Var;
    }

    @Override
    public final void run() {
        switch (this.f25361a) {
            case 0:
                this.f25362b.k(this.f25363c, false);
                return;
            default:
                this.f25362b.k(this.f25363c, false);
                return;
        }
    }
}
