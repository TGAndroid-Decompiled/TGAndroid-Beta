package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class nk0 implements Runnable {
    public final int f39002a;
    public final ok0 f39003b;
    public final String f39004c;

    public nk0(ok0 ok0Var, String str, int i10) {
        this.f39002a = i10;
        this.f39003b = ok0Var;
        this.f39004c = str;
    }

    @Override
    public final void run() {
        switch (this.f39002a) {
            case 0:
                ok0 ok0Var = this.f39003b;
                String str = this.f39004c;
                ok0Var.getClass();
                AndroidUtilities.runOnUIThread(new nk0(ok0Var, str, 1));
                return;
            default:
                ok0 ok0Var2 = this.f39003b;
                String str2 = this.f39004c;
                gg.c2 c2Var = ok0Var2.h;
                int i10 = ok0Var2.f39227n.f33824s;
                boolean z10 = true;
                c2Var.g(str2, true, (i10 == 1 || i10 == 3) ? false : false, true, false, 0L, false, 0, 0);
                Utilities.searchQueue.postRunnable(new nf0(ok0Var2, str2, new ArrayList(ok0Var2.f39227n.f33825w), 8));
                return;
        }
    }
}
