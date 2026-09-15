package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
public final class t5 {
    public ArrayList f28051a;
    public HashMap f28052b;
    public ArrayList f28053c;

    public final void a() {
        ArrayList arrayList = this.f28051a;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((s5) arrayList.get(i10)).d.spanDrawn = false;
        }
    }

    public final void b(int i10) {
        s5 s5Var = (s5) this.f28051a.remove(i10);
        HashMap hashMap = this.f28052b;
        v5 v5Var = (v5) hashMap.get(s5Var.f27773c);
        if (v5Var != null) {
            ArrayList arrayList = v5Var.f28602b;
            arrayList.remove(s5Var);
            v5Var.a();
            if (arrayList.isEmpty()) {
                hashMap.remove(s5Var.f27773c);
                this.f28053c.remove(v5Var);
            }
            o5 o5Var = s5Var.f27774f;
            if (o5Var != null) {
                o5Var.p(s5Var);
                return;
            }
            return;
        }
        throw new RuntimeException("!!!");
    }
}
