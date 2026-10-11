package org.telegram.ui.Components;
public final class z11 implements Runnable {
    public final int f33391a;
    public final c21 f33392b;
    public final b21 f33393c;

    public z11(c21 c21Var, b21 b21Var, int i10) {
        this.f33391a = i10;
        this.f33392b = c21Var;
        this.f33393c = b21Var;
    }

    @Override
    public final void run() {
        switch (this.f33391a) {
            case 0:
                this.f33392b.b(this.f33393c);
                return;
            case 1:
                this.f33392b.b(this.f33393c);
                return;
            default:
                this.f33392b.b(this.f33393c);
                return;
        }
    }
}
