package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
public final class mu implements org.telegram.ui.Components.oj0 {
    public final int f49972a;
    public final cx f49973b;

    public mu(cx cxVar, int i7) {
        this.f49972a = i7;
        this.f49973b = cxVar;
    }

    @Override
    public final void c(int i7, View view) {
        jg.o0 o0Var;
        switch (this.f49972a) {
            case 0:
                cx cxVar = this.f49973b;
                Object obj = cxVar.D0.f39204y0.G(i7).H;
                if (obj instanceof org.telegram.messenger.fj) {
                    org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) obj;
                    Bundle bundle = new Bundle();
                    if (org.telegram.messenger.fj.B0(fjVar.f23968k) >= 0) {
                        bundle.putLong("user_id", org.telegram.messenger.fj.B0(fjVar.f23968k));
                    } else {
                        bundle.putLong("chat_id", -org.telegram.messenger.fj.B0(fjVar.f23968k));
                    }
                    bundle.putInt("message_id", fjVar.e1());
                    bn bnVar = new bn(bundle);
                    cx.r4(bnVar, fjVar);
                    cxVar.presentFragment(bnVar);
                    return;
                } else if (obj instanceof fi.b6) {
                    fi.b6 b6Var = (fi.b6) obj;
                    Bundle f10 = p5.c.f(3, "type");
                    f10.putString("hashtag", b6Var.C);
                    f10.putInt("storiesCount", b6Var.J);
                    cxVar.presentFragment(new org.telegram.ui.Components.i90(f10, null));
                    return;
                } else {
                    return;
                }
            default:
                cx cxVar2 = this.f49973b;
                cxVar2.f46667c0.I0(true);
                ArrayList arrayList = cxVar2.f46667c0.f17630f3;
                if (arrayList.isEmpty()) {
                    o0Var = jg.q0.f17623k3[i7];
                } else {
                    o0Var = (jg.o0) arrayList.get(i7);
                }
                cxVar2.t3(o0Var);
                return;
        }
    }
}
