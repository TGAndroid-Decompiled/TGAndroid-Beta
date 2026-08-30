package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class cj0 implements View.OnClickListener {
    public final int f33385a;
    public final hj0 f33386b;

    public cj0(hj0 hj0Var, int i10) {
        this.f33385a = i10;
        this.f33386b = hj0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f33385a) {
            case 0:
                hj0 hj0Var = this.f33386b;
                gj0 gj0Var = hj0Var.f34903n0;
                HashSet hashSet = hj0Var.f34891a0;
                if (hashSet.size() != 0 && gj0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : hj0Var.f34896f0.values()) {
                        if (hashSet.contains(Long.valueOf(user.f19331id))) {
                            arrayList.add(Long.valueOf(user.f19331id));
                        }
                    }
                    gj0Var.a(arrayList);
                    hj0Var.dismiss();
                    return;
                }
                return;
            default:
                hj0 hj0Var2 = this.f33386b;
                hj0Var2.f34891a0.clear();
                hj0Var2.V.d.b(true);
                hj0Var2.U(true, false);
                return;
        }
    }
}
