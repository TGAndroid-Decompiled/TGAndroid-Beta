package org.telegram.ui.Components;
public final class bm implements org.telegram.messenger.u10 {
    public final int f32321a;
    public final an f32322b;
    public final int f32323c;

    public bm(an anVar, int i3, int i10) {
        this.f32321a = i10;
        this.f32322b = anVar;
        this.f32323c = i3;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f32321a) {
            case 0:
                this.f32322b.j0(this.f32323c, (th.c) obj);
                return;
            default:
                an anVar = this.f32322b;
                anVar.getClass();
                anVar.j0(this.f32323c, new uh.e((String) obj));
                return;
        }
    }
}
