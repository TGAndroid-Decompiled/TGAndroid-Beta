package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class zi implements Runnable {
    public final int f33167a;
    public final aj f33168b;
    public final String f33169c;
    public final int d;

    public zi(aj ajVar, String str, int i10, int i11) {
        this.f33167a = i11;
        this.f33168b = ajVar;
        this.f33169c = str;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f33167a) {
            case 0:
                aj ajVar = this.f33168b;
                String str = this.f33169c;
                int i10 = this.d;
                ajVar.getClass();
                org.telegram.messenger.i0.g3(new zi(ajVar, str, i10, 1));
                return;
            default:
                aj ajVar2 = this.f33168b;
                String str2 = this.f33169c;
                int i11 = this.d;
                ajVar2.getClass();
                int i12 = org.telegram.messenger.e20.f15506s0;
                Utilities.f14523g.c(new bi.k0(ajVar2, str2, new ArrayList(org.telegram.messenger.i5.r(i12).Y.values()), new ArrayList(org.telegram.messenger.i5.r(i12).f16218e0), i12, i11));
                return;
        }
    }
}
