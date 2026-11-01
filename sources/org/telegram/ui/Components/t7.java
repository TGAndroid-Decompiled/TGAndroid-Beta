package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class t7 implements Runnable {
    public final int f30541a;
    public final v7 f30542b;
    public final String f30543c;

    public t7(v7 v7Var, String str, int i10) {
        this.f30541a = i10;
        this.f30542b = v7Var;
        this.f30543c = str;
    }

    @Override
    public final void run() {
        switch (this.f30541a) {
            case 0:
                v7 v7Var = this.f30542b;
                String str = this.f30543c;
                v7Var.f31218f = null;
                org.telegram.messenger.i0.g3(new t7(v7Var, str, 1));
                return;
            default:
                v7 v7Var2 = this.f30542b;
                String str2 = this.f30543c;
                v7Var2.getClass();
                Utilities.f14523g.c(new u7(v7Var2, str2, new ArrayList(v7Var2.f31219n.f32109n2)));
                return;
        }
    }
}
