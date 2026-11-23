package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stories;
public final class l5 implements org.telegram.messenger.y10 {
    public final int f49456a;
    public final t5 f49457b;

    public l5(t5 t5Var, int i7) {
        this.f49456a = i7;
        this.f49457b = t5Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f49456a) {
            case 0:
                this.f49457b.V = (org.telegram.messenger.g3) obj;
                return;
            default:
                org.telegram.messenger.g0.g3(new oi.s2(25, this.f49457b, (TL_stories.TL_premium_boostsStatus) obj));
                return;
        }
    }
}
