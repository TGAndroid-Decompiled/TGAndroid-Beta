package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_aicompose;
public final class f implements org.telegram.messenger.z10 {
    public final int f34460a;
    public final d0 f34461b;

    public f(d0 d0Var, int i7) {
        this.f34460a = i7;
        this.f34461b = d0Var;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f34460a;
        int i10 = 0;
        d0 d0Var = this.f34461b;
        switch (i7) {
            case 0:
                d0.f1(d0Var, (TL_aicompose.AiComposeTone) obj);
                return;
            case 1:
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                d0Var.f33764q2.f23218b.add(0, aiComposeTone);
                d0Var.x1();
                new cc(d0Var.C2, d0Var.J0).p(aiComposeTone.emoji_id, org.telegram.messenger.hd.a0(null, null, 2131754956, aiComposeTone.title), org.telegram.messenger.hd.M0(2131754957, null)).j();
                return;
            case 2:
                TL_aicompose.AiComposeTone aiComposeTone2 = (TL_aicompose.AiComposeTone) obj;
                if (aiComposeTone2 instanceof TL_aicompose.TL_aiComposeTone) {
                    org.telegram.messenger.e eVar = d0Var.f33764q2;
                    TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone2;
                    ArrayList arrayList = eVar.f23218b;
                    while (true) {
                        if (i10 < arrayList.size()) {
                            if ((arrayList.get(i10) instanceof TL_aicompose.TL_aiComposeTone) && ((TL_aicompose.TL_aiComposeTone) arrayList.get(i10)).f28264id == tL_aiComposeTone.f28264id) {
                                arrayList.set(i10, tL_aiComposeTone);
                                eVar.c();
                            } else {
                                i10++;
                            }
                        }
                    }
                }
                d0Var.x1();
                return;
            default:
                d0.e1(d0Var, ((Integer) obj).intValue());
                return;
        }
    }
}
