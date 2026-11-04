package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class hh0 implements Runnable {
    public final int f45924a;
    public final jh0 f45925b;
    public final String f45926c;

    public hh0(jh0 jh0Var, String str, int i3) {
        this.f45924a = i3;
        this.f45925b = jh0Var;
        this.f45926c = str;
    }

    @Override
    public final void run() {
        switch (this.f45924a) {
            case 0:
                jh0 jh0Var = this.f45925b;
                String str = this.f45926c;
                jh0Var.getClass();
                org.telegram.messenger.g0.h3(new hh0(jh0Var, str, 1));
                return;
            default:
                jh0 jh0Var2 = this.f45925b;
                String str2 = this.f45926c;
                kg.v1 v1Var = jh0Var2.h;
                int i3 = jh0Var2.f46625n.f41339s;
                boolean z10 = true;
                v1Var.g(str2, true, (i3 == 1 || i3 == 3) ? false : false, true, false, 0L, false, 0, 0);
                Utilities.f21389g.c(new hc0(jh0Var2, str2, new ArrayList(jh0Var2.f46625n.f41341x), 11));
                return;
        }
    }
}
