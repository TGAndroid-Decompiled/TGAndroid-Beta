package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class ps0 implements Runnable {
    public final int f29420a;
    public final qs0 f29421b;
    public final String f29422c;

    public ps0(qs0 qs0Var, String str, int i10) {
        this.f29420a = i10;
        this.f29421b = qs0Var;
        this.f29422c = str;
    }

    @Override
    public final void run() {
        long j10;
        switch (this.f29420a) {
            case 0:
                qs0 qs0Var = this.f29421b;
                String str = this.f29422c;
                qs0Var.getClass();
                org.telegram.messenger.i0.g3(new ps0(qs0Var, str, 1));
                return;
            default:
                qs0 qs0Var2 = this.f29421b;
                String str2 = this.f29422c;
                ArrayList arrayList = null;
                qs0Var2.f29735f = null;
                if (!org.telegram.messenger.w3.T(qs0Var2.f29736n) && qs0Var2.f29738s.f33188f1 != null) {
                    arrayList = new ArrayList(qs0Var2.f29738s.f33188f1.participants.participants);
                }
                qs0Var2.f29737r = 2;
                if (arrayList != null) {
                    Utilities.f14522g.c(new jg(qs0Var2, str2, arrayList, 22));
                } else {
                    qs0Var2.f29737r = 1;
                }
                zf.m1 m1Var = qs0Var2.e;
                if (org.telegram.messenger.w3.T(qs0Var2.f29736n)) {
                    j10 = qs0Var2.f29736n.f19793id;
                } else {
                    j10 = 0;
                }
                m1Var.g(str2, false, false, true, false, j10, false, 2, 1);
                return;
        }
    }
}
