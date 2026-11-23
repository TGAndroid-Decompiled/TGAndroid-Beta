package org.telegram.ui.Components;

import org.telegram.tgnet.tl.TL_aicompose;
public final class j implements org.telegram.messenger.w10 {
    public final int f36207a;
    public final m0 f36208b;
    public final l0 f36209c;

    public j(m0 m0Var, l0 l0Var, int i7) {
        this.f36207a = i7;
        this.f36208b = m0Var;
        this.f36209c = l0Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f36207a) {
            case 0:
                Integer num = (Integer) obj;
                m0 m0Var = this.f36208b;
                if (m0Var.f37296q2 != null) {
                    this.f36209c.c(0, true);
                    m0Var.y1(null);
                    return;
                }
                return;
            default:
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                m0 m0Var2 = this.f36208b;
                if (m0Var2.f37296q2 != aiComposeTone) {
                    this.f36209c.d(aiComposeTone, true);
                    m0Var2.y1(aiComposeTone);
                    return;
                }
                return;
        }
    }
}
