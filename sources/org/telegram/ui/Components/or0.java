package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class or0 implements Runnable {
    public final int f36929a;
    public final pr0 f36930b;
    public final String f36931c;

    public or0(pr0 pr0Var, String str, int i3) {
        this.f36929a = i3;
        this.f36930b = pr0Var;
        this.f36931c = str;
    }

    @Override
    public final void run() {
        long j10;
        switch (this.f36929a) {
            case 0:
                pr0 pr0Var = this.f36930b;
                String str = this.f36931c;
                pr0Var.getClass();
                org.telegram.messenger.g0.h3(new or0(pr0Var, str, 1));
                return;
            default:
                pr0 pr0Var2 = this.f36930b;
                String str2 = this.f36931c;
                ArrayList arrayList = null;
                pr0Var2.f37228f = null;
                if (!org.telegram.messenger.t3.T(pr0Var2.f37229n) && pr0Var2.f37231s.f40090g1 != null) {
                    arrayList = new ArrayList(pr0Var2.f37231s.f40090g1.participants.participants);
                }
                pr0Var2.f37230r = 2;
                if (arrayList != null) {
                    Utilities.f21389g.c(new e7(pr0Var2, str2, arrayList, 26));
                } else {
                    pr0Var2.f37230r = 1;
                }
                kg.v1 v1Var = pr0Var2.f37227e;
                if (org.telegram.messenger.t3.T(pr0Var2.f37229n)) {
                    j10 = pr0Var2.f37229n.f27001id;
                } else {
                    j10 = 0;
                }
                v1Var.g(str2, false, false, true, false, j10, false, 2, 1);
                return;
        }
    }
}
