package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class og0 implements View.OnClickListener {
    public final int f50683a;
    public final tg0 f50684b;

    public og0(tg0 tg0Var, int i7) {
        this.f50683a = i7;
        this.f50684b = tg0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f50683a) {
            case 0:
                tg0 tg0Var = this.f50684b;
                sg0 sg0Var = tg0Var.f52402m2;
                HashSet hashSet = tg0Var.Z1;
                if (hashSet.size() != 0 && sg0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : tg0Var.f52394e2.values()) {
                        if (hashSet.contains(Long.valueOf(user.f28641id))) {
                            arrayList.add(Long.valueOf(user.f28641id));
                        }
                    }
                    sg0Var.a(arrayList);
                    tg0Var.dismiss();
                    return;
                }
                return;
            default:
                tg0 tg0Var2 = this.f50684b;
                tg0Var2.Z1.clear();
                tg0Var2.U1.d.b(true);
                tg0Var2.h1(true, false);
                return;
        }
    }
}
