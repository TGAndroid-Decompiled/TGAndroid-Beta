package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
public final class ku implements org.telegram.ui.Components.bj0 {
    public final int f47318a;
    public final ww f47319b;

    public ku(ww wwVar, int i7) {
        this.f47318a = i7;
        this.f47319b = wwVar;
    }

    @Override
    public final void c(int i7, View view) {
        jg.o0 o0Var;
        switch (this.f47318a) {
            case 0:
                ww wwVar = this.f47319b;
                Object obj = wwVar.C0.f33617x0.G(i7).G;
                if (obj instanceof org.telegram.messenger.ij) {
                    org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) obj;
                    Bundle bundle = new Bundle();
                    if (org.telegram.messenger.ij.B0(ijVar.f23262k) >= 0) {
                        bundle.putLong("user_id", org.telegram.messenger.ij.B0(ijVar.f23262k));
                    } else {
                        bundle.putLong("chat_id", -org.telegram.messenger.ij.B0(ijVar.f23262k));
                    }
                    bundle.putInt("message_id", ijVar.f1());
                    an anVar = new an(bundle);
                    ww.p4(anVar, ijVar);
                    wwVar.presentFragment(anVar);
                    return;
                } else if (obj instanceof di.k6) {
                    di.k6 k6Var = (di.k6) obj;
                    Bundle f10 = rf.b.f(3, "type");
                    f10.putString("hashtag", k6Var.C);
                    f10.putInt("storiesCount", k6Var.J);
                    wwVar.presentFragment(new org.telegram.ui.Components.u80(f10, null));
                    return;
                } else {
                    return;
                }
            default:
                ww wwVar2 = this.f47319b;
                wwVar2.f51540b0.I0(true);
                ArrayList arrayList = wwVar2.f51540b0.f16891e3;
                if (arrayList.isEmpty()) {
                    o0Var = jg.q0.j3[i7];
                } else {
                    o0Var = (jg.o0) arrayList.get(i7);
                }
                wwVar2.t3(o0Var);
                return;
        }
    }
}
