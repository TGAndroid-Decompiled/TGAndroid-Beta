package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class as0 implements Runnable {
    public final int f33617a;
    public final bs0 f33618b;
    public final String f33619c;

    public as0(bs0 bs0Var, String str, int i7) {
        this.f33617a = i7;
        this.f33618b = bs0Var;
        this.f33619c = str;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f33617a) {
            case 0:
                bs0 bs0Var = this.f33618b;
                String str = this.f33619c;
                bs0Var.getClass();
                org.telegram.messenger.g0.g3(new as0(bs0Var, str, 1));
                return;
            default:
                bs0 bs0Var2 = this.f33618b;
                String str2 = this.f33619c;
                ArrayList arrayList = null;
                bs0Var2.f33919f = null;
                if (!org.telegram.messenger.v3.T(bs0Var2.f33920n) && bs0Var2.f33922s.f36637g1 != null) {
                    arrayList = new ArrayList(bs0Var2.f33922s.f36637g1.participants.participants);
                }
                bs0Var2.f33921r = 2;
                if (arrayList != null) {
                    Utilities.f22809g.c(new g(bs0Var2, str2, arrayList, 28));
                } else {
                    bs0Var2.f33921r = 1;
                }
                jg.z1 z1Var = bs0Var2.f33918e;
                if (org.telegram.messenger.v3.T(bs0Var2.f33920n)) {
                    j3 = bs0Var2.f33920n.f28431id;
                } else {
                    j3 = 0;
                }
                z1Var.g(str2, false, false, true, false, j3, false, 2, 1);
                return;
        }
    }
}
