package org.telegram.ui.Components;
public final class tm0 implements r1.c {
    public final int f38381a;
    public final bn0 f38382b;
    public final r1.g f38383c;

    public tm0(bn0 bn0Var, r1.g gVar, int i7) {
        this.f38381a = i7;
        this.f38382b = bn0Var;
        this.f38383c = gVar;
    }

    @Override
    public final void a(r1.g gVar, boolean z9, float f10, float f11) {
        switch (this.f38381a) {
            case 0:
                if (!z9) {
                    this.f38382b.f32233z.remove(this.f38383c);
                    gVar.d();
                    return;
                }
                return;
            default:
                bn0 bn0Var = this.f38382b;
                if (!z9) {
                    bn0Var.f32233z.remove(this.f38383c);
                    gVar.d();
                    return;
                }
                bn0Var.getClass();
                return;
        }
    }
}
