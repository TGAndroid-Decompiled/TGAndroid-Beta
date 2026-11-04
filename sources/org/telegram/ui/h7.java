package org.telegram.ui;

import java.util.ArrayList;
public abstract class h7 extends g7 {
    public final ArrayList f45835f;
    public final u7 h;

    public h7(u7 u7Var, int i3) {
        super(i3);
        this.h = u7Var;
        this.f45835f = new ArrayList();
    }

    @Override
    public boolean D(u4.d1 d1Var) {
        return !(this instanceof p7);
    }

    @Override
    public void F() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.f45835f;
        arrayList2.clear();
        ArrayList arrayList3 = this.f45561e;
        arrayList2.addAll(arrayList3);
        arrayList3.clear();
        di.c cVar = this.h.h;
        if (cVar != null) {
            int i3 = this.d;
            if (i3 == 1) {
                arrayList = cVar.d;
            } else if (i3 == 2) {
                arrayList = cVar.f9189e;
            } else if (i3 == 3) {
                arrayList = cVar.f9190f;
            } else if (i3 == 5) {
                arrayList = cVar.f9191g;
            } else if (i3 == 4) {
                arrayList = cVar.h;
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ?? aVar = new sg.a(2, true);
                    aVar.d = (di.b) arrayList.get(i10);
                    arrayList3.add(aVar);
                }
            }
        }
        E(arrayList2, arrayList3);
    }
}
