package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class lg0 implements View.OnClickListener {
    public final int f48992a;
    public final qg0 f48993b;

    public lg0(qg0 qg0Var, int i7) {
        this.f48992a = i7;
        this.f48993b = qg0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f48992a) {
            case 0:
                qg0 qg0Var = this.f48993b;
                pg0 pg0Var = qg0Var.f50618m2;
                HashSet hashSet = qg0Var.Z1;
                if (hashSet.size() != 0 && pg0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : qg0Var.f50610e2.values()) {
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
                qg0 qg0Var2 = this.f48993b;
                qg0Var2.Z1.clear();
                qg0Var2.U1.d.b(true);
                qg0Var2.g1(true, false);
                return;
        }
    }
}
