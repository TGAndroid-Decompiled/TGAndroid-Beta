package org.telegram.ui.Components;
public final class km implements org.telegram.messenger.q20 {
    public final int f27823a;
    public final jn f27824b;
    public final int f27825c;

    public km(jn jnVar, int i10, int i11) {
        this.f27823a = i11;
        this.f27824b = jnVar;
        this.f27825c = i10;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f27823a) {
            case 0:
                this.f27824b.h0(this.f27825c, (ih.f) obj);
                return;
            default:
                jn jnVar = this.f27824b;
                jnVar.getClass();
                jnVar.h0(this.f27825c, new jh.e((String) obj));
                return;
        }
    }
}
