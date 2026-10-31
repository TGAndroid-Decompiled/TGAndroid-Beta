package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.j20;
import org.telegram.ui.Components.cc;
public final class m8 implements j20 {
    public final int f34914a;
    public final t8 f34915b;
    public final gf.e f34916c;
    public final k0 d;

    public m8(t8 t8Var, gf.e eVar, k0 k0Var, int i10) {
        this.f34914a = i10;
        this.f34915b = t8Var;
        this.f34916c = eVar;
        this.d = k0Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f34914a) {
            case 0:
                h0 h0Var = (h0) obj;
                String str = (String) obj2;
                this.f34916c.c(false);
                t8 t8Var = this.f34915b;
                if (h0Var == null) {
                    cc a02 = cc.a0(t8Var);
                    if (str == null) {
                        str = "NULL_ERROR";
                    }
                    a02.e0(str, false);
                    return;
                }
                a9 a9Var = new a9();
                a9Var.h = true;
                ArrayList arrayList = a9Var.f34215a;
                arrayList.clear();
                if (!h0Var.d()) {
                    arrayList.addAll(h0Var.f());
                }
                a9Var.Z();
                a9Var.f34218f = new k3(15, t8Var, this.d);
                t8Var.presentFragment(a9Var);
                return;
            default:
                f0 f0Var = (f0) obj;
                String str2 = (String) obj2;
                this.f34916c.c(false);
                t8 t8Var2 = this.f34915b;
                if (f0Var == null) {
                    cc a03 = cc.a0(t8Var2);
                    if (str2 == null) {
                        str2 = "NULL_ERROR";
                    }
                    a03.e0(str2, false);
                    return;
                } else if (t8Var2.f35251f) {
                    f0Var.close();
                    return;
                } else {
                    t8Var2.e.add(f0Var);
                    a9 a9Var2 = new a9();
                    h0 h0Var2 = f0Var.f34480b;
                    ArrayList arrayList2 = a9Var2.f34215a;
                    arrayList2.clear();
                    if (!h0Var2.d()) {
                        arrayList2.addAll(h0Var2.f());
                    }
                    a9Var2.Z();
                    a9Var2.f34218f = new g(t8Var2, this.d, f0Var, 21);
                    t8Var2.presentFragment(a9Var2);
                    return;
                }
        }
    }
}
