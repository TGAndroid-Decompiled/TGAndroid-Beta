package org.telegram.ui;

import java.util.ArrayList;
public abstract class g7 extends f7 {
    public final ArrayList f45856f;
    public final t7 h;

    public g7(t7 t7Var, int i7) {
        super(i7);
        this.h = t7Var;
        this.f45856f = new ArrayList();
    }

    @Override
    public boolean D(v4.d1 d1Var) {
        return !(this instanceof o7);
    }

    @Override
    public void F() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.f45856f;
        arrayList2.clear();
        ArrayList arrayList3 = this.f45467e;
        arrayList2.addAll(arrayList3);
        arrayList3.clear();
        ci.c cVar = this.h.h;
        if (cVar != null) {
            int i7 = this.d;
            if (i7 == 1) {
                arrayList = cVar.d;
            } else if (i7 == 2) {
                arrayList = cVar.f6426e;
            } else if (i7 == 3) {
                arrayList = cVar.f6427f;
            } else if (i7 == 5) {
                arrayList = cVar.f6428g;
            } else if (i7 == 4) {
                arrayList = cVar.h;
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ?? aVar = new rg.a(2, true);
                    aVar.d = (ci.b) arrayList.get(i10);
                    arrayList3.add(aVar);
                }
            }
        }
        E(arrayList2, arrayList3);
    }
}
