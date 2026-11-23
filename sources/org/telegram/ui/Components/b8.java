package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class b8 implements Runnable {
    public final int f33680a;
    public final d8 f33681b;
    public final String f33682c;

    public b8(d8 d8Var, String str, int i7) {
        this.f33680a = i7;
        this.f33681b = d8Var;
        this.f33682c = str;
    }

    @Override
    public final void run() {
        switch (this.f33680a) {
            case 0:
                d8 d8Var = this.f33681b;
                String str = this.f33682c;
                d8Var.f34232f = null;
                org.telegram.messenger.g0.g3(new b8(d8Var, str, 1));
                return;
            default:
                d8 d8Var2 = this.f33681b;
                String str2 = this.f33682c;
                d8Var2.getClass();
                Utilities.f22879g.c(new c8(d8Var2, str2, new ArrayList(d8Var2.f34233n.f34613r2)));
                return;
        }
    }
}
