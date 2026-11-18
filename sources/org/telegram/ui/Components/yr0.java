package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class yr0 implements Runnable {
    public final int f42621a;
    public final zr0 f42622b;
    public final String f42623c;

    public yr0(zr0 zr0Var, String str, int i7) {
        this.f42621a = i7;
        this.f42622b = zr0Var;
        this.f42623c = str;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f42621a) {
            case 0:
                zr0 zr0Var = this.f42622b;
                String str = this.f42623c;
                zr0Var.getClass();
                org.telegram.messenger.g0.g3(new yr0(zr0Var, str, 1));
                return;
            default:
                zr0 zr0Var2 = this.f42622b;
                String str2 = this.f42623c;
                ArrayList arrayList = null;
                zr0Var2.f42939f = null;
                if (!org.telegram.messenger.v3.T(zr0Var2.f42940n) && zr0Var2.f42942s.f35590g1 != null) {
                    arrayList = new ArrayList(zr0Var2.f42942s.f35590g1.participants.participants);
                }
                zr0Var2.f42941r = 2;
                if (arrayList != null) {
                    Utilities.f22781g.c(new k7(zr0Var2, str2, arrayList, 27));
                } else {
                    zr0Var2.f42941r = 1;
                }
                jg.z1 z1Var = zr0Var2.f42938e;
                if (org.telegram.messenger.v3.T(zr0Var2.f42940n)) {
                    j3 = zr0Var2.f42940n.f28403id;
                } else {
                    j3 = 0;
                }
                z1Var.g(str2, false, false, true, false, j3, false, 2, 1);
                return;
        }
    }
}
