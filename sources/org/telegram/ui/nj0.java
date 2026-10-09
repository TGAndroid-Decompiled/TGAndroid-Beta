package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class nj0 implements View.OnClickListener {
    public final int f40225a;
    public final sj0 f40226b;

    public nj0(sj0 sj0Var, int i10) {
        this.f40225a = i10;
        this.f40226b = sj0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40225a) {
            case 0:
                sj0 sj0Var = this.f40226b;
                rj0 rj0Var = sj0Var.f41724q0;
                HashSet hashSet = sj0Var.f41712d0;
                if (hashSet.size() != 0 && rj0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : sj0Var.f41717i0.values()) {
                        if (hashSet.contains(Long.valueOf(user.f20185id))) {
                            arrayList.add(Long.valueOf(user.f20185id));
                        }
                    }
                    rj0Var.a(arrayList);
                    sj0Var.dismiss();
                    return;
                }
                return;
            default:
                sj0 sj0Var2 = this.f40226b;
                sj0Var2.f41712d0.clear();
                sj0Var2.Y.d.b(true);
                sj0Var2.V(true, false);
                return;
        }
    }
}
