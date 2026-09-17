package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_aicompose;
public final class e implements Utilities.Callback {
    public final int f23413a;
    public final e0 f23414b;

    public e(e0 e0Var, int i10) {
        this.f23413a = i10;
        this.f23414b = e0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f23413a) {
            case 0:
                e0.U(this.f23414b, (TL_aicompose.AiComposeTone) obj);
                return;
            case 1:
                e0.T(this.f23414b, (TL_aicompose.AiComposeTone) obj);
                return;
            case 2:
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                boolean z10 = aiComposeTone instanceof TL_aicompose.TL_aiComposeTone;
                e0 e0Var = this.f23414b;
                if (z10) {
                    e0Var.f23434u0.edit((TL_aicompose.TL_aiComposeTone) aiComposeTone);
                }
                e0Var.s0();
                return;
            default:
                e0.S(this.f23414b, ((Integer) obj).intValue());
                return;
        }
    }
}
