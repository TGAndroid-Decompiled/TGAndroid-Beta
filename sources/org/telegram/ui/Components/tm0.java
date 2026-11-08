package org.telegram.ui.Components;
public final class tm0 implements r1.c {
    public final int f38389a;
    public final bn0 f38390b;
    public final r1.g f38391c;

    public tm0(bn0 bn0Var, r1.g gVar, int i7) {
        this.f38389a = i7;
        this.f38390b = bn0Var;
        this.f38391c = gVar;
    }

    @Override
    public final void a(r1.g gVar, boolean z9, float f10, float f11) {
        switch (this.f38389a) {
            case 0:
                if (!z9) {
                    this.f38390b.f32282z.remove(this.f38391c);
                    gVar.d();
                    return;
                }
                return;
            default:
                bn0 bn0Var = this.f38390b;
                if (!z9) {
                    bn0Var.f32282z.remove(this.f38391c);
                    gVar.d();
                    return;
                }
                bn0Var.getClass();
                return;
        }
    }
}
