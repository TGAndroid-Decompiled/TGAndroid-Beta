package org.telegram.ui.Components;
public final class cm implements org.telegram.messenger.c20 {
    public final int f32708a;
    public final bn f32709b;
    public final int f32710c;

    public cm(bn bnVar, int i7, int i10) {
        this.f32708a = i10;
        this.f32709b = bnVar;
        this.f32710c = i7;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f32708a) {
            case 0:
                this.f32709b.j0(this.f32710c, (sh.d) obj);
                return;
            default:
                bn bnVar = this.f32709b;
                bnVar.getClass();
                bnVar.j0(this.f32710c, new th.e((String) obj));
                return;
        }
    }
}
