package org.telegram.ui.Components;
public final class dp0 implements o1.f {
    public final int f23695a;
    public final lp0 f23696b;
    public final o1.k f23697c;

    public dp0(lp0 lp0Var, o1.k kVar, int i10) {
        this.f23695a = i10;
        this.f23696b = lp0Var;
        this.f23697c = kVar;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f23695a) {
            case 0:
                if (!z10) {
                    this.f23696b.f26083z.remove(this.f23697c);
                    hVar.c();
                    return;
                }
                return;
            default:
                lp0 lp0Var = this.f23696b;
                if (!z10) {
                    lp0Var.f26083z.remove(this.f23697c);
                    hVar.c();
                    return;
                }
                lp0Var.getClass();
                return;
        }
    }
}
