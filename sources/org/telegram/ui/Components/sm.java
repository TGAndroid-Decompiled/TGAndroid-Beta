package org.telegram.ui.Components;
public final class sm implements org.telegram.messenger.y10 {
    public final int f39626a;
    public final tn f39627b;
    public final int f39628c;

    public sm(tn tnVar, int i7, int i10) {
        this.f39626a = i10;
        this.f39627b = tnVar;
        this.f39628c = i7;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f39626a) {
            case 0:
                this.f39627b.j0(this.f39628c, (sh.c) obj);
                return;
            default:
                tn tnVar = this.f39627b;
                tnVar.getClass();
                tnVar.j0(this.f39628c, new th.e((String) obj));
                return;
        }
    }
}
