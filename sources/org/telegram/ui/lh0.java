package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class lh0 implements Runnable {
    public final int f47543a;
    public final mh0 f47544b;
    public final String f47545c;

    public lh0(mh0 mh0Var, String str, int i7) {
        this.f47543a = i7;
        this.f47544b = mh0Var;
        this.f47545c = str;
    }

    @Override
    public final void run() {
        switch (this.f47543a) {
            case 0:
                mh0 mh0Var = this.f47544b;
                String str = this.f47545c;
                mh0Var.getClass();
                org.telegram.messenger.g0.h3(new lh0(mh0Var, str, 1));
                return;
            default:
                mh0 mh0Var2 = this.f47544b;
                String str2 = this.f47545c;
                jg.z1 z1Var = mh0Var2.h;
                int i7 = mh0Var2.f47811n.f41310s;
                boolean z9 = true;
                z1Var.g(str2, true, (i7 == 1 || i7 == 3) ? false : false, true, false, 0L, false, 0, 0);
                Utilities.f21338g.c(new mc0(mh0Var2, str2, new ArrayList(mh0Var2.f47811n.f41312x), 10));
                return;
        }
    }
}
