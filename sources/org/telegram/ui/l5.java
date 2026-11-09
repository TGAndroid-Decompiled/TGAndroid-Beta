package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stories;
public final class l5 implements org.telegram.messenger.c20 {
    public final int f47463a;
    public final t5 f47464b;

    public l5(t5 t5Var, int i7) {
        this.f47463a = i7;
        this.f47464b = t5Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f47463a) {
            case 0:
                this.f47464b.U = (org.telegram.messenger.e3) obj;
                return;
            default:
                org.telegram.messenger.g0.h3(new org.telegram.ui.ActionBar.p(10, this.f47464b, (TL_stories.TL_premium_boostsStatus) obj));
                return;
        }
    }
}
