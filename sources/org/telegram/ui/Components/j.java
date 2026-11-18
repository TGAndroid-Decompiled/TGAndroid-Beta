package org.telegram.ui.Components;

import org.telegram.tgnet.tl.TL_aicompose;
public final class j implements org.telegram.messenger.x10 {
    public final int f36273a;
    public final m0 f36274b;
    public final l0 f36275c;

    public j(m0 m0Var, l0 l0Var, int i7) {
        this.f36273a = i7;
        this.f36274b = m0Var;
        this.f36275c = l0Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f36273a) {
            case 0:
                Integer num = (Integer) obj;
                m0 m0Var = this.f36274b;
                if (m0Var.f37296q2 != null) {
                    this.f36275c.c(0, true);
                    m0Var.y1(null);
                    return;
                }
                return;
            default:
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                m0 m0Var2 = this.f36274b;
                if (m0Var2.f37296q2 != aiComposeTone) {
                    this.f36275c.d(aiComposeTone, true);
                    m0Var2.y1(aiComposeTone);
                    return;
                }
                return;
        }
    }
}
