package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class zi implements Runnable {
    public final int f41047a;
    public final aj f41048b;
    public final String f41049c;
    public final int d;

    public zi(aj ajVar, String str, int i3, int i10) {
        this.f41047a = i10;
        this.f41048b = ajVar;
        this.f41049c = str;
        this.d = i3;
    }

    @Override
    public final void run() {
        switch (this.f41047a) {
            case 0:
                aj ajVar = this.f41048b;
                String str = this.f41049c;
                int i3 = this.d;
                ajVar.getClass();
                org.telegram.messenger.g0.h3(new zi(ajVar, str, i3, 1));
                return;
            default:
                aj ajVar2 = this.f41048b;
                String str2 = this.f41049c;
                int i10 = this.d;
                ajVar2.getClass();
                int i11 = org.telegram.messenger.h10.f22829t0;
                Utilities.f21389g.c(new mi.g0(ajVar2, str2, new ArrayList(org.telegram.messenger.g5.r(i11).Z.values()), new ArrayList(org.telegram.messenger.g5.r(i11).f22653f0), i11, i10));
                return;
        }
    }
}
