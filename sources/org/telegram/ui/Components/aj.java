package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class aj implements Runnable {
    public final int f31831a;
    public final bj f31832b;
    public final String f31833c;
    public final int d;

    public aj(bj bjVar, String str, int i7, int i10) {
        this.f31831a = i10;
        this.f31832b = bjVar;
        this.f31833c = str;
        this.d = i7;
    }

    @Override
    public final void run() {
        switch (this.f31831a) {
            case 0:
                bj bjVar = this.f31832b;
                String str = this.f31833c;
                int i7 = this.d;
                bjVar.getClass();
                org.telegram.messenger.g0.h3(new aj(bjVar, str, i7, 1));
                return;
            default:
                bj bjVar2 = this.f31832b;
                String str2 = this.f31833c;
                int i10 = this.d;
                bjVar2.getClass();
                int i11 = org.telegram.messenger.p10.f24467s0;
                Utilities.f21335g.c(new li.g0(bjVar2, str2, new ArrayList(org.telegram.messenger.g5.r(i11).Y.values()), new ArrayList(org.telegram.messenger.g5.r(i11).f22589e0), i11, i10));
                return;
        }
    }
}
