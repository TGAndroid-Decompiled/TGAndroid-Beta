package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class oj0 implements View.OnClickListener {
    public final int f40734a;
    public final tj0 f40735b;

    public oj0(tj0 tj0Var, int i10) {
        this.f40734a = i10;
        this.f40735b = tj0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40734a) {
            case 0:
                tj0 tj0Var = this.f40735b;
                sj0 sj0Var = tj0Var.f42231q0;
                HashSet hashSet = tj0Var.f42219d0;
                if (hashSet.size() != 0 && sj0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : tj0Var.f42224i0.values()) {
                        if (hashSet.contains(Long.valueOf(user.f19950id))) {
                            arrayList.add(Long.valueOf(user.f19950id));
                        }
                    }
                    sj0Var.a(arrayList);
                    tj0Var.dismiss();
                    return;
                }
                return;
            default:
                tj0 tj0Var2 = this.f40735b;
                tj0Var2.f42219d0.clear();
                tj0Var2.Y.d.b(true);
                tj0Var2.V(true, false);
                return;
        }
    }
}
