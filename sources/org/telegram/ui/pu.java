package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
public final class pu implements Runnable {
    public final int f50937a = 1;
    public final cx f50938b;
    public final int f50939c;
    public final ArrayList d;
    public final boolean f50940e;
    public final HashSet f50941f;

    public pu(cx cxVar, int i7, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.f50938b = cxVar;
        this.f50939c = i7;
        this.d = arrayList;
        this.f50940e = z10;
        this.f50941f = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f50937a) {
            case 0:
                this.f50938b.K4(this.d, this.f50939c, false, this.f50940e, this.f50941f);
                return;
            default:
                cx.K0(this.f50938b, this.f50939c, this.d, this.f50940e, this.f50941f);
                return;
        }
    }

    public pu(cx cxVar, ArrayList arrayList, int i7, boolean z10, HashSet hashSet) {
        this.f50938b = cxVar;
        this.d = arrayList;
        this.f50939c = i7;
        this.f50940e = z10;
        this.f50941f = hashSet;
    }
}
