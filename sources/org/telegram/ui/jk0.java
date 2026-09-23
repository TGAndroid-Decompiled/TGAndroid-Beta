package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class jk0 implements Runnable {
    public final int f34470a;
    public final kk0 f34471b;
    public final String f34472c;

    public jk0(kk0 kk0Var, String str, int i10) {
        this.f34470a = i10;
        this.f34471b = kk0Var;
        this.f34472c = str;
    }

    @Override
    public final void run() {
        switch (this.f34470a) {
            case 0:
                kk0 kk0Var = this.f34471b;
                String str = this.f34472c;
                kk0Var.getClass();
                AndroidUtilities.runOnUIThread(new jk0(kk0Var, str, 1));
                return;
            default:
                kk0 kk0Var2 = this.f34471b;
                String str2 = this.f34472c;
                gg.c2 c2Var = kk0Var2.h;
                int i10 = kk0Var2.f34742n.f30841s;
                boolean z10 = true;
                c2Var.g(str2, true, (i10 == 1 || i10 == 3) ? false : false, true, false, 0L, false, 0, 0);
                Utilities.searchQueue.postRunnable(new kf0(kk0Var2, str2, new ArrayList(kk0Var2.f34742n.f30842w), 8));
                return;
        }
    }
}
