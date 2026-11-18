package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class qh0 implements Runnable {
    public final int f51268a;
    public final rh0 f51269b;
    public final String f51270c;

    public qh0(rh0 rh0Var, String str, int i7) {
        this.f51268a = i7;
        this.f51269b = rh0Var;
        this.f51270c = str;
    }

    @Override
    public final void run() {
        switch (this.f51268a) {
            case 0:
                rh0 rh0Var = this.f51269b;
                String str = this.f51270c;
                rh0Var.getClass();
                org.telegram.messenger.g0.g3(new qh0(rh0Var, str, 1));
                return;
            default:
                rh0 rh0Var2 = this.f51269b;
                String str2 = this.f51270c;
                jg.z1 z1Var = rh0Var2.h;
                int i7 = rh0Var2.f51615n.f43123s;
                boolean z10 = true;
                z1Var.g(str2, true, (i7 == 1 || i7 == 3) ? false : false, true, false, 0L, false, 0, 0);
                Utilities.f22784g.c(new lc0(rh0Var2, str2, new ArrayList(rh0Var2.f51615n.f43125x), 10));
                return;
        }
    }
}
