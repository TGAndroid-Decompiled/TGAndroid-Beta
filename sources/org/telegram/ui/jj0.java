package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class jj0 implements View.OnClickListener {
    public final int f37710a;
    public final oj0 f37711b;

    public jj0(oj0 oj0Var, int i10) {
        this.f37710a = i10;
        this.f37711b = oj0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37710a) {
            case 0:
                oj0 oj0Var = this.f37711b;
                nj0 nj0Var = oj0Var.f39221q0;
                HashSet hashSet = oj0Var.f39209d0;
                if (hashSet.size() != 0 && nj0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : oj0Var.f39214i0.values()) {
                        if (hashSet.contains(Long.valueOf(user.f20185id))) {
                            arrayList.add(Long.valueOf(user.f20185id));
                        }
                    }
                    nj0Var.a(arrayList);
                    oj0Var.dismiss();
                    return;
                }
                return;
            default:
                oj0 oj0Var2 = this.f37711b;
                oj0Var2.f39209d0.clear();
                oj0Var2.Y.d.b(true);
                oj0Var2.S(true, false);
                return;
        }
    }
}
