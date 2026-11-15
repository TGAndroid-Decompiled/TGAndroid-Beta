package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class hj implements Runnable {
    public final int f35260a;
    public final ij f35261b;
    public final String f35262c;
    public final int d;

    public hj(ij ijVar, String str, int i7, int i10) {
        this.f35260a = i10;
        this.f35261b = ijVar;
        this.f35262c = str;
        this.d = i7;
    }

    @Override
    public final void run() {
        switch (this.f35260a) {
            case 0:
                ij ijVar = this.f35261b;
                String str = this.f35262c;
                int i7 = this.d;
                ijVar.getClass();
                org.telegram.messenger.g0.h3(new hj(ijVar, str, i7, 1));
                return;
            default:
                ij ijVar2 = this.f35261b;
                String str2 = this.f35262c;
                int i10 = this.d;
                ijVar2.getClass();
                int i11 = org.telegram.messenger.m10.f24940t0;
                Utilities.f22418g.c(new oi.e0(ijVar2, str2, new ArrayList(org.telegram.messenger.g5.r(i11).Z.values()), new ArrayList(org.telegram.messenger.g5.r(i11).f23681f0), i11, i10));
                return;
        }
    }
}
