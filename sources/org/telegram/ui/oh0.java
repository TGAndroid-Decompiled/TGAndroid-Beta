package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class oh0 implements Runnable {
    public final int f48528a;
    public final ph0 f48529b;
    public final String f48530c;

    public oh0(ph0 ph0Var, String str, int i7) {
        this.f48528a = i7;
        this.f48529b = ph0Var;
        this.f48530c = str;
    }

    @Override
    public final void run() {
        switch (this.f48528a) {
            case 0:
                ph0 ph0Var = this.f48529b;
                String str = this.f48530c;
                ph0Var.getClass();
                org.telegram.messenger.g0.h3(new oh0(ph0Var, str, 1));
                return;
            default:
                ph0 ph0Var2 = this.f48529b;
                String str2 = this.f48530c;
                jg.z1 z1Var = ph0Var2.h;
                int i7 = ph0Var2.f48773n.f41308s;
                boolean z9 = true;
                z1Var.g(str2, true, (i7 == 1 || i7 == 3) ? false : false, true, false, 0L, false, 0, 0);
                Utilities.f21343g.c(new pc0(ph0Var2, str2, new ArrayList(ph0Var2.f48773n.f41310x), 10));
                return;
        }
    }
}
