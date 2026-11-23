package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class qg0 implements View.OnClickListener {
    public final int f51214a;
    public final vg0 f51215b;

    public qg0(vg0 vg0Var, int i7) {
        this.f51214a = i7;
        this.f51215b = vg0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f51214a) {
            case 0:
                vg0 vg0Var = this.f51215b;
                ug0 ug0Var = vg0Var.f52809m2;
                HashSet hashSet = vg0Var.Z1;
                if (hashSet.size() != 0 && ug0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : vg0Var.f52801e2.values()) {
                        if (hashSet.contains(Long.valueOf(user.f28547id))) {
                            arrayList.add(Long.valueOf(user.f28547id));
                        }
                    }
                    ug0Var.a(arrayList);
                    vg0Var.dismiss();
                    return;
                }
                return;
            default:
                vg0 vg0Var2 = this.f51215b;
                vg0Var2.Z1.clear();
                vg0Var2.U1.d.b(true);
                vg0Var2.h1(true, false);
                return;
        }
    }
}
