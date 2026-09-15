package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class lj0 implements View.OnClickListener {
    public final int f35522a;
    public final rj0 f35523b;

    public lj0(rj0 rj0Var, int i10) {
        this.f35522a = i10;
        this.f35523b = rj0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35522a) {
            case 0:
                rj0 rj0Var = this.f35523b;
                qj0 qj0Var = rj0Var.f37141q0;
                HashSet hashSet = rj0Var.f37129d0;
                if (hashSet.size() != 0 && qj0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : rj0Var.f37134i0.values()) {
                        if (hashSet.contains(Long.valueOf(user.f18259id))) {
                            arrayList.add(Long.valueOf(user.f18259id));
                        }
                    }
                    qj0Var.a(arrayList);
                    rj0Var.dismiss();
                    return;
                }
                return;
            default:
                rj0 rj0Var2 = this.f35523b;
                rj0Var2.f37129d0.clear();
                rj0Var2.Y.d.b(true);
                rj0Var2.U(true, false);
                return;
        }
    }
}
