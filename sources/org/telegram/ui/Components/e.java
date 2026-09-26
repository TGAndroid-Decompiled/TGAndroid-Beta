package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_aicompose;
public final class e implements Utilities.Callback {
    public final int f23775a;
    public final e0 f23776b;

    public e(e0 e0Var, int i10) {
        this.f23775a = i10;
        this.f23776b = e0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f23775a) {
            case 0:
                e0.U(this.f23776b, (TL_aicompose.AiComposeTone) obj);
                return;
            case 1:
                e0.T(this.f23776b, (TL_aicompose.AiComposeTone) obj);
                return;
            case 2:
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                boolean z10 = aiComposeTone instanceof TL_aicompose.TL_aiComposeTone;
                e0 e0Var = this.f23776b;
                if (z10) {
                    e0Var.f23796u0.edit((TL_aicompose.TL_aiComposeTone) aiComposeTone);
                }
                e0Var.s0();
                return;
            default:
                e0.S(this.f23776b, ((Integer) obj).intValue());
                return;
        }
    }
}
