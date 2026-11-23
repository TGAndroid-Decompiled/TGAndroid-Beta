package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class c8 implements Runnable {
    public final int f34109a;
    public final e8 f34110b;
    public final String f34111c;

    public c8(e8 e8Var, String str, int i7) {
        this.f34109a = i7;
        this.f34110b = e8Var;
        this.f34111c = str;
    }

    @Override
    public final void run() {
        switch (this.f34109a) {
            case 0:
                e8 e8Var = this.f34110b;
                String str = this.f34111c;
                e8Var.f34697f = null;
                org.telegram.messenger.g0.g3(new c8(e8Var, str, 1));
                return;
            default:
                e8 e8Var2 = this.f34110b;
                String str2 = this.f34111c;
                e8Var2.getClass();
                Utilities.f22812g.c(new d8(e8Var2, str2, new ArrayList(e8Var2.f34698n.f35132r2)));
                return;
        }
    }
}
