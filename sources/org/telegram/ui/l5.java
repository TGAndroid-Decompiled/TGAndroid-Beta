package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stories;
public final class l5 implements org.telegram.messenger.x10 {
    public final int f49430a;
    public final t5 f49431b;

    public l5(t5 t5Var, int i7) {
        this.f49430a = i7;
        this.f49431b = t5Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f49430a) {
            case 0:
                this.f49431b.V = (org.telegram.messenger.g3) obj;
                return;
            default:
                org.telegram.messenger.g0.g3(new oi.s2(25, this.f49431b, (TL_stories.TL_premium_boostsStatus) obj));
                return;
        }
    }
}
