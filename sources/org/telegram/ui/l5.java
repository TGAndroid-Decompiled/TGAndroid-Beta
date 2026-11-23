package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stories;
public final class l5 implements org.telegram.messenger.w10 {
    public final int f49592a;
    public final t5 f49593b;

    public l5(t5 t5Var, int i7) {
        this.f49592a = i7;
        this.f49593b = t5Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f49592a) {
            case 0:
                this.f49593b.V = (org.telegram.messenger.g3) obj;
                return;
            default:
                org.telegram.messenger.g0.g3(new n2.c0(29, this.f49593b, (TL_stories.TL_premium_boostsStatus) obj));
                return;
        }
    }
}
