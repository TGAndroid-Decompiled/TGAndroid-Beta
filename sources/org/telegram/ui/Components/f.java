package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_aicompose;
public final class f implements Utilities.Callback {
    public final int f22790a;
    public final g0 f22791b;

    public f(g0 g0Var, int i10) {
        this.f22790a = i10;
        this.f22791b = g0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f22790a) {
            case 0:
                g0.U(this.f22791b, (TL_aicompose.AiComposeTone) obj);
                return;
            case 1:
                g0.T(this.f22791b, (TL_aicompose.AiComposeTone) obj);
                return;
            case 2:
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                boolean z10 = aiComposeTone instanceof TL_aicompose.TL_aiComposeTone;
                g0 g0Var = this.f22791b;
                if (z10) {
                    g0Var.f23130u0.edit((TL_aicompose.TL_aiComposeTone) aiComposeTone);
                }
                g0Var.s0();
                return;
            default:
                g0.S(this.f22791b, ((Integer) obj).intValue());
                return;
        }
    }
}
