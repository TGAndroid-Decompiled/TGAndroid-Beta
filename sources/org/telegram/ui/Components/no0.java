package org.telegram.ui.Components;
public final class no0 implements o1.f {
    public final int f28843a;
    public final vo0 f28844b;
    public final o1.k f28845c;

    public no0(vo0 vo0Var, o1.k kVar, int i10) {
        this.f28843a = i10;
        this.f28844b = vo0Var;
        this.f28845c = kVar;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f28843a) {
            case 0:
                if (!z10) {
                    this.f28844b.f31390z.remove(this.f28845c);
                    hVar.c();
                    return;
                }
                return;
            default:
                vo0 vo0Var = this.f28844b;
                if (!z10) {
                    vo0Var.f31390z.remove(this.f28845c);
                    hVar.c();
                    return;
                }
                vo0Var.getClass();
                return;
        }
    }
}
