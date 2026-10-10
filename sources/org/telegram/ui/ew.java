package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
public final class ew implements Runnable {
    public final int f37417a = 0;
    public final ty f37418b;
    public final ArrayList f37419c;
    public final int d;
    public final boolean f37420e;
    public final HashSet f37421f;

    public ew(ty tyVar, int i10, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.f37418b = tyVar;
        this.d = i10;
        this.f37419c = arrayList;
        this.f37420e = z10;
        this.f37421f = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f37417a) {
            case 0:
                ty.n0(this.f37418b, this.d, this.f37419c, this.f37420e, this.f37421f);
                return;
            default:
                this.f37418b.o4(this.f37419c, this.d, false, this.f37420e, this.f37421f);
                return;
        }
    }

    public ew(ty tyVar, ArrayList arrayList, int i10, boolean z10, HashSet hashSet) {
        this.f37418b = tyVar;
        this.f37419c = arrayList;
        this.d = i10;
        this.f37420e = z10;
        this.f37421f = hashSet;
    }
}
