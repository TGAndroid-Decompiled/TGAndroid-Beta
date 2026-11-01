package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.k20;
import org.telegram.ui.Components.cc;
public final class m8 implements k20 {
    public final int f34913a;
    public final t8 f34914b;
    public final gf.e f34915c;
    public final k0 d;

    public m8(t8 t8Var, gf.e eVar, k0 k0Var, int i10) {
        this.f34913a = i10;
        this.f34914b = t8Var;
        this.f34915c = eVar;
        this.d = k0Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f34913a) {
            case 0:
                h0 h0Var = (h0) obj;
                String str = (String) obj2;
                this.f34915c.c(false);
                t8 t8Var = this.f34914b;
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
                ArrayList arrayList = a9Var.f34214a;
                arrayList.clear();
                if (!h0Var.d()) {
                    arrayList.addAll(h0Var.f());
                }
                a9Var.a0();
                a9Var.f34217f = new m2(16, t8Var, this.d);
                t8Var.presentFragment(a9Var);
                return;
            default:
                f0 f0Var = (f0) obj;
                String str2 = (String) obj2;
                this.f34915c.c(false);
                t8 t8Var2 = this.f34914b;
                if (f0Var == null) {
                    cc a03 = cc.a0(t8Var2);
                    if (str2 == null) {
                        str2 = "NULL_ERROR";
                    }
                    a03.e0(str2, false);
                    return;
                } else if (t8Var2.f35253f) {
                    f0Var.close();
                    return;
                } else {
                    t8Var2.e.add(f0Var);
                    a9 a9Var2 = new a9();
                    h0 h0Var2 = f0Var.f34478b;
                    ArrayList arrayList2 = a9Var2.f34214a;
                    arrayList2.clear();
                    if (!h0Var2.d()) {
                        arrayList2.addAll(h0Var2.f());
                    }
                    a9Var2.a0();
                    a9Var2.f34217f = new g(t8Var2, this.d, f0Var, 21);
                    t8Var2.presentFragment(a9Var2);
                    return;
                }
        }
    }
}
