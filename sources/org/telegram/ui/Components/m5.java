package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
public final class m5 {
    public ArrayList f35850a;
    public HashMap f35851b;
    public ArrayList f35852c;

    public final void a() {
        ArrayList arrayList = this.f35850a;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((l5) arrayList.get(i7)).d.spanDrawn = false;
        }
    }

    public final void b(int i7) {
        l5 l5Var = (l5) this.f35850a.remove(i7);
        HashMap hashMap = this.f35851b;
        o5 o5Var = (o5) hashMap.get(l5Var.f35538c);
        if (o5Var != null) {
            ArrayList arrayList = o5Var.f36522b;
            arrayList.remove(l5Var);
            o5Var.a();
            if (arrayList.isEmpty()) {
                hashMap.remove(l5Var.f35538c);
                this.f35852c.remove(o5Var);
            }
            h5 h5Var = l5Var.f35540f;
            if (h5Var != null) {
                h5Var.o(l5Var);
                return;
            }
            return;
        }
        throw new RuntimeException("!!!");
    }
}
