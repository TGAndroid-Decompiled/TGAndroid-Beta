package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.xc;
public final class c8 implements Utilities.Callback2 {
    public final int f34093a;
    public final k8 f34094b;
    public final pf.c f34095c;
    public final m0 d;

    public c8(k8 k8Var, pf.c cVar, m0 m0Var, int i10) {
        this.f34093a = i10;
        this.f34094b = k8Var;
        this.f34095c = cVar;
        this.d = m0Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f34093a) {
            case 0:
                j0 j0Var = (j0) obj;
                String str = (String) obj2;
                this.f34095c.c(false);
                k8 k8Var = this.f34094b;
                if (j0Var == null) {
                    xc a02 = xc.a0(k8Var);
                    if (str == null) {
                        str = "NULL_ERROR";
                    }
                    a02.e0(str, false);
                    return;
                }
                s8 s8Var = new s8();
                s8Var.h = true;
                ArrayList arrayList = s8Var.f34877a;
                arrayList.clear();
                if (!j0Var.e()) {
                    arrayList.addAll(j0Var.g());
                }
                s8Var.V();
                s8Var.f34880f = new t3(14, k8Var, this.d);
                k8Var.presentFragment(s8Var);
                return;
            default:
                h0 h0Var = (h0) obj;
                String str2 = (String) obj2;
                this.f34095c.c(false);
                k8 k8Var2 = this.f34094b;
                if (h0Var == null) {
                    xc a03 = xc.a0(k8Var2);
                    if (str2 == null) {
                        str2 = "NULL_ERROR";
                    }
                    a03.e0(str2, false);
                    return;
                } else if (k8Var2.e) {
                    h0Var.close();
                    return;
                } else {
                    k8Var2.d.add(h0Var);
                    s8 s8Var2 = new s8();
                    j0 j0Var2 = h0Var.f34248b;
                    ArrayList arrayList2 = s8Var2.f34877a;
                    arrayList2.clear();
                    if (!j0Var2.e()) {
                        arrayList2.addAll(j0Var2.g());
                    }
                    s8Var2.V();
                    s8Var2.f34880f = new h(k8Var2, this.d, h0Var, 18);
                    k8Var2.presentFragment(s8Var2);
                    return;
                }
        }
    }
}
