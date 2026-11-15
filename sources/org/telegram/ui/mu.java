package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
public final class mu implements org.telegram.ui.Components.gj0 {
    public final int f49316a;
    public final yw f49317b;

    public mu(yw ywVar, int i7) {
        this.f49316a = i7;
        this.f49317b = ywVar;
    }

    @Override
    public final void b(int i7, View view) {
        jg.o0 o0Var;
        switch (this.f49316a) {
            case 0:
                yw ywVar = this.f49317b;
                Object obj = ywVar.D0.f36069y0.G(i7).G;
                if (obj instanceof org.telegram.messenger.gj) {
                    org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) obj;
                    Bundle bundle = new Bundle();
                    if (org.telegram.messenger.gj.B0(gjVar.f23817k) >= 0) {
                        bundle.putLong("user_id", org.telegram.messenger.gj.B0(gjVar.f23817k));
                    } else {
                        bundle.putLong("chat_id", -org.telegram.messenger.gj.B0(gjVar.f23817k));
                    }
                    bundle.putInt("message_id", gjVar.e1());
                    an anVar = new an(bundle);
                    yw.p4(anVar, gjVar);
                    ywVar.presentFragment(anVar);
                    return;
                } else if (obj instanceof fi.d6) {
                    fi.d6 d6Var = (fi.d6) obj;
                    Bundle f10 = r.b.f(3, "type");
                    f10.putString("hashtag", d6Var.C);
                    f10.putInt("storiesCount", d6Var.J);
                    ywVar.presentFragment(new org.telegram.ui.Components.x80(f10, null));
                    return;
                } else {
                    return;
                }
            default:
                yw ywVar2 = this.f49317b;
                ywVar2.f53657c0.I0(true);
                ArrayList arrayList = ywVar2.f53657c0.f17244f3;
                if (arrayList.isEmpty()) {
                    o0Var = jg.q0.f17237k3[i7];
                } else {
                    o0Var = (jg.o0) arrayList.get(i7);
                }
                ywVar2.t3(o0Var);
                return;
        }
    }
}
