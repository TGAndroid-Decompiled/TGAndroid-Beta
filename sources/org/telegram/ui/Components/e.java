package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_aicompose;
public final class e implements Utilities.Callback {
    public final int f25494a;
    public final f0 f25495b;

    public e(f0 f0Var, int i10) {
        this.f25494a = i10;
        this.f25495b = f0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f25494a) {
            case 0:
                f0.U(this.f25495b, (TL_aicompose.AiComposeTone) obj);
                return;
            case 1:
                f0.T(this.f25495b, (TL_aicompose.AiComposeTone) obj);
                return;
            case 2:
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                boolean z10 = aiComposeTone instanceof TL_aicompose.TL_aiComposeTone;
                f0 f0Var = this.f25495b;
                if (z10) {
                    f0Var.f25839u0.edit((TL_aicompose.TL_aiComposeTone) aiComposeTone);
                }
                f0Var.s0();
                return;
            default:
                f0.S(this.f25495b, ((Integer) obj).intValue());
                return;
        }
    }
}
