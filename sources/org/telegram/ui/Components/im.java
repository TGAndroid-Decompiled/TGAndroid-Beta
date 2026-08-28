package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
public final class im implements Utilities.Callback {
    public final int f29461a;
    public final jn f29462b;
    public final int f29463c;

    public im(jn jnVar, int i9, int i10) {
        this.f29461a = i10;
        this.f29462b = jnVar;
        this.f29463c = i9;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f29461a) {
            case 0:
                this.f29462b.d0(this.f29463c, (yg.e) obj);
                return;
            default:
                jn jnVar = this.f29462b;
                jnVar.getClass();
                jnVar.d0(this.f29463c, new zg.e((String) obj));
                return;
        }
    }
}
