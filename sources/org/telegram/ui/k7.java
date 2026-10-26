package org.telegram.ui;

import java.util.ArrayList;
public abstract class k7 extends j7 {
    public final ArrayList f40812f;
    public final x7 h;

    public k7(x7 x7Var, int i10) {
        super(i10);
        this.h = x7Var;
        this.f40812f = new ArrayList();
    }

    @Override
    public boolean D(s4.e1 e1Var) {
        return !(this instanceof s7);
    }

    @Override
    public void F() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.f40812f;
        arrayList2.clear();
        ArrayList arrayList3 = this.e;
        arrayList2.addAll(arrayList3);
        arrayList3.clear();
        ci.b bVar = this.h.h;
        if (bVar != null) {
            int i10 = this.d;
            if (i10 == 1) {
                arrayList = bVar.d;
            } else if (i10 == 2) {
                arrayList = bVar.e;
            } else if (i10 == 3) {
                arrayList = bVar.f6372f;
            } else if (i10 == 5) {
                arrayList = bVar.f6373g;
            } else if (i10 == 4) {
                arrayList = bVar.h;
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ?? aVar = new qg.a(2, true);
                    aVar.d = (ci.a) arrayList.get(i11);
                    arrayList3.add(aVar);
                }
            }
        }
        E(arrayList2, arrayList3);
    }
}
