package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class t7 implements Runnable {
    public final int f30466a;
    public final v7 f30467b;
    public final String f30468c;

    public t7(v7 v7Var, String str, int i10) {
        this.f30466a = i10;
        this.f30467b = v7Var;
        this.f30468c = str;
    }

    @Override
    public final void run() {
        switch (this.f30466a) {
            case 0:
                v7 v7Var = this.f30467b;
                String str = this.f30468c;
                v7Var.f31155f = null;
                org.telegram.messenger.i0.g3(new t7(v7Var, str, 1));
                return;
            default:
                v7 v7Var2 = this.f30467b;
                String str2 = this.f30468c;
                v7Var2.getClass();
                Utilities.f14522g.c(new u7(v7Var2, str2, new ArrayList(v7Var2.f31156n.f32061n2)));
                return;
        }
    }
}
