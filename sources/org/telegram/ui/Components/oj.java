package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class oj implements Runnable {
    public final int f38115a;
    public final pj f38116b;
    public final String f38117c;
    public final int d;

    public oj(pj pjVar, String str, int i7, int i10) {
        this.f38115a = i10;
        this.f38116b = pjVar;
        this.f38117c = str;
        this.d = i7;
    }

    @Override
    public final void run() {
        switch (this.f38115a) {
            case 0:
                pj pjVar = this.f38116b;
                String str = this.f38117c;
                int i7 = this.d;
                pjVar.getClass();
                org.telegram.messenger.g0.g3(new oj(pjVar, str, i7, 1));
                return;
            default:
                pj pjVar2 = this.f38116b;
                String str2 = this.f38117c;
                int i10 = this.d;
                pjVar2.getClass();
                int i11 = org.telegram.messenger.j10.f24773t0;
                Utilities.f22784g.c(new bi.p3(pjVar2, str2, new ArrayList(org.telegram.messenger.i5.r(i11).Z.values()), new ArrayList(org.telegram.messenger.i5.r(i11).f24570f0), i11, i10));
                return;
        }
    }
}
