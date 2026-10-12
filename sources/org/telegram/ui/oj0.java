package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class oj0 implements View.OnClickListener {
    public final int f40732a;
    public final tj0 f40733b;

    public oj0(tj0 tj0Var, int i10) {
        this.f40732a = i10;
        this.f40733b = tj0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40732a) {
            case 0:
                tj0 tj0Var = this.f40733b;
                sj0 sj0Var = tj0Var.f42229q0;
                HashSet hashSet = tj0Var.f42217d0;
                if (hashSet.size() != 0 && sj0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : tj0Var.f42222i0.values()) {
                        if (hashSet.contains(Long.valueOf(user.f19949id))) {
                            arrayList.add(Long.valueOf(user.f19949id));
                        }
                    }
                    sj0Var.a(arrayList);
                    tj0Var.dismiss();
                    return;
                }
                return;
            default:
                tj0 tj0Var2 = this.f40733b;
                tj0Var2.f42217d0.clear();
                tj0Var2.Y.d.b(true);
                tj0Var2.V(true, false);
                return;
        }
    }
}
