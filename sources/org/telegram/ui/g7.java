package org.telegram.ui;

import java.util.ArrayList;
public abstract class g7 extends f7 {
    public final ArrayList f36588f;
    public final s7 h;

    public g7(s7 s7Var, int i10) {
        super(i10);
        this.h = s7Var;
        this.f36588f = new ArrayList();
    }

    @Override
    public boolean D(s4.c1 c1Var) {
        return !(this instanceof o7);
    }

    @Override
    public void F() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.f36588f;
        arrayList2.clear();
        ArrayList arrayList3 = this.f36277e;
        arrayList2.addAll(arrayList3);
        arrayList3.clear();
        ai.c cVar = this.h.f40330f;
        if (cVar != null) {
            int i10 = this.d;
            if (i10 == 1) {
                arrayList = cVar.d;
            } else if (i10 == 2) {
                arrayList = cVar.f747e;
            } else if (i10 == 3) {
                arrayList = cVar.f748f;
            } else if (i10 == 5) {
                arrayList = cVar.f749g;
            } else if (i10 == 4) {
                arrayList = cVar.h;
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ?? aVar = new pg.a(2, true);
                    aVar.d = (ai.b) arrayList.get(i11);
                    arrayList3.add(aVar);
                }
            }
        }
        E(arrayList2, arrayList3);
    }
}
