package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_aicompose;
public final class f implements org.telegram.messenger.x10 {
    public final int f34854a;
    public final m0 f34855b;

    public f(m0 m0Var, int i7) {
        this.f34854a = i7;
        this.f34855b = m0Var;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f34854a;
        int i10 = 0;
        m0 m0Var = this.f34855b;
        switch (i7) {
            case 0:
                m0.g1(m0Var, (TL_aicompose.AiComposeTone) obj);
                return;
            case 1:
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                m0Var.f37298s2.f23611b.add(0, aiComposeTone);
                m0Var.E1();
                new lc(m0Var.E2, m0Var.J0).p(aiComposeTone.emoji_id, org.telegram.messenger.gd.a0(null, null, 2131754956, aiComposeTone.title), org.telegram.messenger.gd.M0(2131754957, null)).j();
                return;
            case 2:
                TL_aicompose.AiComposeTone aiComposeTone2 = (TL_aicompose.AiComposeTone) obj;
                if (aiComposeTone2 instanceof TL_aicompose.TL_aiComposeTone) {
                    org.telegram.messenger.e eVar = m0Var.f37298s2;
                    TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone2;
                    ArrayList arrayList = eVar.f23611b;
                    while (true) {
                        if (i10 < arrayList.size()) {
                            if ((arrayList.get(i10) instanceof TL_aicompose.TL_aiComposeTone) && ((TL_aicompose.TL_aiComposeTone) arrayList.get(i10)).f28616id == tL_aiComposeTone.f28616id) {
                                arrayList.set(i10, tL_aiComposeTone);
                                eVar.c();
                            } else {
                                i10++;
                            }
                        }
                    }
                }
                m0Var.E1();
                return;
            default:
                m0.f1(m0Var, ((Integer) obj).intValue());
                return;
        }
    }
}
