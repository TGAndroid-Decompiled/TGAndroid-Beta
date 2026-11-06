package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class y7 implements Runnable {
    public final int f40569a;
    public final a8 f40570b;
    public final String f40571c;

    public y7(a8 a8Var, String str, int i7) {
        this.f40569a = i7;
        this.f40570b = a8Var;
        this.f40571c = str;
    }

    @Override
    public final void run() {
        switch (this.f40569a) {
            case 0:
                a8 a8Var = this.f40570b;
                String str = this.f40571c;
                a8Var.f31720f = null;
                org.telegram.messenger.g0.h3(new y7(a8Var, str, 1));
                return;
            default:
                a8 a8Var2 = this.f40570b;
                String str2 = this.f40571c;
                a8Var2.getClass();
                Utilities.f21335g.c(new z7(a8Var2, str2, new ArrayList(a8Var2.f31721n.f32078n2)));
                return;
        }
    }
}
