package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class og0 implements View.OnClickListener {
    public final int f48525a;
    public final tg0 f48526b;

    public og0(tg0 tg0Var, int i7) {
        this.f48525a = i7;
        this.f48526b = tg0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f48525a) {
            case 0:
                tg0 tg0Var = this.f48526b;
                sg0 sg0Var = tg0Var.f50276l2;
                HashSet hashSet = tg0Var.Y1;
                if (hashSet.size() != 0 && sg0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : tg0Var.d2.values()) {
                        if (hashSet.contains(Long.valueOf(user.f27109id))) {
                            arrayList.add(Long.valueOf(user.f27109id));
                        }
                    }
                    sg0Var.a(arrayList);
                    tg0Var.dismiss();
                    return;
                }
                return;
            default:
                tg0 tg0Var2 = this.f48526b;
                tg0Var2.Y1.clear();
                tg0Var2.T1.d.b(true);
                tg0Var2.g1(true, false);
                return;
        }
    }
}
