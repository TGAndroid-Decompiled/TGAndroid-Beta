package org.telegram.ui.Components;
public final class no0 implements o1.f {
    public final int f26543a;
    public final vo0 f26544b;
    public final o1.k f26545c;

    public no0(vo0 vo0Var, o1.k kVar, int i10) {
        this.f26543a = i10;
        this.f26544b = vo0Var;
        this.f26545c = kVar;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f26543a) {
            case 0:
                if (!z10) {
                    this.f26544b.f28857z.remove(this.f26545c);
                    hVar.c();
                    return;
                }
                return;
            default:
                vo0 vo0Var = this.f26544b;
                if (!z10) {
                    vo0Var.f28857z.remove(this.f26545c);
                    hVar.c();
                    return;
                }
                vo0Var.getClass();
                return;
        }
    }
}
