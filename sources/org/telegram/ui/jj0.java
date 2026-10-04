package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class jj0 implements View.OnClickListener {
    public final int f37709a;
    public final oj0 f37710b;

    public jj0(oj0 oj0Var, int i10) {
        this.f37709a = i10;
        this.f37710b = oj0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37709a) {
            case 0:
                oj0 oj0Var = this.f37710b;
                nj0 nj0Var = oj0Var.f39220q0;
                HashSet hashSet = oj0Var.f39208d0;
                if (hashSet.size() != 0 && nj0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : oj0Var.f39213i0.values()) {
                        if (hashSet.contains(Long.valueOf(user.f20184id))) {
                            arrayList.add(Long.valueOf(user.f20184id));
                        }
                    }
                    nj0Var.a(arrayList);
                    oj0Var.dismiss();
                    return;
                }
                return;
            default:
                oj0 oj0Var2 = this.f37710b;
                oj0Var2.f39208d0.clear();
                oj0Var2.Y.d.b(true);
                oj0Var2.S(true, false);
                return;
        }
    }
}
