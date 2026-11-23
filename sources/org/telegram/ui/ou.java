package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
public final class ou implements Runnable {
    public final int f50764a = 1;
    public final bx f50765b;
    public final int f50766c;
    public final ArrayList d;
    public final boolean f50767e;
    public final HashSet f50768f;

    public ou(bx bxVar, int i7, ArrayList arrayList, boolean z10, HashSet hashSet) {
        this.f50765b = bxVar;
        this.f50766c = i7;
        this.d = arrayList;
        this.f50767e = z10;
        this.f50768f = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f50764a) {
            case 0:
                this.f50765b.K4(this.d, this.f50766c, false, this.f50767e, this.f50768f);
                return;
            default:
                bx.K0(this.f50765b, this.f50766c, this.d, this.f50767e, this.f50768f);
                return;
        }
    }

    public ou(bx bxVar, ArrayList arrayList, int i7, boolean z10, HashSet hashSet) {
        this.f50765b = bxVar;
        this.d = arrayList;
        this.f50766c = i7;
        this.f50767e = z10;
        this.f50768f = hashSet;
    }
}
