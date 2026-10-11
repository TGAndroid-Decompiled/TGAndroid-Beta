package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ad;
public final class f7 implements Utilities.Callback2 {
    public final int f34952a;
    public final n7 f34953b;
    public final of.e f34954c;
    public final l0 d;

    public f7(n7 n7Var, of.e eVar, l0 l0Var, int i10) {
        this.f34952a = i10;
        this.f34953b = n7Var;
        this.f34954c = eVar;
        this.d = l0Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f34952a) {
            case 0:
                i0 i0Var = (i0) obj;
                String str = (String) obj2;
                this.f34954c.c(false);
                n7 n7Var = this.f34953b;
                if (i0Var == null) {
                    ad a02 = ad.a0(n7Var);
                    if (str == null) {
                        str = "NULL_ERROR";
                    }
                    a02.e0(str, false);
                    return;
                }
                r7 r7Var = new r7();
                r7Var.h = true;
                ArrayList arrayList = r7Var.f35516a;
                arrayList.clear();
                if (!i0Var.e()) {
                    arrayList.addAll(i0Var.g());
                }
                r7Var.V();
                r7Var.f35520f = new i(n7Var, this.d);
                n7Var.presentFragment(r7Var);
                return;
            default:
                g0 g0Var = (g0) obj;
                String str2 = (String) obj2;
                this.f34954c.c(false);
                n7 n7Var2 = this.f34953b;
                if (g0Var == null) {
                    ad a03 = ad.a0(n7Var2);
                    if (str2 == null) {
                        str2 = "NULL_ERROR";
                    }
                    a03.e0(str2, false);
                    return;
                } else if (n7Var2.f35336e) {
                    g0Var.close();
                    return;
                } else {
                    n7Var2.d.add(g0Var);
                    r7 r7Var2 = new r7();
                    i0 i0Var2 = g0Var.f34969b;
                    ArrayList arrayList2 = r7Var2.f35516a;
                    arrayList2.clear();
                    if (!i0Var2.e()) {
                        arrayList2.addAll(i0Var2.g());
                    }
                    r7Var2.V();
                    r7Var2.f35520f = new m(n7Var2, this.d, g0Var);
                    n7Var2.presentFragment(r7Var2);
                    return;
                }
        }
    }
}
