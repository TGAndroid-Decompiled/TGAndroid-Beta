package org.telegram.ui.Components;

import java.util.ArrayList;
public final class nj implements tj {
    public final int f37884a;
    public final org.telegram.messenger.f5 f37885b;

    public nj(org.telegram.messenger.f5 f5Var, int i7) {
        this.f37884a = i7;
        this.f37885b = f5Var;
    }

    @Override
    public final String run() {
        switch (this.f37884a) {
            case 0:
                ArrayList arrayList = this.f37885b.f23863e;
                if (arrayList.isEmpty()) {
                    return "";
                }
                return pf.b.c().b((String) arrayList.get(0));
            default:
                ArrayList arrayList2 = this.f37885b.f23863e;
                if (arrayList2.isEmpty()) {
                    return "";
                }
                return pf.b.c().b((String) arrayList2.get(0));
        }
    }
}
