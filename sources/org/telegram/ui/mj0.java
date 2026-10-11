package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class mj0 implements View.OnClickListener {
    public final int f39959a;
    public final rj0 f39960b;

    public mj0(rj0 rj0Var, int i10) {
        this.f39959a = i10;
        this.f39960b = rj0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39959a) {
            case 0:
                rj0 rj0Var = this.f39960b;
                qj0 qj0Var = rj0Var.f41467q0;
                HashSet hashSet = rj0Var.f41455d0;
                if (hashSet.size() != 0 && qj0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : rj0Var.f41460i0.values()) {
                        if (hashSet.contains(Long.valueOf(user.f20179id))) {
                            arrayList.add(Long.valueOf(user.f20179id));
                        }
                    }
                    qj0Var.a(arrayList);
                    rj0Var.dismiss();
                    return;
                }
                return;
            default:
                rj0 rj0Var2 = this.f39960b;
                rj0Var2.f41455d0.clear();
                rj0Var2.Y.d.b(true);
                rj0Var2.V(true, false);
                return;
        }
    }
}
