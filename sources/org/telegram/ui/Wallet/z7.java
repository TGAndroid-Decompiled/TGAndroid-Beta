package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.xc;
public final class z7 implements Utilities.Callback2 {
    public final int f35195a;
    public final h8 f35196b;
    public final pf.c f35197c;
    public final m0 d;

    public z7(h8 h8Var, pf.c cVar, m0 m0Var, int i10) {
        this.f35195a = i10;
        this.f35196b = h8Var;
        this.f35197c = cVar;
        this.d = m0Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f35195a) {
            case 0:
                j0 j0Var = (j0) obj;
                String str = (String) obj2;
                this.f35197c.c(false);
                h8 h8Var = this.f35196b;
                if (j0Var == null) {
                    xc a02 = xc.a0(h8Var);
                    if (str == null) {
                        str = "NULL_ERROR";
                    }
                    a02.e0(str, false);
                    return;
                }
                p8 p8Var = new p8();
                p8Var.h = true;
                ArrayList arrayList = p8Var.f34746a;
                arrayList.clear();
                if (!j0Var.e()) {
                    arrayList.addAll(j0Var.g());
                }
                p8Var.V();
                p8Var.f34749f = new z3(14, h8Var, this.d);
                h8Var.presentFragment(p8Var);
                return;
            default:
                h0 h0Var = (h0) obj;
                String str2 = (String) obj2;
                this.f35197c.c(false);
                h8 h8Var2 = this.f35196b;
                if (h0Var == null) {
                    xc a03 = xc.a0(h8Var2);
                    if (str2 == null) {
                        str2 = "NULL_ERROR";
                    }
                    a03.e0(str2, false);
                    return;
                } else if (h8Var2.e) {
                    h0Var.close();
                    return;
                } else {
                    h8Var2.d.add(h0Var);
                    p8 p8Var2 = new p8();
                    j0 j0Var2 = h0Var.f34276b;
                    ArrayList arrayList2 = p8Var2.f34746a;
                    arrayList2.clear();
                    if (!j0Var2.e()) {
                        arrayList2.addAll(j0Var2.g());
                    }
                    p8Var2.V();
                    p8Var2.f34749f = new h(h8Var2, this.d, h0Var, 19);
                    h8Var2.presentFragment(p8Var2);
                    return;
                }
        }
    }
}
