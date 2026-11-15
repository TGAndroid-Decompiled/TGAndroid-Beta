package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stories;
public final class l5 implements org.telegram.messenger.z10 {
    public final int f48839a;
    public final t5 f48840b;

    public l5(t5 t5Var, int i7) {
        this.f48839a = i7;
        this.f48840b = t5Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f48839a) {
            case 0:
                this.f48840b.V = (org.telegram.messenger.e3) obj;
                return;
            default:
                org.telegram.messenger.g0.h3(new oi.u4(29, this.f48840b, (TL_stories.TL_premium_boostsStatus) obj));
                return;
        }
    }
}
