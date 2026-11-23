package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class ph0 implements Runnable {
    public final int f51025a;
    public final qh0 f51026b;
    public final String f51027c;

    public ph0(qh0 qh0Var, String str, int i7) {
        this.f51025a = i7;
        this.f51026b = qh0Var;
        this.f51027c = str;
    }

    @Override
    public final void run() {
        switch (this.f51025a) {
            case 0:
                qh0 qh0Var = this.f51026b;
                String str = this.f51027c;
                qh0Var.getClass();
                org.telegram.messenger.g0.g3(new ph0(qh0Var, str, 1));
                return;
            default:
                qh0 qh0Var2 = this.f51026b;
                String str2 = this.f51027c;
                jg.z1 z1Var = qh0Var2.h;
                int i7 = qh0Var2.f51461n.f43243s;
                boolean z10 = true;
                z1Var.g(str2, true, (i7 == 1 || i7 == 3) ? false : false, true, false, 0L, false, 0, 0);
                Utilities.f22879g.c(new lc0(qh0Var2, str2, new ArrayList(qh0Var2.f51461n.f43245x), 10));
                return;
        }
    }
}
