package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class p20 implements Runnable {
    public final int f38249a;
    public final r20 f38250b;
    public final String f38251c;
    public final int d;

    public p20(r20 r20Var, String str, int i7, int i10) {
        this.f38249a = i10;
        this.f38250b = r20Var;
        this.f38251c = str;
        this.d = i7;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f38249a) {
            case 0:
                r20 r20Var = this.f38250b;
                String str = this.f38251c;
                int i7 = this.d;
                if (r20Var.f38990e != null) {
                    r20Var.f38990e = null;
                    org.telegram.messenger.g0.g3(new p20(r20Var, str, i7, 1));
                    return;
                }
                return;
            default:
                r20 r20Var2 = this.f38250b;
                String str2 = this.f38251c;
                int i10 = this.d;
                ArrayList arrayList = null;
                r20Var2.f38990e = null;
                if (!org.telegram.messenger.v3.T(r20Var2.f38996x.Q1) && r20Var2.f38996x.R1 != null) {
                    arrayList = new ArrayList(r20Var2.f38996x.R1.participants.participants);
                }
                if (arrayList != null) {
                    Utilities.f22781g.c(new bi.t4(r20Var2, str2, i10, arrayList));
                } else {
                    r20Var2.h = false;
                }
                jg.z1 z1Var = r20Var2.d;
                boolean w10 = org.telegram.messenger.v3.w(3, r20Var2.f38996x.Q1);
                if (org.telegram.messenger.v3.T(r20Var2.f38996x.Q1)) {
                    j3 = r20Var2.f38996x.Q1.f28403id;
                } else {
                    j3 = 0;
                }
                z1Var.g(str2, w10, false, true, false, j3, false, 2, i10);
                return;
        }
    }
}
