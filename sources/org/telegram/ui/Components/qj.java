package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class qj implements Runnable {
    public final int f38941a;
    public final rj f38942b;
    public final String f38943c;
    public final int d;

    public qj(rj rjVar, String str, int i7, int i10) {
        this.f38941a = i10;
        this.f38942b = rjVar;
        this.f38943c = str;
        this.d = i7;
    }

    @Override
    public final void run() {
        switch (this.f38941a) {
            case 0:
                rj rjVar = this.f38942b;
                String str = this.f38943c;
                int i7 = this.d;
                rjVar.getClass();
                org.telegram.messenger.g0.g3(new qj(rjVar, str, i7, 1));
                return;
            default:
                rj rjVar2 = this.f38942b;
                String str2 = this.f38943c;
                int i10 = this.d;
                rjVar2.getClass();
                int i11 = org.telegram.messenger.j10.f24798t0;
                Utilities.f22809g.c(new bi.t3(rjVar2, str2, new ArrayList(org.telegram.messenger.i5.r(i11).Z.values()), new ArrayList(org.telegram.messenger.i5.r(i11).f24595f0), i11, i10));
                return;
        }
    }
}
