package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class s20 implements Runnable {
    public final int f39419a;
    public final u20 f39420b;
    public final String f39421c;
    public final int d;

    public s20(u20 u20Var, String str, int i7, int i10) {
        this.f39419a = i10;
        this.f39420b = u20Var;
        this.f39421c = str;
        this.d = i7;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f39419a) {
            case 0:
                u20 u20Var = this.f39420b;
                String str = this.f39421c;
                int i7 = this.d;
                if (u20Var.f40193e != null) {
                    u20Var.f40193e = null;
                    org.telegram.messenger.g0.g3(new s20(u20Var, str, i7, 1));
                    return;
                }
                return;
            default:
                u20 u20Var2 = this.f39420b;
                String str2 = this.f39421c;
                int i10 = this.d;
                ArrayList arrayList = null;
                u20Var2.f40193e = null;
                if (!org.telegram.messenger.v3.T(u20Var2.f40199x.Q1) && u20Var2.f40199x.R1 != null) {
                    arrayList = new ArrayList(u20Var2.f40199x.R1.participants.participants);
                }
                if (arrayList != null) {
                    Utilities.f22776g.c(new ai.w0(u20Var2, str2, i10, arrayList));
                } else {
                    u20Var2.h = false;
                }
                jg.z1 z1Var = u20Var2.d;
                boolean w10 = org.telegram.messenger.v3.w(3, u20Var2.f40199x.Q1);
                if (org.telegram.messenger.v3.T(u20Var2.f40199x.Q1)) {
                    j3 = u20Var2.f40199x.Q1.f28398id;
                } else {
                    j3 = 0;
                }
                z1Var.g(str2, w10, false, true, false, j3, false, 2, i10);
                return;
        }
    }
}
