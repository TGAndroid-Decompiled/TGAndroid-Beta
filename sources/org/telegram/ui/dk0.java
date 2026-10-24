package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class dk0 implements Runnable {
    public final int f36639a;
    public final ek0 f36640b;
    public final String f36641c;

    public dk0(ek0 ek0Var, String str, int i10) {
        this.f36639a = i10;
        this.f36640b = ek0Var;
        this.f36641c = str;
    }

    @Override
    public final void run() {
        switch (this.f36639a) {
            case 0:
                ek0 ek0Var = this.f36640b;
                String str = this.f36641c;
                ek0Var.getClass();
                AndroidUtilities.runOnUIThread(new dk0(ek0Var, str, 1));
                return;
            default:
                ek0 ek0Var2 = this.f36640b;
                String str2 = this.f36641c;
                hg.a2 a2Var = ek0Var2.h;
                int i10 = ek0Var2.f36944n.f33515s;
                boolean z10 = true;
                a2Var.g(str2, true, (i10 == 1 || i10 == 3) ? false : false, true, false, 0L, false, 0, 0);
                Utilities.searchQueue.postRunnable(new qe0(ek0Var2, str2, new ArrayList(ek0Var2.f36944n.f33516w), 10));
                return;
        }
    }
}
