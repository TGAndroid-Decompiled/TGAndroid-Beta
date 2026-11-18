package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
public final class t5 {
    public ArrayList f39906a;
    public HashMap f39907b;
    public ArrayList f39908c;

    public final void a() {
        ArrayList arrayList = this.f39906a;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((s5) arrayList.get(i7)).d.spanDrawn = false;
        }
    }

    public final void b(int i7) {
        s5 s5Var = (s5) this.f39906a.remove(i7);
        HashMap hashMap = this.f39907b;
        v5 v5Var = (v5) hashMap.get(s5Var.f39487c);
        if (v5Var != null) {
            ArrayList arrayList = v5Var.f40497b;
            arrayList.remove(s5Var);
            v5Var.a();
            if (arrayList.isEmpty()) {
                hashMap.remove(s5Var.f39487c);
                this.f39908c.remove(v5Var);
            }
            o5 o5Var = s5Var.f39489f;
            if (o5Var != null) {
                o5Var.o(s5Var);
                return;
            }
            return;
        }
        throw new RuntimeException("!!!");
    }
}
