package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class qg0 implements View.OnClickListener {
    public final int f51223a;
    public final vg0 f51224b;

    public qg0(vg0 vg0Var, int i7) {
        this.f51223a = i7;
        this.f51224b = vg0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f51223a) {
            case 0:
                vg0 vg0Var = this.f51224b;
                ug0 ug0Var = vg0Var.f52783m2;
                HashSet hashSet = vg0Var.Z1;
                if (hashSet.size() != 0 && ug0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : vg0Var.f52775e2.values()) {
                        if (hashSet.contains(Long.valueOf(user.f28552id))) {
                            arrayList.add(Long.valueOf(user.f28552id));
                        }
                    }
                    ug0Var.a(arrayList);
                    vg0Var.dismiss();
                    return;
                }
                return;
            default:
                vg0 vg0Var2 = this.f51224b;
                vg0Var2.Z1.clear();
                vg0Var2.U1.d.b(true);
                vg0Var2.h1(true, false);
                return;
        }
    }
}
