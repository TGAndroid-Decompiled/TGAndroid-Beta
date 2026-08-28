package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_aicompose;
public final class e implements Utilities.Callback {
    public final int f27850a;
    public final e0 f27851b;

    public e(e0 e0Var, int i9) {
        this.f27850a = i9;
        this.f27851b = e0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f27850a) {
            case 0:
                e0.T(this.f27851b, (TL_aicompose.AiComposeTone) obj);
                return;
            case 1:
                e0.S(this.f27851b, (TL_aicompose.AiComposeTone) obj);
                return;
            case 2:
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                boolean z10 = aiComposeTone instanceof TL_aicompose.TL_aiComposeTone;
                e0 e0Var = this.f27851b;
                if (z10) {
                    e0Var.f27867q0.edit((TL_aicompose.TL_aiComposeTone) aiComposeTone);
                }
                e0Var.r0();
                return;
            default:
                e0.R(this.f27851b, ((Integer) obj).intValue());
                return;
        }
    }
}
