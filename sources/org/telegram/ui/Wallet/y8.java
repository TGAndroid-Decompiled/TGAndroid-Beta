package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.q10;
import org.telegram.ui.Components.lc;
public final class y8 implements q10 {
    public final int f45326a;
    public final d9 f45327b;
    public final vf.b f45328c;
    public final u0 d;

    public y8(d9 d9Var, vf.b bVar, u0 u0Var, int i7) {
        this.f45326a = i7;
        this.f45327b = d9Var;
        this.f45328c = bVar;
        this.d = u0Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f45326a) {
            case 0:
                r0 r0Var = (r0) obj;
                String str = (String) obj2;
                this.f45328c.c(false);
                d9 d9Var = this.f45327b;
                if (r0Var == null) {
                    lc b02 = lc.b0(d9Var);
                    if (str == null) {
                        str = "NULL_ERROR";
                    }
                    b02.f0(str, false);
                    return;
                }
                l9 l9Var = new l9();
                l9Var.h = true;
                ArrayList arrayList = l9Var.f44499a;
                arrayList.clear();
                if (!r0Var.d()) {
                    arrayList.addAll(r0Var.f());
                }
                l9Var.a0();
                l9Var.f44503f = new c5(10, d9Var, this.d);
                d9Var.presentFragment(l9Var);
                return;
            default:
                o0 o0Var = (o0) obj;
                String str2 = (String) obj2;
                this.f45328c.c(false);
                d9 d9Var2 = this.f45327b;
                if (o0Var == null) {
                    lc b03 = lc.b0(d9Var2);
                    if (str2 == null) {
                        str2 = "NULL_ERROR";
                    }
                    b03.f0(str2, false);
                    return;
                } else if (d9Var2.f44052f) {
                    o0Var.close();
                    return;
                } else {
                    d9Var2.f44051e.add(o0Var);
                    l9 l9Var2 = new l9();
                    r0 r0Var2 = o0Var.f44680b;
                    ArrayList arrayList2 = l9Var2.f44499a;
                    arrayList2.clear();
                    if (!r0Var2.d()) {
                        arrayList2.addAll(r0Var2.f());
                    }
                    l9Var2.a0();
                    l9Var2.f44503f = new p(d9Var2, this.d, o0Var);
                    d9Var2.presentFragment(l9Var2);
                    return;
                }
        }
    }
}
