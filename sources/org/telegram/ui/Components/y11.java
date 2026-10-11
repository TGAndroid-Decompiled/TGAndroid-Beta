package org.telegram.ui.Components;
public final class y11 implements Runnable {
    public final int f33115a;
    public final b21 f33116b;
    public final a21 f33117c;

    public y11(b21 b21Var, a21 a21Var, int i10) {
        this.f33115a = i10;
        this.f33116b = b21Var;
        this.f33117c = a21Var;
    }

    @Override
    public final void run() {
        switch (this.f33115a) {
            case 0:
                this.f33116b.b(this.f33117c);
                return;
            case 1:
                this.f33116b.b(this.f33117c);
                return;
            default:
                this.f33116b.b(this.f33117c);
                return;
        }
    }
}
