package org.telegram.ui.Components;

import java.util.ArrayList;
public final class wi implements cj {
    public final int f40011a;
    public final org.telegram.messenger.d5 f40012b;

    public wi(org.telegram.messenger.d5 d5Var, int i3) {
        this.f40011a = i3;
        this.f40012b = d5Var;
    }

    @Override
    public final String run() {
        switch (this.f40011a) {
            case 0:
                ArrayList arrayList = this.f40012b.f22150e;
                if (arrayList.isEmpty()) {
                    return "";
                }
                return mf.b.c().b((String) arrayList.get(0));
            default:
                ArrayList arrayList2 = this.f40012b.f22150e;
                if (arrayList2.isEmpty()) {
                    return "";
                }
                return mf.b.c().b((String) arrayList2.get(0));
        }
    }
}
