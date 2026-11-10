package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class x7 implements Runnable {
    public final int f40211a;
    public final z7 f40212b;
    public final String f40213c;

    public x7(z7 z7Var, String str, int i7) {
        this.f40211a = i7;
        this.f40212b = z7Var;
        this.f40213c = str;
    }

    @Override
    public final void run() {
        switch (this.f40211a) {
            case 0:
                z7 z7Var = this.f40212b;
                String str = this.f40213c;
                z7Var.f40891f = null;
                org.telegram.messenger.g0.h3(new x7(z7Var, str, 1));
                return;
            default:
                z7 z7Var2 = this.f40212b;
                String str2 = this.f40213c;
                z7Var2.getClass();
                Utilities.f21343g.c(new y7(z7Var2, str2, new ArrayList(z7Var2.f40892n.f31753q2)));
                return;
        }
    }
}
