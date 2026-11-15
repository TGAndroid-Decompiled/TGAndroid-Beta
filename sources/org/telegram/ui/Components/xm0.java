package org.telegram.ui.Components;
public final class xm0 implements r1.c {
    public final int f41728a;
    public final fn0 f41729b;
    public final r1.g f41730c;

    public xm0(fn0 fn0Var, r1.g gVar, int i7) {
        this.f41728a = i7;
        this.f41729b = fn0Var;
        this.f41730c = gVar;
    }

    @Override
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        switch (this.f41728a) {
            case 0:
                if (!z10) {
                    this.f41729b.f34660z.remove(this.f41730c);
                    gVar.d();
                    return;
                }
                return;
            default:
                fn0 fn0Var = this.f41729b;
                if (!z10) {
                    fn0Var.f34660z.remove(this.f41730c);
                    gVar.d();
                    return;
                }
                fn0Var.getClass();
                return;
        }
    }
}
