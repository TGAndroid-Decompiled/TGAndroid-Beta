package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class ej0 implements View.OnClickListener {
    public final int f33822a;
    public final jj0 f33823b;

    public ej0(jj0 jj0Var, int i10) {
        this.f33822a = i10;
        this.f33823b = jj0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f33822a) {
            case 0:
                jj0 jj0Var = this.f33823b;
                ij0 ij0Var = jj0Var.f35310n0;
                HashSet hashSet = jj0Var.f35298a0;
                if (hashSet.size() != 0 && ij0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : jj0Var.f35303f0.values()) {
                        if (hashSet.contains(Long.valueOf(user.f19306id))) {
                            arrayList.add(Long.valueOf(user.f19306id));
                        }
                    }
                    ij0Var.a(arrayList);
                    jj0Var.dismiss();
                    return;
                }
                return;
            default:
                jj0 jj0Var2 = this.f33823b;
                jj0Var2.f35298a0.clear();
                jj0Var2.V.d.b(true);
                jj0Var2.U(true, false);
                return;
        }
    }
}
