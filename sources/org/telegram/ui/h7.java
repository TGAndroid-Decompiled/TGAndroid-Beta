package org.telegram.ui;

import java.util.ArrayList;
public abstract class h7 extends g7 {
    public final ArrayList f34089f;
    public final t7 h;

    public h7(t7 t7Var, int i10) {
        super(i10);
        this.h = t7Var;
        this.f34089f = new ArrayList();
    }

    @Override
    public boolean D(s4.c1 c1Var) {
        return !(this instanceof p7);
    }

    @Override
    public void F() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.f34089f;
        arrayList2.clear();
        ArrayList arrayList3 = this.e;
        arrayList2.addAll(arrayList3);
        arrayList3.clear();
        zh.b bVar = this.h.f37589f;
        if (bVar != null) {
            int i10 = this.d;
            if (i10 == 1) {
                arrayList = bVar.d;
            } else if (i10 == 2) {
                arrayList = bVar.e;
            } else if (i10 == 3) {
                arrayList = bVar.f49453f;
            } else if (i10 == 5) {
                arrayList = bVar.f49454g;
            } else if (i10 == 4) {
                arrayList = bVar.h;
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ?? aVar = new og.a(2, true);
                    aVar.d = (zh.a) arrayList.get(i11);
                    arrayList3.add(aVar);
                }
            }
        }
        E(arrayList2, arrayList3);
    }
}
