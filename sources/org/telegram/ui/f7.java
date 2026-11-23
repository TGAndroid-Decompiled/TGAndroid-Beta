package org.telegram.ui;

import java.util.ArrayList;
public abstract class f7 extends e7 {
    public final ArrayList f47581f;
    public final s7 h;

    public f7(s7 s7Var, int i7) {
        super(i7);
        this.h = s7Var;
        this.f47581f = new ArrayList();
    }

    @Override
    public boolean D(v4.e1 e1Var) {
        return !(this instanceof n7);
    }

    @Override
    public void F() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.f47581f;
        arrayList2.clear();
        ArrayList arrayList3 = this.f47119e;
        arrayList2.addAll(arrayList3);
        arrayList3.clear();
        ei.c cVar = this.h.h;
        if (cVar != null) {
            int i7 = this.d;
            if (i7 == 1) {
                arrayList = cVar.d;
            } else if (i7 == 2) {
                arrayList = cVar.f10967e;
            } else if (i7 == 3) {
                arrayList = cVar.f10968f;
            } else if (i7 == 5) {
                arrayList = cVar.f10969g;
            } else if (i7 == 4) {
                arrayList = cVar.h;
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ?? aVar = new rg.a(2, true);
                    aVar.d = (ei.b) arrayList.get(i10);
                    arrayList3.add(aVar);
                }
            }
        }
        E(arrayList2, arrayList3);
    }
}
