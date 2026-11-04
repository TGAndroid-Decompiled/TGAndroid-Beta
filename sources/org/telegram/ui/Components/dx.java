package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;
public final class dx implements sx {
    public final ex f33204a;

    public dx(ex exVar) {
        this.f33204a = exVar;
    }

    @Override
    public final void d() {
        ex exVar = this.f33204a;
        if (exVar.G.W.G) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        exVar.G.W.e(true);
        ex.E(exVar, new cl(18, this, arrayList), arrayList, true);
    }

    @Override
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.f33204a.f33497w;
        cl clVar = new cl(17, this, str);
        if (org.telegram.messenger.i6.d(str)) {
            xu0.G3.c(org.telegram.messenger.h10.f22829t0, str, new ei(2, linkedHashSet, clVar));
        } else {
            clVar.run();
        }
    }
}
