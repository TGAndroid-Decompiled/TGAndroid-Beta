package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class as0 implements Runnable {
    public final int f33630a;
    public final bs0 f33631b;
    public final String f33632c;

    public as0(bs0 bs0Var, String str, int i7) {
        this.f33630a = i7;
        this.f33631b = bs0Var;
        this.f33632c = str;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f33630a) {
            case 0:
                bs0 bs0Var = this.f33631b;
                String str = this.f33632c;
                bs0Var.getClass();
                org.telegram.messenger.g0.g3(new as0(bs0Var, str, 1));
                return;
            default:
                bs0 bs0Var2 = this.f33631b;
                String str2 = this.f33632c;
                ArrayList arrayList = null;
                bs0Var2.f33912f = null;
                if (!org.telegram.messenger.v3.T(bs0Var2.f33913n) && bs0Var2.f33915s.f36632g1 != null) {
                    arrayList = new ArrayList(bs0Var2.f33915s.f36632g1.participants.participants);
                }
                bs0Var2.f33914r = 2;
                if (arrayList != null) {
                    Utilities.f22812g.c(new g(bs0Var2, str2, arrayList, 28));
                } else {
                    bs0Var2.f33914r = 1;
                }
                jg.z1 z1Var = bs0Var2.f33911e;
                if (org.telegram.messenger.v3.T(bs0Var2.f33913n)) {
                    j3 = bs0Var2.f33913n.f28434id;
                } else {
                    j3 = 0;
                }
                z1Var.g(str2, false, false, true, false, j3, false, 2, 1);
                return;
        }
    }
}
