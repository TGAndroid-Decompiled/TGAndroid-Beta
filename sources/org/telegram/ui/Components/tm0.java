package org.telegram.ui.Components;
public final class tm0 implements r1.c {
    public final int f38361a;
    public final bn0 f38362b;
    public final r1.g f38363c;

    public tm0(bn0 bn0Var, r1.g gVar, int i7) {
        this.f38361a = i7;
        this.f38362b = bn0Var;
        this.f38363c = gVar;
    }

    @Override
    public final void a(r1.g gVar, boolean z9, float f10, float f11) {
        switch (this.f38361a) {
            case 0:
                if (!z9) {
                    this.f38362b.f32261z.remove(this.f38363c);
                    gVar.d();
                    return;
                }
                return;
            default:
                bn0 bn0Var = this.f38362b;
                if (!z9) {
                    bn0Var.f32261z.remove(this.f38363c);
                    gVar.d();
                    return;
                }
                bn0Var.getClass();
                return;
        }
    }
}
