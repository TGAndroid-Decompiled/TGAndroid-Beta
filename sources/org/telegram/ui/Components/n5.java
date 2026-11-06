package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
public final class n5 {
    public ArrayList f36230a;
    public HashMap f36231b;
    public ArrayList f36232c;

    public final void a() {
        ArrayList arrayList = this.f36230a;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((m5) arrayList.get(i7)).d.spanDrawn = false;
        }
    }

    public final void b(int i7) {
        m5 m5Var = (m5) this.f36230a.remove(i7);
        HashMap hashMap = this.f36231b;
        p5 p5Var = (p5) hashMap.get(m5Var.f35862c);
        if (p5Var != null) {
            ArrayList arrayList = p5Var.f36777b;
            arrayList.remove(m5Var);
            p5Var.a();
            if (arrayList.isEmpty()) {
                hashMap.remove(m5Var.f35862c);
                this.f36232c.remove(p5Var);
            }
            i5 i5Var = m5Var.f35864f;
            if (i5Var != null) {
                i5Var.o(m5Var);
                return;
            }
            return;
        }
        throw new RuntimeException("!!!");
    }
}
