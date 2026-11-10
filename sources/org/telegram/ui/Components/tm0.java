package org.telegram.ui.Components;
public final class tm0 implements r1.c {
    public final int f38340a;
    public final bn0 f38341b;
    public final r1.g f38342c;

    public tm0(bn0 bn0Var, r1.g gVar, int i7) {
        this.f38340a = i7;
        this.f38341b = bn0Var;
        this.f38342c = gVar;
    }

    @Override
    public final void a(r1.g gVar, boolean z9, float f10, float f11) {
        switch (this.f38340a) {
            case 0:
                if (!z9) {
                    this.f38341b.f32301z.remove(this.f38342c);
                    gVar.d();
                    return;
                }
                return;
            default:
                bn0 bn0Var = this.f38341b;
                if (!z9) {
                    bn0Var.f32301z.remove(this.f38342c);
                    gVar.d();
                    return;
                }
                bn0Var.getClass();
                return;
        }
    }
}
