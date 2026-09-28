package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class fj0 implements View.OnClickListener {
    public final int f33691a;
    public final kj0 f33692b;

    public fj0(kj0 kj0Var, int i10) {
        this.f33691a = i10;
        this.f33692b = kj0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f33691a) {
            case 0:
                kj0 kj0Var = this.f33692b;
                jj0 jj0Var = kj0Var.f35094q0;
                HashSet hashSet = kj0Var.f35082d0;
                if (hashSet.size() != 0 && jj0Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (TLRPC.User user : kj0Var.f35087i0.values()) {
                        if (hashSet.contains(Long.valueOf(user.f18482id))) {
                            arrayList.add(Long.valueOf(user.f18482id));
                        }
                    }
                    jj0Var.a(arrayList);
                    kj0Var.dismiss();
                    return;
                }
                return;
            default:
                kj0 kj0Var2 = this.f33692b;
                kj0Var2.f35082d0.clear();
                kj0Var2.Y.d.b(true);
                kj0Var2.U(true, false);
                return;
        }
    }
}
