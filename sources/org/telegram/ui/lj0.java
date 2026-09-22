package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class lj0 implements View.OnClickListener {
    public final int f35505a;
    public final rj0 f35506b;

    public lj0(rj0 rj0Var, int i10) {
        this.f35505a = i10;
        this.f35506b = rj0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35505a) {
            case 0:
                rj0 rj0Var = this.f35506b;
                qj0 qj0Var = rj0Var.f37159q0;
                HashSet hashSet = rj0Var.f37147d0;
                if (hashSet.size() != 0 && qj0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : rj0Var.f37152i0.values()) {
                        if (hashSet.contains(Long.valueOf(user.f18256id))) {
                            arrayList.add(Long.valueOf(user.f18256id));
                        }
                    }
                    qj0Var.a(arrayList);
                    rj0Var.dismiss();
                    return;
                }
                return;
            default:
                rj0 rj0Var2 = this.f35506b;
                rj0Var2.f37147d0.clear();
                rj0Var2.Y.d.b(true);
                rj0Var2.U(true, false);
                return;
        }
    }
}
