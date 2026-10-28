package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class mk0 implements Runnable {
    public final int f41457a;
    public final nk0 f41458b;
    public final String f41459c;

    public mk0(nk0 nk0Var, String str, int i10) {
        this.f41457a = i10;
        this.f41458b = nk0Var;
        this.f41459c = str;
    }

    @Override
    public final void run() {
        switch (this.f41457a) {
            case 0:
                nk0 nk0Var = this.f41458b;
                String str = this.f41459c;
                nk0Var.getClass();
                AndroidUtilities.runOnUIThread(new mk0(nk0Var, str, 1));
                return;
            default:
                nk0 nk0Var2 = this.f41458b;
                String str2 = this.f41459c;
                ig.a2 a2Var = nk0Var2.h;
                int i10 = nk0Var2.f41818n.f35603s;
                boolean z10 = true;
                a2Var.g(str2, true, (i10 == 1 || i10 == 3) ? false : false, true, false, 0L, false, 0, 0);
                Utilities.searchQueue.postRunnable(new ne0(nk0Var2, str2, new ArrayList(nk0Var2.f41818n.f35604w), 12));
                return;
        }
    }
}
