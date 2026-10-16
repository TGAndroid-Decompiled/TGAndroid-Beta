package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_aicompose;
public final class e implements Utilities.Callback {
    public final int f24214a;
    public final e0 f24215b;

    public e(e0 e0Var, int i10) {
        this.f24214a = i10;
        this.f24215b = e0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f24214a) {
            case 0:
                e0.V(this.f24215b, (TL_aicompose.AiComposeTone) obj);
                return;
            case 1:
                e0.U(this.f24215b, (TL_aicompose.AiComposeTone) obj);
                return;
            case 2:
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                boolean z10 = aiComposeTone instanceof TL_aicompose.TL_aiComposeTone;
                e0 e0Var = this.f24215b;
                if (z10) {
                    e0Var.f24235u0.edit((TL_aicompose.TL_aiComposeTone) aiComposeTone);
                }
                e0Var.t0();
                return;
            default:
                e0.T(this.f24215b, ((Integer) obj).intValue());
                return;
        }
    }
}
