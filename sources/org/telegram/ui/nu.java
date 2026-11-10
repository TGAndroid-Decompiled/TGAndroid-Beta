package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
public final class nu implements org.telegram.ui.Components.bj0 {
    public final int f48299a;
    public final zw f48300b;

    public nu(zw zwVar, int i7) {
        this.f48299a = i7;
        this.f48300b = zwVar;
    }

    @Override
    public final void c(int i7, View view) {
        jg.o0 o0Var;
        switch (this.f48299a) {
            case 0:
                zw zwVar = this.f48300b;
                Object obj = zwVar.C0.f33609x0.G(i7).G;
                if (obj instanceof org.telegram.messenger.ij) {
                    org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) obj;
                    Bundle bundle = new Bundle();
                    if (org.telegram.messenger.ij.B0(ijVar.f23266k) >= 0) {
                        bundle.putLong("user_id", org.telegram.messenger.ij.B0(ijVar.f23266k));
                    } else {
                        bundle.putLong("chat_id", -org.telegram.messenger.ij.B0(ijVar.f23266k));
                    }
                    bundle.putInt("message_id", ijVar.e1());
                    cn cnVar = new cn(bundle);
                    zw.p4(cnVar, ijVar);
                    zwVar.presentFragment(cnVar);
                    return;
                } else if (obj instanceof di.l6) {
                    di.l6 l6Var = (di.l6) obj;
                    Bundle f10 = rf.b.f(3, "type");
                    f10.putString("hashtag", l6Var.C);
                    f10.putInt("storiesCount", l6Var.J);
                    zwVar.presentFragment(new org.telegram.ui.Components.v80(f10, null));
                    return;
                } else {
                    return;
                }
            default:
                zw zwVar2 = this.f48300b;
                zwVar2.f52561b0.I0(true);
                ArrayList arrayList = zwVar2.f52561b0.f16891e3;
                if (arrayList.isEmpty()) {
                    o0Var = jg.q0.j3[i7];
                } else {
                    o0Var = (jg.o0) arrayList.get(i7);
                }
                zwVar2.t3(o0Var);
                return;
        }
    }
}
