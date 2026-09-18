package org.telegram.ui.Components;
public final class bp0 implements o1.f {
    public final int f23056a;
    public final jp0 f23057b;
    public final o1.k f23058c;

    public bp0(jp0 jp0Var, o1.k kVar, int i10) {
        this.f23056a = i10;
        this.f23057b = jp0Var;
        this.f23058c = kVar;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f23056a) {
            case 0:
                if (!z10) {
                    this.f23057b.f25413z.remove(this.f23058c);
                    hVar.c();
                    return;
                }
                return;
            default:
                jp0 jp0Var = this.f23057b;
                if (!z10) {
                    jp0Var.f25413z.remove(this.f23058c);
                    hVar.c();
                    return;
                }
                jp0Var.getClass();
                return;
        }
    }
}
