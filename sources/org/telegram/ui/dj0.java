package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class dj0 implements View.OnClickListener {
    public final int f36255a;
    public final ij0 f36256b;

    public dj0(ij0 ij0Var, int i10) {
        this.f36255a = i10;
        this.f36256b = ij0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36255a) {
            case 0:
                ij0 ij0Var = this.f36256b;
                hj0 hj0Var = ij0Var.f37882n0;
                HashSet hashSet = ij0Var.f37870a0;
                if (hashSet.size() != 0 && hj0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : ij0Var.f37875f0.values()) {
                        if (hashSet.contains(Long.valueOf(user.f20990id))) {
                            arrayList.add(Long.valueOf(user.f20990id));
                        }
                    }
                    hj0Var.a(arrayList);
                    ij0Var.dismiss();
                    return;
                }
                return;
            default:
                ij0 ij0Var2 = this.f36256b;
                ij0Var2.f37870a0.clear();
                ij0Var2.V.d.b(true);
                ij0Var2.U(true, false);
                return;
        }
    }
}
