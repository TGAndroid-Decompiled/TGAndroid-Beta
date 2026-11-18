package org.telegram.ui.Components;
public final class qm implements org.telegram.messenger.x10 {
    public final int f38838a;
    public final rn f38839b;
    public final int f38840c;

    public qm(rn rnVar, int i7, int i10) {
        this.f38838a = i10;
        this.f38839b = rnVar;
        this.f38840c = i7;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f38838a) {
            case 0:
                this.f38839b.j0(this.f38840c, (sh.d) obj);
                return;
            default:
                rn rnVar = this.f38839b;
                rnVar.getClass();
                rnVar.j0(this.f38840c, new th.e((String) obj));
                return;
        }
    }
}
