package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
public final class x5 {
    public ArrayList f31169a;
    public HashMap f31170b;
    public ArrayList f31171c;

    public final void a() {
        ArrayList arrayList = this.f31169a;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((w5) arrayList.get(i10)).d.spanDrawn = false;
        }
    }

    public final void b(int i10) {
        w5 w5Var = (w5) this.f31169a.remove(i10);
        HashMap hashMap = this.f31170b;
        z5 z5Var = (z5) hashMap.get(w5Var.f30800c);
        if (z5Var != null) {
            ArrayList arrayList = z5Var.f31767b;
            arrayList.remove(w5Var);
            z5Var.a();
            if (arrayList.isEmpty()) {
                hashMap.remove(w5Var.f30800c);
                this.f31171c.remove(z5Var);
            }
            s5 s5Var = w5Var.f30801f;
            if (s5Var != null) {
                s5Var.p(w5Var);
                return;
            }
            return;
        }
        throw new RuntimeException("!!!");
    }
}
