package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class nj0 implements View.OnClickListener {
    public final int f38995a;
    public final tj0 f38996b;

    public nj0(tj0 tj0Var, int i10) {
        this.f38995a = i10;
        this.f38996b = tj0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38995a) {
            case 0:
                tj0 tj0Var = this.f38996b;
                sj0 sj0Var = tj0Var.f40810q0;
                HashSet hashSet = tj0Var.f40798d0;
                if (hashSet.size() != 0 && sj0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : tj0Var.f40803i0.values()) {
                        if (hashSet.contains(Long.valueOf(user.f20043id))) {
                            arrayList.add(Long.valueOf(user.f20043id));
                        }
                    }
                    sj0Var.a(arrayList);
                    tj0Var.dismiss();
                    return;
                }
                return;
            default:
                tj0 tj0Var2 = this.f38996b;
                tj0Var2.f40798d0.clear();
                tj0Var2.Y.d.b(true);
                tj0Var2.U(true, false);
                return;
        }
    }
}
