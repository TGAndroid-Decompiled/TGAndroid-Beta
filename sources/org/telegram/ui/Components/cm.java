package org.telegram.ui.Components;
public final class cm implements org.telegram.messenger.c20 {
    public final int f32612a;
    public final bn f32613b;
    public final int f32614c;

    public cm(bn bnVar, int i7, int i10) {
        this.f32612a = i10;
        this.f32613b = bnVar;
        this.f32614c = i7;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f32612a) {
            case 0:
                this.f32613b.j0(this.f32614c, (sh.c) obj);
                return;
            default:
                bn bnVar = this.f32613b;
                bnVar.getClass();
                bnVar.j0(this.f32614c, new th.e((String) obj));
                return;
        }
    }
}
