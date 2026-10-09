package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ad;
import org.telegram.ui.ii1;
public final class d7 implements Utilities.Callback2 {
    public final int f34829a;
    public final l7 f34830b;
    public final of.e f34831c;
    public final k0 d;

    public d7(l7 l7Var, of.e eVar, k0 k0Var, int i10) {
        this.f34829a = i10;
        this.f34830b = l7Var;
        this.f34831c = eVar;
        this.d = k0Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f34829a) {
            case 0:
                h0 h0Var = (h0) obj;
                String str = (String) obj2;
                this.f34831c.c(false);
                l7 l7Var = this.f34830b;
                if (h0Var == null) {
                    ad a02 = ad.a0(l7Var);
                    if (str == null) {
                        str = "NULL_ERROR";
                    }
                    a02.e0(str, false);
                    return;
                }
                p7 p7Var = new p7();
                p7Var.h = true;
                ArrayList arrayList = p7Var.f35396a;
                arrayList.clear();
                if (!h0Var.e()) {
                    arrayList.addAll(h0Var.g());
                }
                p7Var.V();
                p7Var.f35400f = new ii1(17, l7Var, this.d);
                l7Var.presentFragment(p7Var);
                return;
            default:
                f0 f0Var = (f0) obj;
                String str2 = (String) obj2;
                this.f34831c.c(false);
                l7 l7Var2 = this.f34830b;
                if (f0Var == null) {
                    ad a03 = ad.a0(l7Var2);
                    if (str2 == null) {
                        str2 = "NULL_ERROR";
                    }
                    a03.e0(str2, false);
                    return;
                } else if (l7Var2.f35210e) {
                    f0Var.close();
                    return;
                } else {
                    l7Var2.d.add(f0Var);
                    p7 p7Var2 = new p7();
                    h0 h0Var2 = f0Var.f34889b;
                    ArrayList arrayList2 = p7Var2.f35396a;
                    arrayList2.clear();
                    if (!h0Var2.e()) {
                        arrayList2.addAll(h0Var2.g());
                    }
                    p7Var2.V();
                    p7Var2.f35400f = new k(l7Var2, this.d, f0Var);
                    l7Var2.presentFragment(p7Var2);
                    return;
                }
        }
    }
}
