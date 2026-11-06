package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
public final class nu implements Runnable {
    public final int f48110a = 1;
    public final ww f48111b;
    public final int f48112c;
    public final ArrayList d;
    public final boolean f48113e;
    public final HashSet f48114f;

    public nu(ww wwVar, int i7, ArrayList arrayList, boolean z9, HashSet hashSet) {
        this.f48111b = wwVar;
        this.f48112c = i7;
        this.d = arrayList;
        this.f48113e = z9;
        this.f48114f = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f48110a) {
            case 0:
                this.f48111b.D4(this.d, this.f48112c, false, this.f48113e, this.f48114f);
                return;
            default:
                ww.r0(this.f48111b, this.f48112c, this.d, this.f48113e, this.f48114f);
                return;
        }
    }

    public nu(ww wwVar, ArrayList arrayList, int i7, boolean z9, HashSet hashSet) {
        this.f48111b = wwVar;
        this.d = arrayList;
        this.f48112c = i7;
        this.f48113e = z9;
        this.f48114f = hashSet;
    }
}
