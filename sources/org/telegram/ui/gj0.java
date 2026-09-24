package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class gj0 implements View.OnClickListener {
    public final int f33939a;
    public final lj0 f33940b;

    public gj0(lj0 lj0Var, int i10) {
        this.f33939a = i10;
        this.f33940b = lj0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f33939a) {
            case 0:
                lj0 lj0Var = this.f33940b;
                kj0 kj0Var = lj0Var.f35363q0;
                HashSet hashSet = lj0Var.f35351d0;
                if (hashSet.size() != 0 && kj0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : lj0Var.f35356i0.values()) {
                        if (hashSet.contains(Long.valueOf(user.f18468id))) {
                            arrayList.add(Long.valueOf(user.f18468id));
                        }
                    }
                    kj0Var.a(arrayList);
                    lj0Var.dismiss();
                    return;
                }
                return;
            default:
                lj0 lj0Var2 = this.f33940b;
                lj0Var2.f35351d0.clear();
                lj0Var2.Y.d.b(true);
                lj0Var2.U(true, false);
                return;
        }
    }
}
