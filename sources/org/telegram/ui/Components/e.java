package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_aicompose;
public final class e implements Utilities.Callback {
    public final int f26402a;
    public final f0 f26403b;

    public e(f0 f0Var, int i10) {
        this.f26402a = i10;
        this.f26403b = f0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f26402a) {
            case 0:
                f0.U(this.f26403b, (TL_aicompose.AiComposeTone) obj);
                return;
            case 1:
                f0.T(this.f26403b, (TL_aicompose.AiComposeTone) obj);
                return;
            case 2:
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                boolean z4 = aiComposeTone instanceof TL_aicompose.TL_aiComposeTone;
                f0 f0Var = this.f26403b;
                if (z4) {
                    f0Var.f26722r0.edit((TL_aicompose.TL_aiComposeTone) aiComposeTone);
                }
                f0Var.s0();
                return;
            default:
                f0.S(this.f26403b, ((Integer) obj).intValue());
                return;
        }
    }
}
