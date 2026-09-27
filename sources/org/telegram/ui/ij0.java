package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class ij0 implements View.OnClickListener {
    public final int f34496a;
    public final nj0 f34497b;

    public ij0(nj0 nj0Var, int i10) {
        this.f34496a = i10;
        this.f34497b = nj0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f34496a) {
            case 0:
                nj0 nj0Var = this.f34497b;
                mj0 mj0Var = nj0Var.f36038q0;
                HashSet hashSet = nj0Var.f36026d0;
                if (hashSet.size() != 0 && mj0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : nj0Var.f36031i0.values()) {
                        if (hashSet.contains(Long.valueOf(user.f18476id))) {
                            arrayList.add(Long.valueOf(user.f18476id));
                        }
                    }
                    mj0Var.a(arrayList);
                    nj0Var.dismiss();
                    return;
                }
                return;
            default:
                nj0 nj0Var2 = this.f34497b;
                nj0Var2.f36026d0.clear();
                nj0Var2.Y.d.b(true);
                nj0Var2.U(true, false);
                return;
        }
    }
}
