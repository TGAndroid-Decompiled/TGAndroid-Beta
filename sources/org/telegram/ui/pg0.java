package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class pg0 implements View.OnClickListener {
    public final int f50910a;
    public final ug0 f50911b;

    public pg0(ug0 ug0Var, int i7) {
        this.f50910a = i7;
        this.f50911b = ug0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f50910a) {
            case 0:
                ug0 ug0Var = this.f50911b;
                tg0 tg0Var = ug0Var.f52563m2;
                HashSet hashSet = ug0Var.Z1;
                if (hashSet.size() != 0 && tg0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : ug0Var.f52555e2.values()) {
                        if (hashSet.contains(Long.valueOf(user.f28554id))) {
                            arrayList.add(Long.valueOf(user.f28554id));
                        }
                    }
                    tg0Var.a(arrayList);
                    ug0Var.dismiss();
                    return;
                }
                return;
            default:
                ug0 ug0Var2 = this.f50911b;
                ug0Var2.Z1.clear();
                ug0Var2.U1.d.b(true);
                ug0Var2.h1(true, false);
                return;
        }
    }
}
