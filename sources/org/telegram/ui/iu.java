package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
public final class iu implements org.telegram.ui.Components.fj0 {
    public final int f46421a;
    public final uw f46422b;

    public iu(uw uwVar, int i3) {
        this.f46421a = i3;
        this.f46422b = uwVar;
    }

    @Override
    public final void f(int i3, View view) {
        kg.l0 l0Var;
        switch (this.f46421a) {
            case 0:
                uw uwVar = this.f46422b;
                Object obj = uwVar.D0.f34770y0.G(i3).G;
                if (obj instanceof org.telegram.messenger.zi) {
                    org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) obj;
                    Bundle bundle = new Bundle();
                    if (org.telegram.messenger.zi.B0(ziVar.f26868k) >= 0) {
                        bundle.putLong("user_id", org.telegram.messenger.zi.B0(ziVar.f26868k));
                    } else {
                        bundle.putLong("chat_id", -org.telegram.messenger.zi.B0(ziVar.f26868k));
                    }
                    bundle.putInt("message_id", ziVar.f1());
                    wm wmVar = new wm(bundle);
                    uw.p4(wmVar, ziVar);
                    uwVar.presentFragment(wmVar);
                    return;
                } else if (obj instanceof ei.l6) {
                    ei.l6 l6Var = (ei.l6) obj;
                    Bundle k10 = org.telegram.ui.Cells.f1.k(3, "type");
                    k10.putString("hashtag", l6Var.C);
                    k10.putInt("storiesCount", l6Var.J);
                    uwVar.presentFragment(new org.telegram.ui.Components.r80(k10, null));
                    return;
                } else {
                    return;
                }
            default:
                uw uwVar2 = this.f46422b;
                uwVar2.f50214c0.I0(true);
                ArrayList arrayList = uwVar2.f50214c0.f17112f3;
                if (arrayList.isEmpty()) {
                    l0Var = kg.n0.f17105k3[i3];
                } else {
                    l0Var = (kg.l0) arrayList.get(i3);
                }
                uwVar2.t3(l0Var);
                return;
        }
    }
}
