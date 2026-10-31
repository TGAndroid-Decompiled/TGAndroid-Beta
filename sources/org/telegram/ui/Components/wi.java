package org.telegram.ui.Components;

import java.util.ArrayList;
public final class wi implements cj {
    public final int f32194a;
    public final org.telegram.messenger.f5 f32195b;

    public wi(org.telegram.messenger.f5 f5Var, int i10) {
        this.f32194a = i10;
        this.f32195b = f5Var;
    }

    @Override
    public final String run() {
        switch (this.f32194a) {
            case 0:
                ArrayList arrayList = this.f32195b.e;
                if (arrayList.isEmpty()) {
                    return "";
                }
                return af.b.c().b((String) arrayList.get(0));
            default:
                ArrayList arrayList2 = this.f32195b.e;
                if (arrayList2.isEmpty()) {
                    return "";
                }
                return af.b.c().b((String) arrayList2.get(0));
        }
    }
}
