package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_aicompose;
public final class e implements Utilities.Callback {
    public final int f23776a;
    public final e0 f23777b;

    public e(e0 e0Var, int i10) {
        this.f23776a = i10;
        this.f23777b = e0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f23776a) {
            case 0:
                e0.U(this.f23777b, (TL_aicompose.AiComposeTone) obj);
                return;
            case 1:
                e0.T(this.f23777b, (TL_aicompose.AiComposeTone) obj);
                return;
            case 2:
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                boolean z10 = aiComposeTone instanceof TL_aicompose.TL_aiComposeTone;
                e0 e0Var = this.f23777b;
                if (z10) {
                    e0Var.f23797u0.edit((TL_aicompose.TL_aiComposeTone) aiComposeTone);
                }
                e0Var.s0();
                return;
            default:
                e0.S(this.f23777b, ((Integer) obj).intValue());
                return;
        }
    }
}
