package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
public final class v5 {
    public ArrayList f28927a;
    public HashMap f28928b;
    public ArrayList f28929c;

    public final void a() {
        ArrayList arrayList = this.f28927a;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((u5) arrayList.get(i10)).d.spanDrawn = false;
        }
    }

    public final void b(int i10) {
        u5 u5Var = (u5) this.f28927a.remove(i10);
        HashMap hashMap = this.f28928b;
        x5 x5Var = (x5) hashMap.get(u5Var.f28573c);
        if (x5Var != null) {
            ArrayList arrayList = x5Var.f30239b;
            arrayList.remove(u5Var);
            x5Var.a();
            if (arrayList.isEmpty()) {
                hashMap.remove(u5Var.f28573c);
                this.f28929c.remove(x5Var);
            }
            q5 q5Var = u5Var.f28574f;
            if (q5Var != null) {
                q5Var.p(u5Var);
                return;
            }
            return;
        }
        throw new RuntimeException("!!!");
    }
}
