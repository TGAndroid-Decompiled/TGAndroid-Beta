package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.v10;
import org.telegram.ui.Components.hc;
public final class h8 implements v10 {
    public final int f42567a;
    public final o8 f42568b;
    public final vf.b f42569c;
    public final n0 d;

    public h8(o8 o8Var, vf.b bVar, n0 n0Var, int i7) {
        this.f42567a = i7;
        this.f42568b = o8Var;
        this.f42569c = bVar;
        this.d = n0Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f42567a) {
            case 0:
                k0 k0Var = (k0) obj;
                String str = (String) obj2;
                this.f42569c.c(false);
                o8 o8Var = this.f42568b;
                if (k0Var == null) {
                    hc a02 = hc.a0(o8Var);
                    if (str == null) {
                        str = "NULL_ERROR";
                    }
                    a02.e0(str, false);
                    return;
                }
                v8 v8Var = new v8();
                v8Var.h = true;
                ArrayList arrayList = v8Var.f43214a;
                arrayList.clear();
                if (!k0Var.d()) {
                    arrayList.addAll(k0Var.f());
                }
                v8Var.a0();
                v8Var.f43218f = new n(o8Var, this.d);
                o8Var.presentFragment(v8Var);
                return;
            default:
                i0 i0Var = (i0) obj;
                String str2 = (String) obj2;
                this.f42569c.c(false);
                o8 o8Var2 = this.f42568b;
                if (i0Var == null) {
                    hc a03 = hc.a0(o8Var2);
                    if (str2 == null) {
                        str2 = "NULL_ERROR";
                    }
                    a03.e0(str2, false);
                    return;
                } else if (o8Var2.f42906f) {
                    i0Var.close();
                    return;
                } else {
                    o8Var2.f42905e.add(i0Var);
                    v8 v8Var2 = new v8();
                    k0 k0Var2 = i0Var.f42582b;
                    ArrayList arrayList2 = v8Var2.f43214a;
                    arrayList2.clear();
                    if (!k0Var2.d()) {
                        arrayList2.addAll(k0Var2.f());
                    }
                    v8Var2.a0();
                    v8Var2.f43218f = new g(o8Var2, this.d, i0Var, 21);
                    o8Var2.presentFragment(v8Var2);
                    return;
                }
        }
    }
}
