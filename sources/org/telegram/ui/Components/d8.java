package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class d8 implements Runnable {
    public final int f34300a;
    public final f8 f34301b;
    public final String f34302c;

    public d8(f8 f8Var, String str, int i7) {
        this.f34300a = i7;
        this.f34301b = f8Var;
        this.f34302c = str;
    }

    @Override
    public final void run() {
        switch (this.f34300a) {
            case 0:
                f8 f8Var = this.f34301b;
                String str = this.f34302c;
                f8Var.f35021f = null;
                org.telegram.messenger.g0.g3(new d8(f8Var, str, 1));
                return;
            default:
                f8 f8Var2 = this.f34301b;
                String str2 = this.f34302c;
                f8Var2.getClass();
                Utilities.f22784g.c(new e8(f8Var2, str2, new ArrayList(f8Var2.f35022n.f35407r2)));
                return;
        }
    }
}
