package org.telegram.ui.Components;
public final class sm implements org.telegram.messenger.x10 {
    public final int f39634a;
    public final tn f39635b;
    public final int f39636c;

    public sm(tn tnVar, int i7, int i10) {
        this.f39634a = i10;
        this.f39635b = tnVar;
        this.f39636c = i7;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f39634a) {
            case 0:
                this.f39635b.j0(this.f39636c, (sh.c) obj);
                return;
            default:
                tn tnVar = this.f39635b;
                tnVar.getClass();
                tnVar.j0(this.f39636c, new th.e((String) obj));
                return;
        }
    }
}
