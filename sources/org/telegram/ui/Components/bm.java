package org.telegram.ui.Components;
public final class bm implements org.telegram.messenger.c20 {
    public final int f32283a;
    public final an f32284b;
    public final int f32285c;

    public bm(an anVar, int i7, int i10) {
        this.f32283a = i10;
        this.f32284b = anVar;
        this.f32285c = i7;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f32283a) {
            case 0:
                this.f32284b.j0(this.f32285c, (sh.d) obj);
                return;
            default:
                an anVar = this.f32284b;
                anVar.getClass();
                anVar.j0(this.f32285c, new th.e((String) obj));
                return;
        }
    }
}
