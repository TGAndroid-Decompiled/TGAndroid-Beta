package org.telegram.ui.Components;

import java.util.ArrayList;
public final class lj implements rj {
    public final int f37132a;
    public final org.telegram.messenger.f5 f37133b;

    public lj(org.telegram.messenger.f5 f5Var, int i7) {
        this.f37132a = i7;
        this.f37133b = f5Var;
    }

    @Override
    public final String run() {
        switch (this.f37132a) {
            case 0:
                ArrayList arrayList = this.f37133b.f23840e;
                if (arrayList.isEmpty()) {
                    return "";
                }
                return pf.b.c().b((String) arrayList.get(0));
            default:
                ArrayList arrayList2 = this.f37133b.f23840e;
                if (arrayList2.isEmpty()) {
                    return "";
                }
                return pf.b.c().b((String) arrayList2.get(0));
        }
    }
}
