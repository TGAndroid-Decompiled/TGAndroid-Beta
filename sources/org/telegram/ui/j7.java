package org.telegram.ui;

import java.util.ArrayList;
public abstract class j7 extends i7 {
    public final ArrayList f38185f;
    public final v7 h;

    public j7(v7 v7Var, int i10) {
        super(i10);
        this.h = v7Var;
        this.f38185f = new ArrayList();
    }

    @Override
    public boolean D(s4.b1 b1Var) {
        return !(this instanceof r7);
    }

    @Override
    public void F() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.f38185f;
        arrayList2.clear();
        ArrayList arrayList3 = this.e;
        arrayList2.addAll(arrayList3);
        arrayList3.clear();
        bi.c cVar = this.h.f42126f;
        if (cVar != null) {
            int i10 = this.d;
            if (i10 == 1) {
                arrayList = cVar.d;
            } else if (i10 == 2) {
                arrayList = cVar.e;
            } else if (i10 == 3) {
                arrayList = cVar.f4432f;
            } else if (i10 == 5) {
                arrayList = cVar.f4433g;
            } else if (i10 == 4) {
                arrayList = cVar.h;
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ?? aVar = new pg.a(2, true);
                    aVar.d = (bi.b) arrayList.get(i11);
                    arrayList3.add(aVar);
                }
            }
        }
        E(arrayList2, arrayList3);
    }
}
