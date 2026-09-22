package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
public final class u5 {
    public ArrayList f28629a;
    public HashMap f28630b;
    public ArrayList f28631c;

    public final void a() {
        ArrayList arrayList = this.f28629a;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((t5) arrayList.get(i10)).d.spanDrawn = false;
        }
    }

    public final void b(int i10) {
        t5 t5Var = (t5) this.f28629a.remove(i10);
        HashMap hashMap = this.f28630b;
        w5 w5Var = (w5) hashMap.get(t5Var.f28392c);
        if (w5Var != null) {
            ArrayList arrayList = w5Var.f29930b;
            arrayList.remove(t5Var);
            w5Var.a();
            if (arrayList.isEmpty()) {
                hashMap.remove(t5Var.f28392c);
                this.f28631c.remove(w5Var);
            }
            p5 p5Var = t5Var.f28393f;
            if (p5Var != null) {
                p5Var.p(t5Var);
                return;
            }
            return;
        }
        throw new RuntimeException("!!!");
    }
}
