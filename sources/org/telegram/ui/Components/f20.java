package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class f20 implements Runnable {
    public final int f33563a;
    public final h20 f33564b;
    public final String f33565c;
    public final int d;

    public f20(h20 h20Var, String str, int i7, int i10) {
        this.f33563a = i10;
        this.f33564b = h20Var;
        this.f33565c = str;
        this.d = i7;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f33563a) {
            case 0:
                h20 h20Var = this.f33564b;
                String str = this.f33565c;
                int i7 = this.d;
                if (h20Var.f34154e != null) {
                    h20Var.f34154e = null;
                    org.telegram.messenger.g0.h3(new f20(h20Var, str, i7, 1));
                    return;
                }
                return;
            default:
                h20 h20Var2 = this.f33564b;
                String str2 = this.f33565c;
                int i10 = this.d;
                ArrayList arrayList = null;
                h20Var2.f34154e = null;
                if (!org.telegram.messenger.t3.T(h20Var2.f34160x.M1) && h20Var2.f34160x.N1 != null) {
                    arrayList = new ArrayList(h20Var2.f34160x.N1.participants.participants);
                }
                ArrayList arrayList2 = arrayList;
                if (arrayList2 != null) {
                    Utilities.f21338g.c(new ai.a1(h20Var2, str2, i10, arrayList2, 24));
                } else {
                    h20Var2.h = false;
                }
                jg.z1 z1Var = h20Var2.d;
                boolean w10 = org.telegram.messenger.t3.w(3, h20Var2.f34160x.M1);
                if (org.telegram.messenger.t3.T(h20Var2.f34160x.M1)) {
                    j3 = h20Var2.f34160x.M1.f26956id;
                } else {
                    j3 = 0;
                }
                z1Var.g(str2, w10, false, true, false, j3, false, 2, i10);
                return;
        }
    }
}
