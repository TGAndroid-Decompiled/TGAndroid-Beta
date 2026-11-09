package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class y7 implements Runnable {
    public final int f40624a;
    public final a8 f40625b;
    public final String f40626c;

    public y7(a8 a8Var, String str, int i7) {
        this.f40624a = i7;
        this.f40625b = a8Var;
        this.f40626c = str;
    }

    @Override
    public final void run() {
        switch (this.f40624a) {
            case 0:
                a8 a8Var = this.f40625b;
                String str = this.f40626c;
                a8Var.f31749f = null;
                org.telegram.messenger.g0.h3(new y7(a8Var, str, 1));
                return;
            default:
                a8 a8Var2 = this.f40625b;
                String str2 = this.f40626c;
                a8Var2.getClass();
                Utilities.f21338g.c(new z7(a8Var2, str2, new ArrayList(a8Var2.f31750n.f32141n2)));
                return;
        }
    }
}
