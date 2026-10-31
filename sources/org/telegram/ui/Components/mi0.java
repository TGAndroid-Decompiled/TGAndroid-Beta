package org.telegram.ui.Components;

import org.telegram.tgnet.TLObject;
public final class mi0 implements Runnable {
    public final int f28493a;
    public final vi0 f28494b;
    public final TLObject f28495c;

    public mi0(vi0 vi0Var, TLObject tLObject, int i10) {
        this.f28493a = i10;
        this.f28494b = vi0Var;
        this.f28495c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f28493a) {
            case 0:
                vi0 vi0Var = this.f28494b;
                org.telegram.messenger.zs.f(vi0Var.f31260b).d(new mi0(vi0Var, this.f28495c, 1));
                return;
            default:
                vi0.a(this.f28494b, this.f28495c);
                return;
        }
    }
}
