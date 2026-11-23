package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
public final class mu implements org.telegram.ui.Components.qj0 {
    public final int f49964a;
    public final cx f49965b;

    public mu(cx cxVar, int i7) {
        this.f49964a = i7;
        this.f49965b = cxVar;
    }

    @Override
    public final void c(int i7, View view) {
        jg.o0 o0Var;
        switch (this.f49964a) {
            case 0:
                cx cxVar = this.f49965b;
                Object obj = cxVar.D0.f39924y0.G(i7).H;
                if (obj instanceof org.telegram.messenger.gj) {
                    org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) obj;
                    Bundle bundle = new Bundle();
                    if (org.telegram.messenger.gj.B0(gjVar.f24177k) >= 0) {
                        bundle.putLong("user_id", org.telegram.messenger.gj.B0(gjVar.f24177k));
                    } else {
                        bundle.putLong("chat_id", -org.telegram.messenger.gj.B0(gjVar.f24177k));
                    }
                    bundle.putInt("message_id", gjVar.e1());
                    bn bnVar = new bn(bundle);
                    cx.r4(bnVar, gjVar);
                    cxVar.presentFragment(bnVar);
                    return;
                } else if (obj instanceof fi.b6) {
                    fi.b6 b6Var = (fi.b6) obj;
                    Bundle f10 = p5.c.f(3, "type");
                    f10.putString("hashtag", b6Var.C);
                    f10.putInt("storiesCount", b6Var.J);
                    cxVar.presentFragment(new org.telegram.ui.Components.k90(f10, null));
                    return;
                } else {
                    return;
                }
            default:
                cx cxVar2 = this.f49965b;
                cxVar2.f46667c0.I0(true);
                ArrayList arrayList = cxVar2.f46667c0.f17621f3;
                if (arrayList.isEmpty()) {
                    o0Var = jg.q0.f17614k3[i7];
                } else {
                    o0Var = (jg.o0) arrayList.get(i7);
                }
                cxVar2.t3(o0Var);
                return;
        }
    }
}
