package org.telegram.ui.Components;
public final class jm implements org.telegram.messenger.z10 {
    public final int f36031a;
    public final jn f36032b;
    public final int f36033c;

    public jm(jn jnVar, int i7, int i10) {
        this.f36031a = i10;
        this.f36032b = jnVar;
        this.f36033c = i7;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f36031a) {
            case 0:
                this.f36032b.j0(this.f36033c, (sh.c) obj);
                return;
            default:
                jn jnVar = this.f36032b;
                jnVar.getClass();
                jnVar.j0(this.f36033c, new th.e((String) obj));
                return;
        }
    }
}
