package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class zr0 implements Runnable {
    public final int f43031a;
    public final bs0 f43032b;
    public final String f43033c;

    public zr0(bs0 bs0Var, String str, int i7) {
        this.f43031a = i7;
        this.f43032b = bs0Var;
        this.f43033c = str;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f43031a) {
            case 0:
                bs0 bs0Var = this.f43032b;
                String str = this.f43033c;
                bs0Var.getClass();
                org.telegram.messenger.g0.g3(new zr0(bs0Var, str, 1));
                return;
            default:
                bs0 bs0Var2 = this.f43032b;
                String str2 = this.f43033c;
                ArrayList arrayList = null;
                bs0Var2.f33808f = null;
                if (!org.telegram.messenger.v3.T(bs0Var2.f33809n) && bs0Var2.f33811s.f36114g1 != null) {
                    arrayList = new ArrayList(bs0Var2.f33811s.f36114g1.participants.participants);
                }
                bs0Var2.f33810r = 2;
                if (arrayList != null) {
                    Utilities.f22879g.c(new org.telegram.ui.Cells.fa(bs0Var2, str2, arrayList, 29));
                } else {
                    bs0Var2.f33810r = 1;
                }
                jg.z1 z1Var = bs0Var2.f33807e;
                if (org.telegram.messenger.v3.T(bs0Var2.f33809n)) {
                    j3 = bs0Var2.f33809n.f28492id;
                } else {
                    j3 = 0;
                }
                z1Var.g(str2, false, false, true, false, j3, false, 2, 1);
                return;
        }
    }
}
