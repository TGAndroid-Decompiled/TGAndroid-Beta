package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class qs0 implements Runnable {
    public final int f29783a;
    public final rs0 f29784b;
    public final String f29785c;

    public qs0(rs0 rs0Var, String str, int i10) {
        this.f29783a = i10;
        this.f29784b = rs0Var;
        this.f29785c = str;
    }

    @Override
    public final void run() {
        long j10;
        switch (this.f29783a) {
            case 0:
                rs0 rs0Var = this.f29784b;
                String str = this.f29785c;
                rs0Var.getClass();
                org.telegram.messenger.i0.g3(new qs0(rs0Var, str, 1));
                return;
            default:
                rs0 rs0Var2 = this.f29784b;
                String str2 = this.f29785c;
                ArrayList arrayList = null;
                rs0Var2.f30081f = null;
                if (!org.telegram.messenger.w3.T(rs0Var2.f30082n) && rs0Var2.f30084s.f24516f1 != null) {
                    arrayList = new ArrayList(rs0Var2.f30084s.f24516f1.participants.participants);
                }
                rs0Var2.f30083r = 2;
                if (arrayList != null) {
                    Utilities.f14523g.c(new jg(rs0Var2, str2, arrayList, 22));
                } else {
                    rs0Var2.f30083r = 1;
                }
                zf.m1 m1Var = rs0Var2.e;
                if (org.telegram.messenger.w3.T(rs0Var2.f30082n)) {
                    j10 = rs0Var2.f30082n.f19794id;
                } else {
                    j10 = 0;
                }
                m1Var.g(str2, false, false, true, false, j10, false, 2, 1);
                return;
        }
    }
}
