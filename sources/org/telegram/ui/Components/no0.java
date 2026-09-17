package org.telegram.ui.Components;
public final class no0 implements o1.f {
    public final int f28844a;
    public final vo0 f28845b;
    public final o1.k f28846c;

    public no0(vo0 vo0Var, o1.k kVar, int i10) {
        this.f28844a = i10;
        this.f28845b = vo0Var;
        this.f28846c = kVar;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f28844a) {
            case 0:
                if (!z10) {
                    this.f28845b.f31391z.remove(this.f28846c);
                    hVar.c();
                    return;
                }
                return;
            default:
                vo0 vo0Var = this.f28845b;
                if (!z10) {
                    vo0Var.f31391z.remove(this.f28846c);
                    hVar.c();
                    return;
                }
                vo0Var.getClass();
                return;
        }
    }
}
