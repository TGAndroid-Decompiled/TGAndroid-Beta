package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class mj0 implements View.OnClickListener {
    public final int f34987a;
    public final sj0 f34988b;

    public mj0(sj0 sj0Var, int i10) {
        this.f34987a = i10;
        this.f34988b = sj0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f34987a) {
            case 0:
                sj0 sj0Var = this.f34988b;
                rj0 rj0Var = sj0Var.f36709q0;
                HashSet hashSet = sj0Var.f36697d0;
                if (hashSet.size() != 0 && rj0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : sj0Var.f36702i0.values()) {
                        if (hashSet.contains(Long.valueOf(user.f17342id))) {
                            arrayList.add(Long.valueOf(user.f17342id));
                        }
                    }
                    rj0Var.a(arrayList);
                    sj0Var.dismiss();
                    return;
                }
                return;
            default:
                sj0 sj0Var2 = this.f34988b;
                sj0Var2.f36697d0.clear();
                sj0Var2.Y.d.b(true);
                sj0Var2.U(true, false);
                return;
        }
    }
}
