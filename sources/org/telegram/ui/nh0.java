package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class nh0 implements Runnable {
    public final int f49565a;
    public final oh0 f49566b;
    public final String f49567c;

    public nh0(oh0 oh0Var, String str, int i7) {
        this.f49565a = i7;
        this.f49566b = oh0Var;
        this.f49567c = str;
    }

    @Override
    public final void run() {
        switch (this.f49565a) {
            case 0:
                oh0 oh0Var = this.f49566b;
                String str = this.f49567c;
                oh0Var.getClass();
                org.telegram.messenger.g0.h3(new nh0(oh0Var, str, 1));
                return;
            default:
                oh0 oh0Var2 = this.f49566b;
                String str2 = this.f49567c;
                jg.z1 z1Var = oh0Var2.h;
                int i7 = oh0Var2.f49973n.f42678s;
                boolean z10 = true;
                z1Var.g(str2, true, (i7 == 1 || i7 == 3) ? false : false, true, false, 0L, false, 0, 0);
                Utilities.f22418g.c(new lc0(oh0Var2, str2, new ArrayList(oh0Var2.f49973n.f42680x), 10));
                return;
        }
    }
}
