package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
public final class x5 {
    public ArrayList f32827a;
    public HashMap f32828b;
    public ArrayList f32829c;

    public final void a() {
        ArrayList arrayList = this.f32827a;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((w5) arrayList.get(i10)).d.spanDrawn = false;
        }
    }

    public final void b(int i10) {
        w5 w5Var = (w5) this.f32827a.remove(i10);
        HashMap hashMap = this.f32828b;
        z5 z5Var = (z5) hashMap.get(w5Var.f32578c);
        if (z5Var != null) {
            ArrayList arrayList = z5Var.f33414b;
            arrayList.remove(w5Var);
            z5Var.a();
            if (arrayList.isEmpty()) {
                hashMap.remove(w5Var.f32578c);
                this.f32829c.remove(z5Var);
            }
            s5 s5Var = w5Var.f32580f;
            if (s5Var != null) {
                s5Var.p(w5Var);
                return;
            }
            return;
        }
        throw new RuntimeException("!!!");
    }
}
