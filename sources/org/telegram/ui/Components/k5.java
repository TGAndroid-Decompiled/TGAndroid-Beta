package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
public final class k5 {
    public ArrayList f27636a;
    public HashMap f27637b;
    public ArrayList f27638c;

    public final void a() {
        ArrayList arrayList = this.f27636a;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((j5) arrayList.get(i10)).d.spanDrawn = false;
        }
    }

    public final void b(int i10) {
        j5 j5Var = (j5) this.f27636a.remove(i10);
        HashMap hashMap = this.f27637b;
        m5 m5Var = (m5) hashMap.get(j5Var.f27226c);
        if (m5Var != null) {
            ArrayList arrayList = m5Var.f28287b;
            arrayList.remove(j5Var);
            m5Var.a();
            if (arrayList.isEmpty()) {
                hashMap.remove(j5Var.f27226c);
                this.f27638c.remove(m5Var);
            }
            f5 f5Var = j5Var.f27227f;
            if (f5Var != null) {
                f5Var.o(j5Var);
                return;
            }
            return;
        }
        throw new RuntimeException("!!!");
    }
}
