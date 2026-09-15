package org.telegram.ui.Components;
public final class no0 implements o1.f {
    public final int f26544a;
    public final vo0 f26545b;
    public final o1.k f26546c;

    public no0(vo0 vo0Var, o1.k kVar, int i10) {
        this.f26544a = i10;
        this.f26545b = vo0Var;
        this.f26546c = kVar;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f26544a) {
            case 0:
                if (!z10) {
                    this.f26545b.f28860z.remove(this.f26546c);
                    hVar.c();
                    return;
                }
                return;
            default:
                vo0 vo0Var = this.f26545b;
                if (!z10) {
                    vo0Var.f28860z.remove(this.f26546c);
                    hVar.c();
                    return;
                }
                vo0Var.getClass();
                return;
        }
    }
}
