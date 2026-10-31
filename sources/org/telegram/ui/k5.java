package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stories;
public final class k5 implements org.telegram.messenger.q20 {
    public final int f38684a;
    public final t5 f38685b;

    public k5(t5 t5Var, int i10) {
        this.f38684a = i10;
        this.f38685b = t5Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f38684a) {
            case 0:
                this.f38685b.U = (org.telegram.messenger.h3) obj;
                return;
            default:
                org.telegram.messenger.i0.g3(new h0(4, this.f38685b, (TL_stories.TL_premium_boostsStatus) obj));
                return;
        }
    }
}
