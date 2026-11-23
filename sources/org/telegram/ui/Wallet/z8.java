package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.p10;
import org.telegram.ui.Components.kc;
public final class z8 implements p10 {
    public final int f45498a;
    public final e9 f45499b;
    public final vf.b f45500c;
    public final v0 d;

    public z8(e9 e9Var, vf.b bVar, v0 v0Var, int i7) {
        this.f45498a = i7;
        this.f45499b = e9Var;
        this.f45500c = bVar;
        this.d = v0Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f45498a) {
            case 0:
                s0 s0Var = (s0) obj;
                String str = (String) obj2;
                this.f45500c.c(false);
                e9 e9Var = this.f45499b;
                if (s0Var == null) {
                    kc b02 = kc.b0(e9Var);
                    if (str == null) {
                        str = "NULL_ERROR";
                    }
                    b02.f0(str, false);
                    return;
                }
                m9 m9Var = new m9();
                m9Var.h = true;
                ArrayList arrayList = m9Var.f44670a;
                arrayList.clear();
                if (!s0Var.d()) {
                    arrayList.addAll(s0Var.f());
                }
                m9Var.a0();
                m9Var.f44674f = new r(e9Var, this.d);
                e9Var.presentFragment(m9Var);
                return;
            default:
                p0 p0Var = (p0) obj;
                String str2 = (String) obj2;
                this.f45500c.c(false);
                e9 e9Var2 = this.f45499b;
                if (p0Var == null) {
                    kc b03 = kc.b0(e9Var2);
                    if (str2 == null) {
                        str2 = "NULL_ERROR";
                    }
                    b03.f0(str2, false);
                    return;
                } else if (e9Var2.f44224f) {
                    p0Var.close();
                    return;
                } else {
                    e9Var2.f44223e.add(p0Var);
                    m9 m9Var2 = new m9();
                    s0 s0Var2 = p0Var.f44852b;
                    ArrayList arrayList2 = m9Var2.f44670a;
                    arrayList2.clear();
                    if (!s0Var2.d()) {
                        arrayList2.addAll(s0Var2.f());
                    }
                    m9Var2.a0();
                    m9Var2.f44674f = new p(e9Var2, this.d, p0Var);
                    e9Var2.presentFragment(m9Var2);
                    return;
                }
        }
    }
}
