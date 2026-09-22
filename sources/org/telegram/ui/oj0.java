package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class oj0 implements View.OnClickListener {
    public final int f36350a;
    public final uj0 f36351b;

    public oj0(uj0 uj0Var, int i10) {
        this.f36350a = i10;
        this.f36351b = uj0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36350a) {
            case 0:
                uj0 uj0Var = this.f36351b;
                tj0 tj0Var = uj0Var.f38147q0;
                HashSet hashSet = uj0Var.f38135d0;
                if (hashSet.size() != 0 && tj0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : uj0Var.f38140i0.values()) {
                        if (hashSet.contains(Long.valueOf(user.f18490id))) {
                            arrayList.add(Long.valueOf(user.f18490id));
                        }
                    }
                    tj0Var.a(arrayList);
                    uj0Var.dismiss();
                    return;
                }
                return;
            default:
                uj0 uj0Var2 = this.f36351b;
                uj0Var2.f38135d0.clear();
                uj0Var2.Y.d.b(true);
                uj0Var2.U(true, false);
                return;
        }
    }
}
