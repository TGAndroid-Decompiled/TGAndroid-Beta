package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stories;
public final class l5 implements org.telegram.messenger.c20 {
    public final int f47417a;
    public final t5 f47418b;

    public l5(t5 t5Var, int i7) {
        this.f47417a = i7;
        this.f47418b = t5Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f47417a) {
            case 0:
                this.f47418b.U = (org.telegram.messenger.e3) obj;
                return;
            default:
                org.telegram.messenger.g0.h3(new org.telegram.ui.ActionBar.p(10, this.f47418b, (TL_stories.TL_premium_boostsStatus) obj));
                return;
        }
    }
}
