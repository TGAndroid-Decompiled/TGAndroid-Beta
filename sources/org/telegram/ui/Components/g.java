package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_aicompose;
public final class g implements org.telegram.messenger.c20 {
    public final int f33805a;
    public final g0 f33806b;

    public g(g0 g0Var, int i7) {
        this.f33805a = i7;
        this.f33806b = g0Var;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f33805a;
        int i10 = 0;
        g0 g0Var = this.f33806b;
        switch (i7) {
            case 0:
                g0.f1(g0Var, (TL_aicompose.AiComposeTone) obj);
                return;
            case 1:
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                g0Var.f33818m2.f22155b.add(0, aiComposeTone);
                g0Var.x1();
                new hc(g0Var.f33830y2, g0Var.I0).p(aiComposeTone.emoji_id, org.telegram.messenger.id.a0(null, null, 2131754956, aiComposeTone.title), org.telegram.messenger.id.M0(2131754957, null)).j();
                return;
            case 2:
                TL_aicompose.AiComposeTone aiComposeTone2 = (TL_aicompose.AiComposeTone) obj;
                if (aiComposeTone2 instanceof TL_aicompose.TL_aiComposeTone) {
                    org.telegram.messenger.e eVar = g0Var.f33818m2;
                    TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone2;
                    ArrayList arrayList = eVar.f22155b;
                    while (true) {
                        if (i10 < arrayList.size()) {
                            if ((arrayList.get(i10) instanceof TL_aicompose.TL_aiComposeTone) && ((TL_aicompose.TL_aiComposeTone) arrayList.get(i10)).f27169id == tL_aiComposeTone.f27169id) {
                                arrayList.set(i10, tL_aiComposeTone);
                                eVar.c();
                            } else {
                                i10++;
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
