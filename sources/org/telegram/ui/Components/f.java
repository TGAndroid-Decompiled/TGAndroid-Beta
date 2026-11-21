package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_aicompose;
public final class f implements org.telegram.messenger.x10 {
    public final int f35047a;
    public final n0 f35048b;

    public f(n0 n0Var, int i7) {
        this.f35047a = i7;
        this.f35048b = n0Var;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f35047a;
        int i10 = 0;
        n0 n0Var = this.f35048b;
        switch (i7) {
            case 0:
                n0.g1(n0Var, (TL_aicompose.AiComposeTone) obj);
                return;
            case 1:
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                n0Var.f37701s2.f23639b.add(0, aiComposeTone);
                n0Var.E1();
                new lc(n0Var.E2, n0Var.J0).p(aiComposeTone.emoji_id, org.telegram.messenger.gd.a0(null, null, 2131754956, aiComposeTone.title), org.telegram.messenger.gd.N0(2131754957, null)).j();
                return;
            case 2:
                TL_aicompose.AiComposeTone aiComposeTone2 = (TL_aicompose.AiComposeTone) obj;
                if (aiComposeTone2 instanceof TL_aicompose.TL_aiComposeTone) {
                    org.telegram.messenger.e eVar = n0Var.f37701s2;
                    TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone2;
                    ArrayList arrayList = eVar.f23639b;
                    while (true) {
                        if (i10 < arrayList.size()) {
                            if ((arrayList.get(i10) instanceof TL_aicompose.TL_aiComposeTone) && ((TL_aicompose.TL_aiComposeTone) arrayList.get(i10)).f28644id == tL_aiComposeTone.f28644id) {
                                arrayList.set(i10, tL_aiComposeTone);
                                eVar.c();
                            } else {
                                i10++;
                            }
                        }
                    }
                }
                n0Var.E1();
                return;
            default:
                n0.f1(n0Var, ((Integer) obj).intValue());
                return;
        }
    }
}
