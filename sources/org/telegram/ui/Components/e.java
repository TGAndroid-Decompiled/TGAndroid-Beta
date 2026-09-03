package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_aicompose;
public final class e implements Utilities.Callback {
    public final int f24425a;
    public final f0 f24426b;

    public e(f0 f0Var, int i10) {
        this.f24425a = i10;
        this.f24426b = f0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f24425a) {
            case 0:
                f0.U(this.f24426b, (TL_aicompose.AiComposeTone) obj);
                return;
            case 1:
                f0.T(this.f24426b, (TL_aicompose.AiComposeTone) obj);
                return;
            case 2:
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                boolean z4 = aiComposeTone instanceof TL_aicompose.TL_aiComposeTone;
                f0 f0Var = this.f24426b;
                if (z4) {
                    f0Var.f24745r0.edit((TL_aicompose.TL_aiComposeTone) aiComposeTone);
                }
                f0Var.s0();
                return;
            default:
                f0.S(this.f24426b, ((Integer) obj).intValue());
                return;
        }
    }
}
