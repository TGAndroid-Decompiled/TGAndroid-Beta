package org.telegram.ui.Components;
public final class wm0 implements q1.c {
    public final int f40031a;
    public final en0 f40032b;
    public final q1.g f40033c;

    public wm0(en0 en0Var, q1.g gVar, int i3) {
        this.f40031a = i3;
        this.f40032b = en0Var;
        this.f40033c = gVar;
    }

    @Override
    public final void a(q1.g gVar, boolean z10, float f10, float f11) {
        switch (this.f40031a) {
            case 0:
                if (!z10) {
                    this.f40032b.f33431z.remove(this.f40033c);
                    gVar.d();
                    return;
                }
                return;
            default:
                en0 en0Var = this.f40032b;
                if (!z10) {
                    en0Var.f33431z.remove(this.f40033c);
                    gVar.d();
                    return;
                }
                en0Var.getClass();
                return;
        }
    }
}
