package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class y7 implements Runnable {
    public final int f40557a;
    public final a8 f40558b;
    public final String f40559c;

    public y7(a8 a8Var, String str, int i7) {
        this.f40557a = i7;
        this.f40558b = a8Var;
        this.f40559c = str;
    }

    @Override
    public final void run() {
        switch (this.f40557a) {
            case 0:
                a8 a8Var = this.f40558b;
                String str = this.f40559c;
                a8Var.f31724f = null;
                org.telegram.messenger.g0.h3(new y7(a8Var, str, 1));
                return;
            default:
                a8 a8Var2 = this.f40558b;
                String str2 = this.f40559c;
                a8Var2.getClass();
                Utilities.f21335g.c(new z7(a8Var2, str2, new ArrayList(a8Var2.f31725n.f32044n2)));
                return;
        }
    }
}
