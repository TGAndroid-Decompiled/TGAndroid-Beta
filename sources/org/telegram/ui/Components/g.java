package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_aicompose;
public final class g implements org.telegram.messenger.u10 {
    public final int f33899a;
    public final e0 f33900b;

    public g(e0 e0Var, int i3) {
        this.f33899a = i3;
        this.f33900b = e0Var;
    }

    @Override
    public final void a(Object obj) {
        int i3 = this.f33899a;
        int i10 = 0;
        e0 e0Var = this.f33900b;
        switch (i3) {
            case 0:
                e0.f1(e0Var, (TL_aicompose.AiComposeTone) obj);
                return;
            case 1:
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                e0Var.f33246n2.f22272b.add(0, aiComposeTone);
                e0Var.x1();
                new fc(e0Var.f33258z2, e0Var.J0).p(aiComposeTone.emoji_id, org.telegram.messenger.bd.a0(null, null, 2131754956, aiComposeTone.title), org.telegram.messenger.bd.M0(2131754957, null)).j();
                return;
            case 2:
                TL_aicompose.AiComposeTone aiComposeTone2 = (TL_aicompose.AiComposeTone) obj;
                if (aiComposeTone2 instanceof TL_aicompose.TL_aiComposeTone) {
                    org.telegram.messenger.e eVar = e0Var.f33246n2;
                    TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone2;
                    ArrayList arrayList = eVar.f22272b;
                    while (true) {
                        if (i10 < arrayList.size()) {
                            if ((arrayList.get(i10) instanceof TL_aicompose.TL_aiComposeTone) && ((TL_aicompose.TL_aiComposeTone) arrayList.get(i10)).f27214id == tL_aiComposeTone.f27214id) {
                                arrayList.set(i10, tL_aiComposeTone);
                                eVar.c();
                            } else {
                                i10++;
                            }
                        }
                    }
                }
                e0Var.x1();
                return;
            default:
                e0.e1(e0Var, ((Integer) obj).intValue());
                return;
        }
    }
}
