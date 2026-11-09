package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class ng0 implements View.OnClickListener {
    public final int f48188a;
    public final sg0 f48189b;

    public ng0(sg0 sg0Var, int i7) {
        this.f48188a = i7;
        this.f48189b = sg0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f48188a) {
            case 0:
                sg0 sg0Var = this.f48189b;
                rg0 rg0Var = sg0Var.f49909i2;
                HashSet hashSet = sg0Var.V1;
                if (hashSet.size() != 0 && rg0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : sg0Var.f49902a2.values()) {
                        if (hashSet.contains(Long.valueOf(user.f27105id))) {
                            arrayList.add(Long.valueOf(user.f27105id));
                        }
                    }
                    rg0Var.a(arrayList);
                    sg0Var.dismiss();
                    return;
                }
                return;
            default:
                sg0 sg0Var2 = this.f48189b;
                sg0Var2.V1.clear();
                sg0Var2.Q1.d.b(true);
                sg0Var2.g1(true, false);
                return;
        }
    }
}
