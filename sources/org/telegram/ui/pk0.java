package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class pk0 implements Runnable {
    public final int f36599a;
    public final qk0 f36600b;
    public final String f36601c;

    public pk0(qk0 qk0Var, String str, int i10) {
        this.f36599a = i10;
        this.f36600b = qk0Var;
        this.f36601c = str;
    }

    @Override
    public final void run() {
        switch (this.f36599a) {
            case 0:
                qk0 qk0Var = this.f36600b;
                String str = this.f36601c;
                qk0Var.getClass();
                AndroidUtilities.runOnUIThread(new pk0(qk0Var, str, 1));
                return;
            default:
                qk0 qk0Var2 = this.f36600b;
                String str2 = this.f36601c;
                gg.c2 c2Var = qk0Var2.h;
                int i10 = qk0Var2.f36898n.f30867s;
                boolean z10 = true;
                c2Var.g(str2, true, (i10 == 1 || i10 == 3) ? false : false, true, false, 0L, false, 0, 0);
                Utilities.searchQueue.postRunnable(new pf0(qk0Var2, str2, new ArrayList(qk0Var2.f36898n.f30868w), 8));
                return;
        }
    }
}
