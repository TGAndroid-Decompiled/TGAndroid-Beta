package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
public final class q5 {
    public ArrayList f30287a;
    public HashMap f30288b;
    public ArrayList f30289c;

    public final void a() {
        ArrayList arrayList = this.f30287a;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((p5) arrayList.get(i10)).d.spanDrawn = false;
        }
    }

    public final void b(int i10) {
        p5 p5Var = (p5) this.f30287a.remove(i10);
        HashMap hashMap = this.f30288b;
        s5 s5Var = (s5) hashMap.get(p5Var.f29981c);
        if (s5Var != null) {
            ArrayList arrayList = s5Var.f30989b;
            arrayList.remove(p5Var);
            s5Var.a();
            if (arrayList.isEmpty()) {
                hashMap.remove(p5Var.f29981c);
                this.f30289c.remove(s5Var);
            }
            l5 l5Var = p5Var.f29983f;
            if (l5Var != null) {
                l5Var.p(p5Var);
                return;
            }
            return;
        }
        throw new RuntimeException("!!!");
    }
}
