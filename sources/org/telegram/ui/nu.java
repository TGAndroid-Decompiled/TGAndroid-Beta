package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashSet;
public final class nu implements Runnable {
    public final int f48135a = 1;
    public final ww f48136b;
    public final int f48137c;
    public final ArrayList d;
    public final boolean f48138e;
    public final HashSet f48139f;

    public nu(ww wwVar, int i7, ArrayList arrayList, boolean z9, HashSet hashSet) {
        this.f48136b = wwVar;
        this.f48137c = i7;
        this.d = arrayList;
        this.f48138e = z9;
        this.f48139f = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f48135a) {
            case 0:
                this.f48136b.D4(this.d, this.f48137c, false, this.f48138e, this.f48139f);
                return;
            default:
                ww.r0(this.f48136b, this.f48137c, this.d, this.f48138e, this.f48139f);
                return;
        }
    }

    public nu(ww wwVar, ArrayList arrayList, int i7, boolean z9, HashSet hashSet) {
        this.f48136b = wwVar;
        this.d = arrayList;
        this.f48137c = i7;
        this.f48138e = z9;
        this.f48139f = hashSet;
    }
}
