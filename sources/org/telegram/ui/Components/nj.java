package org.telegram.ui.Components;

import java.util.ArrayList;
public final class nj implements tj {
    public final int f37841a;
    public final org.telegram.messenger.f5 f37842b;

    public nj(org.telegram.messenger.f5 f5Var, int i7) {
        this.f37841a = i7;
        this.f37842b = f5Var;
    }

    @Override
    public final String run() {
        switch (this.f37841a) {
            case 0:
                ArrayList arrayList = this.f37842b.f23827e;
                if (arrayList.isEmpty()) {
                    return "";
                }
                return pf.b.c().b((String) arrayList.get(0));
            default:
                ArrayList arrayList2 = this.f37842b.f23827e;
                if (arrayList2.isEmpty()) {
                    return "";
                }
                return pf.b.c().b((String) arrayList2.get(0));
        }
    }
}
