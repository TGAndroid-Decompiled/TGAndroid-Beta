package org.telegram.ui.Components;
public final class xm0 implements r1.c {
    public final int f41720a;
    public final fn0 f41721b;
    public final r1.g f41722c;

    public xm0(fn0 fn0Var, r1.g gVar, int i7) {
        this.f41720a = i7;
        this.f41721b = fn0Var;
        this.f41722c = gVar;
    }

    @Override
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        switch (this.f41720a) {
            case 0:
                if (!z10) {
                    this.f41721b.f34664z.remove(this.f41722c);
                    gVar.d();
                    return;
                }
                return;
            default:
                fn0 fn0Var = this.f41721b;
                if (!z10) {
                    fn0Var.f34664z.remove(this.f41722c);
                    gVar.d();
                    return;
                }
                fn0Var.getClass();
                return;
        }
    }
}
