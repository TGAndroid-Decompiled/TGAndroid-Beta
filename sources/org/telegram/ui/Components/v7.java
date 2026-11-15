package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class v7 implements Runnable {
    public final int f40320a;
    public final x7 f40321b;
    public final String f40322c;

    public v7(x7 x7Var, String str, int i7) {
        this.f40320a = i7;
        this.f40321b = x7Var;
        this.f40322c = str;
    }

    @Override
    public final void run() {
        switch (this.f40320a) {
            case 0:
                x7 x7Var = this.f40321b;
                String str = this.f40322c;
                x7Var.f41610f = null;
                org.telegram.messenger.g0.h3(new v7(x7Var, str, 1));
                return;
            default:
                x7 x7Var2 = this.f40321b;
                String str2 = this.f40322c;
                x7Var2.getClass();
                Utilities.f22418g.c(new w7(x7Var2, str2, new ArrayList(x7Var2.f41611n.f41915r2)));
                return;
        }
    }
}
