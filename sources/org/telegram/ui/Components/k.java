package org.telegram.ui.Components;

import org.telegram.tgnet.tl.TL_aicompose;
public final class k implements org.telegram.messenger.x10 {
    public final int f36723a;
    public final n0 f36724b;
    public final m0 f36725c;

    public k(n0 n0Var, m0 m0Var, int i7) {
        this.f36723a = i7;
        this.f36724b = n0Var;
        this.f36725c = m0Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f36723a) {
            case 0:
                Integer num = (Integer) obj;
                n0 n0Var = this.f36724b;
                if (n0Var.f37699q2 != null) {
                    this.f36725c.c(0, true);
                    n0Var.y1(null);
                    return;
                }
                return;
            default:
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                n0 n0Var2 = this.f36724b;
                if (n0Var2.f37699q2 != aiComposeTone) {
                    this.f36725c.d(aiComposeTone, true);
                    n0Var2.y1(aiComposeTone);
                    return;
                }
                return;
        }
    }
}
