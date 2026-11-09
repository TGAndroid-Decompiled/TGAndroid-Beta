package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class nh0 implements Runnable {
    public final int f48193a;
    public final oh0 f48194b;
    public final String f48195c;

    public nh0(oh0 oh0Var, String str, int i7) {
        this.f48193a = i7;
        this.f48194b = oh0Var;
        this.f48195c = str;
    }

    @Override
    public final void run() {
        switch (this.f48193a) {
            case 0:
                oh0 oh0Var = this.f48194b;
                String str = this.f48195c;
                oh0Var.getClass();
                org.telegram.messenger.g0.h3(new nh0(oh0Var, str, 1));
                return;
            default:
                oh0 oh0Var2 = this.f48194b;
                String str2 = this.f48195c;
                jg.z1 z1Var = oh0Var2.h;
                int i7 = oh0Var2.f48452n.f41317s;
                boolean z9 = true;
                z1Var.g(str2, true, (i7 == 1 || i7 == 3) ? false : false, true, false, 0L, false, 0, 0);
                Utilities.f21338g.c(new oc0(oh0Var2, str2, new ArrayList(oh0Var2.f48452n.f41319x), 10));
                return;
        }
    }
}
