package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stories;
public final class n5 implements org.telegram.messenger.u10 {
    public final int f47880a;
    public final v5 f47881b;

    public n5(v5 v5Var, int i3) {
        this.f47880a = i3;
        this.f47881b = v5Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f47880a) {
            case 0:
                this.f47881b.V = (org.telegram.messenger.e3) obj;
                return;
            default:
                org.telegram.messenger.g0.h3(new org.telegram.messenger.voip.l0(15, this.f47881b, (TL_stories.TL_premium_boostsStatus) obj));
                return;
        }
    }
}
