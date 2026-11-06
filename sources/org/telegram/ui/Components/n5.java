package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
public final class n5 {
    public ArrayList f36278a;
    public HashMap f36279b;
    public ArrayList f36280c;

    public final void a() {
        ArrayList arrayList = this.f36278a;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((m5) arrayList.get(i7)).d.spanDrawn = false;
        }
    }

    public final void b(int i7) {
        m5 m5Var = (m5) this.f36278a.remove(i7);
        HashMap hashMap = this.f36279b;
        p5 p5Var = (p5) hashMap.get(m5Var.f35897c);
        if (p5Var != null) {
            ArrayList arrayList = p5Var.f36898b;
            arrayList.remove(m5Var);
            p5Var.a();
            if (arrayList.isEmpty()) {
                hashMap.remove(m5Var.f35897c);
                this.f36280c.remove(p5Var);
            }
            i5 i5Var = m5Var.f35899f;
            if (i5Var != null) {
                i5Var.o(m5Var);
                return;
            }
            return;
        }
        throw new RuntimeException("!!!");
    }
}
