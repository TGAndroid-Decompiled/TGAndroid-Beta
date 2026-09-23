package org.telegram.ui.Components;
public final class no0 implements o1.f {
    public final int f26455a;
    public final vo0 f26456b;
    public final o1.k f26457c;

    public no0(vo0 vo0Var, o1.k kVar, int i10) {
        this.f26455a = i10;
        this.f26456b = vo0Var;
        this.f26457c = kVar;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f26455a) {
            case 0:
                if (!z10) {
                    this.f26456b.f28831z.remove(this.f26457c);
                    hVar.c();
                    return;
                }
                return;
            default:
                vo0 vo0Var = this.f26456b;
                if (!z10) {
                    vo0Var.f28831z.remove(this.f26457c);
                    hVar.c();
                    return;
                }
                vo0Var.getClass();
                return;
        }
    }
}
