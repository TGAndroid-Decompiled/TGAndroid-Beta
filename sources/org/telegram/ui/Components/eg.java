package org.telegram.ui.Components;
public final class eg implements Runnable {
    public final int f34308a;
    public final gg f34309b;
    public final hi.l3 f34310c;

    public eg(gg ggVar, hi.l3 l3Var, int i7) {
        this.f34308a = i7;
        this.f34309b = ggVar;
        this.f34310c = l3Var;
    }

    @Override
    public final void run() {
        switch (this.f34308a) {
            case 0:
                gg ggVar = this.f34309b;
                hi.l3 l3Var = this.f34310c;
                ggVar.removeView(l3Var);
                if (ggVar.f34931b == l3Var) {
                    ggVar.f34931b = null;
                    return;
                }
                return;
            case 1:
                this.f34309b.removeView(this.f34310c);
                return;
            case 2:
                this.f34309b.removeView(this.f34310c);
                return;
            default:
                gg ggVar2 = this.f34309b;
                hi.l3 l3Var2 = this.f34310c;
                ggVar2.removeView(l3Var2);
                if (ggVar2.f34929a == l3Var2) {
                    ggVar2.f34929a = null;
                    return;
                }
                return;
        }
    }
}
