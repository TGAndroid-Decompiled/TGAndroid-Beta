package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
public final class mv implements org.telegram.ui.Components.hk0 {
    public final int f39619a;
    public final zx f39620b;

    public mv(zx zxVar, int i10) {
        this.f39619a = i10;
        this.f39620b = zxVar;
    }

    @Override
    public final void f(int i10, View view) {
        zf.e0 e0Var;
        switch (this.f39619a) {
            case 0:
                zx zxVar = this.f39620b;
                Object obj = zxVar.C0.f26891x0.G(i10).G;
                if (obj instanceof org.telegram.messenger.kj) {
                    org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) obj;
                    Bundle bundle = new Bundle();
                    if (org.telegram.messenger.kj.B0(kjVar.f16690k) >= 0) {
                        bundle.putLong("user_id", org.telegram.messenger.kj.B0(kjVar.f16690k));
                    } else {
                        bundle.putLong("chat_id", -org.telegram.messenger.kj.B0(kjVar.f16690k));
                    }
                    bundle.putInt("message_id", kjVar.f1());
                    un unVar = new un(bundle);
                    zx.p4(unVar, kjVar);
                    zxVar.presentFragment(unVar);
                    return;
                } else if (obj instanceof th.r4) {
                    th.r4 r4Var = (th.r4) obj;
                    Bundle i11 = org.telegram.ui.Cells.f1.i(3, "type");
                    i11.putString("hashtag", r4Var.C);
                    i11.putInt("storiesCount", r4Var.J);
                    zxVar.presentFragment(new org.telegram.ui.Components.n90(i11, null));
                    return;
                } else {
                    return;
                }
            default:
                zx zxVar2 = this.f39620b;
                zxVar2.f44121b0.I0(true);
                ArrayList arrayList = zxVar2.f44121b0.f55518e3;
                if (arrayList.isEmpty()) {
                    e0Var = zf.g0.f55511j3[i10];
                } else {
                    e0Var = (zf.e0) arrayList.get(i10);
                }
                zxVar2.t3(e0Var);
                return;
        }
    }
}
