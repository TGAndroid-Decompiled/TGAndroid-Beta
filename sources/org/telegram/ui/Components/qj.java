package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class qj implements Runnable {
    public final int f38935a;
    public final rj f38936b;
    public final String f38937c;
    public final int d;

    public qj(rj rjVar, String str, int i7, int i10) {
        this.f38935a = i10;
        this.f38936b = rjVar;
        this.f38937c = str;
        this.d = i7;
    }

    @Override
    public final void run() {
        switch (this.f38935a) {
            case 0:
                rj rjVar = this.f38936b;
                String str = this.f38937c;
                int i7 = this.d;
                rjVar.getClass();
                org.telegram.messenger.g0.g3(new qj(rjVar, str, i7, 1));
                return;
            default:
                rj rjVar2 = this.f38936b;
                String str2 = this.f38937c;
                int i10 = this.d;
                rjVar2.getClass();
                int i11 = org.telegram.messenger.k10.f24968t0;
                Utilities.f22812g.c(new bi.t3(rjVar2, str2, new ArrayList(org.telegram.messenger.i5.r(i11).Z.values()), new ArrayList(org.telegram.messenger.i5.r(i11).f24605f0), i11, i10));
                return;
        }
    }
}
