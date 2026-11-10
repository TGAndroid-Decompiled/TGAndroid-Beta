package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class zi implements Runnable {
    public final int f41007a;
    public final aj f41008b;
    public final String f41009c;
    public final int d;

    public zi(aj ajVar, String str, int i7, int i10) {
        this.f41007a = i10;
        this.f41008b = ajVar;
        this.f41009c = str;
        this.d = i7;
    }

    @Override
    public final void run() {
        switch (this.f41007a) {
            case 0:
                aj ajVar = this.f41008b;
                String str = this.f41009c;
                int i7 = this.d;
                ajVar.getClass();
                org.telegram.messenger.g0.h3(new zi(ajVar, str, i7, 1));
                return;
            default:
                aj ajVar2 = this.f41008b;
                String str2 = this.f41009c;
                int i10 = this.d;
                ajVar2.getClass();
                int i11 = org.telegram.messenger.p10.f24474s0;
                Utilities.f21343g.c(new li.g0(ajVar2, str2, new ArrayList(org.telegram.messenger.g5.r(i11).Y.values()), new ArrayList(org.telegram.messenger.g5.r(i11).f22612e0), i11, i10));
                return;
        }
    }
}
