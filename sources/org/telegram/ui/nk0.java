package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class nk0 implements Runnable {
    public final int f39003a;
    public final ok0 f39004b;
    public final String f39005c;

    public nk0(ok0 ok0Var, String str, int i10) {
        this.f39003a = i10;
        this.f39004b = ok0Var;
        this.f39005c = str;
    }

    @Override
    public final void run() {
        switch (this.f39003a) {
            case 0:
                ok0 ok0Var = this.f39004b;
                String str = this.f39005c;
                ok0Var.getClass();
                AndroidUtilities.runOnUIThread(new nk0(ok0Var, str, 1));
                return;
            default:
                ok0 ok0Var2 = this.f39004b;
                String str2 = this.f39005c;
                gg.c2 c2Var = ok0Var2.h;
                int i10 = ok0Var2.f39228n.f33825s;
                boolean z10 = true;
                c2Var.g(str2, true, (i10 == 1 || i10 == 3) ? false : false, true, false, 0L, false, 0, 0);
                Utilities.searchQueue.postRunnable(new nf0(ok0Var2, str2, new ArrayList(ok0Var2.f39228n.f33826w), 8));
                return;
        }
    }
}
