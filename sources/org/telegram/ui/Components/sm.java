package org.telegram.ui.Components;
public final class sm implements org.telegram.messenger.y10 {
    public final int f39627a;
    public final tn f39628b;
    public final int f39629c;

    public sm(tn tnVar, int i7, int i10) {
        this.f39627a = i10;
        this.f39628b = tnVar;
        this.f39629c = i7;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f39627a) {
            case 0:
                this.f39628b.j0(this.f39629c, (sh.c) obj);
                return;
            default:
                tn tnVar = this.f39628b;
                tnVar.getClass();
                tnVar.j0(this.f39629c, new th.e((String) obj));
                return;
        }
    }
}
