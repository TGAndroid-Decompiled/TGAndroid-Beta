package org.telegram.ui.Components;

import java.util.ArrayList;
public final class xi implements dj {
    public final int f40263a;
    public final org.telegram.messenger.d5 f40264b;

    public xi(org.telegram.messenger.d5 d5Var, int i7) {
        this.f40263a = i7;
        this.f40264b = d5Var;
    }

    @Override
    public final String run() {
        switch (this.f40263a) {
            case 0:
                ArrayList arrayList = this.f40264b.f21959e;
                if (arrayList.isEmpty()) {
                    return "";
                }
                return pf.b.c().b((String) arrayList.get(0));
            default:
                ArrayList arrayList2 = this.f40264b.f21959e;
                if (arrayList2.isEmpty()) {
                    return "";
                }
                return pf.b.c().b((String) arrayList2.get(0));
        }
    }
}
