package org.telegram.ui.Components;
public final class bp0 implements o1.f {
    public final int f23079a;
    public final jp0 f23080b;
    public final o1.k f23081c;

    public bp0(jp0 jp0Var, o1.k kVar, int i10) {
        this.f23079a = i10;
        this.f23080b = jp0Var;
        this.f23081c = kVar;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f23079a) {
            case 0:
                if (!z10) {
                    this.f23080b.f25500z.remove(this.f23081c);
                    hVar.c();
                    return;
                }
                return;
            default:
                jp0 jp0Var = this.f23080b;
                if (!z10) {
                    jp0Var.f25500z.remove(this.f23081c);
                    hVar.c();
                    return;
                }
                jp0Var.getClass();
                return;
        }
    }
}
