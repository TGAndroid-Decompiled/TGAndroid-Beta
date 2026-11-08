package org.telegram.ui.Components;
public final class cm implements org.telegram.messenger.c20 {
    public final int f32630a;
    public final bn f32631b;
    public final int f32632c;

    public cm(bn bnVar, int i7, int i10) {
        this.f32630a = i10;
        this.f32631b = bnVar;
        this.f32632c = i7;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f32630a) {
            case 0:
                this.f32631b.j0(this.f32632c, (sh.c) obj);
                return;
            default:
                bn bnVar = this.f32631b;
                bnVar.getClass();
                bnVar.j0(this.f32632c, new th.e((String) obj));
                return;
        }
    }
}
