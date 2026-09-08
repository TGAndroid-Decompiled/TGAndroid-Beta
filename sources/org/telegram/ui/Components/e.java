package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_aicompose;
public final class e implements Utilities.Callback {
    public final int f25520a;
    public final f0 f25521b;

    public e(f0 f0Var, int i10) {
        this.f25520a = i10;
        this.f25521b = f0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f25520a) {
            case 0:
                f0.U(this.f25521b, (TL_aicompose.AiComposeTone) obj);
                return;
            case 1:
                f0.T(this.f25521b, (TL_aicompose.AiComposeTone) obj);
                return;
            case 2:
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                boolean z10 = aiComposeTone instanceof TL_aicompose.TL_aiComposeTone;
                f0 f0Var = this.f25521b;
                if (z10) {
                    f0Var.f25865u0.edit((TL_aicompose.TL_aiComposeTone) aiComposeTone);
                }
                f0Var.s0();
                return;
            default:
                f0.S(this.f25521b, ((Integer) obj).intValue());
                return;
        }
    }
}
