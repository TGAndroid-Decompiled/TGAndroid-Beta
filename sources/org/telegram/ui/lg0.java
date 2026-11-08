package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class lg0 implements View.OnClickListener {
    public final int f47538a;
    public final qg0 f47539b;

    public lg0(qg0 qg0Var, int i7) {
        this.f47538a = i7;
        this.f47539b = qg0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f47538a) {
            case 0:
                qg0 qg0Var = this.f47539b;
                pg0 pg0Var = qg0Var.f49231i2;
                HashSet hashSet = qg0Var.V1;
                if (hashSet.size() != 0 && pg0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : qg0Var.f49224a2.values()) {
                        if (hashSet.contains(Long.valueOf(user.f27105id))) {
                            arrayList.add(Long.valueOf(user.f27105id));
                        }
                    }
                    pg0Var.a(arrayList);
                    qg0Var.dismiss();
                    return;
                }
                return;
            default:
                qg0 qg0Var2 = this.f47539b;
                qg0Var2.V1.clear();
                qg0Var2.Q1.d.b(true);
                qg0Var2.g1(true, false);
                return;
        }
    }
}
