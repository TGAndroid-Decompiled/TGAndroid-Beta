package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class gj0 implements View.OnClickListener {
    public final int f33955a;
    public final lj0 f33956b;

    public gj0(lj0 lj0Var, int i10) {
        this.f33955a = i10;
        this.f33956b = lj0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f33955a) {
            case 0:
                lj0 lj0Var = this.f33956b;
                kj0 kj0Var = lj0Var.f35378q0;
                HashSet hashSet = lj0Var.f35366d0;
                if (hashSet.size() != 0 && kj0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : lj0Var.f35371i0.values()) {
                        if (hashSet.contains(Long.valueOf(user.f18484id))) {
                            arrayList.add(Long.valueOf(user.f18484id));
                        }
                    }
                    kj0Var.a(arrayList);
                    lj0Var.dismiss();
                    return;
                }
                return;
            default:
                lj0 lj0Var2 = this.f33956b;
                lj0Var2.f35366d0.clear();
                lj0Var2.Y.d.b(true);
                lj0Var2.U(true, false);
                return;
        }
    }
}
