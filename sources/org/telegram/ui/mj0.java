package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class mj0 implements View.OnClickListener {
    public final int f39993a;
    public final rj0 f39994b;

    public mj0(rj0 rj0Var, int i10) {
        this.f39993a = i10;
        this.f39994b = rj0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39993a) {
            case 0:
                rj0 rj0Var = this.f39994b;
                qj0 qj0Var = rj0Var.f41501q0;
                HashSet hashSet = rj0Var.f41489d0;
                if (hashSet.size() != 0 && qj0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : rj0Var.f41494i0.values()) {
                        if (hashSet.contains(Long.valueOf(user.f20215id))) {
                            arrayList.add(Long.valueOf(user.f20215id));
                        }
                    }
                    qj0Var.a(arrayList);
                    rj0Var.dismiss();
                    return;
                }
                return;
            default:
                rj0 rj0Var2 = this.f39994b;
                rj0Var2.f41489d0.clear();
                rj0Var2.Y.d.b(true);
                rj0Var2.V(true, false);
                return;
        }
    }
}
