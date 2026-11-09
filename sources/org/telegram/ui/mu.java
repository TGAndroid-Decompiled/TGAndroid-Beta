package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
public final class mu implements org.telegram.ui.Components.cj0 {
    public final int f48002a;
    public final yw f48003b;

    public mu(yw ywVar, int i7) {
        this.f48002a = i7;
        this.f48003b = ywVar;
    }

    @Override
    public final void c(int i7, View view) {
        jg.o0 o0Var;
        switch (this.f48002a) {
            case 0:
                yw ywVar = this.f48003b;
                Object obj = ywVar.C0.f34014x0.G(i7).G;
                if (obj instanceof org.telegram.messenger.ij) {
                    org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) obj;
                    Bundle bundle = new Bundle();
                    if (org.telegram.messenger.ij.B0(ijVar.f23262k) >= 0) {
                        bundle.putLong("user_id", org.telegram.messenger.ij.B0(ijVar.f23262k));
                    } else {
                        bundle.putLong("chat_id", -org.telegram.messenger.ij.B0(ijVar.f23262k));
                    }
                    bundle.putInt("message_id", ijVar.e1());
                    cn cnVar = new cn(bundle);
                    yw.p4(cnVar, ijVar);
                    ywVar.presentFragment(cnVar);
                    return;
                } else if (obj instanceof di.l6) {
                    di.l6 l6Var = (di.l6) obj;
                    Bundle f10 = rf.b.f(3, "type");
                    f10.putString("hashtag", l6Var.C);
                    f10.putInt("storiesCount", l6Var.J);
                    ywVar.presentFragment(new org.telegram.ui.Components.v80(f10, null));
                    return;
                } else {
                    return;
                }
            default:
                yw ywVar2 = this.f48003b;
                ywVar2.f52215b0.I0(true);
                ArrayList arrayList = ywVar2.f52215b0.f16891e3;
                if (arrayList.isEmpty()) {
                    o0Var = jg.q0.j3[i7];
                } else {
                    o0Var = (jg.o0) arrayList.get(i7);
                }
                ywVar2.t3(o0Var);
                return;
        }
    }
}
