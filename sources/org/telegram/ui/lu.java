package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
public final class lu implements Runnable {
    public final int f47439a = 1;
    public final uw f47440b;
    public final int f47441c;
    public final ArrayList d;
    public final boolean f47442e;
    public final HashSet f47443f;

    public lu(uw uwVar, int i3, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.f47440b = uwVar;
        this.f47441c = i3;
        this.d = arrayList;
        this.f47442e = z10;
        this.f47443f = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f47439a) {
            case 0:
                this.f47440b.D4(this.d, this.f47441c, false, this.f47442e, this.f47443f);
                return;
            default:
                uw.r0(this.f47440b, this.f47441c, this.d, this.f47442e, this.f47443f);
                return;
        }
    }

    public lu(uw uwVar, ArrayList arrayList, int i3, boolean z10, HashSet hashSet) {
        this.f47440b = uwVar;
        this.d = arrayList;
        this.f47441c = i3;
        this.f47442e = z10;
        this.f47443f = hashSet;
    }
}
