package org.telegram.ui.Components;
public final class cm implements org.telegram.messenger.c20 {
    public final int f32608a;
    public final bn f32609b;
    public final int f32610c;

    public cm(bn bnVar, int i7, int i10) {
        this.f32608a = i10;
        this.f32609b = bnVar;
        this.f32610c = i7;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f32608a) {
            case 0:
                this.f32609b.j0(this.f32610c, (sh.c) obj);
                return;
            default:
                bn bnVar = this.f32609b;
                bnVar.getClass();
                bnVar.j0(this.f32610c, new th.e((String) obj));
                return;
        }
    }
}
