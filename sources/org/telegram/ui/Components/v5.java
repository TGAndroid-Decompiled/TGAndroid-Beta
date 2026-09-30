package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
public final class v5 {
    public ArrayList f29037a;
    public HashMap f29038b;
    public ArrayList f29039c;

    public final void a() {
        ArrayList arrayList = this.f29037a;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((u5) arrayList.get(i10)).d.spanDrawn = false;
        }
    }

    public final void b(int i10) {
        u5 u5Var = (u5) this.f29037a.remove(i10);
        HashMap hashMap = this.f29038b;
        x5 x5Var = (x5) hashMap.get(u5Var.f28756c);
        if (x5Var != null) {
            ArrayList arrayList = x5Var.f30123b;
            arrayList.remove(u5Var);
            x5Var.a();
            if (arrayList.isEmpty()) {
                hashMap.remove(u5Var.f28756c);
                this.f29039c.remove(x5Var);
            }
            q5 q5Var = u5Var.f28757f;
            if (q5Var != null) {
                q5Var.p(u5Var);
                return;
            }
            return;
        }
        throw new RuntimeException("!!!");
    }
}
