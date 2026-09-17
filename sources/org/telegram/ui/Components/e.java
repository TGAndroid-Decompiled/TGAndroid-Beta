package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_aicompose;
public final class e implements Utilities.Callback {
    public final int f25521a;
    public final f0 f25522b;

    public e(f0 f0Var, int i10) {
        this.f25521a = i10;
        this.f25522b = f0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f25521a) {
            case 0:
                f0.U(this.f25522b, (TL_aicompose.AiComposeTone) obj);
                return;
            case 1:
                f0.T(this.f25522b, (TL_aicompose.AiComposeTone) obj);
                return;
            case 2:
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                boolean z10 = aiComposeTone instanceof TL_aicompose.TL_aiComposeTone;
                f0 f0Var = this.f25522b;
                if (z10) {
                    f0Var.f25866u0.edit((TL_aicompose.TL_aiComposeTone) aiComposeTone);
                }
                f0Var.s0();
                return;
            default:
                f0.S(this.f25522b, ((Integer) obj).intValue());
                return;
        }
    }
}
