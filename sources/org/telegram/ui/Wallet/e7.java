package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ad;
import org.telegram.ui.ii1;
public final class e7 implements Utilities.Callback2 {
    public final int f34920a;
    public final m7 f34921b;
    public final of.e f34922c;
    public final k0 d;

    public e7(m7 m7Var, of.e eVar, k0 k0Var, int i10) {
        this.f34920a = i10;
        this.f34921b = m7Var;
        this.f34922c = eVar;
        this.d = k0Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f34920a) {
            case 0:
                h0 h0Var = (h0) obj;
                String str = (String) obj2;
                this.f34922c.c(false);
                m7 m7Var = this.f34921b;
                if (h0Var == null) {
                    ad a02 = ad.a0(m7Var);
                    if (str == null) {
                        str = "NULL_ERROR";
                    }
                    a02.e0(str, false);
                    return;
                }
                q7 q7Var = new q7();
                q7Var.h = true;
                ArrayList arrayList = q7Var.f35486a;
                arrayList.clear();
                if (!h0Var.e()) {
                    arrayList.addAll(h0Var.g());
                }
                q7Var.V();
                q7Var.f35490f = new ii1(17, m7Var, this.d);
                m7Var.presentFragment(q7Var);
                return;
            default:
                f0 f0Var = (f0) obj;
                String str2 = (String) obj2;
                this.f34922c.c(false);
                m7 m7Var2 = this.f34921b;
                if (f0Var == null) {
                    ad a03 = ad.a0(m7Var2);
                    if (str2 == null) {
                        str2 = "NULL_ERROR";
                    }
                    a03.e0(str2, false);
                    return;
                } else if (m7Var2.f35306e) {
                    f0Var.close();
                    return;
                } else {
                    m7Var2.d.add(f0Var);
                    q7 q7Var2 = new q7();
                    h0 h0Var2 = f0Var.f34940b;
                    ArrayList arrayList2 = q7Var2.f35486a;
                    arrayList2.clear();
                    if (!h0Var2.e()) {
                        arrayList2.addAll(h0Var2.g());
                    }
                    q7Var2.V();
                    q7Var2.f35490f = new l(m7Var2, this.d, f0Var);
                    m7Var2.presentFragment(q7Var2);
                    return;
                }
        }
    }
}
