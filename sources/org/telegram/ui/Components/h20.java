package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class h20 implements Runnable {
    public final int f35152a;
    public final j20 f35153b;
    public final String f35154c;
    public final int d;

    public h20(j20 j20Var, String str, int i7, int i10) {
        this.f35152a = i10;
        this.f35153b = j20Var;
        this.f35154c = str;
        this.d = i7;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f35152a) {
            case 0:
                j20 j20Var = this.f35153b;
                String str = this.f35154c;
                int i7 = this.d;
                if (j20Var.f35837e != null) {
                    j20Var.f35837e = null;
                    org.telegram.messenger.g0.h3(new h20(j20Var, str, i7, 1));
                    return;
                }
                return;
            default:
                j20 j20Var2 = this.f35153b;
                String str2 = this.f35154c;
                int i10 = this.d;
                ArrayList arrayList = null;
                j20Var2.f35837e = null;
                if (!org.telegram.messenger.t3.T(j20Var2.f35843x.Q1) && j20Var2.f35843x.R1 != null) {
                    arrayList = new ArrayList(j20Var2.f35843x.R1.participants.participants);
                }
                ArrayList arrayList2 = arrayList;
                if (arrayList2 != null) {
                    Utilities.f22418g.c(new ci.p0(j20Var2, str2, i10, arrayList2, 24));
                } else {
                    j20Var2.h = false;
                }
                jg.z1 z1Var = j20Var2.d;
                boolean w10 = org.telegram.messenger.t3.w(3, j20Var2.f35843x.Q1);
                if (org.telegram.messenger.t3.T(j20Var2.f35843x.Q1)) {
                    j3 = j20Var2.f35843x.Q1.f28051id;
                } else {
                    j3 = 0;
                }
                z1Var.g(str2, w10, false, true, false, j3, false, 2, i10);
                return;
        }
    }
}
