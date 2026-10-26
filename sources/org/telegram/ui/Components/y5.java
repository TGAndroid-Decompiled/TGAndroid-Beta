package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
public final class y5 {
    public ArrayList f34928a;
    public HashMap f34929b;
    public ArrayList f34930c;

    public final void a() {
        ArrayList arrayList = this.f34928a;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((x5) arrayList.get(i10)).d.spanDrawn = false;
        }
    }

    public final void b(int i10) {
        x5 x5Var = (x5) this.f34928a.remove(i10);
        HashMap hashMap = this.f34929b;
        a6 a6Var = (a6) hashMap.get(x5Var.f34625c);
        if (a6Var != null) {
            ArrayList arrayList = a6Var.f26418b;
            arrayList.remove(x5Var);
            a6Var.a();
            if (arrayList.isEmpty()) {
                hashMap.remove(x5Var.f34625c);
                this.f34930c.remove(a6Var);
            }
            t5 t5Var = x5Var.f34626f;
            if (t5Var != null) {
                t5Var.p(x5Var);
                return;
            }
            return;
        }
        throw new RuntimeException("!!!");
    }
}
