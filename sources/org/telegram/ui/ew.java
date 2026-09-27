package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
public final class ew implements Runnable {
    public final int f33334a = 0;
    public final ty f33335b;
    public final ArrayList f33336c;
    public final int d;
    public final boolean e;
    public final HashSet f33337f;

    public ew(ty tyVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.f33335b = tyVar;
        this.d = i10;
        this.f33336c = arrayList;
        this.e = z10;
        this.f33337f = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f33334a) {
            case 0:
                ty.p0(this.f33335b, this.d, this.f33336c, this.e, this.f33337f);
                return;
            default:
                this.f33335b.A4(this.f33336c, this.d, false, this.e, this.f33337f);
                return;
        }
    }

    public ew(ty tyVar, ArrayList arrayList, int i10, boolean z10, HashSet hashSet) {
        this.f33335b = tyVar;
        this.f33336c = arrayList;
        this.d = i10;
        this.e = z10;
        this.f33337f = hashSet;
    }
}
