package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_aicompose;
public final class f implements org.telegram.messenger.c20 {
    public final int f33403a;
    public final f0 f33404b;

    public f(f0 f0Var, int i7) {
        this.f33403a = i7;
        this.f33404b = f0Var;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f33403a;
        int i10 = 0;
        f0 f0Var = this.f33404b;
        switch (i7) {
            case 0:
                f0.f1(f0Var, (TL_aicompose.AiComposeTone) obj);
                return;
            case 1:
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                f0Var.f33419p2.f22159b.add(0, aiComposeTone);
                f0Var.x1();
                new gc(f0Var.B2, f0Var.I0).p(aiComposeTone.emoji_id, org.telegram.messenger.id.a0(null, null, 2131754956, aiComposeTone.title), org.telegram.messenger.id.M0(2131754957, null)).j();
                return;
            case 2:
                TL_aicompose.AiComposeTone aiComposeTone2 = (TL_aicompose.AiComposeTone) obj;
                if (aiComposeTone2 instanceof TL_aicompose.TL_aiComposeTone) {
                    org.telegram.messenger.e eVar = f0Var.f33419p2;
                    TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone2;
                    ArrayList arrayList = eVar.f22159b;
                    while (true) {
                        if (i10 < arrayList.size()) {
                            if ((arrayList.get(i10) instanceof TL_aicompose.TL_aiComposeTone) && ((TL_aicompose.TL_aiComposeTone) arrayList.get(i10)).f27173id == tL_aiComposeTone.f27173id) {
                                arrayList.set(i10, tL_aiComposeTone);
                                eVar.c();
                            } else {
                                i10++;
                            }
                        }
                    }
                }
                f0Var.x1();
                return;
            default:
                f0.e1(f0Var, ((Integer) obj).intValue());
                return;
        }
    }
}
