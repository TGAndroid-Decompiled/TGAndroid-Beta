package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class zi implements Runnable {
    public final int f33069a;
    public final aj f33070b;
    public final String f33071c;
    public final int d;

    public zi(aj ajVar, String str, int i10, int i11) {
        this.f33069a = i11;
        this.f33070b = ajVar;
        this.f33071c = str;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f33069a) {
            case 0:
                aj ajVar = this.f33070b;
                String str = this.f33071c;
                int i10 = this.d;
                ajVar.getClass();
                org.telegram.messenger.i0.g3(new zi(ajVar, str, i10, 1));
                return;
            default:
                aj ajVar2 = this.f33070b;
                String str2 = this.f33071c;
                int i11 = this.d;
                ajVar2.getClass();
                int i12 = org.telegram.messenger.d20.f15147s0;
                Utilities.f14522g.c(new bi.k0(ajVar2, str2, new ArrayList(org.telegram.messenger.i5.r(i12).Y.values()), new ArrayList(org.telegram.messenger.i5.r(i12).f16065e0), i12, i11));
                return;
        }
    }
}
