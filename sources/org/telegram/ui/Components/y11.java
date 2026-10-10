package org.telegram.ui.Components;
public final class y11 implements Runnable {
    public final int f33077a;
    public final b21 f33078b;
    public final a21 f33079c;

    public y11(b21 b21Var, a21 a21Var, int i10) {
        this.f33077a = i10;
        this.f33078b = b21Var;
        this.f33079c = a21Var;
    }

    @Override
    public final void run() {
        switch (this.f33077a) {
            case 0:
                this.f33078b.b(this.f33079c);
                return;
            case 1:
                this.f33078b.b(this.f33079c);
                return;
            default:
                this.f33078b.b(this.f33079c);
                return;
        }
    }
}
