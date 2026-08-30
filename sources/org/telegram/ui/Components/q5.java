package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
public final class q5 {
    public ArrayList f28058a;
    public HashMap f28059b;
    public ArrayList f28060c;

    public final void a() {
        ArrayList arrayList = this.f28058a;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((p5) arrayList.get(i10)).d.spanDrawn = false;
        }
    }

    public final void b(int i10) {
        p5 p5Var = (p5) this.f28058a.remove(i10);
        HashMap hashMap = this.f28059b;
        s5 s5Var = (s5) hashMap.get(p5Var.f27741c);
        if (s5Var != null) {
            ArrayList arrayList = s5Var.f28630b;
            arrayList.remove(p5Var);
            s5Var.a();
            if (arrayList.isEmpty()) {
                hashMap.remove(p5Var.f27741c);
                this.f28060c.remove(s5Var);
            }
            l5 l5Var = p5Var.f27742f;
            if (l5Var != null) {
                l5Var.p(p5Var);
                return;
            }
            return;
        }
        throw new RuntimeException("!!!");
    }
}
