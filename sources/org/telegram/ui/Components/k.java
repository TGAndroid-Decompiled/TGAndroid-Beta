package org.telegram.ui.Components;

import org.telegram.tgnet.tl.TL_aicompose;
public final class k implements org.telegram.messenger.y10 {
    public final int f36683a;
    public final n0 f36684b;
    public final m0 f36685c;

    public k(n0 n0Var, m0 m0Var, int i7) {
        this.f36683a = i7;
        this.f36684b = n0Var;
        this.f36685c = m0Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f36683a) {
            case 0:
                Integer num = (Integer) obj;
                n0 n0Var = this.f36684b;
                if (n0Var.f37652q2 != null) {
                    this.f36685c.c(0, true);
                    n0Var.y1(null);
                    return;
                }
                return;
            default:
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                n0 n0Var2 = this.f36684b;
                if (n0Var2.f37652q2 != aiComposeTone) {
                    this.f36685c.d(aiComposeTone, true);
                    n0Var2.y1(aiComposeTone);
                    return;
                }
                return;
        }
    }
}
