package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
public final class nu implements Runnable {
    public final int f48136a = 1;
    public final ww f48137b;
    public final int f48138c;
    public final ArrayList d;
    public final boolean f48139e;
    public final HashSet f48140f;

    public nu(ww wwVar, int i7, ArrayList arrayList, boolean z9, HashSet hashSet) {
        this.f48137b = wwVar;
        this.f48138c = i7;
        this.d = arrayList;
        this.f48139e = z9;
        this.f48140f = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f48136a) {
            case 0:
                this.f48137b.D4(this.d, this.f48138c, false, this.f48139e, this.f48140f);
                return;
            default:
                ww.r0(this.f48137b, this.f48138c, this.d, this.f48139e, this.f48140f);
                return;
        }
    }

    public nu(ww wwVar, ArrayList arrayList, int i7, boolean z9, HashSet hashSet) {
        this.f48137b = wwVar;
        this.d = arrayList;
        this.f48138c = i7;
        this.f48139e = z9;
        this.f48140f = hashSet;
    }
}
