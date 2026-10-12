package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_aicompose;
public final class e implements Utilities.Callback {
    public final int f24517a;
    public final e0 f24518b;

    public e(e0 e0Var, int i10) {
        this.f24517a = i10;
        this.f24518b = e0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f24517a) {
            case 0:
                e0.V(this.f24518b, (TL_aicompose.AiComposeTone) obj);
                return;
            case 1:
                e0.U(this.f24518b, (TL_aicompose.AiComposeTone) obj);
                return;
            case 2:
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                boolean z10 = aiComposeTone instanceof TL_aicompose.TL_aiComposeTone;
                e0 e0Var = this.f24518b;
                if (z10) {
                    e0Var.f24538u0.edit((TL_aicompose.TL_aiComposeTone) aiComposeTone);
                }
                e0Var.t0();
                return;
            default:
                e0.T(this.f24518b, ((Integer) obj).intValue());
                return;
        }
    }
}
