package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
public final class n5 {
    public ArrayList f36250a;
    public HashMap f36251b;
    public ArrayList f36252c;

    public final void a() {
        ArrayList arrayList = this.f36250a;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((m5) arrayList.get(i7)).d.spanDrawn = false;
        }
    }

    public final void b(int i7) {
        m5 m5Var = (m5) this.f36250a.remove(i7);
        HashMap hashMap = this.f36251b;
        p5 p5Var = (p5) hashMap.get(m5Var.f35952c);
        if (p5Var != null) {
            ArrayList arrayList = p5Var.f36928b;
            arrayList.remove(m5Var);
            p5Var.a();
            if (arrayList.isEmpty()) {
                hashMap.remove(m5Var.f35952c);
                this.f36252c.remove(p5Var);
            }
            i5 i5Var = m5Var.f35954f;
            if (i5Var != null) {
                i5Var.o(m5Var);
                return;
            }
            return;
        }
        throw new RuntimeException("!!!");
    }
}
