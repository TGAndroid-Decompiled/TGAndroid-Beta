package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class hj implements Runnable {
    public final int f35269a;
    public final ij f35270b;
    public final String f35271c;
    public final int d;

    public hj(ij ijVar, String str, int i7, int i10) {
        this.f35269a = i10;
        this.f35270b = ijVar;
        this.f35271c = str;
        this.d = i7;
    }

    @Override
    public final void run() {
        switch (this.f35269a) {
            case 0:
                ij ijVar = this.f35270b;
                String str = this.f35271c;
                int i7 = this.d;
                ijVar.getClass();
                org.telegram.messenger.g0.h3(new hj(ijVar, str, i7, 1));
                return;
            default:
                ij ijVar2 = this.f35270b;
                String str2 = this.f35271c;
                int i10 = this.d;
                ijVar2.getClass();
                int i11 = org.telegram.messenger.m10.f24934t0;
                Utilities.f22418g.c(new oi.e0(ijVar2, str2, new ArrayList(org.telegram.messenger.g5.r(i11).Z.values()), new ArrayList(org.telegram.messenger.g5.r(i11).f23679f0), i11, i10));
                return;
        }
    }
}
