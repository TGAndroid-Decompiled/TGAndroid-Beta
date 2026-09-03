package org.telegram.ui;

import java.util.ArrayList;
public abstract class k7 extends j7 {
    public final ArrayList f35436f;
    public final w7 h;

    public k7(w7 w7Var, int i10) {
        super(i10);
        this.h = w7Var;
        this.f35436f = new ArrayList();
    }

    @Override
    public boolean D(f2.l1 l1Var) {
        return !(this instanceof s7);
    }

    @Override
    public void F() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.f35436f;
        arrayList2.clear();
        ArrayList arrayList3 = this.e;
        arrayList2.addAll(arrayList3);
        arrayList3.clear();
        mh.b bVar = this.h.f39283f;
        if (bVar != null) {
            int i10 = this.d;
            if (i10 == 1) {
                arrayList = bVar.d;
            } else if (i10 == 2) {
                arrayList = bVar.e;
            } else if (i10 == 3) {
                arrayList = bVar.f14165f;
            } else if (i10 == 5) {
                arrayList = bVar.f14166g;
            } else if (i10 == 4) {
                arrayList = bVar.h;
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ?? bVar2 = new bg.b(2, true);
                    bVar2.d = (mh.a) arrayList.get(i11);
                    arrayList3.add(bVar2);
                }
            }
        }
        E(arrayList2, arrayList3);
    }
}
