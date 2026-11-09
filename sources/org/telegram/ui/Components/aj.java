package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class aj implements Runnable {
    public final int f31865a;
    public final bj f31866b;
    public final String f31867c;
    public final int d;

    public aj(bj bjVar, String str, int i7, int i10) {
        this.f31865a = i10;
        this.f31866b = bjVar;
        this.f31867c = str;
        this.d = i7;
    }

    @Override
    public final void run() {
        switch (this.f31865a) {
            case 0:
                bj bjVar = this.f31866b;
                String str = this.f31867c;
                int i7 = this.d;
                bjVar.getClass();
                org.telegram.messenger.g0.h3(new aj(bjVar, str, i7, 1));
                return;
            default:
                bj bjVar2 = this.f31866b;
                String str2 = this.f31867c;
                int i10 = this.d;
                bjVar2.getClass();
                int i11 = org.telegram.messenger.p10.f24470s0;
                Utilities.f21338g.c(new li.g0(bjVar2, str2, new ArrayList(org.telegram.messenger.g5.r(i11).Y.values()), new ArrayList(org.telegram.messenger.g5.r(i11).f22608e0), i11, i10));
                return;
        }
    }
}
