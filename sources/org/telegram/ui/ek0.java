package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class ek0 implements Runnable {
    public final int f36982a;
    public final fk0 f36983b;
    public final String f36984c;

    public ek0(fk0 fk0Var, String str, int i10) {
        this.f36982a = i10;
        this.f36983b = fk0Var;
        this.f36984c = str;
    }

    @Override
    public final void run() {
        switch (this.f36982a) {
            case 0:
                fk0 fk0Var = this.f36983b;
                String str = this.f36984c;
                fk0Var.getClass();
                AndroidUtilities.runOnUIThread(new ek0(fk0Var, str, 1));
                return;
            default:
                fk0 fk0Var2 = this.f36983b;
                String str2 = this.f36984c;
                hg.a2 a2Var = fk0Var2.h;
                int i10 = fk0Var2.f37368n.f33513s;
                boolean z10 = true;
                a2Var.g(str2, true, (i10 == 1 || i10 == 3) ? false : false, true, false, 0L, false, 0, 0);
                Utilities.searchQueue.postRunnable(new re0(fk0Var2, str2, new ArrayList(fk0Var2.f37368n.f33514w), 10));
                return;
        }
    }
}
