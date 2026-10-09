package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ad;
import org.telegram.ui.ii1;
public final class c7 implements Utilities.Callback2 {
    public final int f34764a;
    public final k7 f34765b;
    public final of.e f34766c;
    public final k0 d;

    public c7(k7 k7Var, of.e eVar, k0 k0Var, int i10) {
        this.f34764a = i10;
        this.f34765b = k7Var;
        this.f34766c = eVar;
        this.d = k0Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f34764a) {
            case 0:
                h0 h0Var = (h0) obj;
                String str = (String) obj2;
                this.f34766c.c(false);
                k7 k7Var = this.f34765b;
                if (h0Var == null) {
                    ad a02 = ad.a0(k7Var);
                    if (str == null) {
                        str = "NULL_ERROR";
                    }
                    a02.e0(str, false);
                    return;
                }
                o7 o7Var = new o7();
                o7Var.h = true;
                ArrayList arrayList = o7Var.f35327a;
                arrayList.clear();
                if (!h0Var.e()) {
                    arrayList.addAll(h0Var.g());
                }
                o7Var.V();
                o7Var.f35331f = new ii1(17, k7Var, this.d);
                k7Var.presentFragment(o7Var);
                return;
            default:
                f0 f0Var = (f0) obj;
                String str2 = (String) obj2;
                this.f34766c.c(false);
                k7 k7Var2 = this.f34765b;
                if (f0Var == null) {
                    ad a03 = ad.a0(k7Var2);
                    if (str2 == null) {
                        str2 = "NULL_ERROR";
                    }
                    a03.e0(str2, false);
                    return;
                } else if (k7Var2.f35145e) {
                    f0Var.close();
                    return;
                } else {
                    k7Var2.d.add(f0Var);
                    o7 o7Var2 = new o7();
                    h0 h0Var2 = f0Var.f34884b;
                    ArrayList arrayList2 = o7Var2.f35327a;
                    arrayList2.clear();
                    if (!h0Var2.e()) {
                        arrayList2.addAll(h0Var2.g());
                    }
                    o7Var2.V();
                    o7Var2.f35331f = new k(k7Var2, this.d, f0Var);
                    k7Var2.presentFragment(o7Var2);
                    return;
                }
        }
    }
}
