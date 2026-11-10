package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stories;
public final class l5 implements org.telegram.messenger.c20 {
    public final int f47515a;
    public final t5 f47516b;

    public l5(t5 t5Var, int i7) {
        this.f47515a = i7;
        this.f47516b = t5Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f47515a) {
            case 0:
                this.f47516b.U = (org.telegram.messenger.e3) obj;
                return;
            default:
                org.telegram.messenger.g0.h3(new org.telegram.ui.ActionBar.c(11, this.f47516b, (TL_stories.TL_premium_boostsStatus) obj));
                return;
        }
    }
}
