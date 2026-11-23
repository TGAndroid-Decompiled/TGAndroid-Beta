package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
public final class lu implements org.telegram.ui.Components.qj0 {
    public final int f49842a;
    public final bx f49843b;

    public lu(bx bxVar, int i7) {
        this.f49842a = i7;
        this.f49843b = bxVar;
    }

    @Override
    public final void b(int i7, View view) {
        jg.o0 o0Var;
        switch (this.f49842a) {
            case 0:
                bx bxVar = this.f49843b;
                Object obj = bxVar.D0.f40104y0.G(i7).H;
                if (obj instanceof org.telegram.messenger.fj) {
                    org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) obj;
                    Bundle bundle = new Bundle();
                    if (org.telegram.messenger.fj.B0(fjVar.f24073k) >= 0) {
                        bundle.putLong("user_id", org.telegram.messenger.fj.B0(fjVar.f24073k));
                    } else {
                        bundle.putLong("chat_id", -org.telegram.messenger.fj.B0(fjVar.f24073k));
                    }
                    bundle.putInt("message_id", fjVar.e1());
                    bn bnVar = new bn(bundle);
                    bx.r4(bnVar, fjVar);
                    bxVar.presentFragment(bnVar);
                    return;
                } else if (obj instanceof fi.b6) {
                    fi.b6 b6Var = (fi.b6) obj;
                    Bundle f10 = p5.c.f(3, "type");
                    f10.putString("hashtag", b6Var.C);
                    f10.putInt("storiesCount", b6Var.J);
                    bxVar.presentFragment(new org.telegram.ui.Components.h90(f10, null));
                    return;
                } else {
                    return;
                }
            default:
                bx bxVar2 = this.f49843b;
                bxVar2.f46533c0.I0(true);
                ArrayList arrayList = bxVar2.f46533c0.f17723f3;
                if (arrayList.isEmpty()) {
                    o0Var = jg.q0.f17716k3[i7];
                } else {
                    o0Var = (jg.o0) arrayList.get(i7);
                }
                bxVar2.t3(o0Var);
                return;
        }
    }
}
