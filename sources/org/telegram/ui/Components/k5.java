package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
public final class k5 {
    public ArrayList f27728a;
    public HashMap f27729b;
    public ArrayList f27730c;

    public final void a() {
        ArrayList arrayList = this.f27728a;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((j5) arrayList.get(i10)).d.spanDrawn = false;
        }
    }

    public final void b(int i10) {
        j5 j5Var = (j5) this.f27728a.remove(i10);
        HashMap hashMap = this.f27729b;
        m5 m5Var = (m5) hashMap.get(j5Var.f27276c);
        if (m5Var != null) {
            ArrayList arrayList = m5Var.f28370b;
            arrayList.remove(j5Var);
            m5Var.a();
            if (arrayList.isEmpty()) {
                hashMap.remove(j5Var.f27276c);
                this.f27730c.remove(m5Var);
            }
            f5 f5Var = j5Var.f27277f;
            if (f5Var != null) {
                f5Var.o(j5Var);
                return;
            }
            return;
        }
        throw new RuntimeException("!!!");
    }
}
