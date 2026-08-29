package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_aicompose;
public final class e implements Utilities.Callback {
    public final int f27892a;
    public final g0 f27893b;

    public e(g0 g0Var, int i10) {
        this.f27892a = i10;
        this.f27893b = g0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f27892a) {
            case 0:
                g0.U(this.f27893b, (TL_aicompose.AiComposeTone) obj);
                return;
            case 1:
                g0.T(this.f27893b, (TL_aicompose.AiComposeTone) obj);
                return;
            case 2:
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                boolean z10 = aiComposeTone instanceof TL_aicompose.TL_aiComposeTone;
                g0 g0Var = this.f27893b;
                if (z10) {
                    g0Var.f28681q0.edit((TL_aicompose.TL_aiComposeTone) aiComposeTone);
                }
                g0Var.s0();
                return;
            default:
                g0.S(this.f27893b, ((Integer) obj).intValue());
                return;
        }
    }
}
