package org.telegram.ui.Components;
public final class so0 implements o1.f {
    public final int f31137a;
    public final ap0 f31138b;
    public final o1.j f31139c;

    public so0(ap0 ap0Var, o1.j jVar, int i10) {
        this.f31137a = i10;
        this.f31138b = ap0Var;
        this.f31139c = jVar;
    }

    @Override
    public final void a(o1.h hVar, boolean z4, float f10, float f11) {
        switch (this.f31137a) {
            case 0:
                if (!z4) {
                    this.f31138b.f25316z.remove(this.f31139c);
                    hVar.c();
                    return;
                }
                return;
            default:
                ap0 ap0Var = this.f31138b;
                if (!z4) {
                    ap0Var.f25316z.remove(this.f31139c);
                    hVar.c();
                    return;
                }
                ap0Var.getClass();
                return;
        }
    }
}
