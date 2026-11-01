package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_aicompose;
public final class f implements org.telegram.messenger.r20 {
    public final int f25979a;
    public final g0 f25980b;

    public f(g0 g0Var, int i10) {
        this.f25979a = i10;
        this.f25980b = g0Var;
    }

    @Override
    public final void a(Object obj) {
        int i10 = this.f25979a;
        int i11 = 0;
        g0 g0Var = this.f25980b;
        switch (i10) {
            case 0:
                g0.f1(g0Var, (TL_aicompose.AiComposeTone) obj);
                return;
            case 1:
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                g0Var.f26251m2.f15486b.add(0, aiComposeTone);
                g0Var.x1();
                new cc(g0Var.f26263y2, g0Var.I0).p(aiComposeTone.emoji_id, org.telegram.messenger.dd.a0(null, null, 2131754956, aiComposeTone.title), org.telegram.messenger.dd.L0(2131754957, null)).j();
                return;
            case 2:
                TL_aicompose.AiComposeTone aiComposeTone2 = (TL_aicompose.AiComposeTone) obj;
                if (aiComposeTone2 instanceof TL_aicompose.TL_aiComposeTone) {
                    org.telegram.messenger.e eVar = g0Var.f26251m2;
                    TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone2;
                    ArrayList arrayList = eVar.f15486b;
                    while (true) {
                        if (i11 < arrayList.size()) {
                            if ((arrayList.get(i11) instanceof TL_aicompose.TL_aiComposeTone) && ((TL_aicompose.TL_aiComposeTone) arrayList.get(i11)).f20006id == tL_aiComposeTone.f20006id) {
                                arrayList.set(i11, tL_aiComposeTone);
                                eVar.c();
                            } else {
                                i11++;
                            }
                        }
                    }
                }
                g0Var.x1();
                return;
            default:
                g0.e1(g0Var, ((Integer) obj).intValue());
                return;
        }
    }
}
