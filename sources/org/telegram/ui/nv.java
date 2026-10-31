package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
public final class nv implements org.telegram.ui.Components.gk0 {
    public final int f40055a;
    public final ay f40056b;

    public nv(ay ayVar, int i10) {
        this.f40055a = i10;
        this.f40056b = ayVar;
    }

    @Override
    public final void f(int i10, View view) {
        zf.e0 e0Var;
        switch (this.f40055a) {
            case 0:
                ay ayVar = this.f40056b;
                Object obj = ayVar.C0.f26470x0.G(i10).G;
                if (obj instanceof org.telegram.messenger.jj) {
                    org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) obj;
                    Bundle bundle = new Bundle();
                    if (org.telegram.messenger.jj.B0(jjVar.f16337k) >= 0) {
                        bundle.putLong("user_id", org.telegram.messenger.jj.B0(jjVar.f16337k));
                    } else {
                        bundle.putLong("chat_id", -org.telegram.messenger.jj.B0(jjVar.f16337k));
                    }
                    bundle.putInt("message_id", jjVar.f1());
                    un unVar = new un(bundle);
                    ay.o4(unVar, jjVar);
                    ayVar.presentFragment(unVar);
                    return;
                } else if (obj instanceof th.r4) {
                    th.r4 r4Var = (th.r4) obj;
                    Bundle i11 = org.telegram.ui.Cells.f1.i(3, "type");
                    i11.putString("hashtag", r4Var.C);
                    i11.putInt("storiesCount", r4Var.J);
                    ayVar.presentFragment(new org.telegram.ui.Components.n90(i11, null));
                    return;
                } else {
                    return;
                }
            default:
                ay ayVar2 = this.f40056b;
                ayVar2.f35778b0.I0(true);
                ArrayList arrayList = ayVar2.f35778b0.f55500e3;
                if (arrayList.isEmpty()) {
                    e0Var = zf.g0.f55493j3[i10];
                } else {
                    e0Var = (zf.e0) arrayList.get(i10);
                }
                ayVar2.s3(e0Var);
                return;
        }
    }
}
