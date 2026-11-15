package org.telegram.ui.Components;

import java.util.ArrayList;
public final class ej implements kj {
    public final int f34326a;
    public final org.telegram.messenger.d5 f34327b;

    public ej(org.telegram.messenger.d5 d5Var, int i7) {
        this.f34326a = i7;
        this.f34327b = d5Var;
    }

    @Override
    public final String run() {
        switch (this.f34326a) {
            case 0:
                ArrayList arrayList = this.f34327b.f23034e;
                if (arrayList.isEmpty()) {
                    return "";
                }
                return pf.b.c().b((String) arrayList.get(0));
            default:
                ArrayList arrayList2 = this.f34327b.f23034e;
                if (arrayList2.isEmpty()) {
                    return "";
                }
                return pf.b.c().b((String) arrayList2.get(0));
        }
    }
}
