package org.telegram.ui.Components;

import java.util.ArrayList;
public final class ej implements kj {
    public final int f34325a;
    public final org.telegram.messenger.d5 f34326b;

    public ej(org.telegram.messenger.d5 d5Var, int i7) {
        this.f34325a = i7;
        this.f34326b = d5Var;
    }

    @Override
    public final String run() {
        switch (this.f34325a) {
            case 0:
                ArrayList arrayList = this.f34326b.f23042e;
                if (arrayList.isEmpty()) {
                    return "";
                }
                return pf.b.c().b((String) arrayList.get(0));
            default:
                ArrayList arrayList2 = this.f34326b.f23042e;
                if (arrayList2.isEmpty()) {
                    return "";
                }
                return pf.b.c().b((String) arrayList2.get(0));
        }
    }
}
