package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_aicompose;
public final class e implements Utilities.Callback {
    public final int f25820a;
    public final e0 f25821b;

    public e(e0 e0Var, int i10) {
        this.f25820a = i10;
        this.f25821b = e0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f25820a) {
            case 0:
                e0.V(this.f25821b, (TL_aicompose.AiComposeTone) obj);
                return;
            case 1:
                e0.U(this.f25821b, (TL_aicompose.AiComposeTone) obj);
                return;
            case 2:
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                boolean z10 = aiComposeTone instanceof TL_aicompose.TL_aiComposeTone;
                e0 e0Var = this.f25821b;
                if (z10) {
                    e0Var.f25841u0.edit((TL_aicompose.TL_aiComposeTone) aiComposeTone);
                }
                e0Var.t0();
                return;
            default:
                e0.T(this.f25821b, ((Integer) obj).intValue());
                return;
        }
    }
}
