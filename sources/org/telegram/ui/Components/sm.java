package org.telegram.ui.Components;
public final class sm implements org.telegram.messenger.y10 {
    public final int f39582a;
    public final tn f39583b;
    public final int f39584c;

    public sm(tn tnVar, int i7, int i10) {
        this.f39582a = i10;
        this.f39583b = tnVar;
        this.f39584c = i7;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f39582a) {
            case 0:
                this.f39583b.j0(this.f39584c, (sh.c) obj);
                return;
            default:
                tn tnVar = this.f39583b;
                tnVar.getClass();
                tnVar.j0(this.f39584c, new th.e((String) obj));
                return;
        }
    }
}
