package org.telegram.ui.Components;
public final class fn0 implements r1.c {
    public final int f35142a;
    public final on0 f35143b;
    public final r1.g f35144c;

    public fn0(on0 on0Var, r1.g gVar, int i7) {
        this.f35142a = i7;
        this.f35143b = on0Var;
        this.f35144c = gVar;
    }

    @Override
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        switch (this.f35142a) {
            case 0:
                if (!z10) {
                    this.f35143b.f38146z.remove(this.f35144c);
                    gVar.d();
                    return;
                }
                return;
            default:
                on0 on0Var = this.f35143b;
                if (!z10) {
                    on0Var.f38146z.remove(this.f35144c);
                    gVar.d();
                    return;
                }
                on0Var.getClass();
                return;
        }
    }
}
