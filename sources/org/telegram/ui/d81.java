package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stories;
public final class d81 implements org.telegram.messenger.q20 {
    public final int f36703a;
    public final m91 f36704b;

    public d81(m91 m91Var, int i10) {
        this.f36703a = i10;
        this.f36704b = m91Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f36703a) {
            case 0:
                m91 m91Var = this.f36704b;
                m91Var.getClass();
                m91Var.f39579o1 = ((Float) obj).floatValue();
                m91Var.f39603y0.invalidate();
                m91Var.Z0();
                return;
            case 1:
                m91 m91Var2 = this.f36704b;
                m91Var2.W1 = (TL_stories.TL_premium_boostsStatus) obj;
                m91Var2.V1 = true;
                m91Var2.l1(true);
                m91Var2.U1 = false;
                return;
            default:
                m91.Y(this.f36704b, (org.telegram.messenger.h3) obj);
                return;
        }
    }
}
