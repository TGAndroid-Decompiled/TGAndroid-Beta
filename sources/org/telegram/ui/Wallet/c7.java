package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.zc;
import org.telegram.ui.je1;
public final class c7 implements Utilities.Callback2 {
    public final int f33023a;
    public final k7 f33024b;
    public final pf.c f33025c;
    public final j0 d;

    public c7(k7 k7Var, pf.c cVar, j0 j0Var, int i10) {
        this.f33023a = i10;
        this.f33024b = k7Var;
        this.f33025c = cVar;
        this.d = j0Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f33023a) {
            case 0:
                g0 g0Var = (g0) obj;
                String str = (String) obj2;
                this.f33025c.c(false);
                k7 k7Var = this.f33024b;
                if (g0Var == null) {
                    zc a02 = zc.a0(k7Var);
                    if (str == null) {
                        str = "NULL_ERROR";
                    }
                    a02.e0(str, false);
                    return;
                }
                o7 o7Var = new o7();
                o7Var.h = true;
                ArrayList arrayList = o7Var.f33574a;
                arrayList.clear();
                if (!g0Var.e()) {
                    arrayList.addAll(g0Var.g());
                }
                o7Var.V();
                o7Var.f33577f = new je1(28, k7Var, this.d);
                k7Var.presentFragment(o7Var);
                return;
            default:
                e0 e0Var = (e0) obj;
                String str2 = (String) obj2;
                this.f33025c.c(false);
                k7 k7Var2 = this.f33024b;
                if (e0Var == null) {
                    zc a03 = zc.a0(k7Var2);
                    if (str2 == null) {
                        str2 = "NULL_ERROR";
                    }
                    a03.e0(str2, false);
                    return;
                } else if (k7Var2.e) {
                    e0Var.close();
                    return;
                } else {
                    k7Var2.d.add(e0Var);
                    o7 o7Var2 = new o7();
                    g0 g0Var2 = e0Var.f33112b;
                    ArrayList arrayList2 = o7Var2.f33574a;
                    arrayList2.clear();
                    if (!g0Var2.e()) {
                        arrayList2.addAll(g0Var2.g());
                    }
                    o7Var2.V();
                    o7Var2.f33577f = new k(k7Var2, this.d, e0Var);
                    k7Var2.presentFragment(o7Var2);
                    return;
                }
        }
    }
}
