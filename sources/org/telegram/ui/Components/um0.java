package org.telegram.ui.Components;
public final class um0 implements r1.c {
    public final int f38752a;
    public final cn0 f38753b;
    public final r1.g f38754c;

    public um0(cn0 cn0Var, r1.g gVar, int i7) {
        this.f38752a = i7;
        this.f38753b = cn0Var;
        this.f38754c = gVar;
    }

    @Override
    public final void a(r1.g gVar, boolean z9, float f10, float f11) {
        switch (this.f38752a) {
            case 0:
                if (!z9) {
                    this.f38753b.f32726z.remove(this.f38754c);
                    gVar.d();
                    return;
                }
                return;
            default:
                cn0 cn0Var = this.f38753b;
                if (!z9) {
                    cn0Var.f32726z.remove(this.f38754c);
                    gVar.d();
                    return;
                }
                cn0Var.getClass();
                return;
        }
    }
}
