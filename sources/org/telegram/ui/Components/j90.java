package org.telegram.ui.Components;
public final class j90 implements Runnable {
    public final int f25360a;
    public final k90 f25361b;
    public final o90 f25362c;

    public j90(k90 k90Var, o90 o90Var, int i10) {
        this.f25360a = i10;
        this.f25361b = k90Var;
        this.f25362c = o90Var;
    }

    @Override
    public final void run() {
        switch (this.f25360a) {
            case 0:
                this.f25361b.k(this.f25362c, false);
                return;
            default:
                this.f25361b.k(this.f25362c, false);
                return;
        }
    }
}
