package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class mj0 implements View.OnClickListener {
    public final int f35682a;
    public final sj0 f35683b;

    public mj0(sj0 sj0Var, int i10) {
        this.f35682a = i10;
        this.f35683b = sj0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35682a) {
            case 0:
                sj0 sj0Var = this.f35683b;
                rj0 rj0Var = sj0Var.f37360q0;
                HashSet hashSet = sj0Var.f37348d0;
                if (hashSet.size() != 0 && rj0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : sj0Var.f37353i0.values()) {
                        if (hashSet.contains(Long.valueOf(user.f18443id))) {
                            arrayList.add(Long.valueOf(user.f18443id));
                        }
                    }
                    rj0Var.a(arrayList);
                    sj0Var.dismiss();
                    return;
                }
                return;
            default:
                sj0 sj0Var2 = this.f35683b;
                sj0Var2.f37348d0.clear();
                sj0Var2.Y.d.b(true);
                sj0Var2.U(true, false);
                return;
        }
    }
}
