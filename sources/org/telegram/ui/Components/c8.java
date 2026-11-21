package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class c8 implements Runnable {
    public final int f34115a;
    public final e8 f34116b;
    public final String f34117c;

    public c8(e8 e8Var, String str, int i7) {
        this.f34115a = i7;
        this.f34116b = e8Var;
        this.f34117c = str;
    }

    @Override
    public final void run() {
        switch (this.f34115a) {
            case 0:
                e8 e8Var = this.f34116b;
                String str = this.f34117c;
                e8Var.f34699f = null;
                org.telegram.messenger.g0.g3(new c8(e8Var, str, 1));
                return;
            default:
                e8 e8Var2 = this.f34116b;
                String str2 = this.f34117c;
                e8Var2.getClass();
                Utilities.f22809g.c(new d8(e8Var2, str2, new ArrayList(e8Var2.f34700n.f35130r2)));
                return;
        }
    }
}
