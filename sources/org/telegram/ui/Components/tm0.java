package org.telegram.ui.Components;
public final class tm0 implements r1.c {
    public final int f38372a;
    public final bn0 f38373b;
    public final r1.g f38374c;

    public tm0(bn0 bn0Var, r1.g gVar, int i7) {
        this.f38372a = i7;
        this.f38373b = bn0Var;
        this.f38374c = gVar;
    }

    @Override
    public final void a(r1.g gVar, boolean z9, float f10, float f11) {
        switch (this.f38372a) {
            case 0:
                if (!z9) {
                    this.f38373b.f32227z.remove(this.f38374c);
                    gVar.d();
                    return;
                }
                return;
            default:
                bn0 bn0Var = this.f38373b;
                if (!z9) {
                    bn0Var.f32227z.remove(this.f38374c);
                    gVar.d();
                    return;
                }
                bn0Var.getClass();
                return;
        }
    }
}
