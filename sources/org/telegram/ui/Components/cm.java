package org.telegram.ui.Components;
public final class cm implements org.telegram.messenger.c20 {
    public final int f32599a;
    public final bn f32600b;
    public final int f32601c;

    public cm(bn bnVar, int i7, int i10) {
        this.f32599a = i10;
        this.f32600b = bnVar;
        this.f32601c = i7;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f32599a) {
            case 0:
                this.f32600b.j0(this.f32601c, (sh.c) obj);
                return;
            default:
                bn bnVar = this.f32600b;
                bnVar.getClass();
                bnVar.j0(this.f32601c, new th.e((String) obj));
                return;
        }
    }
}
