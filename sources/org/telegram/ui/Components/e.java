package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_aicompose;

public final class e implements Utilities.Callback {

    public final int f27876a;

    public final e0 f27877b;

    public e(e0 e0Var, int i10) {
        this.f27876a = i10;
        this.f27877b = e0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f27876a) {
            case 0:
                e0.U(this.f27877b, (TL_aicompose.AiComposeTone) obj);
                break;
            case 1:
                e0.T(this.f27877b, (TL_aicompose.AiComposeTone) obj);
                break;
            case 2:
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                boolean z10 = aiComposeTone instanceof TL_aicompose.TL_aiComposeTone;
                e0 e0Var = this.f27877b;
                if (z10) {
                    e0Var.f27893q0.edit((TL_aicompose.TL_aiComposeTone) aiComposeTone);
                }
                e0Var.s0();
                break;
            default:
                e0.S(this.f27877b, ((Integer) obj).intValue());
                break;
        }
    }
}
