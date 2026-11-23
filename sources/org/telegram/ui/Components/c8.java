package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class c8 implements Runnable {
    public final int f34073a;
    public final e8 f34074b;
    public final String f34075c;

    public c8(e8 e8Var, String str, int i7) {
        this.f34073a = i7;
        this.f34074b = e8Var;
        this.f34075c = str;
    }

    @Override
    public final void run() {
        switch (this.f34073a) {
            case 0:
                e8 e8Var = this.f34074b;
                String str = this.f34075c;
                e8Var.f34687f = null;
                org.telegram.messenger.g0.g3(new c8(e8Var, str, 1));
                return;
            default:
                e8 e8Var2 = this.f34074b;
                String str2 = this.f34075c;
                e8Var2.getClass();
                Utilities.f22776g.c(new d8(e8Var2, str2, new ArrayList(e8Var2.f34688n.f35107r2)));
                return;
        }
    }
}
