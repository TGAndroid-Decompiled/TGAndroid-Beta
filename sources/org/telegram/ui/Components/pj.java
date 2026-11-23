package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class pj implements Runnable {
    public final int f38497a;
    public final qj f38498b;
    public final String f38499c;
    public final int d;

    public pj(qj qjVar, String str, int i7, int i10) {
        this.f38497a = i10;
        this.f38498b = qjVar;
        this.f38499c = str;
        this.d = i7;
    }

    @Override
    public final void run() {
        switch (this.f38497a) {
            case 0:
                qj qjVar = this.f38498b;
                String str = this.f38499c;
                int i7 = this.d;
                qjVar.getClass();
                org.telegram.messenger.g0.g3(new pj(qjVar, str, i7, 1));
                return;
            default:
                qj qjVar2 = this.f38498b;
                String str2 = this.f38499c;
                int i10 = this.d;
                qjVar2.getClass();
                int i11 = org.telegram.messenger.i10.f24637t0;
                Utilities.f22879g.c(new bi.v3(qjVar2, str2, new ArrayList(org.telegram.messenger.i5.r(i11).Z.values()), new ArrayList(org.telegram.messenger.i5.r(i11).f24693f0), i11, i10));
                return;
        }
    }
}
