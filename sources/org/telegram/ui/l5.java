package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stories;
public final class l5 implements org.telegram.messenger.z10 {
    public final int f48843a;
    public final t5 f48844b;

    public l5(t5 t5Var, int i7) {
        this.f48843a = i7;
        this.f48844b = t5Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f48843a) {
            case 0:
                this.f48844b.V = (org.telegram.messenger.e3) obj;
                return;
            default:
                org.telegram.messenger.g0.h3(new oi.u4(29, this.f48844b, (TL_stories.TL_premium_boostsStatus) obj));
                return;
        }
    }
}
