package org.telegram.ui.Components;
public final class jm implements org.telegram.messenger.z10 {
    public final int f36041a;
    public final jn f36042b;
    public final int f36043c;

    public jm(jn jnVar, int i7, int i10) {
        this.f36041a = i10;
        this.f36042b = jnVar;
        this.f36043c = i7;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f36041a) {
            case 0:
                this.f36042b.j0(this.f36043c, (sh.c) obj);
                return;
            default:
                jn jnVar = this.f36042b;
                jnVar.getClass();
                jnVar.j0(this.f36043c, new th.e((String) obj));
                return;
        }
    }
}
