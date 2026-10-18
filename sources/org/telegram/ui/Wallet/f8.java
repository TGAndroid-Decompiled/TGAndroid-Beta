package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.xc;
public final class f8 implements Utilities.Callback2 {
    public final int f34247a;
    public final n8 f34248b;
    public final pf.c f34249c;
    public final m0 d;

    public f8(n8 n8Var, pf.c cVar, m0 m0Var, int i10) {
        this.f34247a = i10;
        this.f34248b = n8Var;
        this.f34249c = cVar;
        this.d = m0Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f34247a) {
            case 0:
                j0 j0Var = (j0) obj;
                String str = (String) obj2;
                this.f34249c.c(false);
                n8 n8Var = this.f34248b;
                if (j0Var == null) {
                    xc a02 = xc.a0(n8Var);
                    if (str == null) {
                        str = "NULL_ERROR";
                    }
                    a02.e0(str, false);
                    return;
                }
                v8 v8Var = new v8();
                v8Var.h = true;
                ArrayList arrayList = v8Var.f35007a;
                arrayList.clear();
                if (!j0Var.e()) {
                    arrayList.addAll(j0Var.g());
                }
                v8Var.V();
                v8Var.f35010f = new u3(14, n8Var, this.d);
                n8Var.presentFragment(v8Var);
                return;
            default:
                h0 h0Var = (h0) obj;
                String str2 = (String) obj2;
                this.f34249c.c(false);
                n8 n8Var2 = this.f34248b;
                if (h0Var == null) {
                    xc a03 = xc.a0(n8Var2);
                    if (str2 == null) {
                        str2 = "NULL_ERROR";
                    }
                    a03.e0(str2, false);
                    return;
                } else if (n8Var2.e) {
                    h0Var.close();
                    return;
                } else {
                    n8Var2.d.add(h0Var);
                    v8 v8Var2 = new v8();
                    j0 j0Var2 = h0Var.f34288b;
                    ArrayList arrayList2 = v8Var2.f35007a;
                    arrayList2.clear();
                    if (!j0Var2.e()) {
                        arrayList2.addAll(j0Var2.g());
                    }
                    v8Var2.V();
                    v8Var2.f35010f = new h(n8Var2, this.d, h0Var, 18);
                    n8Var2.presentFragment(v8Var2);
                    return;
                }
        }
    }
}
