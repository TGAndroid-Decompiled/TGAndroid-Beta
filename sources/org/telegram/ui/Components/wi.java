package org.telegram.ui.Components;

import java.util.ArrayList;
public final class wi implements cj {
    public final int f39975a;
    public final org.telegram.messenger.d5 f39976b;

    public wi(org.telegram.messenger.d5 d5Var, int i7) {
        this.f39975a = i7;
        this.f39976b = d5Var;
    }

    @Override
    public final String run() {
        switch (this.f39975a) {
            case 0:
                ArrayList arrayList = this.f39976b.f21993e;
                if (arrayList.isEmpty()) {
                    return "";
                }
                return pf.b.c().b((String) arrayList.get(0));
            default:
                ArrayList arrayList2 = this.f39976b.f21993e;
                if (arrayList2.isEmpty()) {
                    return "";
                }
                return pf.b.c().b((String) arrayList2.get(0));
        }
    }
}
