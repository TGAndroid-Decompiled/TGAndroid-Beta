package org.telegram.ui.Components;
public final class km implements org.telegram.messenger.r20 {
    public final int f27897a;
    public final jn f27898b;
    public final int f27899c;

    public km(jn jnVar, int i10, int i11) {
        this.f27897a = i11;
        this.f27898b = jnVar;
        this.f27899c = i10;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f27897a) {
            case 0:
                this.f27898b.h0(this.f27899c, (ih.f) obj);
                return;
            default:
                jn jnVar = this.f27898b;
                jnVar.getClass();
                jnVar.h0(this.f27899c, new jh.e((String) obj));
                return;
        }
    }
}
