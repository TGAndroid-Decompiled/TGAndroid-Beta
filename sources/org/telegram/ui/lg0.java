package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class lg0 implements View.OnClickListener {
    public final int f48988a;
    public final qg0 f48989b;

    public lg0(qg0 qg0Var, int i7) {
        this.f48988a = i7;
        this.f48989b = qg0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f48988a) {
            case 0:
                qg0 qg0Var = this.f48989b;
                pg0 pg0Var = qg0Var.f50609m2;
                HashSet hashSet = qg0Var.Z1;
                if (hashSet.size() != 0 && pg0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : qg0Var.f50601e2.values()) {
                        if (hashSet.contains(Long.valueOf(user.f28200id))) {
                            arrayList.add(Long.valueOf(user.f28200id));
                        }
                    }
                    pg0Var.a(arrayList);
                    qg0Var.dismiss();
                    return;
                }
                return;
            default:
                qg0 qg0Var2 = this.f48989b;
                qg0Var2.Z1.clear();
                qg0Var2.U1.d.b(true);
                qg0Var2.g1(true, false);
                return;
        }
    }
}
