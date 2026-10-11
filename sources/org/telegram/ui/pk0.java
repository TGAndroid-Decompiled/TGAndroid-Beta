package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class pk0 implements Runnable {
    public final int f40934a;
    public final qk0 f40935b;
    public final String f40936c;

    public pk0(qk0 qk0Var, String str, int i10) {
        this.f40934a = i10;
        this.f40935b = qk0Var;
        this.f40936c = str;
    }

    @Override
    public final void run() {
        switch (this.f40934a) {
            case 0:
                qk0 qk0Var = this.f40935b;
                String str = this.f40936c;
                qk0Var.getClass();
                AndroidUtilities.runOnUIThread(new pk0(qk0Var, str, 1));
                return;
            default:
                qk0 qk0Var2 = this.f40935b;
                String str2 = this.f40936c;
                gg.b2 b2Var = qk0Var2.h;
                int i10 = qk0Var2.f41230n.f33896s;
                boolean z10 = true;
                b2Var.g(str2, true, (i10 == 1 || i10 == 3) ? false : false, true, false, 0L, false, 0, 0);
                Utilities.searchQueue.postRunnable(new nf0(qk0Var2, str2, new ArrayList(qk0Var2.f41230n.f33897w), 8));
                return;
        }
    }
}
