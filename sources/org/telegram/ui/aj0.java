package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class aj0 implements View.OnClickListener {
    public final int f35690a;
    public final fj0 f35691b;

    public aj0(fj0 fj0Var, int i10) {
        this.f35690a = i10;
        this.f35691b = fj0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35690a) {
            case 0:
                fj0 fj0Var = this.f35691b;
                ej0 ej0Var = fj0Var.f37360q0;
                HashSet hashSet = fj0Var.f37348d0;
                if (hashSet.size() != 0 && ej0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : fj0Var.f37353i0.values()) {
                        if (hashSet.contains(Long.valueOf(user.f20490id))) {
                            arrayList.add(Long.valueOf(user.f20490id));
                        }
                    }
                    ej0Var.a(arrayList);
                    fj0Var.dismiss();
                    return;
                }
                return;
            default:
                fj0 fj0Var2 = this.f35691b;
                fj0Var2.f37348d0.clear();
                fj0Var2.Y.d.b(true);
                fj0Var2.U(true, false);
                return;
        }
    }
}
