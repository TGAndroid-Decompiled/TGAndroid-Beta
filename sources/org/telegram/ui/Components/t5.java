package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
public final class t5 {
    public ArrayList f28013a;
    public HashMap f28014b;
    public ArrayList f28015c;

    public final void a() {
        ArrayList arrayList = this.f28013a;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((s5) arrayList.get(i10)).d.spanDrawn = false;
        }
    }

    public final void b(int i10) {
        s5 s5Var = (s5) this.f28013a.remove(i10);
        HashMap hashMap = this.f28014b;
        v5 v5Var = (v5) hashMap.get(s5Var.f27768c);
        if (v5Var != null) {
            ArrayList arrayList = v5Var.f28597b;
            arrayList.remove(s5Var);
            v5Var.a();
            if (arrayList.isEmpty()) {
                hashMap.remove(s5Var.f27768c);
                this.f28015c.remove(v5Var);
            }
            o5 o5Var = s5Var.f27769f;
            if (o5Var != null) {
                o5Var.p(s5Var);
                return;
            }
            return;
        }
        throw new RuntimeException("!!!");
    }
}
