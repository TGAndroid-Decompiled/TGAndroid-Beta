package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stories;
public final class l5 implements org.telegram.messenger.y10 {
    public final int f49478a;
    public final t5 f49479b;

    public l5(t5 t5Var, int i7) {
        this.f49478a = i7;
        this.f49479b = t5Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f49478a) {
            case 0:
                this.f49479b.V = (org.telegram.messenger.g3) obj;
                return;
            default:
                org.telegram.messenger.g0.g3(new oi.t(27, this.f49479b, (TL_stories.TL_premium_boostsStatus) obj));
                return;
        }
    }
}
